package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMejoresPromedios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4152673567920887870L;
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "PROMEDIO")
	private Double dblPromedio;

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public Double getDblPromedio() {
		return dblPromedio;
	}

	public void setDblPromedio(Double dblPromedio) {
		this.dblPromedio = dblPromedio;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}


}