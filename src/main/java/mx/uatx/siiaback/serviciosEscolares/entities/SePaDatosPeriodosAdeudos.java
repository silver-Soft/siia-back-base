package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosPeriodosAdeudos {

	@Id
	@Column(name = "IDPERIODO")
	private String intIdPeriodo;

	@Column(name = "DSPERIODO")
	private String strDsOPeriodo;
	
	

	

	public String getIntIdPeriodo() {
		return intIdPeriodo;
	}

	public void setIntIdPeriodo(String intIdPeriodo) {
		this.intIdPeriodo = intIdPeriodo;
	}

	public String getStrDsOPeriodo() {
		return strDsOPeriodo;
	}

	public void setStrDsOPeriodo(String strDsOPeriodo) {
		this.strDsOPeriodo = strDsOPeriodo;
	}
	
	
	
	
	
}
