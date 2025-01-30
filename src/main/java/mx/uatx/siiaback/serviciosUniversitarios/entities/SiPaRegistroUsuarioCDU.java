/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SiPaRegistroUsuarioCDU implements Serializable {

	private static final long serialVersionUID = -8226822079815304768L;	

	@Id
	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	@Column(name = "NOMBRE")
	private String strNbUsuario;

	@Column(name = "ENTIDADNACIMIENTO")
	private String strEntidadNacimiento;
	
	@Column(name = "EDAD")
	private Integer intEdad;
	
	@Column(name = "FCNACIMIENTO")
	private Date fcNacimientoUsuario;
	
	@Column(name = "CURP")
	private String strCurpUsuario;
	
	@Column(name = "GENERO")
	private String strDsGenero;

	@Column(name = "PROGRAMAEDU")
	private String strProgramaEducativo;
	
	@Column(name = "AREA")
	private String strAreaCampus;
	
	@Column(name = "FECHAREGISTRO")
	@Temporal(TemporalType.DATE)
	private Date fcRegistroUsuario;
	
	@Column(name = "FECHAAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "ASENTAMIENTO")
	private String strNbAsentamiento;
	
	@Column(name = "MUNICIPIO")
	private String strNbMunicipio;
	
	@Column(name = "ENTIDAD")
	private String strNbEntidad;
	
	@Column(name = "CODIGOPOS")
	private String strCodigoPostal;
	
	@Column(name = "NBCALLE")
	private String strNbCalle;
	
	@Column(name = "NUMEROEXT")
	private String strNmExterior;
	
	@Column(name = "IDAREA")
	private Integer intIdAreaCampus;
	
	@Column(name = "MATRICULAEMP")
	private String strMatriculaNumEmp;
	
	@Column(name = "SEMESTRE")
	private String strPeriodoCursado;
	
	@Column(name = "TURNO")
	private String strDsTurno;
	
	@Column(name = "CORREO")
	private String strDsCorreoElectronico;
	
	@Column(name = "TELCASA")
	private String strNmTelefonoCasa;

	@Column(name = "TELOFIC")
	private String strNmTelefonoOficina;

	@Column(name = "CELULAR")
	private String strNmTelefonoMovil;
	
	@Column(name = "ACTIVIDAD")
	private String strDsActividad;
	
	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "DIAS")
	private String strDias;
	
	@Column(name = "FAMILIAR")
	private String strNbFamiliarEmergencia;
	
	@Column(name = "TELEMERGENCIA")
	private String strNmTelefonoEmergencia;
	
	@Column(name = "REVISIONMED")
	private String strDsRevisionMedica;
	
	@Column(name = "SANGUINEO")
	private String strDsGrupoSanguineo;
	
	@Column(name = "ALERGIA")
	private String strAlergia;
	
	@Column(name = "PESO")
	private String strPeso;

	@Column(name = "ESTATURA")
	private String strEstatura;

	@Column(name = "TALLA")
	private String strTalla;
	
	@Column(name = "TIPO")
	private String strTipoUsuario;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	public Long getLngIdUsuarioActDepYRec() {
		return lngIdUsuarioActDepYRec;
	}

	public void setLngIdUsuarioActDepYRec(Long lngIdUsuarioActDepYRec) {
		this.lngIdUsuarioActDepYRec = lngIdUsuarioActDepYRec;
	}

	public String getStrNbUsuario() {
		return strNbUsuario;
	}

	public void setStrNbUsuario(String strNbUsuario) {
		this.strNbUsuario = strNbUsuario;
	}

	public String getStrEntidadNacimiento() {
		return strEntidadNacimiento;
	}

	public void setStrEntidadNacimiento(String strEntidadNacimiento) {
		this.strEntidadNacimiento = strEntidadNacimiento;
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public String getStrCurpUsuario() {
		return strCurpUsuario;
	}

	public void setStrCurpUsuario(String strCurpUsuario) {
		this.strCurpUsuario = strCurpUsuario;
	}

	public String getStrDsGenero() {
		return strDsGenero;
	}

	public void setStrDsGenero(String strDsGenero) {
		this.strDsGenero = strDsGenero;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrAreaCampus() {
		return strAreaCampus;
	}

	public void setStrAreaCampus(String strAreaCampus) {
		this.strAreaCampus = strAreaCampus;
	}

	public Date getFcRegistroUsuario() {
		return fcRegistroUsuario;
	}

	public void setFcRegistroUsuario(Date fcRegistroUsuario) {
		this.fcRegistroUsuario = fcRegistroUsuario;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrNbAsentamiento() {
		return strNbAsentamiento;
	}

	public void setStrNbAsentamiento(String strNbAsentamiento) {
		this.strNbAsentamiento = strNbAsentamiento;
	}

	public String getStrNbMunicipio() {
		return strNbMunicipio;
	}

	public void setStrNbMunicipio(String strNbMunicipio) {
		this.strNbMunicipio = strNbMunicipio;
	}

	public String getStrNbEntidad() {
		return strNbEntidad;
	}

	public void setStrNbEntidad(String strNbEntidad) {
		this.strNbEntidad = strNbEntidad;
	}

	public String getStrCodigoPostal() {
		return strCodigoPostal;
	}

	public void setStrCodigoPostal(String strCodigoPostal) {
		this.strCodigoPostal = strCodigoPostal;
	}

	public String getStrNbCalle() {
		return strNbCalle;
	}

	public void setStrNbCalle(String strNbCalle) {
		this.strNbCalle = strNbCalle;
	}

	public String getStrNmExterior() {
		return strNmExterior;
	}

	public void setStrNmExterior(String strNmExterior) {
		this.strNmExterior = strNmExterior;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrMatriculaNumEmp() {
		return strMatriculaNumEmp;
	}

	public void setStrMatriculaNumEmp(String strMatriculaNumEmp) {
		this.strMatriculaNumEmp = strMatriculaNumEmp;
	}

	public String getStrPeriodoCursado() {
		return strPeriodoCursado;
	}

	public void setStrPeriodoCursado(String strPeriodoCursado) {
		this.strPeriodoCursado = strPeriodoCursado;
	}

	public String getStrDsTurno() {
		return strDsTurno;
	}

	public void setStrDsTurno(String strDsTurno) {
		this.strDsTurno = strDsTurno;
	}

	public String getStrDsCorreoElectronico() {
		return strDsCorreoElectronico;
	}

	public void setStrDsCorreoElectronico(String strDsCorreoElectronico) {
		this.strDsCorreoElectronico = strDsCorreoElectronico;
	}

	public String getStrNmTelefonoCasa() {
		return strNmTelefonoCasa;
	}

	public void setStrNmTelefonoCasa(String strNmTelefonoCasa) {
		this.strNmTelefonoCasa = strNmTelefonoCasa;
	}

	public String getStrNmTelefonoOficina() {
		return strNmTelefonoOficina;
	}

	public void setStrNmTelefonoOficina(String strNmTelefonoOficina) {
		this.strNmTelefonoOficina = strNmTelefonoOficina;
	}

	public String getStrNmTelefonoMovil() {
		return strNmTelefonoMovil;
	}

	public void setStrNmTelefonoMovil(String strNmTelefonoMovil) {
		this.strNmTelefonoMovil = strNmTelefonoMovil;
	}

	public String getStrDsActividad() {
		return strDsActividad;
	}

	public void setStrDsActividad(String strDsActividad) {
		this.strDsActividad = strDsActividad;
	}

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	public String getStrDias() {
		return strDias;
	}

	public void setStrDias(String strDias) {
		this.strDias = strDias;
	}

	public String getStrNbFamiliarEmergencia() {
		return strNbFamiliarEmergencia;
	}

	public void setStrNbFamiliarEmergencia(String strNbFamiliarEmergencia) {
		this.strNbFamiliarEmergencia = strNbFamiliarEmergencia;
	}

	public String getStrNmTelefonoEmergencia() {
		return strNmTelefonoEmergencia;
	}

	public void setStrNmTelefonoEmergencia(String strNmTelefonoEmergencia) {
		this.strNmTelefonoEmergencia = strNmTelefonoEmergencia;
	}

	public String getStrDsRevisionMedica() {
		return strDsRevisionMedica;
	}

	public void setStrDsRevisionMedica(String strDsRevisionMedica) {
		this.strDsRevisionMedica = strDsRevisionMedica;
	}

	public String getStrDsGrupoSanguineo() {
		return strDsGrupoSanguineo;
	}

	public void setStrDsGrupoSanguineo(String strDsGrupoSanguineo) {
		this.strDsGrupoSanguineo = strDsGrupoSanguineo;
	}

	public String getStrAlergia() {
		return strAlergia;
	}

	public void setStrAlergia(String strAlergia) {
		this.strAlergia = strAlergia;
	}

	public String getStrPeso() {
		return strPeso;
	}

	public void setStrPeso(String strPeso) {
		this.strPeso = strPeso;
	}

	public String getStrEstatura() {
		return strEstatura;
	}

	public void setStrEstatura(String strEstatura) {
		this.strEstatura = strEstatura;
	}

	public String getStrTalla() {
		return strTalla;
	}

	public void setStrTalla(String strTalla) {
		this.strTalla = strTalla;
	}

	public String getStrTipoUsuario() {
		return strTipoUsuario;
	}

	public void setStrTipoUsuario(String strTipoUsuario) {
		this.strTipoUsuario = strTipoUsuario;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public Date getFcNacimientoUsuario() {
		return fcNacimientoUsuario;
	}

	public void setFcNacimientoUsuario(Date fcNacimientoUsuario) {
		this.fcNacimientoUsuario = fcNacimientoUsuario;
	}
	
	

}
