package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SECTPREGUNTAS")
public class SeCtPreguntas {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPREGUNTA", sequenceName = "SERESC.IDPREGUNTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPREGUNTA")
	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;

	@Column(name = "CLCLASIFICACIONPREGUNTA")
	private String strClClasificacionPregunta;

	@Column(name = "CLTIPOPREGUNTA")
	private String strClTipoPregunta;

	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDGRUPORESPUESTA")
	private Integer intIdGrupoRespuesta;

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public String getStrClClasificacionPregunta() {
		return strClClasificacionPregunta;
	}

	public void setStrClClasificacionPregunta(String strClClasificacionPregunta) {
		this.strClClasificacionPregunta = strClClasificacionPregunta;
	}

	public String getStrClTipoPregunta() {
		return strClTipoPregunta;
	}

	public void setStrClTipoPregunta(String strClTipoPregunta) {
		this.strClTipoPregunta = strClTipoPregunta;
	}

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
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

	public Integer getIntIdGrupoRespuesta() {
		return intIdGrupoRespuesta;
	}

	public void setIntIdGrupoRespuesta(Integer intIdGrupoRespuesta) {
		this.intIdGrupoRespuesta = intIdGrupoRespuesta;
	}

}