package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaPais implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2774852993705552810L;

	@Id
	@Column(name = "CLPAIS")
	private String strCvePais;

	@Column(name = "NBPAIS")
	private String strNbPais;

	@Column(name = "ABREVIATURA2")
	private String strAbreviatura2;

	@Column(name = "ABREVIATURA3")
	private String strAbreviatura3;

	@Column(name = "DSGENTILICIO")
	private String strDsGentilicio;

	public SiPaPais() {
		super();
	}

	public String getStrCvePais() {
		return strCvePais;
	}

	public void setStrCvePais(String strCvePais) {
		this.strCvePais = strCvePais;
	}

	public String getStrNbPais() {
		return strNbPais;
	}

	public void setStrNbPais(String strNbPais) {
		this.strNbPais = strNbPais;
	}

	public String getStrAbreviatura2() {
		return strAbreviatura2;
	}

	public void setStrAbreviatura2(String strAbreviatura2) {
		this.strAbreviatura2 = strAbreviatura2;
	}

	public String getStrAbreviatura3() {
		return strAbreviatura3;
	}

	public void setStrAbreviatura3(String strAbreviatura3) {
		this.strAbreviatura3 = strAbreviatura3;
	}

	public String getStrDsGentilicio() {
		return strDsGentilicio;
	}

	public void setStrDsGentilicio(String strDsGentilicio) {
		this.strDsGentilicio = strDsGentilicio;
	}

}
