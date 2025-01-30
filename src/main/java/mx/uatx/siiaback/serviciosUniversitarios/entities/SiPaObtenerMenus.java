package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtenerMenus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9005721163684428444L;
	@Id
	@Column(name = "IDMENU")
	private Integer intIdMenu;
	
	@Column(name = "IDMENUPADRE")
	private Integer intIdMenuPadre;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "NBMENU")
	private String strNbMenu;
	
	@Column(name = "NBMENUPADRE")
	private String strNbMenuPadre;
	
	@Column(name = "DSMENU")
	private String strDsMenu;
	
	@Column(name = "PATH")
	private String strPath;	
	
	@Column(name = "ORDEN")
	private Integer intOrden;	
	
	public SiPaObtenerMenus() {
		super();
	}

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

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}

	public String getStrNbMenuPadre() {
		return strNbMenuPadre;
	}

	public void setStrNbMenuPadre(String strNbMenuPadre) {
		this.strNbMenuPadre = strNbMenuPadre;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}	
	
}
