package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtVestimenta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3037239213500175167L;
	@Id
	@Column(name = "IDVESTIMENTA")
	private String strIdVestimenta;
	
	@Column(name = "DSVESTIMENTA")
	private String strDsVestimenta;
	
	public SiPaObtVestimenta() {
		super();
	}

	public String getStrIdVestimenta() {
		return strIdVestimenta;
	}

	public void setStrIdVestimenta(String strIdVestimenta) {
		this.strIdVestimenta = strIdVestimenta;
	}

	public String getStrDsVestimenta() {
		return strDsVestimenta;
	}

	public void setStrDsVestimenta(String strDsVestimenta) {
		this.strDsVestimenta = strDsVestimenta;
	}
	
	
}
