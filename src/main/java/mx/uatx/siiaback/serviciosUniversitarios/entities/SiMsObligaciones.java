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


@Entity
@Table(schema = "SIIUAT", name = "SIMSOBLIGACIONES")
public class SiMsObligaciones {
	
	
	@Id
    @Basic(optional = false)
    @SequenceGenerator(name = "GEN_IDOBLIGACION", sequenceName = "SIIUAT.IDOBLIGACION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_IDOBLIGACION")
    @Column(name = "IDOBLIGACION")
	private Integer idObligacion;
	
	@Column(name = "IDPERSONA")
	private Integer idPersona;
	
	@Column(name = "IDPERIODO")
	private String strPeriodo;
	
	@Column(name = "TIPOOBLIGACION")
	private String strTipoObligacion;
	
	@Column(name = "FCACEPTADO")
	private Date fcAceptado;
	
	@Column(name = "CLESTATUS")
	private Integer clEstatus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrTipoObligacion() {
		return strTipoObligacion;
	}

	public void setStrTipoObligacion(String strTipoObligacion) {
		this.strTipoObligacion = strTipoObligacion;
	}

	public Date getFcAceptado() {
		return fcAceptado;
	}

	public void setFcAceptado(Date fcAceptado) {
		this.fcAceptado = fcAceptado;
	}

	public Integer getClEstatus() {
		return clEstatus;
	}

	public void setClEstatus(Integer clEstatus) {
		this.clEstatus = clEstatus;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
	
	
	

}
