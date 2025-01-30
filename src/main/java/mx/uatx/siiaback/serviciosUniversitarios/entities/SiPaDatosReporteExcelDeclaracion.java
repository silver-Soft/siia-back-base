package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SiPaDatosReporteExcelDeclaracion {

	
	@Id
	@Column(name = "IDPERSONA")
	private Integer idPersona;

	@Column(name = "LOGIN")
	private String strLogin;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "PUESTO")
	private String strPuesto;
	
	@Column(name = "TIPODECLARACION")
	private String strTipoDeclaracion;

	@Column(name = "AREADECLARACION")
	private String strAreaDeclaracion;

	@Column(name = "AREAADSCRIPCION")
	private String strAreaDesc;

	@Column(name = "FECHADECLARACION")
	private Date dteFcDeclaracion;

	@Column(name = "FECHAPRESENTACION")
	private Date dteFcPresentacion;

	@Column(name = "RFC")
	private String strRFC;
	
	@Column(name = "CURP")
	private String strCURP;

	@Column(name = "ESTATUS")
	private String strEstatus;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrPuesto() {
		return strPuesto;
	}

	public void setStrPuesto(String strPuesto) {
		this.strPuesto = strPuesto;
	}

	public String getStrTipoDeclaracion() {
		return strTipoDeclaracion;
	}

	public void setStrTipoDeclaracion(String strTipoDeclaracion) {
		this.strTipoDeclaracion = strTipoDeclaracion;
	}

	public String getStrAreaDeclaracion() {
		return strAreaDeclaracion;
	}

	public void setStrAreaDeclaracion(String strAreaDeclaracion) {
		this.strAreaDeclaracion = strAreaDeclaracion;
	}

	public String getStrAreaDesc() {
		return strAreaDesc;
	}

	public void setStrAreaDesc(String strAreaDesc) {
		this.strAreaDesc = strAreaDesc;
	}

	public Date getDteFcDeclaracion() {
		return dteFcDeclaracion;
	}

	public void setDteFcDeclaracion(Date dteFcDeclaracion) {
		this.dteFcDeclaracion = dteFcDeclaracion;
	}

	public Date getDteFcPresentacion() {
		return dteFcPresentacion;
	}

	public void setDteFcPresentacion(Date dteFcPresentacion) {
		this.dteFcPresentacion = dteFcPresentacion;
	}

	public String getStrRFC() {
		return strRFC;
	}

	public void setStrRFC(String strRFC) {
		this.strRFC = strRFC;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrCURP() {
		return strCURP;
	}

	public void setStrCURP(String strCURP) {
		this.strCURP = strCURP;
	}
	
	
	
	
	
	
}
