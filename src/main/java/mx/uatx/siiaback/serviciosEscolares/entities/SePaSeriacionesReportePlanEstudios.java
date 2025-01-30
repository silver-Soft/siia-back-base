package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSeriacionesReportePlanEstudios implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6516388284425566225L;

	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "MATERIA")
	private String strMateria;

	@Column(name = "MATERIAPRECEDENTE")
	private String strMateriaPrecedente;

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrMateriaPrecedente() {
		return strMateriaPrecedente;
	}

	public void setStrMateriaPrecedente(String strMateriaPrecedente) {
		this.strMateriaPrecedente = strMateriaPrecedente;
	}

	
}
