package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtGruposProgramaAdmin implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6559547895920721853L;

	@Id
	@Column(name="FOLIO")
	private Integer intFolio;
	
	@Column(name="NOMBRE")
	private String strNombre;
	
	@Column(name="ESTATUS")
	private String strEstatus;
	
	@Column(name="CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name="PERMITEPROGRAMASCAMPUS")
	private boolean blnPermiteProgramasCampus;
	
	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Integer getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(Integer intFolio) {
		this.intFolio = intFolio;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	

	public boolean isBlnPermiteProgramasCampus() {
		return blnPermiteProgramasCampus;
	}

	public void setBlnPermiteProgramasCampus(boolean blnPermiteProgramasCampus) {
		this.blnPermiteProgramasCampus = blnPermiteProgramasCampus;
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

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	} 
	
	
}
