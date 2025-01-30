package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCredencialesImpresas {



	@Id
	@Column(name = "NUMERO")
	private Integer intNumero;

	@Column(name = "NOMBRE")
	private String strNbAlumno;

	@Column(name = "LOGIN")
	private String strLogin;

	
	public SePaCredencialesImpresas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public Integer getIntNumero() {
		return intNumero;
	}

	public void setIntNumero(Integer intNumero) {
		this.intNumero = intNumero;
	}

	public String getStrNbAlumno() {
		return strNbAlumno;
	}

	public void setStrNbAlumno(String strNbAlumno) {
		this.strNbAlumno = strNbAlumno;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}


	


	
	
	

}
