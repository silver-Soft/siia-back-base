package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaProgramasDependenciaServicioSocial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -321534310116921225L;

	@Id
	@Column(name = "ID_SEAXPROGRAMASSERSOC")
	private Integer intIdPrograma;

	@Column(name = "NOMBRE_SEAXPROGRAMASSERSOC")
	private String strNombre;

	@Column(name = "AREA")
	private String strArea;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "DEP_ID_SECTDEPENDENCIAS")
	private Integer intIdDependencia;

	public SePaProgramasDependenciaServicioSocial() {
		super();
	}

	public Integer getIntIdPrograma() {
		return intIdPrograma;
	}

	public void setIntIdPrograma(Integer intIdPrograma) {
		this.intIdPrograma = intIdPrograma;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntIdDependencia() {
		return intIdDependencia;
	}

	public void setIntIdDependencia(Integer intIdDependencia) {
		this.intIdDependencia = intIdDependencia;
	}

}
