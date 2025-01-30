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
@Table(schema = "SERESC", name = "SEDTTAREASPLANTRABAJO")
public class SeDtTareasPlanDTrabajo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8389412292422919459L;

	private static final String GENID_SEDTTAREASPLANDTRABAJO = "GENID_SEDTTAREASPLANDTRABAJO";

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENID_SEDTTAREASPLANDTRABAJO, sequenceName = "SERESC.IDDTTAREAPLANTRABAJO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEDTTAREASPLANDTRABAJO)
	@Column(name = "IDDTTAREAPLANTRABAJO")
	private Long lngIdTareaPlanTrabajo;

	@Column(name = "IDDIAGNOSTICOINICIAL")
	private Long lngIdDiagnosticoInicial;

	@Column(name = "CLESTATUSTAREAPLAN")
	private Integer intClEstatusTareaPlan;

	@Column(name = "FCINICIOTAREAPLAN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicioAreaPlan;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "FCFINTAREAPLAN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcFinAreaPlan;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DSTAREAPLAN")
	private String strTareaPlan;

	public Long getLngIdTareaPlanTrabajo() {
		return lngIdTareaPlanTrabajo;
	}

	public void setLngIdTareaPlanTrabajo(Long lngIdTareaPlanTrabajo) {
		this.lngIdTareaPlanTrabajo = lngIdTareaPlanTrabajo;
	}

	public Long getLngIdDiagnosticoInicial() {
		return lngIdDiagnosticoInicial;
	}

	public void setLngIdDiagnosticoInicial(Long lngIdDiagnosticoInicial) {
		this.lngIdDiagnosticoInicial = lngIdDiagnosticoInicial;
	}

	public Date getFcInicioAreaPlan() {
		return fcInicioAreaPlan;
	}

	public void setFcInicioAreaPlan(Date fcInicioAreaPlan) {
		this.fcInicioAreaPlan = fcInicioAreaPlan;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Date getFcFinAreaPlan() {
		return fcFinAreaPlan;
	}

	public void setFcFinAreaPlan(Date fcFinAreaPlan) {
		this.fcFinAreaPlan = fcFinAreaPlan;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrTareaPlan() {
		return strTareaPlan;
	}

	public void setStrTareaPlan(String strTareaPlan) {
		this.strTareaPlan = strTareaPlan;
	}

	public Integer getIntClEstatusTareaPlan() {
		return intClEstatusTareaPlan;
	}

	public void setIntClEstatusTareaPlan(Integer intClEstatusTareaPlan) {
		this.intClEstatusTareaPlan = intClEstatusTareaPlan;
	}

}
