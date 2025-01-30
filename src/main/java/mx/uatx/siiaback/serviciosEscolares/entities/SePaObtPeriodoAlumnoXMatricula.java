package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodoAlumnoXMatricula {
	
	@Id
	@Column(name = "IDALUMNOPERIODO")
	private Long idAlumnoPeriodo;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodoTemporada;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	public Long getIdAlumnoPeriodo() {
		return idAlumnoPeriodo;
	}
	public void setIdAlumnoPeriodo(Long idAlumnoPeriodo) {
		this.idAlumnoPeriodo = idAlumnoPeriodo;
	}
	public String getDsPeriodoTemporada() {
		return dsPeriodoTemporada;
	}
	public void setDsPeriodoTemporada(String dsPeriodoTemporada) {
		this.dsPeriodoTemporada = dsPeriodoTemporada;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	

}
