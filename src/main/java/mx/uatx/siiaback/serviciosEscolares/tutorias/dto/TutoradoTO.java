package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtTutoradosTutor;

public class TutoradoTO implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5688455697788472315L;

	private Boolean blnSeleccionar;

	private Long lngIdTutor;
	private String strMatricula;
	private String strNombre;
	private String strNombreCompleto;
	private String strApellidoPaterno;
	private String strApellidoMaterno;
	private String strProgramaEducativo;
	private Integer intTutoriasRegistradas;
	private Integer intTutoriasFirmadas;
	private Boolean blnTieneBitacora;
	private Boolean blnTieneCeneval;
	private Boolean blnTieneSov;
	private Boolean blnTieneDiagnostico;
	private Boolean blnTienePlan;
	private Boolean blnTieneBoleta;
	private Boolean blnTieneKardex;
	private Boolean blnTieneAvance;
	private Long lngIdSolicitudIngreso;
	private String strPeriodo;

	private String strUrlServerImgs;
	private String strNombreTutor;
	private Integer intNumeroTutorias;
	private String strUsuarioTutor;
	private Long lngIdCuestionarioPersona;
	private Boolean blnPermiteConstancia;

	public TutoradoTO() {
		super();
	}

	public TutoradoTO(final SePaObtTutoradosTutor entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public Long getLngIdTutor() {
		return lngIdTutor;
	}

	public void setLngIdTutor(Long lngIdTutor) {
		this.lngIdTutor = lngIdTutor;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Integer getIntTutoriasRegistradas() {
		return intTutoriasRegistradas;
	}

	public void setIntTutoriasRegistradas(Integer intTutoriasRegistradas) {
		this.intTutoriasRegistradas = intTutoriasRegistradas;
	}

	public Integer getIntTutoriasFirmadas() {
		return intTutoriasFirmadas;
	}

	public void setIntTutoriasFirmadas(Integer intTutoriasFirmadas) {
		this.intTutoriasFirmadas = intTutoriasFirmadas;
	}

	public Boolean getBlnTieneBitacora() {
		return blnTieneBitacora;
	}

	public void setBlnTieneBitacora(Boolean blnTieneBitacora) {
		this.blnTieneBitacora = blnTieneBitacora;
	}

	public Boolean getBlnTieneCeneval() {
		return blnTieneCeneval;
	}

	public void setBlnTieneCeneval(Boolean blnTieneCeneval) {
		this.blnTieneCeneval = blnTieneCeneval;
	}

	public Boolean getBlnTieneSov() {
		return blnTieneSov;
	}

	public void setBlnTieneSov(Boolean blnTieneSov) {
		this.blnTieneSov = blnTieneSov;
	}

	public Boolean getBlnTieneDiagnostico() {
		return blnTieneDiagnostico;
	}

	public void setBlnTieneDiagnostico(Boolean blnTieneDiagnostico) {
		this.blnTieneDiagnostico = blnTieneDiagnostico;
	}

	public Boolean getBlnTienePlan() {
		return blnTienePlan;
	}

	public void setBlnTienePlan(Boolean blnTienePlan) {
		this.blnTienePlan = blnTienePlan;
	}

	public Boolean getBlnTieneBoleta() {
		return blnTieneBoleta;
	}

	public void setBlnTieneBoleta(Boolean blnTieneBoleta) {
		this.blnTieneBoleta = blnTieneBoleta;
	}

	public Boolean getBlnTieneKardex() {
		return blnTieneKardex;
	}

	public void setBlnTieneKardex(Boolean blnTieneKardex) {
		this.blnTieneKardex = blnTieneKardex;
	}

	public Boolean getBlnTieneAvance() {
		return blnTieneAvance;
	}

	public void setBlnTieneAvance(Boolean blnTieneAvance) {
		this.blnTieneAvance = blnTieneAvance;
	}

	public Boolean getBlnSeleccionar() {
		return blnSeleccionar;
	}

	public void setBlnSeleccionar(Boolean blnSeleccionar) {
		this.blnSeleccionar = blnSeleccionar;
	}

	public Long getLngIdSolicitudIngreso() {
		return lngIdSolicitudIngreso;
	}

	public void setLngIdSolicitudIngreso(Long lngIdSolicitudIngreso) {
		this.lngIdSolicitudIngreso = lngIdSolicitudIngreso;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrNombreTutor() {
		return strNombreTutor;
	}

	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}

	public Integer getIntNumeroTutorias() {
		return intNumeroTutorias;
	}

	public void setIntNumeroTutorias(Integer intNumeroTutorias) {
		this.intNumeroTutorias = intNumeroTutorias;
	}

	public String getStrUrlServerImgs() {
		return strUrlServerImgs;
	}

	public void setStrUrlServerImgs(String strUrlServerImgs) {
		this.strUrlServerImgs = strUrlServerImgs;
	}

	public String getStrUsuarioTutor() {
		return strUsuarioTutor;
	}

	public void setStrUsuarioTutor(String strUsuarioTutor) {
		this.strUsuarioTutor = strUsuarioTutor;
	}

	public String getStrNombreCompleto() {

		strNombreCompleto = this.strNombre + " " + this.strApellidoPaterno + " " + this.strApellidoMaterno;

		return strNombreCompleto;

	}

	public void setStrNombreCompleto(String strNombreCompleto) {
		this.strNombreCompleto = strNombreCompleto;
	}

	public Long getLngIdCuestionarioPersona() {
		return lngIdCuestionarioPersona;
	}

	public void setLngIdCuestionarioPersona(Long lngIdCuestionarioPersona) {
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

	public Boolean getBlnPermiteConstancia() {
		return blnPermiteConstancia;
	}

	public void setBlnPermiteConstancia(Boolean blnPermiteConstancia) {
		this.blnPermiteConstancia = blnPermiteConstancia;
	}

}
