package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAutorizacionReinscripcion implements Serializable {

	@Id
    @Column(name = "IDAUTORIZACIONREINSCRIPCION")
    private Long idAutorizacionReinscripcion;

    @Column(name = "MATRICULA")
    private String strMatricula;
	
    @Column(name = "NBPERSONA")
    private String nbPersona;

    @Column(name = "APPATERNO")
    private String apPaterno;

    @Column(name = "APMATERNO")
    private String apMaterno;

    @Column(name = "NMREPROBADAS")
    private Integer nmMateriasReprobadas;

    @Column(name = "DSPERIODOTEMPORADA")
    private String dsPeriodoMes;
    
    @Column(name = "FCINICIO")
    private Date fcInicio;

    @Column(name = "FCFIN")
    private Date fcFin;

    @Column(name = "PROGRAMAEDUCATIVO")
    private String dsProgramaCampus;

    @Column(name = "IDHISTORIALACADEMICO")
    private Long idHistorialAcademico;

    @Column(name = "IDPERIODO")
    private String idPeriodo;
    
    public SePaAutorizacionReinscripcion() {
    	super();
    }

	

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
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

	public Integer getNmMateriasReprobadas() {
		return nmMateriasReprobadas;
	}

	public void setNmMateriasReprobadas(Integer nmMateriasReprobadas) {
		this.nmMateriasReprobadas = nmMateriasReprobadas;
	}

	public String getDsPeriodoMes() {
		return dsPeriodoMes;
	}

	public void setDsPeriodoMes(String dsPeriodoMes) {
		this.dsPeriodoMes = dsPeriodoMes;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public String getDsProgramaCampus() {
		return dsProgramaCampus;
	}

	public void setDsProgramaCampus(String dsProgramaCampus) {
		this.dsProgramaCampus = dsProgramaCampus;
	}

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}



	public Long getIdAutorizacionReinscripcion() {
		return idAutorizacionReinscripcion;
	}



	public void setIdAutorizacionReinscripcion(Long idAutorizacionReinscripcion) {
		this.idAutorizacionReinscripcion = idAutorizacionReinscripcion;
	}
    
    
}
