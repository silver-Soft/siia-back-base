package mx.uatx.siiaback.microsoft.graph.api;

public class UsuarioMicrosoftDTO {
	
	private String city;
	private String country;
	private String department;
	private String displayName;
	private String givenName;
	private String jobTitle;
	private String mailNickname;
	private String mail;
	private String passwordPolicies = "DisablePasswordExpiration";

	private String password;

	private String officeLocation;
	private String postalCode;
	private String preferredLanguage;
	private String state;   
	private String streetAddress;
	private String surname;
	private String mobilePhone;
	private String usageLocation;
	private String userPrincipalName;

	private String strID;

	public UsuarioMicrosoftDTO() {
		super();
	}

	public UsuarioMicrosoftDTO(String city, String country, String department, String displayName, String givenName,
			String jobTitle, String mailNickname, String mail, String passwordPolicies, String password,
			String officeLocation, String postalCode, String preferredLanguage, String state, String streetAddress,
			String surname, String mobilePhone, String usageLocation, String userPrincipalName) {
		super();
		this.city = city;
		this.country = country;
		this.department = department;
		this.displayName = displayName;
		this.givenName = givenName;
		this.jobTitle = jobTitle;
		this.mailNickname = mailNickname;
		this.mail = mail;
		this.passwordPolicies = passwordPolicies;
		this.password = password;
		this.officeLocation = officeLocation;
		this.postalCode = postalCode;
		this.preferredLanguage = preferredLanguage;
		this.state = state;
		this.streetAddress = streetAddress;
		this.surname = surname;
		this.mobilePhone = mobilePhone;
		this.usageLocation = usageLocation;
		this.userPrincipalName = userPrincipalName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getMailNickname() {
		return mailNickname;
	}

	public void setMailNickname(String mailNickname) {
		this.mailNickname = mailNickname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPasswordPolicies() {
		return passwordPolicies;
	}

	public void setPasswordPolicies(String passwordPolicies) {
		this.passwordPolicies = passwordPolicies;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getUsageLocation() {
		return usageLocation;
	}

	public void setUsageLocation(String usageLocation) {
		this.usageLocation = usageLocation;
	}

	public String getUserPrincipalName() {
		return userPrincipalName;
	}

	public void setUserPrincipalName(String userPrincipalName) {
		this.userPrincipalName = userPrincipalName;
	}

	public String getStrID() {
		return strID;
	}

	public void setStrID(String strID) {
		this.strID = strID;
	}

}
