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
@Table(schema = "SERESC", name = "SEMSDIAGNOSTICOSINICIALES")
public class SeMsDiagnosticosIniciales implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5562335972818756698L;

	private static final String GENID_SEMSDIAGNOSTICOSINICIALES = "GENID_SEMSDIAGNOSTICOSINICIALES";

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENID_SEMSDIAGNOSTICOSINICIALES, sequenceName = "SERESC.IDDIAGNOSTICOINICIAL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEMSDIAGNOSTICOSINICIALES)
	@Column(name = "IDDIAGNOSTICOINICIAL")
	private Long lngIdDiagnosticoInicial;

	@Column(name = "IDTUTOR")
	private Long lngIdTutor;

	@Column(name = "FCMODPLANTRABAJO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcModPlanTrabajo;

	@Column(name = "FCDIAGNOSTICOINICIAL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcDiagnosticoInicial;

	@Column(name = "FCPLANTRABAJO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcPlanTrabajo;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "FCMODDIAGNOSTICOINICIAL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcModDiagnosticoInicial;

	@Column(name = "DSDIAGNOSTICOINICIAL")
	private String strDiagnosticoInicial;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DSOBJETIVO")
	private String strObjetivo;

	@Column(name = "DSCONCLUSION")
	private String strConclusion;

	public Long getLngIdDiagnosticoInicial() {
		return lngIdDiagnosticoInicial;
	}

	public void setLngIdDiagnosticoInicial(Long lngIdDiagnosticoInicial) {
		this.lngIdDiagnosticoInicial = lngIdDiagnosticoInicial;
	}

	public Long getLngIdTutor() {
		return lngIdTutor;
	}

	public void setLngIdTutor(Long lngIdTutor) {
		this.lngIdTutor = lngIdTutor;
	}

	public Date getFcModPlanTrabajo() {
		return fcModPlanTrabajo;
	}

	public void setFcModPlanTrabajo(Date fcModPlanTrabajo) {
		this.fcModPlanTrabajo = fcModPlanTrabajo;
	}

	public Date getFcDiagnosticoInicial() {
		return fcDiagnosticoInicial;
	}

	public void setFcDiagnosticoInicial(Date fcDiagnosticoInicial) {
		this.fcDiagnosticoInicial = fcDiagnosticoInicial;
	}

	public Date getFcPlanTrabajo() {
		return fcPlanTrabajo;
	}

	public void setFcPlanTrabajo(Date fcPlanTrabajo) {
		this.fcPlanTrabajo = fcPlanTrabajo;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Date getFcModDiagnosticoInicial() {
		return fcModDiagnosticoInicial;
	}

	public void setFcModDiagnosticoInicial(Date fcModDiagnosticoInicial) {
		this.fcModDiagnosticoInicial = fcModDiagnosticoInicial;
	}

	public String getStrDiagnosticoInicial() {
		return strDiagnosticoInicial;
	}

	public void setStrDiagnosticoInicial(String strDiagnosticoInicial) {
		this.strDiagnosticoInicial = strDiagnosticoInicial;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrObjetivo() {
		return strObjetivo;
	}

	public void setStrObjetivo(String strObjetivo) {
		this.strObjetivo = strObjetivo;
	}

	public String getStrConclusion() {
		return strConclusion;
	}

	public void setStrConclusion(String strConclusion) {
		this.strConclusion = strConclusion;
	}

}
