package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaHistorialEstudiantes {
	
	@Id
    @Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NBPERSONA")
	private String nombre;

	@Column(name = "APPATERNO")
	private String paterno;

	@Column(name = "APMATERNO")
	private String materno;

	@Column(name = "PROGRAMAEDUCATIVO")
	private String programaEducativo;

	@Column(name = "ESTATUS")
	private String estatus;

	@Column(name = "PERIODOCURSADO")
	private String periodoCursado;
	
	@Column(name = "PROGRAMAPLAN")
	private String dsProgramaPlan;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "IDPLANESTUDIO")
	private Long idPlan;
	
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long idCuestionarioPersona;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "IDDOMICILIOPERSONA")
	private Long idPersonaDomicilio;
	
	@Column(name = "IDPERSONATELEFONO")
	private Long idPersonaTelefono;
	
	@Column(name = "IDPERSONACORREO")
	private Long idPersonaCorreo;
	
	@Column(name = "NBPLANESTUDIO")
	private String nbPlanEstudio;
	
	@Column(name = "PERMITECONSULTARDATOSALUMNO")
	private Integer blnPermiteConsultarDatosAlumno;

	@Column(name = "PERMITECONSULTARBOLETAALUMNO")
	private Integer blnPermiteConsultarBoletaAlumno;

	@Column(name = "PERMITECONSULTARKARDEXALUMNO")
	private Integer blnPermiteConsultarKardexAlumno;

	@Column(name = "PERMITECONSULTARPROMEDIOALUMNO")
	private Integer blnPermiteConsultarPromedioAlumno;

	@Column(name = "PERMITECONSULTARAVANCEALUMNO")
	private Integer blnPermiteConsultarAvanceAlumno;

	@Column(name = "PERMITECONVALIDACIONES")
	private Integer blnPermiteConvalidaciones;

	@Column(name = "PERMITECONSULTAREXPEDIENTE")
	private Integer blnPermiteConsultarExpedienteAlumno;

	@Column(name = "PERMITEGENERARFUA")
	private Integer blnPermiteGenerarFUA;

	@Column(name = "PERMITEELIMINARALUMNOCOMPLETO")
	private Integer blnPermiteEliminarAlumnoCompleto;
	
	@Column(name = "PERMITEREPORTEENTREVISTA")
	private Integer blnPermiteEntrevistaInicial;
	
	
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getProgramaEducativo() {
		return programaEducativo;
	}
	public void setProgramaEducativo(String programaEducativo) {
		this.programaEducativo = programaEducativo;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getPeriodoCursado() {
		return periodoCursado;
	}
	public void setPeriodoCursado(String periodoCursado) {
		this.periodoCursado = periodoCursado;
	}
	public String getDsProgramaPlan() {
		return dsProgramaPlan;
	}
	public void setDsProgramaPlan(String dsProgramaPlan) {
		this.dsProgramaPlan = dsProgramaPlan;
	}
	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}
	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}
	public Long getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
	}
	public Integer getBlnPermiteConsultarDatosAlumno() {
		return blnPermiteConsultarDatosAlumno;
	}
	public void setBlnPermiteConsultarDatosAlumno(Integer blnPermiteConsultarDatosAlumno) {
		this.blnPermiteConsultarDatosAlumno = blnPermiteConsultarDatosAlumno;
	}
	public Integer getBlnPermiteConsultarBoletaAlumno() {
		return blnPermiteConsultarBoletaAlumno;
	}
	public void setBlnPermiteConsultarBoletaAlumno(Integer blnPermiteConsultarBoletaAlumno) {
		this.blnPermiteConsultarBoletaAlumno = blnPermiteConsultarBoletaAlumno;
	}
	public Integer getBlnPermiteConsultarKardexAlumno() {
		return blnPermiteConsultarKardexAlumno;
	}
	public void setBlnPermiteConsultarKardexAlumno(Integer blnPermiteConsultarKardexAlumno) {
		this.blnPermiteConsultarKardexAlumno = blnPermiteConsultarKardexAlumno;
	}
	public Integer getBlnPermiteConsultarPromedioAlumno() {
		return blnPermiteConsultarPromedioAlumno;
	}
	public void setBlnPermiteConsultarPromedioAlumno(Integer blnPermiteConsultarPromedioAlumno) {
		this.blnPermiteConsultarPromedioAlumno = blnPermiteConsultarPromedioAlumno;
	}
	public Integer getBlnPermiteConsultarAvanceAlumno() {
		return blnPermiteConsultarAvanceAlumno;
	}
	public void setBlnPermiteConsultarAvanceAlumno(Integer blnPermiteConsultarAvanceAlumno) {
		this.blnPermiteConsultarAvanceAlumno = blnPermiteConsultarAvanceAlumno;
	}
	public Integer getBlnPermiteConvalidaciones() {
		return blnPermiteConvalidaciones;
	}
	public void setBlnPermiteConvalidaciones(Integer blnPermiteConvalidaciones) {
		this.blnPermiteConvalidaciones = blnPermiteConvalidaciones;
	}
	public Integer getBlnPermiteConsultarExpedienteAlumno() {
		return blnPermiteConsultarExpedienteAlumno;
	}
	public void setBlnPermiteConsultarExpedienteAlumno(Integer blnPermiteConsultarExpedienteAlumno) {
		this.blnPermiteConsultarExpedienteAlumno = blnPermiteConsultarExpedienteAlumno;
	}
	public Integer getBlnPermiteGenerarFUA() {
		return blnPermiteGenerarFUA;
	}
	public void setBlnPermiteGenerarFUA(Integer blnPermiteGenerarFUA) {
		this.blnPermiteGenerarFUA = blnPermiteGenerarFUA;
	}
	public Integer getBlnPermiteEliminarAlumnoCompleto() {
		return blnPermiteEliminarAlumnoCompleto;
	}
	public void setBlnPermiteEliminarAlumnoCompleto(Integer blnPermiteEliminarAlumnoCompleto) {
		this.blnPermiteEliminarAlumnoCompleto = blnPermiteEliminarAlumnoCompleto;
	}
	public Long getIdCuestionarioPersona() {
		return idCuestionarioPersona;
	}
	public void setIdCuestionarioPersona(Long idCuestionarioPersona) {
		this.idCuestionarioPersona = idCuestionarioPersona;
	}
	public Integer getBlnPermiteEntrevistaInicial() {
		return blnPermiteEntrevistaInicial;
	}
	public void setBlnPermiteEntrevistaInicial(Integer blnPermiteEntrevistaInicial) {
		this.blnPermiteEntrevistaInicial = blnPermiteEntrevistaInicial;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public Long getIdPersonaDomicilio() {
		return idPersonaDomicilio;
	}
	public void setIdPersonaDomicilio(Long idPersonaDomicilio) {
		this.idPersonaDomicilio = idPersonaDomicilio;
	}
	public Long getIdPersonaTelefono() {
		return idPersonaTelefono;
	}
	public void setIdPersonaTelefono(Long idPersonaTelefono) {
		this.idPersonaTelefono = idPersonaTelefono;
	}
	public Long getIdPersonaCorreo() {
		return idPersonaCorreo;
	}
	public void setIdPersonaCorreo(Long idPersonaCorreo) {
		this.idPersonaCorreo = idPersonaCorreo;
	}
	public String getNbPlanEstudio() {
		return nbPlanEstudio;
	}
	public void setNbPlanEstudio(String nbPlanEstudio) {
		this.nbPlanEstudio = nbPlanEstudio;
	}
		
}
