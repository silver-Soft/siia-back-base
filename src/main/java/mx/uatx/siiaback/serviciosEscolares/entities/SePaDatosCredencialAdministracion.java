package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosCredencialAdministracion {

	@Id
	@Column(name = "IDCREDENCIALPERSONA")
	private Integer intIdCredencialPersona;

	@Column(name = "IDCREDENCIAL")
	private Integer intIdCredencial;

	@Column(name = "MATRICULA")
	private String strLogin;

	@Column(name = "NOMBRE")
	private String strNbPersona;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "CURP")
	private String strCurp;

	@Column(name = "FECHANACIMIENTO")
	private Date fcNacimiento;

	@Column(name = "DOMICILIO")
	private String strDomicilio;

	@Column(name = "GRUPOSANGUINEO")
	private String strGrupoSanguineo;

	@Column(name = "CONDICIONSALUD")
	private String strCondicionSalud;

	@Column(name = "NUMEROSS")
	private String strNumeroSeguridadSocial;

	@Column(name = "FOTOGRAFIA")
	@Lob
	private byte[] fotografia;

	@Column(name = "VIGENCIA")
	private String strVigencia;

	@Column(name = "ESTUDIANTEDE")
	private String strEstudiante;

	@Column(name = "FACULTADDE")
	private String strTitFacultad;
	
	@Column(name = "CADENAQR")
	private String strQR;
	
	@Column(name = "CAMPUS")
	private String strCampus;
	
	@Column(name = "FIRMA")
	@Lob
	private byte[] firmaDocente;

	public SePaDatosCredencialAdministracion() {
		

	}

	public Integer getIntIdCredencialPersona() {
		return intIdCredencialPersona;
	}

	public void setIntIdCredencialPersona(Integer intIdCredencialPersona) {
		this.intIdCredencialPersona = intIdCredencialPersona;
	}

	public Integer getIntIdCredencial() {
		return intIdCredencial;
	}

	public void setIntIdCredencial(Integer intIdCredencial) {
		this.intIdCredencial = intIdCredencial;
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

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public Date getFcNacimiento() {
		return fcNacimiento;
	}

	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
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

	public String getStrCondicionSalud() {
		return strCondicionSalud;
	}

	public void setStrCondicionSalud(String strCondicionSalud) {
		this.strCondicionSalud = strCondicionSalud;
	}

	public String getStrNumeroSeguridadSocial() {
		return strNumeroSeguridadSocial;
	}

	public void setStrNumeroSeguridadSocial(String strNumeroSeguridadSocial) {
		this.strNumeroSeguridadSocial = strNumeroSeguridadSocial;
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

	public String getStrEstudiante() {
		return strEstudiante;
	}

	public void setStrEstudiante(String strEstudiante) {
		this.strEstudiante = strEstudiante;
	}

	public String getStrTitFacultad() {
		return strTitFacultad;
	}

	public void setStrTitFacultad(String strTitFacultad) {
		this.strTitFacultad = strTitFacultad;
	}

	public String getStrQR() {
		return strQR;
	}

	public void setStrQR(String strQR) {
		this.strQR = strQR;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public byte[] getFirmaDocente() {
		return firmaDocente;
	}

	public void setFirmaDocente(byte[] firmaDocente) {
		this.firmaDocente = firmaDocente;
	}
	

}
