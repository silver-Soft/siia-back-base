package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtConvocatoriasActivas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6193566116245721395L;

	@Id
	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;
	
	@Column(name = "DSCONVOCATORIA")
	private String strDsConvocatoria;
	
	@Column(name = "PERIODO")
	private String strPeriodo;

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public String getStrDsConvocatoria() {
		return strDsConvocatoria;
	}

	public void setStrDsConvocatoria(String strDsConvocatoria) {
		this.strDsConvocatoria = strDsConvocatoria;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}
	
	

}
