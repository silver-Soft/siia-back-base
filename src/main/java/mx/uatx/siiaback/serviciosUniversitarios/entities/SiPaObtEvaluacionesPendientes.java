package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtEvaluacionesPendientes {
	
	@Id
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long idCuestionarioPersona;
	
	@Column(name = "IDCUESTIONARIO")
	private Integer idCuestionario;

	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodoTemporada;

	@Column(name = "PERMITECONTESTAR")
	private Boolean permiteContestar;
	
	public Integer getIdCuestionario() {
		return idCuestionario;
	}
	public void setIdCuestionario(Integer idCuestionario) {
		this.idCuestionario = idCuestionario;
	}
	public String getDsCuestionario() {
		return dsCuestionario;
	}
	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}
	public Long getIdCuestionarioPersona() {
		return idCuestionarioPersona;
	}
	public void setIdCuestionarioPersona(Long idCuestionarioPersona) {
		this.idCuestionarioPersona = idCuestionarioPersona;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getDsPeriodoTemporada() {
		return dsPeriodoTemporada;
	}
	public void setDsPeriodoTemporada(String dsPeriodoTemporada) {
		this.dsPeriodoTemporada = dsPeriodoTemporada;
	}
	public Boolean getPermiteContestar() {
		return permiteContestar;
	}
	public void setPermiteContestar(Boolean permiteContestar) {
		this.permiteContestar = permiteContestar;
	}

}
