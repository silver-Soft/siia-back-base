package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtExtraordinarios {

	@Column(name = "ID")
	private Integer intId;

	@Id
	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;

	@Column(name = "DSTIPOALUMNO")
	private String strDsTipoAlumno;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

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

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public String getStrDsTipoAlumno() {
		return strDsTipoAlumno;
	}

	public void setStrDsTipoAlumno(String strDsTipoAlumno) {
		this.strDsTipoAlumno = strDsTipoAlumno;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

}