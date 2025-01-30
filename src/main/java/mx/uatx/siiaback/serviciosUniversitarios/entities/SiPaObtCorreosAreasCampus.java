package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtCorreosAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2419589486002096788L;
	@Id
	@Column(name = "IDCORREOAREACAMPUS")
	private Integer intIdCorreoAreaCampus;
	
	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;

	@Column(name = "DSCORREOAREACAMPUS")
	private String strDsCorreoAreaCampus;

	@Column(name = "NBPUESTO")
	private String strNbPuesto;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	public Integer getIntIdCorreoAreaCampus() {
		return intIdCorreoAreaCampus;
	}

	public void setIntIdCorreoAreaCampus(Integer intIdCorreoAreaCampus) {
		this.intIdCorreoAreaCampus = intIdCorreoAreaCampus;
	}

	public String getStrDsCorreoAreaCampus() {
		return strDsCorreoAreaCampus;
	}

	public void setStrDsCorreoAreaCampus(String strDsCorreoAreaCampus) {
		this.strDsCorreoAreaCampus = strDsCorreoAreaCampus;
	}

	public String getStrNbPuesto() {
		return strNbPuesto;
	}

	public void setStrNbPuesto(String strNbPuesto) {
		this.strNbPuesto = strNbPuesto;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Integer getIntIdPuesto() {
		return intIdPuesto;
	}

	public void setIntIdPuesto(Integer intIdPuesto) {
		this.intIdPuesto = intIdPuesto;
	}

}