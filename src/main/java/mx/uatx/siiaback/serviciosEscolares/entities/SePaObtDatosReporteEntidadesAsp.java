package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteEntidadesAsp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2183488707157540131L;
	@Id
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	
	@Column(name = "NBENTIDAD")
	private String strNbEntidad;

	@Column(name = "CONTESTARONSOV")
	private Integer intConstaronSov;
	
	@Column(name = "TOTAL")
	private Integer intTotal;
	
	public SePaObtDatosReporteEntidadesAsp() {
		super();
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

	public String getStrNbEntidad() {
		return strNbEntidad;
	}

	public void setStrNbEntidad(String strNbEntidad) {
		this.strNbEntidad = strNbEntidad;
	}

	public Integer getIntConstaronSov() {
		return intConstaronSov;
	}

	public void setIntConstaronSov(Integer intConstaronSov) {
		this.intConstaronSov = intConstaronSov;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}
	
	
}
