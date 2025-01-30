package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasCursadas {
	
	@Id
	@Column(name = "IDALUMNOACTA")
	private Long idAlumnoActa;
	
	@Column(name = "IDPLANMATERIA")
	private Long idPlanMateria;

	@Column(name = "DSMATERIA")
	private String dsMateria;

	@Column(name = "CLCALIFICACIONFINAL")
	private Integer clCalificacionFinal;

	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodo;

	public Long getIdAlumnoActa() {
		return idAlumnoActa;
	}

	public void setIdAlumnoActa(Long idAlumnoActa) {
		this.idAlumnoActa = idAlumnoActa;
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

	public Integer getClCalificacionFinal() {
		return clCalificacionFinal;
	}

	public void setClCalificacionFinal(Integer clCalificacionFinal) {
		this.clCalificacionFinal = clCalificacionFinal;
	}

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}

}
