package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDtExpedienteTitulacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6908797241662525361L;

	@Id
	@Column(name = "IDDTSOLICITUDEXPTITULACION")
	private Long lngIdDtSolicitudExptitulacion;

	@Column(name = "IDHISTORIALACADEMICO")
	private Integer idHistorialAcademico;

	@Column(name = "CLESTATUSPERMITIDO")
	private Integer intClEstatus;

	@Column(name = "IDSOLICITUDEXPTITULACION")
	private Integer intIdSolicitudExpediente;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "NOMBRE")
	private String strNombreCompleto;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaEducativo;

	@Column(name = "PERMITEFIRMASEC")
	private Boolean blnPermiteFirmaSec;

	@Column(name = "PERMITEFIRMAREC")
	private Boolean blnPermiteFirmaRec;

	@Column(name = "CADENAORIGINAL")
	private String strCadena;
	
	@Column(name = "CADENAORIGINALRECTOR")
	private String strCadenaRector;

	@Column(name = "IDTITULO")
	private Long lngIdTitulo;

	public Long getLngIdDtSolicitudExptitulacion() {
		return lngIdDtSolicitudExptitulacion;
	}

	public void setLngIdDtSolicitudExptitulacion(Long lngIdDtSolicitudExptitulacion) {
		this.lngIdDtSolicitudExptitulacion = lngIdDtSolicitudExptitulacion;
	}

	public Integer getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Integer idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntIdSolicitudExpediente() {
		return intIdSolicitudExpediente;
	}

	public void setIntIdSolicitudExpediente(Integer intIdSolicitudExpediente) {
		this.intIdSolicitudExpediente = intIdSolicitudExpediente;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
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

	public String getStrNombreCompleto() {
		return strNombreCompleto;
	}

	public void setStrNombreCompleto(String strNombreCompleto) {
		this.strNombreCompleto = strNombreCompleto;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Boolean getBlnPermiteFirmaSec() {
		return blnPermiteFirmaSec;
	}

	public void setBlnPermiteFirmaSec(Boolean blnPermiteFirmaSec) {
		this.blnPermiteFirmaSec = blnPermiteFirmaSec;
	}

	public Boolean getBlnPermiteFirmaRec() {
		return blnPermiteFirmaRec;
	}

	public void setBlnPermiteFirmaRec(Boolean blnPermiteFirmaRec) {
		this.blnPermiteFirmaRec = blnPermiteFirmaRec;
	}

	public String getStrCadena() {
		return strCadena;
	}

	public void setStrCadena(String strCadena) {
		this.strCadena = strCadena;
	}

	public Long getLngIdTitulo() {
		return lngIdTitulo;
	}

	public void setLngIdTitulo(Long lngIdTitulo) {
		this.lngIdTitulo = lngIdTitulo;
	}

	public String getStrCadenaRector() {
		return strCadenaRector;
	}

	public void setStrCadenaRector(String strCadenaRector) {
		this.strCadenaRector = strCadenaRector;
	}

}
