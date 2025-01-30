package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReporteMatSinFormato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5417216796847903913L;
	@Id	
	@Column(name="MATRICULA")
	private String strMatricula;
	
	@Column(name="NOMBRE")
	private String strNombre;	
	
	@Column(name="PROGRAMACAMPUS")
	private String strProgramaCampus;

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}
	
	
}
