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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEMSRESPUESTASCUESTSOLSERSOC")
public class SeMsRespuestasCuestSolSerSoc {
	
	@Id
	@Basic(optional = false)
	@Column(name = "IDRESPUESTACUESTSOLSERSOC")
	@SequenceGenerator(name = "IDRESPUESTACUESTSOLSERSOC", sequenceName = "SERESC.IDRESPUESTACUESTSOLSERSOC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDRESPUESTACUESTSOLSERSOC")
	private Long lngIdRespuestaCuestionario;

	@Column(name = "IDCUESTIONARIOSOLSERSOC")
	private Long lngIdCuestionarioPersona;

	@Column(name = "DSRESPUESTATEXTO")
	private String strRespuestaTexto;

	@Column(name = "FCRESPUESTA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcRespuesta;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDAXGRUPORESPUESTA")
	private Long lngIdRespuestaPregunta;

	@Column(name = "IDSECCIONPREGUNTA")
	private Long lngIdSeccionPregunta;
	
	
	public Long getLngIdRespuestaCuestionario() {
		return lngIdRespuestaCuestionario;
	}

	public void setLngIdRespuestaCuestionario(Long lngIdRespuestaCuestionario) {
		this.lngIdRespuestaCuestionario = lngIdRespuestaCuestionario;
	}

	public Long getLngIdCuestionarioPersona() {
		return lngIdCuestionarioPersona;
	}

	public void setLngIdCuestionarioPersona(Long lngIdCuestionarioPersona) {
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

	public String getStrRespuestaTexto() {
		return strRespuestaTexto;
	}

	public void setStrRespuestaTexto(String strRespuestaTexto) {
		this.strRespuestaTexto = strRespuestaTexto;
	}

	public Date getFcRespuesta() {
		return fcRespuesta;
	}

	public void setFcRespuesta(Date fcRespuesta) {
		this.fcRespuesta = fcRespuesta;
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

	public Long getLngIdRespuestaPregunta() {
		return lngIdRespuestaPregunta;
	}

	public void setLngIdRespuestaPregunta(Long lngIdRespuestaPregunta) {
		this.lngIdRespuestaPregunta = lngIdRespuestaPregunta;
	}

	public Long getLngIdSeccionPregunta() {
		return lngIdSeccionPregunta;
	}

	public void setLngIdSeccionPregunta(Long lngIdSeccionPregunta) {
		this.lngIdSeccionPregunta = lngIdSeccionPregunta;
	}

}
