package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtExencionesAdmin {
	
	@Id
    @Column(name = "IDEXENCION")
	private Long idExencion;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;

	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodo;

	@Column(name = "DSTIPOEXENCION")
	private String dsTipoExcencion;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "PERMITEMODIFICAR")
	private Integer permiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Integer permiteEliminar;
	
	@Column(name = "DSGENERO")
	private String genero;
	
	@Column(name = "PROGRAMA")
	private String programaEducativo;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	
	public Long getIdExencion() {
		return idExencion;
	}
	public void setIdExencion(Long idExencion) {
		this.idExencion = idExencion;
	}
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
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getDsPeriodo() {
		return dsPeriodo;
	}
	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}
	public String getDsTipoExcencion() {
		return dsTipoExcencion;
	}
	public void setDsTipoExcencion(String dsTipoExcencion) {
		this.dsTipoExcencion = dsTipoExcencion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Integer getPermiteModificar() {
		return permiteModificar;
	}
	public void setPermiteModificar(Integer permiteModificar) {
		this.permiteModificar = permiteModificar;
	}
	public Integer getPermiteEliminar() {
		return permiteEliminar;
	}
	public void setPermiteEliminar(Integer permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getProgramaEducativo() {
		return programaEducativo;
	}
	public void setProgramaEducativo(String programaEducativo) {
		this.programaEducativo = programaEducativo;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
}
