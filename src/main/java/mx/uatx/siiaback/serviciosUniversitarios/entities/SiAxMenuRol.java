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
@Table(schema = "SIIUAT", name = "SIAXMENUSROLES")
public class SiAxMenuRol {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDMENUROL", sequenceName = "SIIUAT.IDMENUROL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDMENUROL")
	@NotNull
	@Column(name = "IDMENUROL")
	private Integer intIdMenuROL;
	
	@Column(name = "IDMENU")
	private Integer intIdMenu;
	
	@Column(name = "IDROL")
	private Integer intIdRol;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	
	

	public SiAxMenuRol() {
		super();
	}

	public Integer getIntIdMenuROL() {
		return intIdMenuROL;
	}

	public void setIntIdMenuROL(Integer intIdMenuROL) {
		this.intIdMenuROL = intIdMenuROL;
	}

	public Integer getIntIdMenu() {
		return intIdMenu;
	}

	public void setIntIdMenu(Integer intIdMenu) {
		this.intIdMenu = intIdMenu;
	}

	public Integer getIntIdRol() {
		return intIdRol;
	}

	public void setIntIdRol(Integer intIdRol) {
		this.intIdRol = intIdRol;
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
