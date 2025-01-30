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
@Table(schema = "SERESC", name = "SEAXPUBLICACIONESASPIRANTE")
public class SeAxPublicacionesAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1878581834456686035L;

	private static final String GENID_PUBLICACIONES_ASP = "GENIDPUBLICACIONASPIRANTE";

	@Id
	@Basic(optional = false)
	@Column(name = "IDPUBLICACIONASPIRANTE")
	@SequenceGenerator(name = GENID_PUBLICACIONES_ASP, sequenceName = "SERESC.IDPUBLICACIONASPIRANTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_PUBLICACIONES_ASP)
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

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

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

}
