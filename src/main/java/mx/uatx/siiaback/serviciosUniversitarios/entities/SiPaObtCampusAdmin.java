package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtCampusAdmin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 351189635806220862L;

	@Id
	@Column(name = "CLCAMPUS")
	private Integer intClCampus;
	
	@Column(name = "IDMUNICIPIO")
	private String strIdMunicipio;

	@Column(name = "IDENTIDAD")
	private Integer intIdentidad;

	@Column(name = "DSCAMPUS")
	private String strDsCampus;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	@Column(name = "PERMITEAREAS")
	private Boolean blnPermiteAreas;

	public Integer getIntClCampus() {
		return intClCampus;
	}

	public void setIntClCampus(Integer intClCampus) {
		this.intClCampus = intClCampus;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
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

	public Boolean getBlnPermiteAreas() {
		return blnPermiteAreas;
	}

	public void setBlnPermiteAreas(Boolean blnPermiteAreas) {
		this.blnPermiteAreas = blnPermiteAreas;
	}

	public String getStrIdMunicipio() {
		return strIdMunicipio;
	}

	public void setStrIdMunicipio(String strIdMunicipio) {
		this.strIdMunicipio = strIdMunicipio;
	}

	public Integer getIntIdentidad() {
		return intIdentidad;
	}

	public void setIntIdentidad(Integer intIdentidad) {
		this.intIdentidad = intIdentidad;
	}

}