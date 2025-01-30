package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

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

@Entity
@Table(schema = "SERESC", name = "SEAXENVIOSTITULOS")
public class SeAxEnviosTitulos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1785004168243419049L;
	private static final String GENIDENVIOTITULO = "GENIDENVIOTITULO";

	@Id
	@Column(name = "IDENVIOTITULO")
	@SequenceGenerator(name = GENIDENVIOTITULO, sequenceName = "SERESC.IDENVIOTITULO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENIDENVIOTITULO)
	private Integer intIdEnvioTitulo;

	@Column(name = "IDSOLICITUDEXPTITULACION")
	private Integer intIdSolicitudExpTitulacion;

	@Column(name = "FOLIORECEPPROFESIONES")
	private Integer intIdFolioRecepcionProfesiones;

	@Column(name = "IDPERSONAENVIOPROFESIONES")
	private Long lngIdPersonaEnvioProfesiones;

	@Column(name = "FCENVIOPROFESIONES")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcEnvioProfeciones = new Date();

	@Column(name = "FCRESPUESTAPROFESIONES")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcRespuestaProfesiones = new Date();

	@Lob
	@Column(name = "ARCHIVOTITULOS", nullable = false)
	private byte[] archivoZipGenerado;

	@Lob
	@Column(name = "ARCHIVORESPUESTAPROF", nullable = false)
	private byte[] archivoExcelDescargado;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public SeAxEnviosTitulos() {
		super();
	}

	public Integer getIntIdEnvioTitulo() {
		return intIdEnvioTitulo;
	}

	public void setIntIdEnvioTitulo(Integer intIdEnvioTitulo) {
		this.intIdEnvioTitulo = intIdEnvioTitulo;
	}

	public Integer getIntIdSolicitudExpTitulacion() {
		return intIdSolicitudExpTitulacion;
	}

	public void setIntIdSolicitudExpTitulacion(Integer intIdSolicitudExpTitulacion) {
		this.intIdSolicitudExpTitulacion = intIdSolicitudExpTitulacion;
	}

	public Integer getIntIdFolioRecepcionProfesiones() {
		return intIdFolioRecepcionProfesiones;
	}

	public void setIntIdFolioRecepcionProfesiones(Integer intIdFolioRecepcionProfesiones) {
		this.intIdFolioRecepcionProfesiones = intIdFolioRecepcionProfesiones;
	}

	

	public Long getLngIdPersonaEnvioProfesiones() {
		return lngIdPersonaEnvioProfesiones;
	}

	public void setLngIdPersonaEnvioProfesiones(Long lngIdPersonaEnvioProfesiones) {
		this.lngIdPersonaEnvioProfesiones = lngIdPersonaEnvioProfesiones;
	}

	public Date getFcEnvioProfeciones() {
		return fcEnvioProfeciones;
	}

	public void setFcEnvioProfeciones(Date fcEnvioProfeciones) {
		this.fcEnvioProfeciones = fcEnvioProfeciones;
	}

	public byte[] getArchivoZipGenerado() {
		return archivoZipGenerado;
	}

	public void setArchivoZipGenerado(byte[] archivoZipGenerado) {
		this.archivoZipGenerado = archivoZipGenerado;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public byte[] getArchivoExcelDescargado() {
		return archivoExcelDescargado;
	}

	public void setArchivoExcelDescargado(byte[] archivoExcelDescargado) {
		this.archivoExcelDescargado = archivoExcelDescargado;
	}

	public Date getFcRespuestaProfesiones() {
		return fcRespuestaProfesiones;
	}

	public void setFcRespuestaProfesiones(Date fcRespuestaProfesiones) {
		this.fcRespuestaProfesiones = fcRespuestaProfesiones;
	}

}
