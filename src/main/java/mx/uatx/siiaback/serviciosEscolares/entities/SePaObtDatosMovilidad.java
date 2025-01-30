package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosMovilidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1003507488930140369L;
	@Id
	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "PROGRAMAORIGEN")
	private String strProgramaOrigen;
	
	@Column(name = "PROGRAMADESTINO")
	private String strProgramaDestino;
	
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;
	
	@Column(name = "DSMATERIA")
	private String strDsMateria;
	
	@Column(name = "NBPLANESTUDIOORIGEN")
	private String strNbPlanEstudioOrigen;
	
	@Column(name = "NBPLANESTUDIODESTINO")
	private String strNbPlanEstudioDestino;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	public SePaObtDatosMovilidad() {
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

	public String getStrProgramaOrigen() {
		return strProgramaOrigen;
	}

	public void setStrProgramaOrigen(String strProgramaOrigen) {
		this.strProgramaOrigen = strProgramaOrigen;
	}

	public String getStrProgramaDestino() {
		return strProgramaDestino;
	}

	public void setStrProgramaDestino(String strProgramaDestino) {
		this.strProgramaDestino = strProgramaDestino;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrNbPlanEstudioOrigen() {
		return strNbPlanEstudioOrigen;
	}

	public void setStrNbPlanEstudioOrigen(String strNbPlanEstudioOrigen) {
		this.strNbPlanEstudioOrigen = strNbPlanEstudioOrigen;
	}

	public String getStrNbPlanEstudioDestino() {
		return strNbPlanEstudioDestino;
	}

	public void setStrNbPlanEstudioDestino(String strNbPlanEstudioDestino) {
		this.strNbPlanEstudioDestino = strNbPlanEstudioDestino;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}
	
	
}
