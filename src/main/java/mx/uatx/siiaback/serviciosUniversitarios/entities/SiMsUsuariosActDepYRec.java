/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SIIUAT", name = "SIMSUSUARIOSACTDEPYREC")
public class SiMsUsuariosActDepYRec implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1933781356913137879L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENIDUSUARIOACTDEPYREC", sequenceName = "SIIUAT.IDUSUARIOACTDEPYREC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDUSUARIOACTDEPYREC")
	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	@Column(name = "NBUSUARIO")
	private String strNbUsuario;

	@Column(name = "APPATERNOUSUARIO")
	private String strApPaternoUsuario;

	@Column(name = "APMATERNOUSUARIO")
	private String strApMaternoUsuario;

	@Column(name = "IDENTIDADNACIMIENTO")
	private Integer intIdEntidadNacimiento;

	@Column(name = "FCNACIMIENTOUSUARIO")
	@Temporal(TemporalType.DATE)
	private Date fcNacimientoUsuario;

	@Column(name = "CURPUSUARIO")
	private String strCurpUsuario;

	@Column(name = "CLGENERO")
	private Integer intCveGenero;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;

	@Column(name = "FCREGISTROUSUARIO")
	@Temporal(TemporalType.DATE)
	private Date fcRegistroUsuario;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	@Column(name = "CLASENTAMIENTO")
	private Long lngIdLocalidad;

	@Column(name = "NBCALLE")
	private String strNbCalle;

	@Column(name = "NMEXTERIOR")
	private String strNmExterior;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "MATRICULANUMEMP")
	private String strMatriculaNumEmp;

	@Column(name = "CLPERIODOCURSADO")
	private Integer intCvePeriodoCursado;

	@Column(name = "CLTURNOS")
	private String strCveTurnos;

	@Column(name = "DSCORREOELECTRONICO")
	private String strDsCorreoElectronico;

	@Column(name = "NMTELEFONOCASA")
	private String strNmTelefonoCasa;

	@Column(name = "NMTELEFONOOFICINA")
	private String strNmTelefonoOficina;

	@Column(name = "NMTELEFONOMOVIL")
	private String strNmTelefonoMovil;

	@Column(name = "IDTIPOACTDEPYREC")
	private Integer intIdTipoActDepYRec;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "HORARIOSABATINO")
	private String strHorarioSb;

	@Column(name = "DIAS")
	private String strDias;

	@Column(name = "NBFAMILIAREMERGENCIA")
	private String strNbFamiliarEmergencia;

	@Column(name = "NMTELEFONOEMERGENCIA")
	private String strNmTelefonoEmergencia;

	@Column(name = "CLESTATUSREVISIONMEDICA")
	private Integer intCveEstatusRevicionMedica;

	@Column(name = "IDGRUPOSANGUINEO")
	private Integer intIdGrupoSanguineo;

	@Column(name = "DSALERGIA")
	private String strAlergia;

	@Column(name = "PESO")
	private String strPeso;

	@Column(name = "ESTATURA")
	private String strEstatura;

	@Column(name = "TALLA")
	private String strTalla;

	@Column(name = "TIPOUSUARIO")
	private String strTipoUsuario;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "CLESTATUSVALIDADO")
	private Integer intCveEstatusValidado;
	
	@Column(name = "NMHORAS")
	private Integer intNmHoras;
	
	@Lob
    @Column(name = "FOTO")
    private byte[] btyFoto;

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

	public String getStrApPaternoUsuario() {
		return strApPaternoUsuario;
	}

	public void setStrApPaternoUsuario(String strApPaternoUsuario) {
		this.strApPaternoUsuario = strApPaternoUsuario;
	}

	public String getStrApMaternoUsuario() {
		return strApMaternoUsuario;
	}

	public void setStrApMaternoUsuario(String strApMaternoUsuario) {
		this.strApMaternoUsuario = strApMaternoUsuario;
	}

	public Integer getIntIdEntidadNacimiento() {
		return intIdEntidadNacimiento;
	}

	public void setIntIdEntidadNacimiento(Integer intIdEntidadNacimiento) {
		this.intIdEntidadNacimiento = intIdEntidadNacimiento;
	}

	public Date getFcNacimientoUsuario() {
		return fcNacimientoUsuario;
	}

	public void setFcNacimientoUsuario(Date fcNacimientoUsuario) {
		this.fcNacimientoUsuario = fcNacimientoUsuario;
	}

	public String getStrCurpUsuario() {
		return strCurpUsuario;
	}

	public void setStrCurpUsuario(String strCurpUsuario) {
		this.strCurpUsuario = strCurpUsuario;
	}

	public Integer getIntCveGenero() {
		return intCveGenero;
	}

	public void setIntCveGenero(Integer intCveGenero) {
		this.intCveGenero = intCveGenero;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
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

	public Long getLngIdLocalidad() {
		return lngIdLocalidad;
	}

	public void setLngIdLocalidad(Long lngIdLocalidad) {
		this.lngIdLocalidad = lngIdLocalidad;
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

	public Integer getIntCvePeriodoCursado() {
		return intCvePeriodoCursado;
	}

	public void setIntCvePeriodoCursado(Integer intCvePeriodoCursado) {
		this.intCvePeriodoCursado = intCvePeriodoCursado;
	}

	public String getStrCveTurnos() {
		return strCveTurnos;
	}

	public void setStrCveTurnos(String strCveTurnos) {
		this.strCveTurnos = strCveTurnos;
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

	public Integer getIntIdTipoActDepYRec() {
		return intIdTipoActDepYRec;
	}

	public void setIntIdTipoActDepYRec(Integer intIdTipoActDepYRec) {
		this.intIdTipoActDepYRec = intIdTipoActDepYRec;
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

	public Integer getIntCveEstatusRevicionMedica() {
		return intCveEstatusRevicionMedica;
	}

	public void setIntCveEstatusRevicionMedica(Integer intCveEstatusRevicionMedica) {
		this.intCveEstatusRevicionMedica = intCveEstatusRevicionMedica;
	}

	public Integer getIntIdGrupoSanguineo() {
		return intIdGrupoSanguineo;
	}

	public void setIntIdGrupoSanguineo(Integer intIdGrupoSanguineo) {
		this.intIdGrupoSanguineo = intIdGrupoSanguineo;
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

	public Integer getIntCveEstatusValidado() {
		return intCveEstatusValidado;
	}

	public void setIntCveEstatusValidado(Integer intCveEstatusValidado) {
		this.intCveEstatusValidado = intCveEstatusValidado;
	}

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	public String getStrHorarioSb() {
		return strHorarioSb;
	}

	public void setStrHorarioSb(String strHorarioSb) {
		this.strHorarioSb = strHorarioSb;
	}

	public Integer getIntNmHoras() {
		return intNmHoras;
	}

	public void setIntNmHoras(Integer intNmHoras) {
		this.intNmHoras = intNmHoras;
	}

	public byte[] getBtyFoto() {
		return btyFoto;
	}

	public void setBtyFoto(byte[] btyFoto) {
		this.btyFoto = btyFoto;
	}

}
