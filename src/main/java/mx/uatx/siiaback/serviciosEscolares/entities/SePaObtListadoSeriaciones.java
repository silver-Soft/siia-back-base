package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtListadoSeriaciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7441558847648651774L;
	@Id
	@Column(name="IDSERIACION")
	private  Long lngIdSeriacion;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Long getLngIdSeriacion() {
		return lngIdSeriacion;
	}

	public void setLngIdSeriacion(Long lngIdSeriacion) {
		this.lngIdSeriacion = lngIdSeriacion;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	
}
