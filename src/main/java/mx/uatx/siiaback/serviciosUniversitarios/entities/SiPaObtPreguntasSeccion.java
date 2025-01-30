package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtPreguntasSeccion {
	
	@Id
	@Column(name = "ROWNUM")
	private Integer id;
	
	@Column(name = "IDSECCIONPREGUNTA")
	private Long idSeccionPregunta;

	@Column(name = "CLTIPOPREGUNTA")
	private Integer clTipoPregunta;

	@Column(name = "DSPREGUNTA")
	private String dsPregunta;

	@Column(name = "IDAXGRUPORESPUESTA")
	private Long idAxGrupoRespuesta;

	@Column(name = "DSRESPUESTA")
	private String dsRespuesta;

	@Column(name = "PREGUNTATIENEDEPENDENCIA")
	private Boolean preguntaTieneDependencia;

	@Column(name = "PREGUNTAACTIVAINICIAL")
	private Boolean preguntaActivaInicial;

	@Column(name = "PREGUNTASDEPENDIENTES")
	private String preguntasDependientes;

	@Column(name = "ESREQUERIDO")
	private Boolean esRequerido;

	@Column(name = "IDRESPUESTACUESTIONARIO")
	private Long idRespuestaCuestionario;

	@Column(name = "DOCUMENTOSOPORTE")
	private byte[] documentoSoporte;

	@Column(name = "DSRESPUESTATEXTO")
	private String dsRespuestaTexto;

	@Column(name = "URLDOCUMENTO")
	private String urlDocumento;

	@Column(name = "IDRESPUESTA")
	private Long idRespuesta;

	@Column(name = "DSRESPUESTACONTESTADA")
	private String dsRespuestaContestada;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getIdSeccionPregunta() {
		return idSeccionPregunta;
	}
	public void setIdSeccionPregunta(Long idSeccionPregunta) {
		this.idSeccionPregunta = idSeccionPregunta;
	}
	public Integer getClTipoPregunta() {
		return clTipoPregunta;
	}
	public void setClTipoPregunta(Integer clTipoPregunta) {
		this.clTipoPregunta = clTipoPregunta;
	}
	public String getDsPregunta() {
		return dsPregunta;
	}
	public void setDsPregunta(String dsPregunta) {
		this.dsPregunta = dsPregunta;
	}
	public Long getIdAxGrupoRespuesta() {
		return idAxGrupoRespuesta;
	}
	public void setIdAxGrupoRespuesta(Long idAxGrupoRespuesta) {
		this.idAxGrupoRespuesta = idAxGrupoRespuesta;
	}
	public String getDsRespuesta() {
		return dsRespuesta;
	}
	public void setDsRespuesta(String dsRespuesta) {
		this.dsRespuesta = dsRespuesta;
	}
	public Boolean getPreguntaTieneDependencia() {
		return preguntaTieneDependencia;
	}
	public void setPreguntaTieneDependencia(Boolean preguntaTieneDependencia) {
		this.preguntaTieneDependencia = preguntaTieneDependencia;
	}
	public Boolean getPreguntaActivaInicial() {
		return preguntaActivaInicial;
	}
	public void setPreguntaActivaInicial(Boolean preguntaActivaInicial) {
		this.preguntaActivaInicial = preguntaActivaInicial;
	}
	public Boolean getEsRequerido() {
		return esRequerido;
	}
	public void setEsRequerido(Boolean esRequerido) {
		this.esRequerido = esRequerido;
	}
	public Long getIdRespuestaCuestionario() {
		return idRespuestaCuestionario;
	}
	public void setIdRespuestaCuestionario(Long idRespuestaCuestionario) {
		this.idRespuestaCuestionario = idRespuestaCuestionario;
	}
	public byte[] getDocumentoSoporte() {
		return documentoSoporte;
	}
	public void setDocumentoSoporte(byte[] documentoSoporte) {
		this.documentoSoporte = documentoSoporte;
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
	public Long getIdRespuesta() {
		return idRespuesta;
	}
	public void setIdRespuesta(Long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}
	public String getDsRespuestaContestada() {
		return dsRespuestaContestada;
	}
	public void setDsRespuestaContestada(String dsRespuestaContestada) {
		this.dsRespuestaContestada = dsRespuestaContestada;
	}
	public String getPreguntasDependientes() {
		return preguntasDependientes;
	}
	public void setPreguntasDependientes(String preguntasDependientes) {
		this.preguntasDependientes = preguntasDependientes;
	}

}
