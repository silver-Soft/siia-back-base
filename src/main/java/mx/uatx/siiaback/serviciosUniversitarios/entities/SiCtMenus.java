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
@Table(schema = "SIIUAT", name = "SICTMENUS")
public class SiCtMenus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3554598150116003009L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDMENU", sequenceName = "SIIUAT.IDMENU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDMENU")
	@NotNull
	
	@Column(name = "IDMENU")
	private Integer intIdMenu;
	
	@Column(name = "IDMENUPADRE")
	private Integer intIdMenuPadre;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "NBMENU")
	private String strNbMenu;
	
	@Column(name = "DSMENU")
	private String strDsMenu;
	
	@Column(name = "PATH")
	private String strPath;
	
	@Column(name = "ORDEN")
	private Integer intOrden;
	
	@Column(name = "IDSISTEMA")
	private Long lngIdSistema;
	
	@Column(name = "IDFUNCION")
	private Long lngIdFuncion;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdMenu() {
		return intIdMenu;
	}

	public void setIntIdMenu(Integer intIdMenu) {
		this.intIdMenu = intIdMenu;
	}

	public Integer getIntIdMenuPadre() {
		return intIdMenuPadre;
	}

	public void setIntIdMenuPadre(Integer intIdMenuPadre) {
		this.intIdMenuPadre = intIdMenuPadre;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public String getStrNbMenu() {
		return strNbMenu;
	}

	public void setStrNbMenu(String strNbMenu) {
		this.strNbMenu = strNbMenu;
	}

	public String getStrDsMenu() {
		return strDsMenu;
	}

	public void setStrDsMenu(String strDsMenu) {
		this.strDsMenu = strDsMenu;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}	

	public Long getLngIdSistema() {
		return lngIdSistema;
	}

	public void setLngIdSistema(Long lngIdSistema) {
		this.lngIdSistema = lngIdSistema;
	}

	public Long getLngIdFuncion() {
		return lngIdFuncion;
	}

	public void setLngIdFuncion(Long lngIdFuncion) {
		this.lngIdFuncion = lngIdFuncion;
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
