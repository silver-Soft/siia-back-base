package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEAXPRORROGASINSCRIPCIONES")
public class SeAxProrrogasInscripciones implements Serializable {
	
	@Id
    @Basic(optional = false)
    @SequenceGenerator(name = "GENIDPRORROGAINS", sequenceName = "SERESC.IDPRORROGAINS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDPRORROGAINS")
	@Column(name = "IDPRORROGAINS")
	private Long idProrrogaIns;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFIN")
	private Date fcFin;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	public SeAxProrrogasInscripciones() {
		
	}

	public Long getIdProrrogaIns() {
		return idProrrogaIns;
	}

	public void setIdProrrogaIns(Long idProrrogaIns) {
		this.idProrrogaIns = idProrrogaIns;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
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

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	
	
	

}
