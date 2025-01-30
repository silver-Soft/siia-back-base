package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCuestionariosAsignadosAdmin {

	@Id
	@Column(name = "FOLIO")
	private Integer intFolio;

	@Column(name = "CUESTIONARIO")
	private String strCuestionario;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "PERIODO")
	private String strPeriodo;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Integer getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(Integer intFolio) {
		this.intFolio = intFolio;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
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

	public String getStrCuestionario() {
		return strCuestionario;
	}

	public void setStrCuestionario(String strCuestionario) {
		this.strCuestionario = strCuestionario;
	}

}