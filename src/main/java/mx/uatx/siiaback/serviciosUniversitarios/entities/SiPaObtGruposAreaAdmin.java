package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtGruposAreaAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2424371848365435817L;
	@Id
	@Column(name="FOLIO")
	private Integer intIdGrupoArea;
	
	@Column(name="NOMBRE")
	private String strNbGrupoArea;
	
	@Column(name="ESTATUS")
	private String strEstatus;
	
	@Column(name="CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name="PERMITEAREASCAMPUS")
	private boolean blnPermiteAreasCampus;
	
	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Integer getIntIdGrupoArea() {
		return intIdGrupoArea;
	}

	public void setIntIdGrupoArea(Integer intIdGrupoArea) {
		this.intIdGrupoArea = intIdGrupoArea;
	}

	public String getStrNbGrupoArea() {
		return strNbGrupoArea;
	}

	public void setStrNbGrupoArea(String strNbGrupoArea) {
		this.strNbGrupoArea = strNbGrupoArea;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public boolean isBlnPermiteAreasCampus() {
		return blnPermiteAreasCampus;
	}

	public void setBlnPermiteAreasCampus(boolean blnPermiteAreasCampus) {
		this.blnPermiteAreasCampus = blnPermiteAreasCampus;
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
