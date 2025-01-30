package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtPuestosAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2876579064478360136L;

	@Id
	@Column(name = "IDAREAPUESTO")
	private Integer intIdAreaPuesto;
	
	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;

	@Column(name = "NBPUESTO")
	private String strNbPuesto;

	@Column(name = "DSFUNCIONPUESTO")
	private String strDsFuncionPuesto;

	@Column(name = "NMPLAZASPUESTO")
	private Integer intNmPlazasPuesto;
	
	@Column(name = "NMPLAZASOCUPADAS")
	private Integer intNmPlazasOcupadas;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Integer getIntIdAreaPuesto() {
		return intIdAreaPuesto;
	}

	public void setIntIdAreaPuesto(Integer intIdAreaPuesto) {
		this.intIdAreaPuesto = intIdAreaPuesto;
	}

	public String getStrNbPuesto() {
		return strNbPuesto;
	}

	public void setStrNbPuesto(String strNbPuesto) {
		this.strNbPuesto = strNbPuesto;
	}

	public String getStrDsFuncionPuesto() {
		return strDsFuncionPuesto;
	}

	public void setStrDsFuncionPuesto(String strDsFuncionPuesto) {
		this.strDsFuncionPuesto = strDsFuncionPuesto;
	}

	public Integer getIntNmPlazasPuesto() {
		return intNmPlazasPuesto;
	}

	public void setIntNmPlazasPuesto(Integer intNmPlazasPuesto) {
		this.intNmPlazasPuesto = intNmPlazasPuesto;
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

	public Integer getIntIdPuesto() {
		return intIdPuesto;
	}

	public void setIntIdPuesto(Integer intIdPuesto) {
		this.intIdPuesto = intIdPuesto;
	}

	public Integer getIntNmPlazasOcupadas() {
		return intNmPlazasOcupadas;
	}

	public void setIntNmPlazasOcupadas(Integer intNmPlazasOcupadas) {
		this.intNmPlazasOcupadas = intNmPlazasOcupadas;
	}

}