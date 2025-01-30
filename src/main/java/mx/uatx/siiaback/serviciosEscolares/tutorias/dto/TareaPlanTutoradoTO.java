package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtTareasPlanTutorado;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;

public class TareaPlanTutoradoTO implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7495132003042072321L;

	private Long lngIdTareaPlanTrabajo;
	private Long lngIdDiagnosticoInicial;
	private String strTareaPlan;
	private Date fcInicioTareaPlan;
	private String strFcInicioTareaPlan;
	private Date fcFinTareaPlan;
	private String strFcFinTareaPlan;
	private Integer intClEstatusTareaPlan;
	private String strEstatusTareaPlan;
	private Boolean blnPermiteEliminar;

	private Date fcAudit;
	private String strUsuarioAudit;

	public TareaPlanTutoradoTO() {
		super();
	}

	public TareaPlanTutoradoTO(final SePaObtTareasPlanTutorado entidad, final FechaHelper fcHelp) {
		BeanUtils.copyProperties(entidad, this);
		this.strFcInicioTareaPlan = fcHelp.formatearFecha(entidad.getFcInicioTareaPlan());
		this.strFcFinTareaPlan = fcHelp.formatearFecha(entidad.getFcInicioTareaPlan());
	}

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

	public String getStrTareaPlan() {
		return strTareaPlan;
	}

	public void setStrTareaPlan(String strTareaPlan) {
		this.strTareaPlan = strTareaPlan;
	}

	public Date getFcInicioTareaPlan() {
		return fcInicioTareaPlan;
	}

	public void setFcInicioTareaPlan(Date fcInicioTareaPlan) {
		this.fcInicioTareaPlan = fcInicioTareaPlan;
	}

	public Date getFcFinTareaPlan() {
		return fcFinTareaPlan;
	}

	public void setFcFinTareaPlan(Date fcFinTareaPlan) {
		this.fcFinTareaPlan = fcFinTareaPlan;
	}

	public Integer getIntClEstatusTareaPlan() {
		return intClEstatusTareaPlan;
	}

	public void setIntClEstatusTareaPlan(Integer intClEstatusTareaPlan) {
		this.intClEstatusTareaPlan = intClEstatusTareaPlan;
	}

	public String getStrEstatusTareaPlan() {
		return strEstatusTareaPlan;
	}

	public void setStrEstatusTareaPlan(String strEstatusTareaPlan) {
		this.strEstatusTareaPlan = strEstatusTareaPlan;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
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

	public String getStrFcInicioTareaPlan() {
		return strFcInicioTareaPlan;
	}

	public void setStrFcInicioTareaPlan(String strFcInicioTareaPlan) {
		this.strFcInicioTareaPlan = strFcInicioTareaPlan;
	}

	public String getStrFcFinTareaPlan() {
		return strFcFinTareaPlan;
	}

	public void setStrFcFinTareaPlan(String strFcFinTareaPlan) {
		this.strFcFinTareaPlan = strFcFinTareaPlan;
	}

}
