package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaIdiomasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4328647179950203055L;

	@Id
	@Column(name = "IDIDIOMAASPIRANTE")
	private Long lngIdIdiomaAspirante;

	@Column(name = "IDIDIOMA")
	private Integer intIdIdioma;

	@Column(name = "NOMBRE_IDIOMA")
	private String strNombreIdioma;

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

	public String getStrNombreIdioma() {
		return strNombreIdioma;
	}

	public void setStrNombreIdioma(String strNombreIdioma) {
		this.strNombreIdioma = strNombreIdioma;
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
