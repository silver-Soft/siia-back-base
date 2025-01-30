package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDtRespuestasEvaluacion {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DSPREGUNTA")
	private String dsPregunta;
	
	@Column(name = "DSRESPUESTATEXTO")
	private String dsRespuestaTexto;
	
	@Column(name = "URLDOCUMENTO")
	private String urlDocumento;
	
	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;
	
	@Column(name = "IDRESPUESTACUESTIONARIO")
	private Long idRespuestaCuestionario;
	
	@Column(name = "DESCRIPCION")
	private String seccion;
	
	@Column(name = "PERMITEVERDOCUMENTO")
	private Boolean permiteVerDocumento;
	
	@Column(name = "PERMITEVERSEGUNDODOCUMENTO")
	private Boolean permiteVerSegundoDocumento;
	
	@Column(name = "PUNTAJEOBTENIDO")
	private Double puntajeObtenido;
	
	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteEliminar;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDsPregunta() {
		return dsPregunta;
	}

	public void setDsPregunta(String dsPregunta) {
		this.dsPregunta = dsPregunta;
	}

	public String getDsRespuestaTexto() {
		return dsRespuestaTexto;
	}

	public void setDsRespuestaTexto(String dsRespuestaTexto) {
		this.dsRespuestaTexto = dsRespuestaTexto;
	}

	public String getUrlDocumento() {
		return urlDocumento;
	}

	public void setUrlDocumento(String urlDocumento) {
		this.urlDocumento = urlDocumento;
	}

	public String getDsCuestionario() {
		return dsCuestionario;
	}

	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}

	public Long getIdRespuestaCuestionario() {
		return idRespuestaCuestionario;
	}

	public void setIdRespuestaCuestionario(Long idRespuestaCuestionario) {
		this.idRespuestaCuestionario = idRespuestaCuestionario;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Boolean getPermiteVerDocumento() {
		return permiteVerDocumento;
	}

	public void setPermiteVerDocumento(Boolean permiteVerDocumento) {
		this.permiteVerDocumento = permiteVerDocumento;
	}

	public Boolean getPermiteVerSegundoDocumento() {
		return permiteVerSegundoDocumento;
	}

	public void setPermiteVerSegundoDocumento(Boolean permiteVerSegundoDocumento) {
		this.permiteVerSegundoDocumento = permiteVerSegundoDocumento;
	}

	public Double getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(Double puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	public Boolean getPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(Boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}
	
	
}
