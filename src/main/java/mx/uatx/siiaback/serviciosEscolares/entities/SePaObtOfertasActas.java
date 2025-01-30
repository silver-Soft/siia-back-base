package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtOfertasActas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3935780894322649832L;
	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "MATERIA")
	private String strMateria;
	
	@Column(name = "DOCENTE")
	private String strDocente;
	
	@Column(name = "PLANESTUDIOS")
	private String strPlanEstudios;
	
	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	@Column(name = "PERIODO")
	private String strPeriodo;
	
	public SePaObtOfertasActas() {
		super();
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public String getStrPlanEstudios() {
		return strPlanEstudios;
	}

	public void setStrPlanEstudios(String strPlanEstudios) {
		this.strPlanEstudios = strPlanEstudios;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}	
		
}
