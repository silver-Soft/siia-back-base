package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaPublicacionesAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6293094816470060400L;

	@Id
	@Column(name = "IDPUBLICACIONASPIRANTE")
	private Long lngIdPublicacionesAspirante;

	@Column(name = "AUTORES")
	private String strAutores;

	@Column(name = "TITULOPUBLICACION")
	private String strTituloPublicacion;

	@Column(name = "LUGARPUBLICACION")
	private String strLugarPublicacion;

	@Column(name = "EDITORIAL")
	private String strEditorial;

	@Column(name = "ANIOPUBLICACION")
	private Integer intAnioPublicacion;

	@Column(name = "NMPAGINAS")
	private Integer intNumeroPaginas;

	@Column(name = "ARCHIVO")
	@Lob
	private byte[] archivo;

	public Long getLngIdPublicacionesAspirante() {
		return lngIdPublicacionesAspirante;
	}

	public void setLngIdPublicacionesAspirante(Long lngIdPublicacionesAspirante) {
		this.lngIdPublicacionesAspirante = lngIdPublicacionesAspirante;
	}

	public String getStrAutores() {
		return strAutores;
	}

	public void setStrAutores(String strAutores) {
		this.strAutores = strAutores;
	}

	public String getStrTituloPublicacion() {
		return strTituloPublicacion;
	}

	public void setStrTituloPublicacion(String strTituloPublicacion) {
		this.strTituloPublicacion = strTituloPublicacion;
	}

	public String getStrLugarPublicacion() {
		return strLugarPublicacion;
	}

	public void setStrLugarPublicacion(String strLugarPublicacion) {
		this.strLugarPublicacion = strLugarPublicacion;
	}

	public String getStrEditorial() {
		return strEditorial;
	}

	public void setStrEditorial(String strEditorial) {
		this.strEditorial = strEditorial;
	}

	public Integer getIntAnioPublicacion() {
		return intAnioPublicacion;
	}

	public void setIntAnioPublicacion(Integer intAnioPublicacion) {
		this.intAnioPublicacion = intAnioPublicacion;
	}

	public Integer getIntNumeroPaginas() {
		return intNumeroPaginas;
	}

	public void setIntNumeroPaginas(Integer intNumeroPaginas) {
		this.intNumeroPaginas = intNumeroPaginas;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

}
