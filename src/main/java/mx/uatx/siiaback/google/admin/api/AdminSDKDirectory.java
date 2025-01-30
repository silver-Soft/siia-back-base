package mx.uatx.siiaback.google.admin.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.admin.directory.DirectoryScopes;

public class AdminSDKDirectory {
	
	final String APPLICATION_NAME = "Google Admin SDK Directory API Java Quickstart";
	
	private final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	private static final String TOKENS_DIRECTORY_PATH = "tokens";
	
	

	/**
	 * Global instance of the scopes required by this quickstart. If modifying these
	 * scopes, delete your previously saved tokens/ folder.
	 */
	private static final List<String> SCOPES = Collections.singletonList(DirectoryScopes.ADMIN_DIRECTORY_USER);
	private static final String CREDENTIALS_FILE_PATH = "credentials.json";

	/**
	 * Creates an authorized Credential object.
	 * 
	 * @param HTTP_TRANSPORT The network HTTP Transport.
	 * @return An authorized Credential object.
	 * @throws IOException If the credentials.json file cannot be found.
	 * 
	 */

	public Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
		// Load client secrets.		
		//InputStream in = AdminSDKDirectory.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
		
		File  credencialesFile = leerCredenciales(CREDENTIALS_FILE_PATH);
		
		InputStream in = new FileInputStream(credencialesFile);
		
		
		if (in == null) {
			throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
		}
		
		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
		
		

		// Build flow and trigger user authorization request.
		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
				clientSecrets, SCOPES)
						.setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
						.setAccessType("offline").build();
		
		
		LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
		
		//LocalServerReceiver receiver = new LocalServerReceiver();
		
		return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
	}
	
	
	 private static File leerCredenciales(String resource) {
	        try {
	        	
	        	Resource resourcee = new ClassPathResource(resource);
				File file = resourcee.getFile();
	    		
	    		return file;
	    	
	        } catch (Exception ex){
	            System.out.println("Error reading data from file: " + ex.getMessage());
	            throw new RuntimeException(ex);
	        }
	    }
	
	

	public JsonFactory getJSON_FACTORY() {
		return JSON_FACTORY;
	}

	public String getAPPLICATION_NAME() {
		return APPLICATION_NAME;
	}

	
	
	

}
