package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtProgramasGrupoPrograma implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5967816603203113665L;

	@Id
	@Column(name="FOLIO")
	private Integer intIdGrupoProgramaEducativo;
	
	@Column(name="PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;
	
	@Column(name="AREA")
	private String strArea;
	
	@Column(name="CAMPUS")
	private String strCampus;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;



	public Integer getIntIdGrupoProgramaEducativo() {
		return intIdGrupoProgramaEducativo;
	}

	public void setIntIdGrupoProgramaEducativo(Integer intIdGrupoProgramaEducativo) {
		this.intIdGrupoProgramaEducativo = intIdGrupoProgramaEducativo;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	
}
