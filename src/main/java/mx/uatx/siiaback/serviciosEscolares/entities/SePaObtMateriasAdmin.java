package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasAdmin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4575774821253865670L;

	@Id
	@Column(name = "IDMATERIA")
	private Long lngIdMateria;
	
	@Column(name = "DSMATERIA")
	private String strDsMateria;
	
	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Long getLngIdMateria() {
		return lngIdMateria;
	}

	public void setLngIdMateria(Long lngIdMateria) {
		this.lngIdMateria = lngIdMateria;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
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
	
}
