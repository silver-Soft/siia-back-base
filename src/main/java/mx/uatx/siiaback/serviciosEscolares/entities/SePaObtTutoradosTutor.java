package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTutoradosTutor implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4065486936464609215L;

	@Id
	@Column(name = "IDTUTOR")
	private Long lngIdTutor;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NBPERSONA")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApellidoPaterno;

	@Column(name = "APMATERNO")
	private String strApellidoMaterno;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaEducativo;

	@Column(name = "TUTREGISTRADAS")
	private Integer intTutoriasRegistradas;

	@Column(name = "TUTFIRMADAS")
	private Integer intTutoriasFirmadas;

	@Column(name = "TIENEBITACORA")
	private Boolean blnTieneBitacora;

	@Column(name = "TIENECENEVAL")
	private Boolean blnTieneCeneval;

	@Column(name = "TIENESOV")
	private Boolean blnTieneSov;

	@Column(name = "TIENEDIAGNOSTICO")
	private Boolean blnTieneDiagnostico;

	@Column(name = "TIENEPLAN")
	private Boolean blnTienePlan;

	@Column(name = "TIENEBOLETA")
	private Boolean blnTieneBoleta;

	@Column(name = "TIENEKARDEX")
	private Boolean blnTieneKardex;

	@Column(name = "TIENEAVANCE")
	private Boolean blnTieneAvance;

	@Column(name = "IDSOLICITUDINGRESO")
	private Long lngIdSolicitudIngreso;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodo;

	@Column(name = "LOGIN")
	private String strUsuarioTutor;
	
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long lngIdCuestionarioPersona;
	
	@Column(name = "PERMITECONSTANCIA")
	private Boolean blnPermiteConstancia;
	
	

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

	public String getStrUsuarioTutor() {
		return strUsuarioTutor;
	}

	public void setStrUsuarioTutor(String strUsuarioTutor) {
		this.strUsuarioTutor = strUsuarioTutor;
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
