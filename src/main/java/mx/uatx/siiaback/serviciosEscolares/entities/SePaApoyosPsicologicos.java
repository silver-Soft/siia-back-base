package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaApoyosPsicologicos implements Serializable {

	private static final long serialVersionUID = -3782226925485283317L;

	@Id
	@Column(name = "IDAPOYO")
	private Integer intId;

	@Column(name = "FCSOLICITUD")
	private Date dteFcSolicitud;

	@Column(name = "DSMOTIVO")
	private String strMotivo;

	@Column(name = "NOMBRECANALIZO")
	private String strNbCanalizo;

	@Column(name = "ESTADOCIVILPADRE")
	private String strEstadoCivilPadre;

	@Column(name = "ESTADOCIVILMADRE")
	private String strEstadoCivilMadre;

	@Column(name = "EDADMADRE")
	private Integer intEdadMadre;

	@Column(name = "EDADPADRE")
	private Integer intEdadPadre;
	
	@Column(name = "TIPOPERSONACANALIZO")
	private String strTipoPersonaCanalizo;
	

	public SePaApoyosPsicologicos() {
		super();
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Date getDteFcSolicitud() {
		return dteFcSolicitud;
	}

	public void setDteFcSolicitud(Date dteFcSolicitud) {
		this.dteFcSolicitud = dteFcSolicitud;
	}

	public String getStrMotivo() {
		return strMotivo;
	}

	public void setStrMotivo(String strMotivo) {
		this.strMotivo = strMotivo;
	}

	public String getStrNbCanalizo() {
		return strNbCanalizo;
	}

	public void setStrNbCanalizo(String strNbCanalizo) {
		this.strNbCanalizo = strNbCanalizo;
	}

	

	public String getStrEstadoCivilPadre() {
		return strEstadoCivilPadre;
	}

	public void setStrEstadoCivilPadre(String strEstadoCivilPadre) {
		this.strEstadoCivilPadre = strEstadoCivilPadre;
	}

	public String getStrEstadoCivilMadre() {
		return strEstadoCivilMadre;
	}

	public void setStrEstadoCivilMadre(String strEstadoCivilMadre) {
		this.strEstadoCivilMadre = strEstadoCivilMadre;
	}

	public Integer getIntEdadMadre() {
		return intEdadMadre;
	}

	public void setIntEdadMadre(Integer intEdadMadre) {
		this.intEdadMadre = intEdadMadre;
	}

	public Integer getIntEdadPadre() {
		return intEdadPadre;
	}

	public void setIntEdadPadre(Integer intEdadPadre) {
		this.intEdadPadre = intEdadPadre;
	}

	public String getStrTipoPersonaCanalizo() {
		return strTipoPersonaCanalizo;
	}

	public void setStrTipoPersonaCanalizo(String strTipoPersonaCanalizo) {
		this.strTipoPersonaCanalizo = strTipoPersonaCanalizo;
	}
	
	

	

}
