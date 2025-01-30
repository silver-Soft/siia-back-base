package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;

public class PeriodoCierreTO implements Serializable, Cloneable {


	private static final long serialVersionUID = 2223453860703366950L;

	private Integer idPeriodoCierre;
	
	private Integer idEstatus;
	
	private String strIdPeriodo;
	
	private String strUsuario;
	
	private Date fcCierre;
	
	

	public PeriodoCierreTO() {
		super();
	}

	public Integer getIdPeriodoCierre() {
		return idPeriodoCierre;
	}

	public void setIdPeriodoCierre(Integer idPeriodoCierre) {
		this.idPeriodoCierre = idPeriodoCierre;
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public Date getFcCierre() {
		return fcCierre;
	}

	public void setFcCierre(Date fcCierre) {
		this.fcCierre = fcCierre;
	}
	


}
