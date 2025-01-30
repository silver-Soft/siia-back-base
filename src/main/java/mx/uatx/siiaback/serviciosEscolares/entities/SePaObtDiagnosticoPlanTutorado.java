package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDiagnosticoPlanTutorado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3720237102492343010L;

	@Id
	@Column(name = "IDDIAGNOSTICOINICIAL")
	private Long lngIdDiagnosticoInicial;

	@Column(name = "DSCONCLUSION")
	private String strConclusion;

	@Column(name = "DSDIAGNOSTICOINICIAL")
	private String strDiagnosticoInicial;

	@Column(name = "DSOBJETIVO")
	private String strObjetivo;

	@Column(name = "FCDIAGNOSTICOINICIAL")
	private Date fcDiagnosticoInicial;

	@Column(name = "FCMODDIAGNOSTICOINICIAL")
	private Date fcModDiagnosticoInicial;

	@Column(name = "FCPLANTRABAJO")
	private Date fcPlanTrabajo;

	@Column(name = "FCMODPLANTRABAJO")
	private Date fcModPlanTrabajo;

	@Column(name = "DSESTATUSAREATUTORIA")
	private String strEstatusAreaTutoria;

	@Column(name = "DSAREAPLAN")
	private String strAreaPlan;

	public Long getLngIdDiagnosticoInicial() {
		return lngIdDiagnosticoInicial;
	}

	public void setLngIdDiagnosticoInicial(Long lngIdDiagnosticoInicial) {
		this.lngIdDiagnosticoInicial = lngIdDiagnosticoInicial;
	}

	public String getStrConclusion() {
		return strConclusion;
	}

	public void setStrConclusion(String strConclusion) {
		this.strConclusion = strConclusion;
	}

	public String getStrDiagnosticoInicial() {
		return strDiagnosticoInicial;
	}

	public void setStrDiagnosticoInicial(String strDiagnosticoInicial) {
		this.strDiagnosticoInicial = strDiagnosticoInicial;
	}

	public String getStrObjetivo() {
		return strObjetivo;
	}

	public void setStrObjetivo(String strObjetivo) {
		this.strObjetivo = strObjetivo;
	}

	public Date getFcDiagnosticoInicial() {
		return fcDiagnosticoInicial;
	}

	public void setFcDiagnosticoInicial(Date fcDiagnosticoInicial) {
		this.fcDiagnosticoInicial = fcDiagnosticoInicial;
	}

	public Date getFcModDiagnosticoInicial() {
		return fcModDiagnosticoInicial;
	}

	public void setFcModDiagnosticoInicial(Date fcModDiagnosticoInicial) {
		this.fcModDiagnosticoInicial = fcModDiagnosticoInicial;
	}

	public Date getFcPlanTrabajo() {
		return fcPlanTrabajo;
	}

	public void setFcPlanTrabajo(Date fcPlanTrabajo) {
		this.fcPlanTrabajo = fcPlanTrabajo;
	}

	public Date getFcModPlanTrabajo() {
		return fcModPlanTrabajo;
	}

	public void setFcModPlanTrabajo(Date fcModPlanTrabajo) {
		this.fcModPlanTrabajo = fcModPlanTrabajo;
	}

	public String getStrEstatusAreaTutoria() {
		return strEstatusAreaTutoria;
	}

	public void setStrEstatusAreaTutoria(String strEstatusAreaTutoria) {
		this.strEstatusAreaTutoria = strEstatusAreaTutoria;
	}

	public String getStrAreaPlan() {
		return strAreaPlan;
	}

	public void setStrAreaPlan(String strAreaPlan) {
		this.strAreaPlan = strAreaPlan;
	}

}
