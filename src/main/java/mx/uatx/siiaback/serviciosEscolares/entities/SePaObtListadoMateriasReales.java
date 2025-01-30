package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtListadoMateriasReales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1125969276013850159L;

	@Id
	@Column(name="IDMATERIAREAL")
	private Long lngIdMateriaReal;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;
	
	@Column(name="OPCIONTERMINAL")
	private String strOpcionTerminal;

	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Long getLngIdMateriaReal() {
		return lngIdMateriaReal;
	}

	public void setLngIdMateriaReal(Long lngIdMateriaReal) {
		this.lngIdMateriaReal = lngIdMateriaReal;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
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

	public String getStrOpcionTerminal() {
		return strOpcionTerminal;
	}

	public void setStrOpcionTerminal(String strOpcionTerminal) {
		this.strOpcionTerminal = strOpcionTerminal;
	}
	
	
}
