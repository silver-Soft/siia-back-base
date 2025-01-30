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
@Table(schema = "SERESC", name = "SEMSBAJAS")
public class SeMsBajas implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDBAJA", sequenceName = "SERESC.IDBAJA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDBAJA")	
	@Column(name = "IDBAJA")
	private Long lngIdBaja;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;
	
	@Column(name = "CLMOTIVOBAJA")
	private Integer intClMotivoBaja;
	
	@Column(name = "CLESTATUSBAJA")
	private String strClEstatusBaja;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "IDPAGO")
	private String strIdPago;
	
	@Column(name = "CLTIPOBAJA")
	private String strClTipoBaja;
	
	@Column(name = "FCSOLICITUD")
	private Date dtFcSolicitud;
	
	@Column(name = "FCAUTORIZACION")
	private Date dtFcAutorizacion;
	
	@Column(name = "FCBAJA")
	private Date dtFcBaja;
	
	@Column(name = "DSOBSERVACIONES")
	private String strDsObservaciones;
	
	@Column(name = "FCAUDIT")
	private Date dtFcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "CLSTINACTIVACARGA")
	private Integer intClStInactivaCarga;

	public Long getLngIdBaja() {
		return lngIdBaja;
	}

	public void setLngIdBaja(Long lngIdBaja) {
		this.lngIdBaja = lngIdBaja;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Integer getIntClMotivoBaja() {
		return intClMotivoBaja;
	}

	public void setIntClMotivoBaja(Integer intClMotivoBaja) {
		this.intClMotivoBaja = intClMotivoBaja;
	}

	public String getStrClEstatusBaja() {
		return strClEstatusBaja;
	}

	public void setStrClEstatusBaja(String strClEstatusBaja) {
		this.strClEstatusBaja = strClEstatusBaja;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrIdPago() {
		return strIdPago;
	}

	public void setStrIdPago(String strIdPago) {
		this.strIdPago = strIdPago;
	}

	public String getStrClTipoBaja() {
		return strClTipoBaja;
	}

	public void setStrClTipoBaja(String strClTipoBaja) {
		this.strClTipoBaja = strClTipoBaja;
	}

	public Date getDtFcSolicitud() {
		return dtFcSolicitud;
	}

	public void setDtFcSolicitud(Date dtFcSolicitud) {
		this.dtFcSolicitud = dtFcSolicitud;
	}

	public Date getDtFcAutorizacion() {
		return dtFcAutorizacion;
	}

	public void setDtFcAutorizacion(Date dtFcAutorizacion) {
		this.dtFcAutorizacion = dtFcAutorizacion;
	}

	public Date getDtFcBaja() {
		return dtFcBaja;
	}

	public void setDtFcBaja(Date dtFcBaja) {
		this.dtFcBaja = dtFcBaja;
	}

	public String getStrDsObservaciones() {
		return strDsObservaciones;
	}

	public void setStrDsObservaciones(String strDsObservaciones) {
		this.strDsObservaciones = strDsObservaciones;
	}

	public Date getDtFcAudit() {
		return dtFcAudit;
	}

	public void setDtFcAudit(Date dtFcAudit) {
		this.dtFcAudit = dtFcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntClStInactivaCarga() {
		return intClStInactivaCarga;
	}

	public void setIntClStInactivaCarga(Integer intClStInactivaCarga) {
		this.intClStInactivaCarga = intClStInactivaCarga;
	}
	
	
}
