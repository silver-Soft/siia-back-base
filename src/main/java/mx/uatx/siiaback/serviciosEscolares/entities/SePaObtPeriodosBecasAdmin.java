package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodosBecasAdmin {
	
	@Id
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodo;
	
	@Column(name = "IDCONVOCATORIA")
	private Integer idConvocatoria;
	
	@Column(name = "CLESTATUSCONVO")
	private String clEstatus;

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}

	public Integer getIdConvocatoria() {
		return idConvocatoria;
	}

	public void setIdConvocatoria(Integer idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}

	public String getClEstatus() {
		return clEstatus;
	}

	public void setClEstatus(String clEstatus) {
		this.clEstatus = clEstatus;
	}

}
