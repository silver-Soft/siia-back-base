package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaPersonaSolicitante {
	
	@Id
	@Column(name = "IDPERSONA")
	private Long longIdPersona;
	
	@Column(name = "LOGIN")
	private String strLogin;
	
	@Column(name = "NBPERSONA")
	private String strNombre;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;

	
	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public Long getLongIdPersona() {
		return longIdPersona;
	}

	public void setLongIdPersona(Long longIdPersona) {
		this.longIdPersona = longIdPersona;
	}



}
