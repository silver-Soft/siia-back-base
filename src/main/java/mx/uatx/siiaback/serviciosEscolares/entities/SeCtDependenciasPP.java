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

@Entity
@Table(schema = "SERESC", name = "SECTDEPENDENCIASPP")
public class SeCtDependenciasPP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4445907771907389992L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "IDSECTDEPENDENCIASPP")
	@SequenceGenerator(name = "IDSECTDEPENDENCIASPP", sequenceName = "SERESC.IDSECTDEPENDENCIASPP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSECTDEPENDENCIASPP")	
	private Integer intIdDependencia;

	@Column(name = "NOMBRESECTDEPENDENCIASPP")
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
	private Set<SeAxProgramasPracPro> lstProgramas;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	
	@Column(name = "PREFIJO")
	private String strPrefijo;		

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

	public Set<SeAxProgramasPracPro> getLstProgramas() {
		return lstProgramas;
	}

	public void setLstProgramas(Set<SeAxProgramasPracPro> lstProgramas) {
		this.lstProgramas = lstProgramas;
	}

	
	
}
