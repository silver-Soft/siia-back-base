package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDependenciaServicioSocial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1441433104467598291L;

	@Id
	@Column(name = "IDSECTDEPENDENCIAS")
	private Integer intIdDependencia;

	@Column(name = "NOMBRESECTDEPENDENCIAS")
	private String strNombre;

	@Column(name = "SECTOR")
	private String strSector;

	@Column(name = "DIRECCION")
	private String strDireccion;

	@Column(name = "TITULAR")
	private String strTitular;

	@Column(name = "TELEFONO")
	private Long lngTelefono;

	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "FCUADIT")
	private String strFcAudit;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	

	public SePaDependenciaServicioSocial() {
		super();
	}

	public Integer getIntIdDependencia() {
		return intIdDependencia;
	}

	public void setIntIdDependencia(Integer intIdDependencia) {
		this.intIdDependencia = intIdDependencia;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrSector() {
		return strSector;
	}

	public void setStrSector(String strSector) {
		this.strSector = strSector;
	}

	public String getStrDireccion() {
		return strDireccion;
	}

	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}

	public String getStrTitular() {
		return strTitular;
	}

	public void setStrTitular(String strTitular) {
		this.strTitular = strTitular;
	}

	public Long getLngTelefono() {
		return lngTelefono;
	}

	public void setLngTelefono(Long lngTelefono) {
		this.lngTelefono = lngTelefono;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}


	public String getStrFcAudit() {
		return strFcAudit;
	}

	public void setStrFcAudit(String strFcAudit) {
		this.strFcAudit = strFcAudit;
	}
	
}
