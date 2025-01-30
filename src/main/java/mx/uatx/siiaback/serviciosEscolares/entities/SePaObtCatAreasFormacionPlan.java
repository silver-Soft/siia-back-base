package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCatAreasFormacionPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7120277669382093279L;
	@Id		
	@Column(name="IDAREAFORMACION")
	private Integer intIdAreaFormacion;
	
	@Column(name="DSAREAFORMACION")
	private String strDsAreaFormacion;

	public Integer getIntIdAreaFormacion() {
		return intIdAreaFormacion;
	}

	public void setIntIdAreaFormacion(Integer intIdAreaFormacion) {
		this.intIdAreaFormacion = intIdAreaFormacion;
	}

	public String getStrDsAreaFormacion() {
		return strDsAreaFormacion;
	}

	public void setStrDsAreaFormacion(String strDsAreaFormacion) {
		this.strDsAreaFormacion = strDsAreaFormacion;
	}
	
		
}
