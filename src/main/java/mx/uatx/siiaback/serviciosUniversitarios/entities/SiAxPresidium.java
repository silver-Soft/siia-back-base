package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
import javax.validation.constraints.NotNull;
@Entity
@Table(schema = "SIIUAT", name="SIAXPRESIDIUM")
public class SiAxPresidium implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7756423390017884633L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPRESIDIUM", sequenceName = "SIIUAT.IDPRESIDIUM", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPRESIDIUM")
    @NotNull
    
    @Column(name = "IDPRESIDIUM")
	private Integer intIdPresidium;

	@Column(name = "IDEVENTORECTOR")
	private Integer intIdEventoRector;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "CARGO")
	private String strCargo;
	
	@Column(name = "ORDEN")
	private Integer intOrden;
	
	@Column(name = "STATUS")
	private Integer intEstatus;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	public Integer getIntIdPresidium() {
		return intIdPresidium;
	}

	public void setIntIdPresidium(Integer intIdPresidium) {
		this.intIdPresidium = intIdPresidium;
	}

	public Integer getIntIdEventoRector() {
		return intIdEventoRector;
	}

	public void setIntIdEventoRector(Integer intIdEventoRector) {
		this.intIdEventoRector = intIdEventoRector;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public Integer getIntEstatus() {
		return intEstatus;
	}

	public void setIntEstatus(Integer intEstatus) {
		this.intEstatus = intEstatus;
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

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}
	
	
}
