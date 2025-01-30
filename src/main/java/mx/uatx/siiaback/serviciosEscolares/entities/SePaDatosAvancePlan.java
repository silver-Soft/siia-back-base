package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosAvancePlan {
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "GRADO")
	private Integer nmGrado;

	@Column(name = "IDPLANMATERIA")
	private Long idPlanMateria;

	@Column(name = "MATERIA")
	private String dsMateria;

	@Column(name = "CALIFICACION")
	private String nmCalificacion;

	@Column(name = "GRUPO")
	private Long idGrupo;

	@Column(name = "ACTA")
	private Long idActa;

	@Column(name = "ESTATUS")
	private String dsEstatus;

	@Column(name = "FCACTA")
	private Date fcActa;

	@Column(name = "TIPO")
	private String dsTipo;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "IDMATERIAREAL")
	private Long idMateriaReal;
	
	@Column(name = "PERMITEREVALIDAR")
	private Integer permiteRevalidar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNmGrado() {
		return nmGrado;
	}

	public void setNmGrado(Integer nmGrado) {
		this.nmGrado = nmGrado;
	}

	public Long getIdPlanMateria() {
		return idPlanMateria;
	}

	public void setIdPlanMateria(Long idPlanMateria) {
		this.idPlanMateria = idPlanMateria;
	}

	public String getDsMateria() {
		return dsMateria;
	}

	public void setDsMateria(String dsMateria) {
		this.dsMateria = dsMateria;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Long getIdActa() {
		return idActa;
	}

	public void setIdActa(Long idActa) {
		this.idActa = idActa;
	}

	public String getDsEstatus() {
		return dsEstatus;
	}

	public void setDsEstatus(String dsEstatus) {
		this.dsEstatus = dsEstatus;
	}

	public Date getFcActa() {
		return fcActa;
	}

	public void setFcActa(Date fcActa) {
		this.fcActa = fcActa;
	}

	public String getDsTipo() {
		return dsTipo;
	}

	public void setDsTipo(String dsTipo) {
		this.dsTipo = dsTipo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getIdMateriaReal() {
		return idMateriaReal;
	}

	public void setIdMateriaReal(Long idMateriaReal) {
		this.idMateriaReal = idMateriaReal;
	}

	public Integer getPermiteRevalidar() {
		return permiteRevalidar;
	}

	public void setPermiteRevalidar(Integer permiteRevalidar) {
		this.permiteRevalidar = permiteRevalidar;
	}

	public String getNmCalificacion() {
		return nmCalificacion;
	}

	public void setNmCalificacion(String nmCalificacion) {
		this.nmCalificacion = nmCalificacion;
	}
	
}
