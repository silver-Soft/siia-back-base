package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPreguntasSeccionesAdmin {

	@Id
	@Column(name = "FOLIO")
	private Integer intFolio;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "OBLIGATORIO")
	private String strObligatorio;
	
	@Column(name = "CLESTATUSOBLIGATORIO")
	private Integer intClEstatusObligatorio;

	@Column(name = "ORDEN")
	private Integer intOrden;

	@Column(name = "PONDERACION")
	private Integer intPonderacion;

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

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrObligatorio() {
		return strObligatorio;
	}

	public void setStrObligatorio(String strObligatorio) {
		this.strObligatorio = strObligatorio;
	}

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}

	public Integer getIntPonderacion() {
		return intPonderacion;
	}

	public void setIntPonderacion(Integer intPonderacion) {
		this.intPonderacion = intPonderacion;
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

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntClEstatusObligatorio() {
		return intClEstatusObligatorio;
	}

	public void setIntClEstatusObligatorio(Integer intClEstatusObligatorio) {
		this.intClEstatusObligatorio = intClEstatusObligatorio;
	}

}