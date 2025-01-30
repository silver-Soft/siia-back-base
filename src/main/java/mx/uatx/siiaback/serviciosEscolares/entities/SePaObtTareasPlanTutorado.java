package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTareasPlanTutorado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1256332727847811472L;

	@Id
	@Column(name = "IDDTTAREAPLANTRABAJO")
	private Long lngIdTareaPlanTrabajo;

	@Column(name = "IDDIAGNOSTICOINICIAL")
	private Long lngIdDiagnosticoInicial;

	@Column(name = "DSTAREAPLAN")
	private String strTareaPlan;

	@Column(name = "FCINICIOTAREAPLAN")
	private Date fcInicioTareaPlan;

	@Column(name = "FCFINTAREAPLAN")
	private Date fcFinTareaPlan;

	@Column(name = "CLESTATUSTAREAPLAN")
	private Integer intClEstatusTareaPlan;

	@Column(name = "DSESTATUSTAREATUTORIA")
	private String strEstatusTareaPlan;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

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

}
