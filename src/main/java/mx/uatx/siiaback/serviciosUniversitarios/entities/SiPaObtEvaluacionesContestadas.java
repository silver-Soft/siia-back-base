package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtEvaluacionesContestadas {
	
	@Id
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;
	
	@Column(name = "FCCONTESTADO")
	private Date fcContestado;
	
	@Column(name = "AREA")
	private String area;
	
	@Column(name = "PERMITECONSULTAR")
	private Boolean permiteConsultar;
	
	public String getDsCuestionario() {
		return dsCuestionario;
	}
	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}
	public Date getFcContestado() {
		return fcContestado;
	}
	public void setFcContestado(Date fcContestado) {
		this.fcContestado = fcContestado;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Boolean getPermiteConsultar() {
		return permiteConsultar;
	}
	public void setPermiteConsultar(Boolean permiteConsultar) {
		this.permiteConsultar = permiteConsultar;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

}
