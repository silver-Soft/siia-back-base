package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTipoServicio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5314537516840796899L;
	@Id
	@Column(name = "IDTIPOSERVICIO")
	private Integer intIdTipoServicio;
	
	@Column(name = "DSTIPOSERVICIO")
	private String strDsTipoServicio;

	public Integer getIntIdTipoServicio() {
		return intIdTipoServicio;
	}

	public void setIntIdTipoServicio(Integer intIdTipoServicio) {
		this.intIdTipoServicio = intIdTipoServicio;
	}

	public String getStrDsTipoServicio() {
		return strDsTipoServicio;
	}

	public void setStrDsTipoServicio(String strDsTipoServicio) {
		this.strDsTipoServicio = strDsTipoServicio;
	}
	
	
}
