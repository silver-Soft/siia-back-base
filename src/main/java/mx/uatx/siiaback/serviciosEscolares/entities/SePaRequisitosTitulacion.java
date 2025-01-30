package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaRequisitosTitulacion {
	
	
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	
	@Column(name = "REQUISITO")
	private String strRequisito;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "FECHA")
	private String strFecha;
	
	
	

	public SePaRequisitosTitulacion() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getIntId() {
		return intId;
	}




	public void setIntId(Integer intId) {
		this.intId = intId;
	}




	public String getStrRequisito() {
		return strRequisito;
	}




	public void setStrRequisito(String strRequisito) {
		this.strRequisito = strRequisito;
	}




	public String getStrEstatus() {
		return strEstatus;
	}




	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}




	public String getStrFecha() {
		return strFecha;
	}




	public void setStrFecha(String strFecha) {
		this.strFecha = strFecha;
	}
	
	
	
	
	
	

}
