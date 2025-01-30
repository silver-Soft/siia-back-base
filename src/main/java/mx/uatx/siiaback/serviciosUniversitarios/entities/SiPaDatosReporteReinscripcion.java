package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDatosReporteReinscripcion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5599132932963162765L;

	@Id
	@Column(name = "TIPOFORMATO")
	private String strTipoInscripcion;

	@Column(name = "IMPRESION")
	private Integer intImprimirReportePago;

	@Column(name = "FOLIO")
	private Long lngFolio;

	@Column(name = "FECHA")
	private Date fcInscripcion;

	@Column(name = "SEMESTRE")
	private String strSemestre;

	@Column(name = "PERIODO")
	private String strPeriodo;

	@Column(name = "TELEFONOCEL")
	private String strTelefonoEstudiante;

	@Column(name = "CODIGOCALIDAD")
	private String strCodigoCalidad;

	@Column(name = "LEYENDA")
	private String strLeyenda;

	@Column(name = "IDCONCEPTOPAGO")
	private Long lngIdConceptoPago;

	@Column(name = "MONTOPAGO")
	private Double dbConceptoPago;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NBPERSONA")
	private String strNombreEstudiante;

	@Column(name = "APPATERNO")
	private String strApPaternoEstudiante;

	@Column(name = "APMATERNO")
	private String strApMaternoEstudiante;

	@Column(name = "DSESTADOCIVIL")
	private String strEstadoCivilEstudiante;

	@Column(name = "SERVICIOMEDICO")
	private String strServicioMedicoEstudiante;

	@Column(name = "DSGENERO")
	private String strGeneroEstudiante;

	@Column(name = "FOTOGRAFIA")
	private byte[] fotografia;

	@Column(name = "NBCALLE")
	private String strCalleEstudiante;

	@Column(name = "NMEXTERIOR")
	private String strNumExteriorEstudiante;

	@Column(name = "NBASENTAMIENTO")
	private String strColoniaEstudiante;

	@Column(name = "NBMUNICIPIO")
	private String strMunicipioEstudiante;

	@Column(name = "NBENTIDAD")
	private String strEstadoEstudiante;

	@Column(name = "NOMBRETUTOR")
	private String strNombreTutor;

	@Column(name = "APPATERNOTUTOR")
	private String strApPaternoTutor;

	@Column(name = "APMATERNOTUTOR")
	private String strApMaternoTutor;

	@Column(name = "NBCALLETUTOR")
	private String strCalleTutor;

	@Column(name = "NMEXTERIORTUTOR")
	private String strNumExteriorTutor;

	@Column(name = "NBASENTAMIENTOTUTOR")
	private String strColoniaTutor;

	@Column(name = "NBMUNICIPIOTUTOR")
	private String strMunicipioTutor;

	@Column(name = "NBENTIDADTUTOR")
	private String strEstadoTutor;

	@Column(name = "NMTELEFONOTUTOR")
	private String strTelefonoTutor;

	@Column(name = "PROGRAMACAMPUS")
	private String strPrograma;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "ESPOSGRADO")
	private Boolean blnEsProsgrado;
	
	public String getStrTipoInscripcion() {
		return strTipoInscripcion;
	}

	public void setStrTipoInscripcion(String strTipoInscripcion) {
		this.strTipoInscripcion = strTipoInscripcion;
	}

	public Long getLngFolio() {
		return lngFolio;
	}

	public void setLngFolio(Long lngFolio) {
		this.lngFolio = lngFolio;
	}

	public Date getFcInscripcion() {
		return fcInscripcion;
	}

	public void setFcInscripcion(Date fcInscripcion) {
		this.fcInscripcion = fcInscripcion;
	}

	public String getStrSemestre() {
		return strSemestre;
	}

	public void setStrSemestre(String strSemestre) {
		this.strSemestre = strSemestre;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrTelefonoEstudiante() {
		return strTelefonoEstudiante;
	}

	public void setStrTelefonoEstudiante(String strTelefonoEstudiante) {
		this.strTelefonoEstudiante = strTelefonoEstudiante;
	}

	public String getStrCodigoCalidad() {
		return strCodigoCalidad;
	}

	public void setStrCodigoCalidad(String strCodigoCalidad) {
		this.strCodigoCalidad = strCodigoCalidad;
	}

	public String getStrLeyenda() {
		return strLeyenda;
	}

	public void setStrLeyenda(String strLeyenda) {
		this.strLeyenda = strLeyenda;
	}

	public Long getLngIdConceptoPago() {
		return lngIdConceptoPago;
	}

	public void setLngIdConceptoPago(Long lngIdConceptoPago) {
		this.lngIdConceptoPago = lngIdConceptoPago;
	}

	public Double getDbConceptoPago() {
		return dbConceptoPago;
	}

	public void setDbConceptoPago(Double dbConceptoPago) {
		this.dbConceptoPago = dbConceptoPago;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombreEstudiante() {
		return strNombreEstudiante;
	}

	public void setStrNombreEstudiante(String strNombreEstudiante) {
		this.strNombreEstudiante = strNombreEstudiante;
	}

	public String getStrApPaternoEstudiante() {
		return strApPaternoEstudiante;
	}

	public void setStrApPaternoEstudiante(String strApPaternoEstudiante) {
		this.strApPaternoEstudiante = strApPaternoEstudiante;
	}

	public String getStrApMaternoEstudiante() {
		return strApMaternoEstudiante;
	}

	public void setStrApMaternoEstudiante(String strApMaternoEstudiante) {
		this.strApMaternoEstudiante = strApMaternoEstudiante;
	}

	public String getStrEstadoCivilEstudiante() {
		return strEstadoCivilEstudiante;
	}

	public void setStrEstadoCivilEstudiante(String strEstadoCivilEstudiante) {
		this.strEstadoCivilEstudiante = strEstadoCivilEstudiante;
	}

	public String getStrServicioMedicoEstudiante() {
		return strServicioMedicoEstudiante;
	}

	public void setStrServicioMedicoEstudiante(String strServicioMedicoEstudiante) {
		this.strServicioMedicoEstudiante = strServicioMedicoEstudiante;
	}

	public String getStrGeneroEstudiante() {
		return strGeneroEstudiante;
	}

	public void setStrGeneroEstudiante(String strGeneroEstudiante) {
		this.strGeneroEstudiante = strGeneroEstudiante;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public String getStrCalleEstudiante() {
		return strCalleEstudiante;
	}

	public void setStrCalleEstudiante(String strCalleEstudiante) {
		this.strCalleEstudiante = strCalleEstudiante;
	}

	public String getStrNumExteriorEstudiante() {
		return strNumExteriorEstudiante;
	}

	public void setStrNumExteriorEstudiante(String strNumExteriorEstudiante) {
		this.strNumExteriorEstudiante = strNumExteriorEstudiante;
	}

	public String getStrColoniaEstudiante() {
		return strColoniaEstudiante;
	}

	public void setStrColoniaEstudiante(String strColoniaEstudiante) {
		this.strColoniaEstudiante = strColoniaEstudiante;
	}

	public String getStrMunicipioEstudiante() {
		return strMunicipioEstudiante;
	}

	public void setStrMunicipioEstudiante(String strMunicipioEstudiante) {
		this.strMunicipioEstudiante = strMunicipioEstudiante;
	}

	public String getStrEstadoEstudiante() {
		return strEstadoEstudiante;
	}

	public void setStrEstadoEstudiante(String strEstadoEstudiante) {
		this.strEstadoEstudiante = strEstadoEstudiante;
	}

	public String getStrNombreTutor() {
		return strNombreTutor;
	}

	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}

	public String getStrApPaternoTutor() {
		return strApPaternoTutor;
	}

	public void setStrApPaternoTutor(String strApPaternoTutor) {
		this.strApPaternoTutor = strApPaternoTutor;
	}

	public String getStrApMaternoTutor() {
		return strApMaternoTutor;
	}

	public void setStrApMaternoTutor(String strApMaternoTutor) {
		this.strApMaternoTutor = strApMaternoTutor;
	}

	public String getStrCalleTutor() {
		return strCalleTutor;
	}

	public void setStrCalleTutor(String strCalleTutor) {
		this.strCalleTutor = strCalleTutor;
	}

	public String getStrNumExteriorTutor() {
		return strNumExteriorTutor;
	}

	public void setStrNumExteriorTutor(String strNumExteriorTutor) {
		this.strNumExteriorTutor = strNumExteriorTutor;
	}

	public String getStrColoniaTutor() {
		return strColoniaTutor;
	}

	public void setStrColoniaTutor(String strColoniaTutor) {
		this.strColoniaTutor = strColoniaTutor;
	}

	public String getStrMunicipioTutor() {
		return strMunicipioTutor;
	}

	public void setStrMunicipioTutor(String strMunicipioTutor) {
		this.strMunicipioTutor = strMunicipioTutor;
	}

	public String getStrEstadoTutor() {
		return strEstadoTutor;
	}

	public void setStrEstadoTutor(String strEstadoTutor) {
		this.strEstadoTutor = strEstadoTutor;
	}

	public String getStrTelefonoTutor() {
		return strTelefonoTutor;
	}

	public void setStrTelefonoTutor(String strTelefonoTutor) {
		this.strTelefonoTutor = strTelefonoTutor;
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

	public Integer getIntImprimirReportePago() {
		return intImprimirReportePago;
	}

	public void setIntImprimirReportePago(Integer intImprimirReportePago) {
		this.intImprimirReportePago = intImprimirReportePago;
	}

	public Boolean getBlnEsProsgrado() {
		return blnEsProsgrado;
	}

	public void setBlnEsProsgrado(Boolean blnEsProsgrado) {
		this.blnEsProsgrado = blnEsProsgrado;
	}

}
