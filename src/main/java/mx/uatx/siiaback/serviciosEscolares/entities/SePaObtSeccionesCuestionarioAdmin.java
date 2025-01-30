package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSeccionesCuestionarioAdmin {

	@Id
	@Column(name = "FOLIO")
	private Integer intFolio;

	@Column(name = "TITULO")
	private String strTitulo;

	@Column(name = "SECCION")
	private String strSeccion;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "ORDEN")
	private Integer intOrden;
	
	@Column(name = "IDSECCION")
	private Integer intIdSeccion;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

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

	public String getStrTitulo() {
		return strTitulo;
	}

	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}

	public String getStrSeccion() {
		return strSeccion;
	}

	public void setStrSeccion(String strSeccion) {
		this.strSeccion = strSeccion;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
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

	public Integer getIntIdSeccion() {
		return intIdSeccion;
	}

	public void setIntIdSeccion(Integer intIdSeccion) {
		this.intIdSeccion = intIdSeccion;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}
}