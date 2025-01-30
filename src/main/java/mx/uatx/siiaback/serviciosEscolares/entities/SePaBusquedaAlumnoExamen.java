package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBusquedaAlumnoExamen implements Serializable {

	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;

	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "LOGIN")
	private String strLogin;

	@Column(name = "NBPERSONA")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "CORREO")
	private String strCorreo;

	@Column(name = "TELEFONO")
	private String strTelefono;

	@Column(name = "IDPERSONA")
	private int idpersona;

	@Column(name = "PERMITECAMBIARCONTRASENA")
	private Integer permiteContrasenia;

	@Column(name = "PERMITEEXPEDIENTEDIGITAL")
	private Integer permiteExpDigital;

	@Column(name = "PERMITEVALIDAR")
	private Integer permiteValidar;

	@Column(name = "ESTATUSTITULACION")
	private String estatusTitulacion;

	@Column(name = "CURP")
	private String strCURP;

	@Column(name = "IDCORREOINSTITUCIONAL")
	private Long idPersonaCorreo;
	
	@Column(name = "IDMICROSOFT")
	private String idMicrosoft;

	@Column(name = "DSCORREOMICROSOFT")
	private String dsPersonaCorreoMicrosoft;
	
	@Column(name = "IDGMAIL")
	private String idGamil;
	
	@Column(name = "DSCORREOGMAIL")
	private String dsPerosonaGamil;
	
	@Column(name = "OBSEXPEDIENTE")
	private String obsExpediente;
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "MOTIVORECHAZO")
	private String strMotivoRechazo;
	

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
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

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public Integer getPermiteContrasenia() {
		return permiteContrasenia;
	}

	public void setPermiteContrasenia(Integer permiteContrasenia) {
		this.permiteContrasenia = permiteContrasenia;
	}

	public Integer getPermiteExpDigital() {
		return permiteExpDigital;
	}

	public void setPermiteExpDigital(Integer permiteExpDigital) {
		this.permiteExpDigital = permiteExpDigital;
	}

	public Integer getPermiteValidar() {
		return permiteValidar;
	}

	public void setPermiteValidar(Integer permiteValidar) {
		this.permiteValidar = permiteValidar;
	}

	public String getEstatusTitulacion() {
		return estatusTitulacion;
	}

	public void setEstatusTitulacion(String estatusTitulacion) {
		this.estatusTitulacion = estatusTitulacion;
	}

	public String getStrCURP() {
		return strCURP;
	}

	public void setStrCURP(String strCURP) {
		this.strCURP = strCURP;
	}

	public String getIdMicrosoft() {
		return idMicrosoft;
	}

	public void setIdMicrosoft(String idMicrosoft) {
		this.idMicrosoft = idMicrosoft;
	}

	public Long getIdPersonaCorreo() {
		return idPersonaCorreo;
	}

	public void setIdPersonaCorreo(Long idPersonaCorreo) {
		this.idPersonaCorreo = idPersonaCorreo;
	}

	public String getDsPersonaCorreoMicrosoft() {
		return dsPersonaCorreoMicrosoft;
	}

	public void setDsPersonaCorreoMicrosoft(String dsPersonaCorreoMicrosoft) {
		this.dsPersonaCorreoMicrosoft = dsPersonaCorreoMicrosoft;
	}

	public String getIdGamil() {
		return idGamil;
	}

	public void setIdGamil(String idGamil) {
		this.idGamil = idGamil;
	}

	public String getDsPerosonaGamil() {
		return dsPerosonaGamil;
	}

	public void setDsPerosonaGamil(String dsPerosonaGamil) {
		this.dsPerosonaGamil = dsPerosonaGamil;
	}

	public String getObsExpediente() {
		return obsExpediente;
	}

	public void setObsExpediente(String obsExpediente) {
		this.obsExpediente = obsExpediente;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getStrMotivoRechazo() {
		return strMotivoRechazo;
	}

	public void setStrMotivoRechazo(String strMotivoRechazo) {
		this.strMotivoRechazo = strMotivoRechazo;
	}
	
	
	

}
