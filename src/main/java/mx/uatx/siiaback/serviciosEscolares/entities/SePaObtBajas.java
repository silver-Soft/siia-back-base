package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtBajas {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "FCAUTORIZACION")
	private Date fcAutorizacion;

	@Column(name = "DSTIPOBAJA")
	private String strDsTipoBaja;

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Date getFcAutorizacion() {
		return fcAutorizacion;
	}

	public void setFcAutorizacion(Date fcAutorizacion) {
		this.fcAutorizacion = fcAutorizacion;
	}

	public String getStrDsTipoBaja() {
		return strDsTipoBaja;
	}

	public void setStrDsTipoBaja(String strDsTipoBaja) {
		this.strDsTipoBaja = strDsTipoBaja;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

}