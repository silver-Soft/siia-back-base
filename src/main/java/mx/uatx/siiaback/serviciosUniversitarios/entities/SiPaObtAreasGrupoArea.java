package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasGrupoArea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1967797935812343549L;
	@Id
	@Column(name="IDGRUPOAREACAMPUS")
	private Integer intIdGrupoAreaCampus;	
	
	@Column(name="NBAREA")
	private String strNbArea;
	
	@Column(name="DSCAMPUS")
	private String strDsCampus;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Integer getIntIdGrupoAreaCampus() {
		return intIdGrupoAreaCampus;
	}

	public void setIntIdGrupoAreaCampus(Integer intIdGrupoAreaCampus) {
		this.intIdGrupoAreaCampus = intIdGrupoAreaCampus;
	}



	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	
}
