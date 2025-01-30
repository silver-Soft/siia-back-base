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
@Table(schema = "SERESC", name = "SEAXSECCIONPREGUNTAS")
public class SeAxSeccionPreguntas {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSECCIONPREGUNTA", sequenceName = "SERESC.IDSECCIONPREGUNTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSECCIONPREGUNTA")

	@Column(name = "IDSECCIONPREGUNTA")
	private Integer intIdSeccionPregunta;

	@Column(name = "IDSECCION")
	private Integer intIdSeccion;

	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "PONDERACION")
	private Integer intPonderacion;

	@Column(name = "NMORDEN")
	private Integer intNmOrden;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "CLESTATUSOBLIGATORIO")
	private Integer intClEstatusObligatorio;

	public Integer getIntIdSeccionPregunta() {
		return intIdSeccionPregunta;
	}

	public void setIntIdSeccionPregunta(Integer intIdSeccionPregunta) {
		this.intIdSeccionPregunta = intIdSeccionPregunta;
	}

	public Integer getIntIdSeccion() {
		return intIdSeccion;
	}

	public void setIntIdSeccion(Integer intIdSeccion) {
		this.intIdSeccion = intIdSeccion;
	}

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntPonderacion() {
		return intPonderacion;
	}

	public void setIntPonderacion(Integer intPonderacion) {
		this.intPonderacion = intPonderacion;
	}

	public Integer getIntNmOrden() {
		return intNmOrden;
	}

	public void setIntNmOrden(Integer intNmOrden) {
		this.intNmOrden = intNmOrden;
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

	public Integer getIntClEstatusObligatorio() {
		return intClEstatusObligatorio;
	}

	public void setIntClEstatusObligatorio(Integer intClEstatusObligatorio) {
		this.intClEstatusObligatorio = intClEstatusObligatorio;
	}

}