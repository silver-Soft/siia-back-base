package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtConvocatoriasAspirante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3823735186793987457L;

	@Id
	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;
	
	@Column(name = "DSCONVOCATORIA")
	private String strDsConvocatoria;

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
	
	
}
