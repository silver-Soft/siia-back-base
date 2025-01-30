/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author zerodkpg
 */
@Entity
@Table(schema = "SERESC", name = "SECTDEPENDENCIAS")
public class SeCtDependencias implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5474782375009443895L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDSECTDEPENDENCIAS")
	@SequenceGenerator(name = "GENIDSECTDEPENDENCIAS", sequenceName = "SERESC.ID_DEPENDENCIAS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDSECTDEPENDENCIAS")
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

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@OneToMany(mappedBy = "dependencia")
	private Set<SeAxProgramasSerSoc> lstProgramas;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	
	@Column(name = "PREFIJO")
	private String strPrefijo;

	public SeCtDependencias() {
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

	public Set<SeAxProgramasSerSoc> getLstProgramas() {
		return lstProgramas;
	}

	public void setLstProgramas(Set<SeAxProgramasSerSoc> lstProgramas) {
		this.lstProgramas = lstProgramas;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

	public String getStrPrefijo() {
		return strPrefijo;
	}

	public void setStrPrefijo(String strPrefijo) {
		this.strPrefijo = strPrefijo;
	}

}
