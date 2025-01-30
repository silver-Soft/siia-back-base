package mx.uatx.siiaback.serviciosUniversitarios.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParametrosMS {
	
	@Id
	@Column(name="SECRET")
	private String strSecret;
	
	@Column(name="SCOPE")
	private String strScope;
	
	@Column(name="CLIENTID")
	private String strClienteId;
	
	@Column(name="AUTHORITY")
	private String strAuthority;
	
	

	public String getStrSecret() {
		return strSecret;
	}

	public void setStrSecret(String strSecret) {
		this.strSecret = strSecret;
	}

	public String getStrScope() {
		return strScope;
	}

	public void setStrScope(String strScope) {
		this.strScope = strScope;
	}

	public String getStrClienteId() {
		return strClienteId;
	}

	public void setStrClienteId(String strClienteId) {
		this.strClienteId = strClienteId;
	}

	public String getStrAuthority() {
		return strAuthority;
	}

	public void setStrAuthority(String strAuthority) {
		this.strAuthority = strAuthority;
	}	

}
