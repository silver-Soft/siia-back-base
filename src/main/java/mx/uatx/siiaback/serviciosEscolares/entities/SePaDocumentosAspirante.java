package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDocumentosAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5481521059864416060L;

	@Id
	@Column(name = "IDDOCUMENTODIGITALASP")
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
