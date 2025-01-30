package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtPlanesEstudio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -953487512865863448L;
	@Id
	@Column(name="IDPLANESTUDIO")
	private Integer intIdPlanEstudio;
	
	@Column(name="NBPLANESTUDIO")
	private String strNbPlanEstudio;
	
	@Column(name="DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;
	
	@Column(name="DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;
	
	@Column(name="DSSTPLANESTUDIO")
	private String strDsStPlanEstudio;
	
	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	public String getStrDsStPlanEstudio() {
		return strDsStPlanEstudio;
	}

	public void setStrDsStPlanEstudio(String strDsStPlanEstudio) {
		this.strDsStPlanEstudio = strDsStPlanEstudio;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	} 
	
	
}
