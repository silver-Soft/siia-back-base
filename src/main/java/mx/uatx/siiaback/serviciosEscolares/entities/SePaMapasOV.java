package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaMapasOV implements Serializable{
	
	private static final long serialVersionUID = -2268034258944730224L;

	@Id
	@Column(name = "IDMAPAOV")
	private Integer intIdmapaOv;

	@Column(name = "DSINTERPRETACIONMAPAOV")
	private String  strDsInterpretacionMapaOv;

	public Integer getIntIdmapaOv() {
		return intIdmapaOv;
	}

	public void setIntIdmapaOv(Integer intIdmapaOv) {
		this.intIdmapaOv = intIdmapaOv;
	}

	public String getStrDsInterpretacionMapaOv() {
		return strDsInterpretacionMapaOv;
	}

	public void setStrDsInterpretacionMapaOv(String strDsInterpretacionMapaOv) {
		this.strDsInterpretacionMapaOv = strDsInterpretacionMapaOv;
	}
	

}
