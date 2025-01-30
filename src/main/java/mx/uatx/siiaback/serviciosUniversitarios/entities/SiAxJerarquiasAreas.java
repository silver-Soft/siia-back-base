package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIAXJERARQUIASAREAS")
public class SiAxJerarquiasAreas {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDJERARQUIAAREA", sequenceName = "SIIUAT.IDJERARQUIAAREA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDJERARQUIAAREA")
	@NotNull
	@Column(name = "IDJERARQUIAAREA")
	private Long idJerarquiaArea;
	
	@Column(name = "CLESTATUS")
	private Integer clEstatus;
	
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "IDAREACAMPUSPADRE")
	private Long idAreaCampusPadre;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	public Long getIdJerarquiaArea() {
		return idJerarquiaArea;
	}
	public void setIdJerarquiaArea(Long idJerarquiaArea) {
		this.idJerarquiaArea = idJerarquiaArea;
	}
	public Integer getClEstatus() {
		return clEstatus;
	}
	public void setClEstatus(Integer clEstatus) {
		this.clEstatus = clEstatus;
	}
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	public Long getIdAreaCampusPadre() {
		return idAreaCampusPadre;
	}
	public void setIdAreaCampusPadre(Long idAreaCampusPadre) {
		this.idAreaCampusPadre = idAreaCampusPadre;
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
