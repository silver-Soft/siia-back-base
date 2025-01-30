/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXSOLICITUDESPRACPRO")
public class SeAxSolicitudesPracPro implements Serializable {

	private static final String GENID_SEAXSOLICITUDESPRACPRO = "GENID_SEAXSOLICITUDESPRACPRO";

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENID_SEAXSOLICITUDESPRACPRO, sequenceName = "SERESC.IDSOLICITUDPRACPRO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEAXSOLICITUDESPRACPRO)
	@Column(name = "IDSOLICITUDPRACPRO")
	private Long lngIdSeAxSolicitudesPracPro;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "FC_SOLICITUD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSolicitud;

	@Column(name = "NB_JEFE")
	private String strNbJefe;

	@Column(name = "CARGO_JEFE")
	private String strCargoJefe;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "TURNO")
	private String strTurno;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "TURNO_ALUMNO")
	private String strTurnoAlumno;

	@Column(name = "GRUPO_ALUMNO")
	private String strGrupoAlumno;

	@Column(name = "FC_SOLGENERADA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSolGenerada;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "NBPERSONACARTA")
	private String strNbPersonaCarta;

	@Column(name = "CARGOPERSONACARTA")
	private String strCargoPersonaCarta;

	@Column(name = "FCSOLCARTATERMINACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSolCartaTerminacion;

	@Column(name = "FCGENERACIONCONSTERM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcGeneracionConsTerm;

	@JoinColumn(name = "IDPERIODOSPRACPRO", referencedColumnName = "ID_SEAXPERIODOSPRACTICAS")
	@ManyToOne(cascade = CascadeType.ALL)
	private SeAxPeriodosPracticasProfesionales perIdSeAxPeriodosPracPro;

	@JoinColumn(name = "IDPROGRAMAPRACPRO", referencedColumnName = "IDPROGRAMAPRACPRO")
	@ManyToOne(cascade = CascadeType.ALL)
	private SeAxProgramasPracPro progIdSeAxProgramasPracPro;

	@Column(name = "TIPOAPOYO")
	private String strTipoApoyo;

	@Column(name = "MNAPOYO")
	private Double dblMontoApoyo;

	@Column(name = "PERIODICIDAD")
	private String strPeridiocidad;

	@Column(name = "DSESPECIE")
	private String strDsEspecie;

	@Column(name = "FCINICIO")
	private Date fcInicio;

	@Column(name = "FCFIN")
	private Date fcFin;

	@Column(name = "DSACTIVIDADES")
	private String strDsActividades;

	@Column(name = "ASESOR")
	private String strAsesor;

	@Column(name = "COORDINADOREXTYCULTURA")
	private String strCooridnador;
	
	 	@Column(name = "FIRMAJEFEPRACPRO")
	    private String firmaJefePracPro;
	    
	    @Column(name = "FCFIRMAJEFEPRACPRO")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date fcFirmaJefePracPro;
	    
	    @Column(name = "IDPERSONAJEFEPRACPRO")
	    private Long idPersonaJefePracPro;
	    
	    @Column(name = "CERTIFICADOJEFEPRACPRO")
	    private String certificadoJefePracPro;
	    
	    @Column(name = "NOCERTIFICADOJEFEPRACPRO")
	    private String noCertificadoJefePracPro;
	    
	    @Column(name = "CADENAORIGINALJEFEPRACPRO")
	    private String cadenaOriginalJefePracPro;
	    
	    @Column(name = "FIRMASECEXTENSION")
	    private String firmaSecExtension;
	    
	    @Column(name = "FCFIRMASECEXTENSION")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date fcFirmaSecExtension;
	    
	    @Column(name = "IDPERSONASECEXTENSION")
	    private Long idPersonaSecExtension;
	    
	    @Column(name = "CERTIFICADOSECEXTENSION")
	    private String certificadoSecExtension;
	    
	    @Column(name = "NOCERTIFICADOSECEXTENSION")
	    private String noCertificadoSecExtension;
	    
	    @Column(name = "CADENAORIGINALSECEXTENSION")
	    private String cadenaOriginalSecExtension;
	    
	    @Column(name = "CERTIFICADORESPUAT")
	    private String certificadoRespUat;
	    
	    @Column(name = "NOCERTIFICADORESPUAT")
	    private String noCertificadoRespUat;
	    
	    @Column(name = "FCSELLADO")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date fcSellado;
	    
	    @Column(name = "CADENAORIGINALSELLADO")
	    private String cadenaOriginalSellado;
	    
	    @Column(name = "SELLO")
	    private String sello;
	    
	    @Column(name = "RUBRO")
	    private String  strRubro;
	    
	public SeAxSolicitudesPracPro() {
	}

	public Long getLngIdSeAxSolicitudesPracPro() {
		return lngIdSeAxSolicitudesPracPro;
	}

	public void setLngIdSeAxSolicitudesPracPro(Long lngIdSeAxSolicitudesPracPro) {
		this.lngIdSeAxSolicitudesPracPro = lngIdSeAxSolicitudesPracPro;
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

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrTurnoAlumno() {
		return strTurnoAlumno;
	}

	public void setStrTurnoAlumno(String strTurnoAlumno) {
		this.strTurnoAlumno = strTurnoAlumno;
	}

	public String getStrGrupoAlumno() {
		return strGrupoAlumno;
	}

	public void setStrGrupoAlumno(String strGrupoAlumno) {
		this.strGrupoAlumno = strGrupoAlumno;
	}

	public Date getFcSolGenerada() {
		return fcSolGenerada;
	}

	public void setFcSolGenerada(Date fcSolGenerada) {
		this.fcSolGenerada = fcSolGenerada;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
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

	public Date getFcSolCartaTerminacion() {
		return fcSolCartaTerminacion;
	}

	public void setFcSolCartaTerminacion(Date fcSolCartaTerminacion) {
		this.fcSolCartaTerminacion = fcSolCartaTerminacion;
	}

	public Date getFcGeneracionConsTerm() {
		return fcGeneracionConsTerm;
	}

	public void setFcGeneracionConsTerm(Date fcGeneracionConsTerm) {
		this.fcGeneracionConsTerm = fcGeneracionConsTerm;
	}

	public SeAxPeriodosPracticasProfesionales getPerIdSeAxPeriodosPracPro() {
		return perIdSeAxPeriodosPracPro;
	}

	public void setPerIdSeAxPeriodosPracPro(SeAxPeriodosPracticasProfesionales perIdSeAxPeriodosPracPro) {
		this.perIdSeAxPeriodosPracPro = perIdSeAxPeriodosPracPro;
	}

	public SeAxProgramasPracPro getProgIdSeAxProgramasPracPro() {
		return progIdSeAxProgramasPracPro;
	}

	public void setProgIdSeAxProgramasPracPro(SeAxProgramasPracPro progIdSeAxProgramasPracPro) {
		this.progIdSeAxProgramasPracPro = progIdSeAxProgramasPracPro;
	}

	public String getStrTipoApoyo() {
		return strTipoApoyo;
	}

	public void setStrTipoApoyo(String strTipoApoyo) {
		this.strTipoApoyo = strTipoApoyo;
	}

	public Double getDblMontoApoyo() {
		return dblMontoApoyo;
	}

	public void setDblMontoApoyo(Double dblMontoApoyo) {
		this.dblMontoApoyo = dblMontoApoyo;
	}

	public String getStrPeridiocidad() {
		return strPeridiocidad;
	}

	public void setStrPeridiocidad(String strPeridiocidad) {
		this.strPeridiocidad = strPeridiocidad;
	}

	public String getStrDsEspecie() {
		return strDsEspecie;
	}

	public void setStrDsEspecie(String strDsEspecie) {
		this.strDsEspecie = strDsEspecie;
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

	public String getStrDsActividades() {
		return strDsActividades;
	}

	public void setStrDsActividades(String strDsActividades) {
		this.strDsActividades = strDsActividades;
	}

	public String getStrAsesor() {
		return strAsesor;
	}

	public void setStrAsesor(String strAsesor) {
		this.strAsesor = strAsesor;
	}

	public String getStrCooridnador() {
		return strCooridnador;
	}

	public void setStrCooridnador(String strCooridnador) {
		this.strCooridnador = strCooridnador;
	}

	public String getFirmaJefePracPro() {
		return firmaJefePracPro;
	}

	public void setFirmaJefePracPro(String firmaJefePracPro) {
		this.firmaJefePracPro = firmaJefePracPro;
	}

	public Date getFcFirmaJefePracPro() {
		return fcFirmaJefePracPro;
	}

	public void setFcFirmaJefePracPro(Date fcFirmaJefePracPro) {
		this.fcFirmaJefePracPro = fcFirmaJefePracPro;
	}

	public Long getIdPersonaJefePracPro() {
		return idPersonaJefePracPro;
	}

	public void setIdPersonaJefePracPro(Long idPersonaJefePracPro) {
		this.idPersonaJefePracPro = idPersonaJefePracPro;
	}

	public String getCertificadoJefePracPro() {
		return certificadoJefePracPro;
	}

	public void setCertificadoJefePracPro(String certificadoJefePracPro) {
		this.certificadoJefePracPro = certificadoJefePracPro;
	}

	public String getNoCertificadoJefePracPro() {
		return noCertificadoJefePracPro;
	}

	public void setNoCertificadoJefePracPro(String noCertificadoJefePracPro) {
		this.noCertificadoJefePracPro = noCertificadoJefePracPro;
	}

	public String getCadenaOriginalJefePracPro() {
		return cadenaOriginalJefePracPro;
	}

	public void setCadenaOriginalJefePracPro(String cadenaOriginalJefePracPro) {
		this.cadenaOriginalJefePracPro = cadenaOriginalJefePracPro;
	}

	public String getFirmaSecExtension() {
		return firmaSecExtension;
	}

	public void setFirmaSecExtension(String firmaSecExtension) {
		this.firmaSecExtension = firmaSecExtension;
	}

	public Date getFcFirmaSecExtension() {
		return fcFirmaSecExtension;
	}

	public void setFcFirmaSecExtension(Date fcFirmaSecExtension) {
		this.fcFirmaSecExtension = fcFirmaSecExtension;
	}

	public Long getIdPersonaSecExtension() {
		return idPersonaSecExtension;
	}

	public void setIdPersonaSecExtension(Long idPersonaSecExtension) {
		this.idPersonaSecExtension = idPersonaSecExtension;
	}

	public String getCertificadoSecExtension() {
		return certificadoSecExtension;
	}

	public void setCertificadoSecExtension(String certificadoSecExtension) {
		this.certificadoSecExtension = certificadoSecExtension;
	}

	public String getNoCertificadoSecExtension() {
		return noCertificadoSecExtension;
	}

	public void setNoCertificadoSecExtension(String noCertificadoSecExtension) {
		this.noCertificadoSecExtension = noCertificadoSecExtension;
	}

	public String getCadenaOriginalSecExtension() {
		return cadenaOriginalSecExtension;
	}

	public void setCadenaOriginalSecExtension(String cadenaOriginalSecExtension) {
		this.cadenaOriginalSecExtension = cadenaOriginalSecExtension;
	}

	public String getCertificadoRespUat() {
		return certificadoRespUat;
	}

	public void setCertificadoRespUat(String certificadoRespUat) {
		this.certificadoRespUat = certificadoRespUat;
	}

	public String getNoCertificadoRespUat() {
		return noCertificadoRespUat;
	}

	public void setNoCertificadoRespUat(String noCertificadoRespUat) {
		this.noCertificadoRespUat = noCertificadoRespUat;
	}

	public Date getFcSellado() {
		return fcSellado;
	}

	public void setFcSellado(Date fcSellado) {
		this.fcSellado = fcSellado;
	}

	public String getCadenaOriginalSellado() {
		return cadenaOriginalSellado;
	}

	public void setCadenaOriginalSellado(String cadenaOriginalSellado) {
		this.cadenaOriginalSellado = cadenaOriginalSellado;
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public String getStrRubro() {
		return strRubro;
	}

	public void setStrRubro(String strRubro) {
		this.strRubro = strRubro;
	}
	
	

}
