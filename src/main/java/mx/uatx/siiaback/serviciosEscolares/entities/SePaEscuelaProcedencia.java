package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEscuelaProcedencia implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2957999820260182556L;

	@Id
	@Column(name = "IDESCUELAPROCEDENCIA")
	private Integer intIdEscuelaProcedencia;

	@Column(name = "NBESCUELA")
	private String strNbEscuela;

	@Column(name = "NBLOCALIDAD")
	private String strNbLocalidad;

	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipio;

	@Column(name = "CLREGIMEN")
	private Integer intCveRegimen;
	
	@Column(name = "NBMUNICIPIO")
	private String strNbMunicipio;
	
	@Column(name = "NBENTIDAD")
	private String strNbEntidad;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	

	public SePaEscuelaProcedencia() {
		super();
	}


	public Integer getIntIdEscuelaProcedencia() {
		return intIdEscuelaProcedencia;
	}

	public void setIntIdEscuelaProcedencia(Integer intIdEscuelaProcedencia) {
		this.intIdEscuelaProcedencia = intIdEscuelaProcedencia;
	}

	public String getStrNbEscuela() {
		return strNbEscuela;
	}

	public void setStrNbEscuela(String strNbEscuela) {
		this.strNbEscuela = strNbEscuela;
	}

	public String getStrNbLocalidad() {
		return strNbLocalidad;
	}

	public void setStrNbLocalidad(String strNbLocalidad) {
		this.strNbLocalidad = strNbLocalidad;
	}

	public Long getLngIdMunicipio() {
		return lngIdMunicipio;
	}

	public void setLngIdMunicipio(Long lngIdMunicipio) {
		this.lngIdMunicipio = lngIdMunicipio;
	}

	public Integer getIntCveRegimen() {
		return intCveRegimen;
	}

	public void setIntCveRegimen(Integer intCveRegimen) {
		this.intCveRegimen = intCveRegimen;
	}


	public String getStrNbMunicipio() {
		return strNbMunicipio;
	}


	public void setStrNbMunicipio(String strNbMunicipio) {
		this.strNbMunicipio = strNbMunicipio;
	}


	public String getStrNbEntidad() {
		return strNbEntidad;
	}


	public void setStrNbEntidad(String strNbEntidad) {
		this.strNbEntidad = strNbEntidad;
	}


	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}


	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}
	
}
