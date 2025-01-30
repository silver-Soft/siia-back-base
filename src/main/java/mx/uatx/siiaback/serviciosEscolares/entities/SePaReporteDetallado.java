package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteDetallado {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "NBPERSONA")
	private String strNombre;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "ULTIMOPERIODO")
	private Integer intUltimoPeriodo;

	@Column(name = "PERIODOEGRESO")
	private String strPeriodoEgreso;

	@Column(name = "FCTITULACION")
	private Date dteFechaTitulacion;

	public SePaReporteDetallado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntUltimoPeriodo() {
		return intUltimoPeriodo;
	}

	public void setIntUltimoPeriodo(Integer intUltimoPeriodo) {
		this.intUltimoPeriodo = intUltimoPeriodo;
	}

	public String getStrPeriodoEgreso() {
		return strPeriodoEgreso;
	}

	public void setStrPeriodoEgreso(String strPeriodoEgreso) {
		this.strPeriodoEgreso = strPeriodoEgreso;
	}

	public Date getDteFechaTitulacion() {
		return dteFechaTitulacion;
	}

	public void setDteFechaTitulacion(Date dteFechaTitulacion) {
		this.dteFechaTitulacion = dteFechaTitulacion;
	}

}
