package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtModalidadesProgramas implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3366439620099660530L;

	@Id
	@Column(name = "CLMODALIDADPROGRAMA")
	private Integer intClModalidadPrograma;
	
	@Column(name = "DSMODALIDADPROGRAMA")
	private String strDsModalidadPrograma;

	public Integer getIntClModalidadPrograma() {
		return intClModalidadPrograma;
	}

	public void setIntClModalidadPrograma(Integer intClModalidadPrograma) {
		this.intClModalidadPrograma = intClModalidadPrograma;
	}

	public String getStrDsModalidadPrograma() {
		return strDsModalidadPrograma;
	}

	public void setStrDsModalidadPrograma(String strDsModalidadPrograma) {
		this.strDsModalidadPrograma = strDsModalidadPrograma;
	}
	
}
