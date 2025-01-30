package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtEvaluacionDesemPracPro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2635002535887999135L;
	@Id
    @Column(name = "ID")
	private String strId;	
	
	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;
	
	public SePaObtEvaluacionDesemPracPro() {
		super();
	}

	

	public String getStrId() {
		return strId;
	}



	public void setStrId(String strId) {
		this.strId = strId;
	}



	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}
	
}
