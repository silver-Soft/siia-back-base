package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEquivalenciasPlanEstudios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1831203396964895043L;
	@Id
	@Column(name="IDEQUIVALENCIA")
	private Integer intIdEquivalencia;
	
	@Column(name="UNIDADAPRENDIZAJE")
	private String strUnidadAprendizaje;
	
	@Column(name="INIDADAPRENDIZAJEEQUI")
	private String strUnidadAprendizajeEqui;
	
	@Column(name="PROGRAMAEQUIVALENTE")
	private String strProgramaEquivalente;
	
	@Column(name="PLANEQUIVALENTE")
	private String strPlanEquivalente;

	public Integer getIntIdEquivalencia() {
		return intIdEquivalencia;
	}

	public void setIntIdEquivalencia(Integer intIdEquivalencia) {
		this.intIdEquivalencia = intIdEquivalencia;
	}

	public String getStrUnidadAprendizaje() {
		return strUnidadAprendizaje;
	}

	public void setStrUnidadAprendizaje(String strUnidadAprendizaje) {
		this.strUnidadAprendizaje = strUnidadAprendizaje;
	}

	public String getStrUnidadAprendizajeEqui() {
		return strUnidadAprendizajeEqui;
	}

	public void setStrUnidadAprendizajeEqui(String strUnidadAprendizajeEqui) {
		this.strUnidadAprendizajeEqui = strUnidadAprendizajeEqui;
	}

	public String getStrProgramaEquivalente() {
		return strProgramaEquivalente;
	}

	public void setStrProgramaEquivalente(String strProgramaEquivalente) {
		this.strProgramaEquivalente = strProgramaEquivalente;
	}

	public String getStrPlanEquivalente() {
		return strPlanEquivalente;
	}

	public void setStrPlanEquivalente(String strPlanEquivalente) {
		this.strPlanEquivalente = strPlanEquivalente;
	}
	
	
}
