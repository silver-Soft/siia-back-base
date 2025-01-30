package mx.uatx.siiaback.microsoft.graph.api;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCredential;
import com.microsoft.aad.msal4j.ITokenCache;
import com.microsoft.aad.msal4j.MsalException;
import com.microsoft.aad.msal4j.SilentParameters;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.LoggerLevel;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import com.microsoft.graph.requests.extensions.IEventCollectionPage;

import mx.uatx.siiaback.serviciosUniversitarios.dto.ParametrosMS;

public class Graph implements Serializable {

	private static final long serialVersionUID = 8317618212239335190L;

	private static String authority;
	private static String clientId;
	private static String secret;
	private static String scope;

	private IGraphServiceClient graphClient = null;
	private SimpleAuthProvider authProvider = null;

	private void ensureGraphClient(String accessToken) {
		if (graphClient == null) {
			// Create the auth provider
			authProvider = new SimpleAuthProvider(accessToken);

			// Create default logger to only log errors
			DefaultLogger logger = new DefaultLogger();
			logger.setLoggingLevel(LoggerLevel.ERROR);

			// Build a Graph client
			graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).logger(logger)
					.buildClient();

		}
	}

	public User getUser(String accessToken) {
		ensureGraphClient(accessToken);

		// GET /me to get authenticated user
		User me = graphClient.me().buildRequest().get();

		return me;
	}

	// <GetEventsSnippet>
	public List<Event> getEvents(String accessToken) {
		ensureGraphClient(accessToken);

		// Use QueryOption to specify the $orderby query parameter
		final List<Option> options = new LinkedList<Option>();
		// Sort results by createdDateTime, get newest first
		options.add(new QueryOption("orderby", "createdDateTime DESC"));

		// GET /me/events
		IEventCollectionPage eventPage = graphClient.me().events().buildRequest(options)
				.select("subject,organizer,start,end").get();

		return eventPage.getCurrentPage();
	}
	// </GetEventsSnippet>

	// <GetEventsSnippet>
	public Boolean crearUsuario(String accessToken, UsuarioMicrosoftDTO dtoPersona) throws Exception {

		ensureGraphClient(accessToken);

		User user = new User();
		user.accountEnabled = true;
		user.displayName = dtoPersona.getDisplayName();
		user.givenName = dtoPersona.getGivenName();
		user.preferredLanguage = dtoPersona.getPreferredLanguage();
		user.surname = dtoPersona.getSurname();
		user.mailNickname = dtoPersona.getMailNickname();
		user.mail = dtoPersona.getMail();
		user.userPrincipalName = dtoPersona.getUserPrincipalName();
		user.preferredLanguage = dtoPersona.getPreferredLanguage();
		user.usageLocation = dtoPersona.getUsageLocation();

		PasswordProfile passwordProfile = new PasswordProfile();
		passwordProfile.forceChangePasswordNextSignIn = false;
		passwordProfile.password = dtoPersona.getPassword();
		user.passwordProfile = passwordProfile;

		graphClient.users().buildRequest().post(user);

		this.authProvider = null;
		this.graphClient = null;

		return true;

	}

	public void conexionGraphClient(String accessToken) {

		ensureGraphClient(accessToken);

		graphClient.me().buildRequest().get();
	}

	public User obtnerUsuario(String accessToken, UsuarioMicrosoftDTO dtoPersona) {
		ensureGraphClient(accessToken);

		User user = graphClient.users(dtoPersona.getMail()).buildRequest().get();

		return user;
	}

	public void asignarLicencia(String accessToken, UsuarioMicrosoftDTO dtoPersona, String strLicencia) {
		ensureGraphClient(accessToken);

		// final String LICENCIA = "314c4481-f395-4525-be8b-2ec4bb1e9d91";
		// final String LICENCIA_ALUMNOS = "e82ae690-a2d5-4d76-8d30-7c6e01e6022e";
		// final String LICENCIA_DOCENTES = "78e66a63-337a-4a9a-8959-41c6654dfb56";

		LinkedList<AssignedLicense> addLicensesList = new LinkedList<AssignedLicense>();
		AssignedLicense addLicenses = new AssignedLicense();
		LinkedList<UUID> disabledPlansList = new LinkedList<UUID>();
		addLicenses.disabledPlans = disabledPlansList;

		// Licencia de office 365
		addLicenses.skuId = UUID.fromString(strLicencia);

		addLicensesList.add(addLicenses);

		LinkedList<UUID> removeLicensesList = new LinkedList<UUID>();

		graphClient.users(dtoPersona.getStrID()).assignLicense(addLicensesList, removeLicensesList).buildRequest()
				.post();

	}

	public User actualizarContraseniaUsuario(String accessToken, UsuarioMicrosoftDTO dtoPersona) {
		ensureGraphClient(accessToken);

		User user = new User();

		PasswordProfile passwordProfile = new PasswordProfile();
		passwordProfile.forceChangePasswordNextSignIn = false;
		passwordProfile.password = dtoPersona.getPassword();

		user.passwordProfile = passwordProfile;

		graphClient.users(dtoPersona.getStrID()).buildRequest().patch(user);

		return null;
	}

	private void setUpData(ParametrosMS msParametros) throws IOException {
		// Load properties file and set properties used throughout the sample

		/*
		 * Properties properties = new Properties(); properties.load(new
		 * FileInputStream(Thread.currentThread().getContextClassLoader().getResource(""
		 * ).getPath() + "application.properties")); authority =
		 * properties.getProperty("AUTHORITY"); clientId =
		 * properties.getProperty("CLIENT_ID"); secret =
		 * properties.getProperty("SECRET"); scope = properties.getProperty("SCOPE");
		 * scopes = properties.getProperty("app.scopes").split(",");
		 * 
		 */

		authority = msParametros.getStrAuthority();
		clientId = msParametros.getStrClienteId();
		secret = msParametros.getStrSecret();
		scope = msParametros.getStrScope();

	}

	public IAuthenticationResult getAccessTokenByClientCredentialGrant(ParametrosMS parametrosMs) throws Exception {

		setUpData(parametrosMs);

		ConfidentialClientApplication app = ConfidentialClientApplication
				.builder(clientId, ClientCredentialFactory.createFromSecret(secret)).authority(authority).build();

		// With client credentials flows the scope is ALWAYS of the shape
		// "resource/.default", as the
		// application permissions need to be set statically (in the portal), and then
		// granted by a tenant administrator

		Set<String> scopes = new HashSet<String>();

		scopes.add(scope);
		scopes.add("offline_access");

		ClientCredentialParameters clientCredentialParam = ClientCredentialParameters.builder(scopes).build();

		ITokenCache tokcache = app.tokenCache();

		CompletableFuture<IAuthenticationResult> future = app.acquireToken(clientCredentialParam);

		return future.get();
	}

	public IAuthenticationResult getAccessTokenByClientCredentialGrantSilently(ParametrosMS parametrosMs)
			throws Exception {

		setUpData(parametrosMs);

		ConfidentialClientApplication app = ConfidentialClientApplication
				.builder(clientId, ClientCredentialFactory.createFromSecret(secret)).authority(authority).build();

		Set<String> scopes = new HashSet<String>();

		scopes.add(scope);
		scopes.add("offline_access");

		SilentParameters silentParamete = SilentParameters.builder(scopes).build();

		IAuthenticationResult future = app.acquireTokenSilently(silentParamete).join();

		return future;
	}

	public void autenticarMs(ParametrosMS parametrosMs) throws Exception {

		setUpData(parametrosMs);

	}

	public IAuthenticationResult acquireToken(ParametrosMS parametrosMs) throws Exception {

		setUpData(parametrosMs);

		IClientCredential credential = ClientCredentialFactory.createFromSecret(secret);

		TokenCacheAspect tokenCacheAspect = new TokenCacheAspect("sample_cache.json");

		ConfidentialClientApplication cca = ConfidentialClientApplication.builder(clientId, credential)
				.authority(authority).setTokenCacheAccessAspect(tokenCacheAspect).build();

		IAuthenticationResult result;
		try {
			SilentParameters silentParameters = SilentParameters.builder(Collections.singleton(scope)).build();

			// try to acquire token silently. This call will fail since the token cache does
			// not
			// have a token for the application you are requesting an access token for
			result = cca.acquireTokenSilently(silentParameters).join();

			System.out.println("Obteniendo token silently");
		} catch (Exception ex) {
			if (ex.getCause() instanceof MsalException) {

				ClientCredentialParameters parameters = ClientCredentialParameters.builder(Collections.singleton(scope))
						.build();

				// Try to acquire a token. If successful, you should see
				// the token information printed out to console
				result = cca.acquireToken(parameters).join();
				System.out.println("Obteniendo token");

			} else {
				// Handle other exceptions accordingly
				throw ex;
			}
		}
		return result;
	}

}
