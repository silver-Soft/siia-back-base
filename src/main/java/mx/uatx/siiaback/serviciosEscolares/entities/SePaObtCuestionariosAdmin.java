package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCuestionariosAdmin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 220060120026382039L;

	@Id
	@Column(name = "FOLIO")
	private Integer intFolio;

	@Column(name = "TITULO")
	private String strTitulo;

	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	@Column(name = "PERMITESECCIONES")
	private Boolean blnPermiteSecciones;

	public Integer getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(Integer intFolio) {
		this.intFolio = intFolio;
	}

	public String getStrTitulo() {
		return strTitulo;
	}

	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public Boolean getBlnPermiteSecciones() {
		return blnPermiteSecciones;
	}

	public void setBlnPermiteSecciones(Boolean blnPermiteSecciones) {
		this.blnPermiteSecciones = blnPermiteSecciones;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

}