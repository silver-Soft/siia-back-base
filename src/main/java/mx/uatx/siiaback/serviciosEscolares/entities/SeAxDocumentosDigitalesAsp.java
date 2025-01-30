package mx.uatx.siiaback.serviciosEscolares.entities;

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

@Entity
@Table(schema = "SERESC", name = "SEAXDOCUMENTOSDIGITALESASP")
public class SeAxDocumentosDigitalesAsp implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 204598688407214140L;

	private static final String GENID_DOCUMENTOS_DIGITALES_ASP = "GENIDDOCUMENTODIGITALASP";

	@Id
	@Basic(optional = false)
	@Column(name = "IDDOCUMENTODIGITALASP")
	@SequenceGenerator(name = GENID_DOCUMENTOS_DIGITALES_ASP, sequenceName = "SERESC.IDDOCUMENTODIGITALASP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_DOCUMENTOS_DIGITALES_ASP)
	private Long lngIdDocumentoDigitalAsp;

	@Column(name = "ACTANACIMIENTO")
	@Lob
	private byte[] archivoActaNacimiento;

	@Column(name = "TITULO")
	@Lob
	private byte[] archivoTitulo;

	@Column(name = "INE")
	@Lob
	private byte[] archivoINE;

	@Column(name = "CERTIFICADO")
	@Lob
	private byte[] archivoCertificado;

	@Column(name = "CARTAMOTIVOS")
	@Lob
	private byte[] archivoCartaMotivos;

	@Column(name = "CURRICULUM")
	@Lob
	private byte[] archivoCurriculum;

	@Column(name = "CEDULA")
	@Lob
	private byte[] archivoCedula;
	
	@Column(name = "PROYECTOINVESTIGACION")
	@Lob
	private byte[] archivoProyectoInvestigacion;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	public Long getLngIdDocumentoDigitalAsp() {
		return lngIdDocumentoDigitalAsp;
	}

	public void setLngIdDocumentoDigitalAsp(Long lngIdDocumentoDigitalAsp) {
		this.lngIdDocumentoDigitalAsp = lngIdDocumentoDigitalAsp;
	}

	public byte[] getArchivoActaNacimiento() {
		return archivoActaNacimiento;
	}

	public void setArchivoActaNacimiento(byte[] archivoActaNacimiento) {
		this.archivoActaNacimiento = archivoActaNacimiento;
	}

	public byte[] getArchivoTitulo() {
		return archivoTitulo;
	}

	public void setArchivoTitulo(byte[] archivoTitulo) {
		this.archivoTitulo = archivoTitulo;
	}

	public byte[] getArchivoINE() {
		return archivoINE;
	}

	public void setArchivoINE(byte[] archivoINE) {
		this.archivoINE = archivoINE;
	}

	public byte[] getArchivoCertificado() {
		return archivoCertificado;
	}

	public void setArchivoCertificado(byte[] archivoCertificado) {
		this.archivoCertificado = archivoCertificado;
	}

	public byte[] getArchivoCartaMotivos() {
		return archivoCartaMotivos;
	}

	public void setArchivoCartaMotivos(byte[] archivoCartaMotivos) {
		this.archivoCartaMotivos = archivoCartaMotivos;
	}

	public byte[] getArchivoCurriculum() {
		return archivoCurriculum;
	}

	public void setArchivoCurriculum(byte[] archivoCurriculum) {
		this.archivoCurriculum = archivoCurriculum;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}

	public byte[] getArchivoCedula() {
		return archivoCedula;
	}

	public void setArchivoCedula(byte[] archivoCedula) {
		this.archivoCedula = archivoCedula;
	}

	public byte[] getArchivoProyectoInvestigacion() {
		return archivoProyectoInvestigacion;
	}

	public void setArchivoProyectoInvestigacion(byte[] archivoProyectoInvestigacion) {
		this.archivoProyectoInvestigacion = archivoProyectoInvestigacion;
	}

}
