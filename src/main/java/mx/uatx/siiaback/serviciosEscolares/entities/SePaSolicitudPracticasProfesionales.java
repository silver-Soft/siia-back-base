/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaSolicitudPracticasProfesionales implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2015928709512240478L;

	@Id
	@Column(name = "IDSOLICITUDPRACPRO")
	private Long lngIdSolicitud;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "FC_SOLICITUD")
	private Date fcSolicitud;

	@Column(name = "NB_JEFE")
	private String strNbJefe;

	@Column(name = "CARGO_JEFE")
	private String strCargoJefe;

	@Column(name = "IDPERIODOPRACPOR")
	private String strIdPeriodo;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "TURNO")
	private String strTurno;

	@Column(name = "IDPERIODOPRACPRO")
	private Integer intIdPeriodoPracticas;

	@Column(name = "IDPROGRAMAPRACPRO")
	private Integer intIdProgramaPracticas;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "NOMBRE")
	private String strNombreCompletoAlumno;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "PROGRAMAPRACPRO")
	private String strProgramaPracticasProfesionales;

	@Column(name = "NOMBREDEPENDENCIA")
	private String strNombreDependencia;
	
	@Column(name = "HABILITARLIBERACION")
	private Boolean blnActivarFnLiberacion;
	
	@Column(name = "HABILITARCARTA")
	private Boolean blnActivarFnCartaTerm;
	
	@Column(name = "PERMITESOLICITUD")
	private Boolean blnPermiteSolicitud;
	
	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;
	
	@Column(name = "FCSOLCARTATERMINACION")
	private Date fcSolCartaTerminacion;
	
	@Column(name = "NBPERSONACARTA")
	private String strNbPersonaCarta;
	
	@Column(name = "CARGOPEROANACARTA")
	private String strCargoPersonaCarta;
	
	@Column(name = "TITULARSS")
	private String strNbJefePracticasProfesionales;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;
	
	@Column(name = "PERMITEVALIDAR")
	private Boolean blnPermiteValidar;
	
	@Column(name = "PERMITEDESVALIDAR")
	private Boolean blnPermiteRevertir;
	
	@Column(name = "IDFOTOESTUDIO")
	private Long lngIdFotoEstudioPersona;
	

	public Long getLngIdSolicitud() {
		return lngIdSolicitud;
	}

	public void setLngIdSolicitud(Long lngIdSolicitud) {
		this.lngIdSolicitud = lngIdSolicitud;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getStrNbJefe() {
		return strNbJefe;
	}

	public void setStrNbJefe(String strNbJefe) {
		this.strNbJefe = strNbJefe;
	}

	public String getStrCargoJefe() {
		return strCargoJefe;
	}

	public void setStrCargoJefe(String strCargoJefe) {
		this.strCargoJefe = strCargoJefe;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	public String getStrTurno() {
		return strTurno;
	}

	public void setStrTurno(String strTurno) {
		this.strTurno = strTurno;
	}

	public Integer getIntIdPeriodoPracticas() {
		return intIdPeriodoPracticas;
	}

	public void setIntIdPeriodoPracticas(Integer intIdPeriodoPracticas) {
		this.intIdPeriodoPracticas = intIdPeriodoPracticas;
	}

	public Integer getIntIdProgramaPracticas() {
		return intIdProgramaPracticas;
	}

	public void setIntIdProgramaPracticas(Integer intIdProgramaPracticas) {
		this.intIdProgramaPracticas = intIdProgramaPracticas;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrNombreCompletoAlumno() {
		return strNombreCompletoAlumno;
	}

	public void setStrNombreCompletoAlumno(String strNombreCompletoAlumno) {
		this.strNombreCompletoAlumno = strNombreCompletoAlumno;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrProgramaPracticasProfesionales() {
		return strProgramaPracticasProfesionales;
	}

	public void setStrProgramaPracticasProfesionales(String strProgramaPracticasProfesionales) {
		this.strProgramaPracticasProfesionales = strProgramaPracticasProfesionales;
	}

	public String getStrNombreDependencia() {
		return strNombreDependencia;
	}

	public void setStrNombreDependencia(String strNombreDependencia) {
		this.strNombreDependencia = strNombreDependencia;
	}

	public Boolean getBlnActivarFnLiberacion() {
		return blnActivarFnLiberacion;
	}

	public void setBlnActivarFnLiberacion(Boolean blnActivarFnLiberacion) {
		this.blnActivarFnLiberacion = blnActivarFnLiberacion;
	}

	public Boolean getBlnActivarFnCartaTerm() {
		return blnActivarFnCartaTerm;
	}

	public void setBlnActivarFnCartaTerm(Boolean blnActivarFnCartaTerm) {
		this.blnActivarFnCartaTerm = blnActivarFnCartaTerm;
	}

	public Boolean getBlnPermiteSolicitud() {
		return blnPermiteSolicitud;
	}

	public void setBlnPermiteSolicitud(Boolean blnPermiteSolicitud) {
		this.blnPermiteSolicitud = blnPermiteSolicitud;
	}

	public Boolean getBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}

	public void setBlnPermiteImprimir(Boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}

	public Date getFcSolCartaTerminacion() {
		return fcSolCartaTerminacion;
	}

	public void setFcSolCartaTerminacion(Date fcSolCartaTerminacion) {
		this.fcSolCartaTerminacion = fcSolCartaTerminacion;
	}

	public String getStrNbPersonaCarta() {
		return strNbPersonaCarta;
	}

	public void setStrNbPersonaCarta(String strNbPersonaCarta) {
		this.strNbPersonaCarta = strNbPersonaCarta;
	}

	public String getStrCargoPersonaCarta() {
		return strCargoPersonaCarta;
	}

	public void setStrCargoPersonaCarta(String strCargoPersonaCarta) {
		this.strCargoPersonaCarta = strCargoPersonaCarta;
	}

	public String getStrNbJefePracticasProfesionales() {
		return strNbJefePracticasProfesionales;
	}

	public void setStrNbJefePracticasProfesionales(String strNbJefePracticasProfesionales) {
		this.strNbJefePracticasProfesionales = strNbJefePracticasProfesionales;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Boolean getBlnPermiteValidar() {
		return blnPermiteValidar;
	}

	public void setBlnPermiteValidar(Boolean blnPermiteValidar) {
		this.blnPermiteValidar = blnPermiteValidar;
	}

	public Long getLngIdFotoEstudioPersona() {
		return lngIdFotoEstudioPersona;
	}

	public void setLngIdFotoEstudioPersona(Long lngIdFotoEstudioPersona) {
		this.lngIdFotoEstudioPersona = lngIdFotoEstudioPersona;
	}

	public Boolean getBlnPermiteRevertir() {
		return blnPermiteRevertir;
	}

	public void setBlnPermiteRevertir(Boolean blnPermiteRevertir) {
		this.blnPermiteRevertir = blnPermiteRevertir;
	}
	
	
	

}
