package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtHistoricoCedula {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "DSOBSERVACIONES")
	private String observaciones;
	
	@Column(name = "NBPERSONA")
	private String nbPersona;
	
	@Column(name = "APPATERNO")
	private String apPaterno;
	
	@Column(name = "APMATERNO")
	private String apMaterno;
	
	@Column(name = "CLGENERO")
	private Integer idGenero;
	
	@Column(name = "FCNACIMIENTO")
	private Date fcNacimiento;
	
	@Column(name = "IDENTIDAD")
	private Long idEntidadLocalizacion;
	
	@Column(name = "IDMUNICIPIO")
	private Long idMunicipioLocalizacion;
	
	@Column(name = "CLESTATUSHISTACAD")
	private Integer clEstatusHistAcad;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "IDPLANESTUDIO")
	private Long idPlanEstudios;
	
	@Column(name = "IDPERIODOINGRESO")
	private String idPeriodoIngreso;
	
	@Column(name = "IDPERIODOEGRESO")
	private String idPeriodoEgreso;
	
	@Column(name = "FCTITULACION")
	private Date fcFechaTitulacion;
	
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	public Integer getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}
	public Date getFcNacimiento() {
		return fcNacimiento;
	}
	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}
	public Long getIdEntidadLocalizacion() {
		return idEntidadLocalizacion;
	}
	public void setIdEntidadLocalizacion(Long idEntidadLocalizacion) {
		this.idEntidadLocalizacion = idEntidadLocalizacion;
	}
	public Long getIdMunicipioLocalizacion() {
		return idMunicipioLocalizacion;
	}
	public void setIdMunicipioLocalizacion(Long idMunicipioLocalizacion) {
		this.idMunicipioLocalizacion = idMunicipioLocalizacion;
	}
	public Integer getClEstatusHistAcad() {
		return clEstatusHistAcad;
	}
	public void setClEstatusHistAcad(Integer clEstatusHistAcad) {
		this.clEstatusHistAcad = clEstatusHistAcad;
	}
	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}
	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}
	public Long getIdPlanEstudios() {
		return idPlanEstudios;
	}
	public void setIdPlanEstudios(Long idPlanEstudios) {
		this.idPlanEstudios = idPlanEstudios;
	}
	public String getIdPeriodoIngreso() {
		return idPeriodoIngreso;
	}
	public void setIdPeriodoIngreso(String idPeriodoIngreso) {
		this.idPeriodoIngreso = idPeriodoIngreso;
	}
	public String getIdPeriodoEgreso() {
		return idPeriodoEgreso;
	}
	public void setIdPeriodoEgreso(String idPeriodoEgreso) {
		this.idPeriodoEgreso = idPeriodoEgreso;
	}
	public Date getFcFechaTitulacion() {
		return fcFechaTitulacion;
	}
	public void setFcFechaTitulacion(Date fcFechaTitulacion) {
		this.fcFechaTitulacion = fcFechaTitulacion;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

}
