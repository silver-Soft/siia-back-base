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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXCIERRESPERIODOSTUTORIAS")
public class SeAxCierresPeriodosTutorias implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -229310951816448996L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDCIERREPERIODOSTUTORIAS")
	@SequenceGenerator(name = "GENID_IDCIERREPERIODOSTUTORIAS", sequenceName = "SERESC.IDCIERREPERIODOSTUTORIAS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_IDCIERREPERIODOSTUTORIAS")
	private Long lngIdResponsableSerSoc;

	@Column(name = "IDPERIODO")
	private String intIdPeriodo;

	@Column(name = "FCCIERRE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcCierre;

	@Column(name = "CLESTATUS")
	private Integer intIdEstatus;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;
	
	

	public Long getLngIdResponsableSerSoc() {
		return lngIdResponsableSerSoc;
	}

	public void setLngIdResponsableSerSoc(Long lngIdResponsableSerSoc) {
		this.lngIdResponsableSerSoc = lngIdResponsableSerSoc;
	}

	

	public String getIntIdPeriodo() {
		return intIdPeriodo;
	}

	public void setIntIdPeriodo(String intIdPeriodo) {
		this.intIdPeriodo = intIdPeriodo;
	}

	public Date getFcCierre() {
		return fcCierre;
	}

	public void setFcCierre(Date fcCierre) {
		this.fcCierre = fcCierre;
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}
	
	
	
	
	
	

	
}
