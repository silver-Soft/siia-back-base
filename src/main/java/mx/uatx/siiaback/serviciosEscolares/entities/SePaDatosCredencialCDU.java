package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosCredencialCDU {

	@Id
	@Column(name = "IDUSUARIOACTDEPYREC")
	private Integer intIdCredencialCDU;

	@Column(name = "MATRICULANUMEMP")
	private String strLogin;

	@Column(name = "NOMBRE")
	private String strNbPersona;

	@Column(name = "TIPOUSUARIO")
	private String strTipoUsuario;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strTipoActividad;

	@Column(name = "DIAS")
	private String strDias;

	@Column(name = "DOMICILIO")
	private String strDomicilio;

	@Column(name = "DSGRUPOSANGUINEO")
	private String strGrupoSanguineo;

	@Column(name = "DSALERGIA")
	private String strAlergia;

	@Column(name = "NMTELEFONOEMERGENCIA")
	private String strNumeroTelefono;

	@Column(name = "FOTO")
	@Lob
	private byte[] fotografia;

	@Column(name = "VIGENCIA")
	private String strVigencia;

	@Column(name = "CADENAQR")
	private String strQR;

	@Column(name = "SECRETARIOEXTENSION")
	private String strSecretario;

	@Column(name = "FIRMA")
	@Lob
	private byte[] firmaSecretario;
	

	public SePaDatosCredencialCDU() {
		super();
	}

	public Integer getIntIdCredencialCDU() {
		return intIdCredencialCDU;
	}

	public void setIntIdCredencialCDU(Integer intIdCredencialCDU) {
		this.intIdCredencialCDU = intIdCredencialCDU;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrTipoUsuario() {
		return strTipoUsuario;
	}

	public void setStrTipoUsuario(String strTipoUsuario) {
		this.strTipoUsuario = strTipoUsuario;
	}

	public String getStrTipoActividad() {
		return strTipoActividad;
	}

	public void setStrTipoActividad(String strTipoActividad) {
		this.strTipoActividad = strTipoActividad;
	}

	public String getStrDias() {
		return strDias;
	}

	public void setStrDias(String strDias) {
		this.strDias = strDias;
	}

	public String getStrDomicilio() {
		return strDomicilio;
	}

	public void setStrDomicilio(String strDomicilio) {
		this.strDomicilio = strDomicilio;
	}

	public String getStrGrupoSanguineo() {
		return strGrupoSanguineo;
	}

	public void setStrGrupoSanguineo(String strGrupoSanguineo) {
		this.strGrupoSanguineo = strGrupoSanguineo;
	}

	public String getStrAlergia() {
		return strAlergia;
	}

	public void setStrAlergia(String strAlergia) {
		this.strAlergia = strAlergia;
	}

	public String getStrNumeroTelefono() {
		return strNumeroTelefono;
	}

	public void setStrNumeroTelefono(String strNumeroTelefono) {
		this.strNumeroTelefono = strNumeroTelefono;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public String getStrVigencia() {
		return strVigencia;
	}

	public void setStrVigencia(String strVigencia) {
		this.strVigencia = strVigencia;
	}

	public String getStrQR() {
		return strQR;
	}

	public void setStrQR(String strQR) {
		this.strQR = strQR;
	}

	public String getStrSecretario() {
		return strSecretario;
	}

	public void setStrSecretario(String strSecretario) {
		this.strSecretario = strSecretario;
	}

	public byte[] getFirmaSecretario() {
		return firmaSecretario;
	}

	public void setFirmaSecretario(byte[] firmaSecretario) {
		this.firmaSecretario = firmaSecretario;
	}

}
