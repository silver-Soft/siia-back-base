package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEAXPERIODOSPROGRAMASCAMPUS")
public class SeAxPeriodoProgramaCampus {
	
	@Id
	@Column(name = "IDPERIODOPROGRAMACAMPUS")
	@SequenceGenerator(name = "generadorIdentificadorProgCam", sequenceName = "SERESC.IDPERIODOPROGRAMACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorProgCam")
	private Long idPeriodoProgramaCampus;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	public SeAxPeriodoProgramaCampus() {
		
	}
	
	public Long getIdPeriodoProgramaCampus() {
		return idPeriodoProgramaCampus;
	}
	public void setIdPeriodoProgramaCampus(Long idPeriodoProgramaCampus) {
		this.idPeriodoProgramaCampus = idPeriodoProgramaCampus;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}
	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}
	public Date getFcAudit() {
		return fcAudit;
	}
	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}
	public String getUsuarioAudit() {
		return usuarioAudit;
	}
	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	
	

}
