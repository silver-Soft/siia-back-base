package mx.uatx.siiaback.serviciosEscolares.entities;

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
@Table(schema = "SERESC", name = "SEAXPRORROGASEXADMI")
public class SeAxProrrogasExaAdmi {
	
	@Id
    @Basic(optional = false)
    @SequenceGenerator(name = "GENIDPRORROGAEXADMI", sequenceName = "SERESC.IDPRORROGAEXADMI", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDPRORROGAEXADMI")
	@Column(name = "IDPRORROGAEXADMI")
	private Long idProrrogaExAdmi;
	
	@Column(name = "IDSOLICITUDINGRESO")
	private Long idSolicitudIngreso;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFIN")
	private Date fcFin;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	@Column(name = "TIPOPRORROGA")
	private String tipoProrroga;

	public Long getIdProrrogaExAdmi() {
		return idProrrogaExAdmi;
	}

	public void setIdProrrogaExAdmi(Long idProrrogaExAdmi) {
		this.idProrrogaExAdmi = idProrrogaExAdmi;
	}

	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}

	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
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

	public String getTipoProrroga() {
		return tipoProrroga;
	}

	public void setTipoProrroga(String tipoProrroga) {
		this.tipoProrroga = tipoProrroga;
	}
	
	
	
}
