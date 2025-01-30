package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosReporteAsegurados implements Serializable {
	
	@Id
	@Column(name = "IDCOMPLEMENTARIOIMSS")
	private Long idComplementarioImss;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NBPERSONA")
	private String nbPersona;
	
	@Column(name = "APPATERNO")
	private String apPaterno;
	
	@Column(name = "APMATERNO")
	private String apMaterno;

	@Column(name = "CURP")
	private String curp;
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "NSS")
	private String nss;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "PROGRAMACAMPUS")
	private String programacampus;
	
	@Column(name = "PERIODO")
	private Integer periodo;

	public Long getIdComplementarioImss() {
		return idComplementarioImss;
	}

	public void setIdComplementarioImss(Long idComplementarioImss) {
		this.idComplementarioImss = idComplementarioImss;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNbPersona() {
		return nbPersona;
	}

	public void setNbPersona(String nbPersona) {
		this.nbPersona = nbPersona;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getProgramacampus() {
		return programacampus;
	}

	public void setProgramacampus(String programacampus) {
		this.programacampus = programacampus;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

}
