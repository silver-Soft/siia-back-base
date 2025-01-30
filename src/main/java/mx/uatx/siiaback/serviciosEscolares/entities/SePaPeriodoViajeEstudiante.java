package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodoViajeEstudiante {
	
	@Id
    @Column(name = "ID")
	private Integer intId;
	
	@Column(name = "PERIODO")
	private String strPeriodo;
	
	@Column(name = "COLOR")
	private String strColor;
	
	public Integer getIntId() {
		return intId;
	}
	public void setIntId(Integer intId) {
		this.intId = intId;
	}
	public String getStrPeriodo() {
		return strPeriodo;
	}
	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}
	public String getStrColor() {
		return strColor;
	}
	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

}
