package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodosGenerales implements Serializable {
	
	@Id
    @Column(name = "IDPERIODO") 
	private String idPeriodo;
	
	@Column(name = "IDPERIODOHIJO") 
	private String idPeriodoHijo;
	
	@Column(name = "DESCRIPCIONPERIODO")
    private String descripcionPeriodo;
	
	@Column(name = "ESTATUS")
    private String estatus;
	
	@Column(name = "FCINICIO")
    private Date fcInicio;
	
	@Column(name = "FCFIN")
    private Date fcFin;
	
	@Column(name = "DESCRIPCIONTIPOPERIODO")
    private String descripcionTipoPeriodo;
	
	@Column(name = "USUARIOAUDIT")
    private String usuarioAudit;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getDescripcionPeriodo() {
		return descripcionPeriodo;
	}

	public void setDescripcionPeriodo(String descripcionPeriodo) {
		this.descripcionPeriodo = descripcionPeriodo;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
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

	public String getDescripcionTipoPeriodo() {
		return descripcionTipoPeriodo;
	}

	public void setDescripcionTipoPeriodo(String descripcionTipoPeriodo) {
		this.descripcionTipoPeriodo = descripcionTipoPeriodo;
	}

	public String getUsuarioAudit() {
		return usuarioAudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}
	
	public SePaPeriodosGenerales() {
		super();
	}

	public String getIdPeriodoHijo() {
		return idPeriodoHijo;
	}

	public void setIdPeriodoHijo(String idPeriodoHijo) {
		this.idPeriodoHijo = idPeriodoHijo;
	}

}
