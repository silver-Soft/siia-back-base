package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTelefonosAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8524802432693162085L;

	@Id
	@Column(name = "IDTELEFONOAREACAMPUS")
	private Integer intIdTelefonoAreaCampus;

	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;
	
	@Column(name = "NMCODIGOAREA")
	private String strNmCodigoArea;

	@Column(name = "DSTELEFONOAREACAMPUS")
	private String strDsTelefonoAreaCampus;

	@Column(name = "NMEXTENSION")
	private String strNmExtension;

	@Column(name = "NBPUESTO")
	private String strNbPuesto;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	public Integer getIntIdTelefonoAreaCampus() {
		return intIdTelefonoAreaCampus;
	}

	public void setIntIdTelefonoAreaCampus(Integer intIdTelefonoAreaCampus) {
		this.intIdTelefonoAreaCampus = intIdTelefonoAreaCampus;
	}

	public String getStrNmCodigoArea() {
		return strNmCodigoArea;
	}

	public void setStrNmCodigoArea(String strNmCodigoArea) {
		this.strNmCodigoArea = strNmCodigoArea;
	}

	public String getStrDsTelefonoAreaCampus() {
		return strDsTelefonoAreaCampus;
	}

	public void setStrDsTelefonoAreaCampus(String strDsTelefonoAreaCampus) {
		this.strDsTelefonoAreaCampus = strDsTelefonoAreaCampus;
	}

	public String getStrNmExtension() {
		return strNmExtension;
	}

	public void setStrNmExtension(String strNmExtension) {
		this.strNmExtension = strNmExtension;
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