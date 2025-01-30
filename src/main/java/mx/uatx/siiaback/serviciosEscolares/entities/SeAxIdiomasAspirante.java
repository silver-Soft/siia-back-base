package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXIDIOMASASPIRANTE")
public class SeAxIdiomasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7913517574937891873L;

	private static final String GENID_IDIOMAS_ASPIRANTE = "GENIDIDIOMAASPIRANTE";

	@Id
	@Basic(optional = false)
	@Column(name = "IDIDIOMAASPIRANTE")
	@SequenceGenerator(name = GENID_IDIOMAS_ASPIRANTE, sequenceName = "SERESC.IDIDIOMAASPIRANTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_IDIOMAS_ASPIRANTE)
	private Long lngIdIdiomaAspirante;

	@Column(name = "IDIDIOMA")
	private Integer intIdIdioma;

	@Column(name = "NIVELLECTURA")
	private String strNivelLectura;

	@Column(name = "NIVELCONVERSACION")
	private String strNivelConversacion;

	@Column(name = "NIVELESCRITURA")
	private String strNivelEscritura;

	@Column(name = "CERTIFICACION")
	private String strCertificacion;

	@Column(name = "PUNTAJE")
	private String strPuntaje;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;
	
	@Column(name = "ANIOCERTIFICACION")
	private Integer intAnioCertificacion;
	
	@Column(name = "ARCHIVOCERTIFICACION")
	private byte[] archivoCertificacion;

	public Long getLngIdIdiomaAspirante() {
		return lngIdIdiomaAspirante;
	}

	public void setLngIdIdiomaAspirante(Long lngIdIdiomaAspirante) {
		this.lngIdIdiomaAspirante = lngIdIdiomaAspirante;
	}

	public Integer getIntIdIdioma() {
		return intIdIdioma;
	}

	public void setIntIdIdioma(Integer intIdIdioma) {
		this.intIdIdioma = intIdIdioma;
	}

	public String getStrNivelLectura() {
		return strNivelLectura;
	}

	public void setStrNivelLectura(String strNivelLectura) {
		this.strNivelLectura = strNivelLectura;
	}

	public String getStrNivelConversacion() {
		return strNivelConversacion;
	}

	public void setStrNivelConversacion(String strNivelConversacion) {
		this.strNivelConversacion = strNivelConversacion;
	}

	public String getStrNivelEscritura() {
		return strNivelEscritura;
	}

	public void setStrNivelEscritura(String strNivelEscritura) {
		this.strNivelEscritura = strNivelEscritura;
	}

	public String getStrCertificacion() {
		return strCertificacion;
	}

	public void setStrCertificacion(String strCertificacion) {
		this.strCertificacion = strCertificacion;
	}

	public String getStrPuntaje() {
		return strPuntaje;
	}

	public void setStrPuntaje(String strPuntaje) {
		this.strPuntaje = strPuntaje;
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

	public Integer getIntAnioCertificacion() {
		return intAnioCertificacion;
	}

	public void setIntAnioCertificacion(Integer intAnioCertificacion) {
		this.intAnioCertificacion = intAnioCertificacion;
	}

	public byte[] getArchivoCertificacion() {
		return archivoCertificacion;
	}

	public void setArchivoCertificacion(byte[] archivoCertificacion) {
		this.archivoCertificacion = archivoCertificacion;
	}

}
