package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEncabezadoViajeEstudiante implements Serializable {
	
	private static final long serialVersionUID = -4419912725622502841L;
	
	@Id
    @Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "PERIODOSPLAN")
	private Integer intPeriodosPlan;
	
	public SePaEncabezadoViajeEstudiante() {
		super();
	}
	
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
	public String getStrPrograma() {
		return strPrograma;
	}
	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}
	public String getStrFacultad() {
		return strFacultad;
	}
	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}
	public Integer getIntPeriodosPlan() {
		return intPeriodosPlan;
	}
	public void setIntPeriodosPlan(Integer intPeriodosPlan) {
		this.intPeriodosPlan = intPeriodosPlan;
	}
	

}
