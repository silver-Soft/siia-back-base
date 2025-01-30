package mx.uatx.siiaback.serviciosEscolares.entities;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SePaDatosTitulo {
	
	@Id
	@Column(name = "FOLIOCONTROL")
	private Integer intIdTitulo;
	
	//Firma rector
	
	@Column(name = "VERSION")
	private String strVersion;
	
	@Column(name = "NBRECTOR")
	private String nombreRector;
    
	@Column(name = "APPATERNORECTOR")
	private String primerApellidoRector;
	
	@Column(name = "APMATERNORECTOR")
	private String segundoApellidoRector;
    
	@Column(name = "CURPRECTOR")
	private String curpRector;
    
	@Column(name = "IDCARGORECTOR")
	private BigInteger idCargoRector;
	
	@Column(name = "CARGORECTOR")
	private String cargoRector;
	
	@Column(name = "ABRTITULORECTOR")
	private String abrTituloRector;
	
	@Column(name = "FIRMARECTOR")
	private String selloRector;
	
	@Column(name = "CERTIFICADORECTOR")
	private String certificadoResponsableRector;
    
	@Column(name = "NMCERTIFICADORECTOR")
	private String noCertificadoResponsableRector;
	
	
	
	//Firma ACADEMICO
	
		@Column(name = "NBSECACAD")
		private String nombreAcademico;
	    
		@Column(name = "APPATERNOSECACAD")
		private String primerApellidoAcademico;
		
		@Column(name = "APMATERNOSECACAD")
		private String segundoApellidoAcademico;
	    
		@Column(name = "CURPSECACAD")
		private String curpAcademico;
	    
		@Column(name = "IDCARGOSECACAD")
		private BigInteger idCargoAcademico;
		
		@Column(name = "CARGOSECACAD")
		private String cargoAcademico;
		
		@Column(name = "ABRTITULOSECACAD")
		private String abrTituloAcademico;
		
		@Column(name = "FIRMASECACADEMICO")
		private String selloAcademico;
		
		@Column(name = "CERTIFICADOSECACAD")
		private String certificadoResponsableAcademico;
	    
		@Column(name = "NMCERTIFICADOSECACAD")
		private String noCertificadoResponsableAcademico;
	

	//Institucion
	@Column(name = "CLAVEINSTITUCION")
    private String cveInstitucion;
    
	@Column(name = "NBINSTITUCION")
    private String nombreInstitucion;
    
    //CArrera
	@Column(name = "CLAVECARRERA")
    private String cveCarrera;
    
	@Column(name = "NBCARRERA")
    private String nombreCarrera;
    
	@Column(name = "FECHAINICIO")
    private Date fechaInicio;

	@Column(name = "FECHATERMINACION")
    private Date fechaTerminacion;

	@Column(name = "IDAUTORIZACIONRECONOCIMIENTO")
    private BigInteger idAutorizacionReconocimiento;
    
	@Column(name = "AUTORIZACIONRECONOCIMIENTO")
    private String autorizacionReconocimiento;
    
	@Column(name = "NUMERORVOE")
    private String numeroRvoe;
	
    //Profesionista
	@Column(name = "CURP")
    private String curp;
    
	@Column(name = "NOMBRE")
    private String nombre;
    
	@Column(name = "APELLIDOPATERNO")
    private String primerApellido;
    
	@Column(name = "APELLIDOMATERNO")
    private String segundoApellido;
    
	@Column(name = "CORREOELECTRONICO")
    private String correoElectronico;
    
    
    
    //Expedicion
	@Column(name = "FECHAEXPEDICION")
    private Date fechaExpedicion;
    
	@Column(name = "IDMODALIDADTITULACION")
    private BigInteger idModalidadTitulacion;
    
	@Column(name = "MODALIDADTITULACION")
    private String modalidadTitulacion;
    
	@Column(name = "FECHAEXAMENPROFESIONAL")
    private Date fechaExamenProfesional;
    
	@Column(name = "FECHAEXENCIONEXAMENPROFESIONAL")
    private Date fechaExencionExamenProfesional;
    
	@Column(name = "CUMPLIOSERVICIOSOCIAL")
    private BigInteger cumplioServicioSocial;
    
	@Column(name = "IDFUNDAMENTOLEGALSERVSOC")
    private BigInteger idFundamentoLegalServicioSocial;
    
	@Column(name = "FUNDAMENTOLEGALSERVSOC")
    private String fundamentoLegalServicioSocial;
    
	@Column(name = "IDENTIDADFEDERATIVA")
    private String idEntidadFederativaExpedicion;
    
	@Column(name = "ENTIDADFEDERATIVA")
    private String entidadFederativaExpedicion;
    
    
    //Antecedente
	@Column(name = "INSTITUCIONPROCEDENCIA")
    private String institucionProcedencia;

	@Column(name = "IDTIPOESTUDIOANTECEDENTE")
    private BigInteger idTipoEstudioAntecedente;

	@Column(name = "TIPOESTUDIOANTECEDENTE")
    private String tipoEstudioAntecedente;

	@Column(name = "IDENTIDADFEDERATIVAANTE")
    private String idEntidadFederativaAntecedente;

	@Column(name = "ENTIDADFEDERATIVAANTE")
    private String entidadFederativaAntecedente;
   
	@Column(name = "FECHAINICIOANTE")
    private Date fechaInicioAntecedente;
    
	@Column(name = "FECHATERMINACIONANTE")
    private Date fechaTerminacionAntecedente;
    
	@Column(name = "NUMEROCEDULA")
    private String noCedula;
	
	@Column(name = "MATRICULA")
    private String strMatricula;
	
	@Column(name = "CADENAORIGINAL")
    private String strCadenaOriginal;



	public Integer getIntIdTitulo() {
		return intIdTitulo;
	}

	public void setIntIdTitulo(Integer intIdTitulo) {
		this.intIdTitulo = intIdTitulo;
	}

	public String getCveInstitucion() {
		return cveInstitucion;
	}

	public void setCveInstitucion(String cveInstitucion) {
		this.cveInstitucion = cveInstitucion;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public String getCveCarrera() {
		return cveCarrera;
	}

	public void setCveCarrera(String cveCarrera) {
		this.cveCarrera = cveCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTerminacion() {
		return fechaTerminacion;
	}

	public void setFechaTerminacion(Date fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion;
	}

	public BigInteger getIdAutorizacionReconocimiento() {
		return idAutorizacionReconocimiento;
	}

	public void setIdAutorizacionReconocimiento(BigInteger idAutorizacionReconocimiento) {
		this.idAutorizacionReconocimiento = idAutorizacionReconocimiento;
	}

	public String getAutorizacionReconocimiento() {
		return autorizacionReconocimiento;
	}

	public void setAutorizacionReconocimiento(String autorizacionReconocimiento) {
		this.autorizacionReconocimiento = autorizacionReconocimiento;
	}

	public String getNumeroRvoe() {
		return numeroRvoe;
	}

	public void setNumeroRvoe(String numeroRvoe) {
		this.numeroRvoe = numeroRvoe;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public BigInteger getIdModalidadTitulacion() {
		return idModalidadTitulacion;
	}

	public void setIdModalidadTitulacion(BigInteger idModalidadTitulacion) {
		this.idModalidadTitulacion = idModalidadTitulacion;
	}

	public String getModalidadTitulacion() {
		return modalidadTitulacion;
	}

	public void setModalidadTitulacion(String modalidadTitulacion) {
		this.modalidadTitulacion = modalidadTitulacion;
	}

	public Date getFechaExamenProfesional() {
		return fechaExamenProfesional;
	}

	public void setFechaExamenProfesional(Date fechaExamenProfesional) {
		this.fechaExamenProfesional = fechaExamenProfesional;
	}

	public Date getFechaExencionExamenProfesional() {
		return fechaExencionExamenProfesional;
	}

	public void setFechaExencionExamenProfesional(Date fechaExencionExamenProfesional) {
		this.fechaExencionExamenProfesional = fechaExencionExamenProfesional;
	}

	public BigInteger getCumplioServicioSocial() {
		return cumplioServicioSocial;
	}

	public void setCumplioServicioSocial(BigInteger cumplioServicioSocial) {
		this.cumplioServicioSocial = cumplioServicioSocial;
	}

	public BigInteger getIdFundamentoLegalServicioSocial() {
		return idFundamentoLegalServicioSocial;
	}

	public void setIdFundamentoLegalServicioSocial(BigInteger idFundamentoLegalServicioSocial) {
		this.idFundamentoLegalServicioSocial = idFundamentoLegalServicioSocial;
	}

	public String getFundamentoLegalServicioSocial() {
		return fundamentoLegalServicioSocial;
	}

	public void setFundamentoLegalServicioSocial(String fundamentoLegalServicioSocial) {
		this.fundamentoLegalServicioSocial = fundamentoLegalServicioSocial;
	}

	public String getIdEntidadFederativaExpedicion() {
		return idEntidadFederativaExpedicion;
	}

	public void setIdEntidadFederativaExpedicion(String idEntidadFederativaExpedicion) {
		this.idEntidadFederativaExpedicion = idEntidadFederativaExpedicion;
	}

	public String getEntidadFederativaExpedicion() {
		return entidadFederativaExpedicion;
	}

	public void setEntidadFederativaExpedicion(String entidadFederativaExpedicion) {
		this.entidadFederativaExpedicion = entidadFederativaExpedicion;
	}

	public String getInstitucionProcedencia() {
		return institucionProcedencia;
	}

	public void setInstitucionProcedencia(String institucionProcedencia) {
		this.institucionProcedencia = institucionProcedencia;
	}

	public BigInteger getIdTipoEstudioAntecedente() {
		return idTipoEstudioAntecedente;
	}

	public void setIdTipoEstudioAntecedente(BigInteger idTipoEstudioAntecedente) {
		this.idTipoEstudioAntecedente = idTipoEstudioAntecedente;
	}

	public String getTipoEstudioAntecedente() {
		return tipoEstudioAntecedente;
	}

	public void setTipoEstudioAntecedente(String tipoEstudioAntecedente) {
		this.tipoEstudioAntecedente = tipoEstudioAntecedente;
	}

	public String getIdEntidadFederativaAntecedente() {
		return idEntidadFederativaAntecedente;
	}

	public void setIdEntidadFederativaAntecedente(String idEntidadFederativaAntecedente) {
		this.idEntidadFederativaAntecedente = idEntidadFederativaAntecedente;
	}

	public String getEntidadFederativaAntecedente() {
		return entidadFederativaAntecedente;
	}

	public void setEntidadFederativaAntecedente(String entidadFederativaAntecedente) {
		this.entidadFederativaAntecedente = entidadFederativaAntecedente;
	}

	public Date getFechaInicioAntecedente() {
		return fechaInicioAntecedente;
	}

	public void setFechaInicioAntecedente(Date fechaInicioAntecedente) {
		this.fechaInicioAntecedente = fechaInicioAntecedente;
	}

	public Date getFechaTerminacionAntecedente() {
		return fechaTerminacionAntecedente;
	}

	public void setFechaTerminacionAntecedente(Date fechaTerminacionAntecedente) {
		this.fechaTerminacionAntecedente = fechaTerminacionAntecedente;
	}

	public String getNoCedula() {
		return noCedula;
	}

	public void setNoCedula(String noCedula) {
		this.noCedula = noCedula;
	}

	public String getNombreRector() {
		return nombreRector;
	}

	public void setNombreRector(String nombreRector) {
		this.nombreRector = nombreRector;
	}

	public String getPrimerApellidoRector() {
		return primerApellidoRector;
	}

	public void setPrimerApellidoRector(String primerApellidoRector) {
		this.primerApellidoRector = primerApellidoRector;
	}

	public String getSegundoApellidoRector() {
		return segundoApellidoRector;
	}

	public void setSegundoApellidoRector(String segundoApellidoRector) {
		this.segundoApellidoRector = segundoApellidoRector;
	}

	public String getCurpRector() {
		return curpRector;
	}

	public void setCurpRector(String curpRector) {
		this.curpRector = curpRector;
	}

	public BigInteger getIdCargoRector() {
		return idCargoRector;
	}

	public void setIdCargoRector(BigInteger idCargoRector) {
		this.idCargoRector = idCargoRector;
	}

	public String getCargoRector() {
		return cargoRector;
	}

	public void setCargoRector(String cargoRector) {
		this.cargoRector = cargoRector;
	}

	public String getAbrTituloRector() {
		return abrTituloRector;
	}

	public void setAbrTituloRector(String abrTituloRector) {
		this.abrTituloRector = abrTituloRector;
	}

	public String getSelloRector() {
		return selloRector;
	}

	public void setSelloRector(String selloRector) {
		this.selloRector = selloRector;
	}

	public String getCertificadoResponsableRector() {
		return certificadoResponsableRector;
	}

	public void setCertificadoResponsableRector(String certificadoResponsableRector) {
		this.certificadoResponsableRector = certificadoResponsableRector;
	}

	public String getNoCertificadoResponsableRector() {
		return noCertificadoResponsableRector;
	}

	public void setNoCertificadoResponsableRector(String noCertificadoResponsableRector) {
		this.noCertificadoResponsableRector = noCertificadoResponsableRector;
	}

	public String getNombreAcademico() {
		return nombreAcademico;
	}

	public void setNombreAcademico(String nombreAcademico) {
		this.nombreAcademico = nombreAcademico;
	}

	public String getPrimerApellidoAcademico() {
		return primerApellidoAcademico;
	}

	public void setPrimerApellidoAcademico(String primerApellidoAcademico) {
		this.primerApellidoAcademico = primerApellidoAcademico;
	}

	public String getSegundoApellidoAcademico() {
		return segundoApellidoAcademico;
	}

	public void setSegundoApellidoAcademico(String segundoApellidoAcademico) {
		this.segundoApellidoAcademico = segundoApellidoAcademico;
	}

	public String getCurpAcademico() {
		return curpAcademico;
	}

	public void setCurpAcademico(String curpAcademico) {
		this.curpAcademico = curpAcademico;
	}

	public BigInteger getIdCargoAcademico() {
		return idCargoAcademico;
	}

	public void setIdCargoAcademico(BigInteger idCargoAcademico) {
		this.idCargoAcademico = idCargoAcademico;
	}

	public String getCargoAcademico() {
		return cargoAcademico;
	}

	public void setCargoAcademico(String cargoAcademico) {
		this.cargoAcademico = cargoAcademico;
	}

	public String getAbrTituloAcademico() {
		return abrTituloAcademico;
	}

	public void setAbrTituloAcademico(String abrTituloAcademico) {
		this.abrTituloAcademico = abrTituloAcademico;
	}

	public String getSelloAcademico() {
		return selloAcademico;
	}

	public void setSelloAcademico(String selloAcademico) {
		this.selloAcademico = selloAcademico;
	}

	public String getCertificadoResponsableAcademico() {
		return certificadoResponsableAcademico;
	}

	public void setCertificadoResponsableAcademico(String certificadoResponsableAcademico) {
		this.certificadoResponsableAcademico = certificadoResponsableAcademico;
	}

	public String getNoCertificadoResponsableAcademico() {
		return noCertificadoResponsableAcademico;
	}

	public void setNoCertificadoResponsableAcademico(String noCertificadoResponsableAcademico) {
		this.noCertificadoResponsableAcademico = noCertificadoResponsableAcademico;
	}

	public String getStrVersion() {
		return strVersion;
	}

	public void setStrVersion(String strVersion) {
		this.strVersion = strVersion;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrCadenaOriginal() {
		return strCadenaOriginal;
	}

	public void setStrCadenaOriginal(String strCadenaOriginal) {
		this.strCadenaOriginal = strCadenaOriginal;
	}
	
	
	
	
	
	
	
	
	
	
}
