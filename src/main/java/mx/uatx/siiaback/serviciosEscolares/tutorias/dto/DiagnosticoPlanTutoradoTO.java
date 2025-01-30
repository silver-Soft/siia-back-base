package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtDiagnosticoPlanTutorado;

public class DiagnosticoPlanTutoradoTO implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7279060888787537462L;

	private Long lngIdDiagnosticoInicial;
	private String strConclusion;
	private String strDiagnosticoInicial;
	private String strObjetivo;
	private Date fcDiagnosticoInicial;
	private Date fcModDiagnosticoInicial;
	private Date fcPlanTrabajo;
	private Date fcModPlanTrabajo;
	private String strEstatusAreaTutoria;
	private String strAreaPlan;

	private Long lngIdTutor;
	private Date fcAudit;
	private String strUsuarioAudit;

	private List<TareaPlanTutoradoTO> lstTareas;

	public DiagnosticoPlanTutoradoTO(final Long lngIdTutor) {
		this.lngIdTutor = lngIdTutor;
	}

	public DiagnosticoPlanTutoradoTO(final SePaObtDiagnosticoPlanTutorado entidad, final Long lngIdTutor) {
		BeanUtils.copyProperties(entidad, this);
		this.lngIdTutor = lngIdTutor;
	}

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

	public Long getLngIdTutor() {
		return lngIdTutor;
	}

	public void setLngIdTutor(Long lngIdTutor) {
		this.lngIdTutor = lngIdTutor;
	}

	public List<TareaPlanTutoradoTO> getLstTareas() {
		return lstTareas;
	}

	public void setLstTareas(List<TareaPlanTutoradoTO> lstTareas) {
		this.lstTareas = lstTareas;
	}

}
