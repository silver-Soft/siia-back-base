package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtenerMenuRol {

	@Id
	@Column(name = "IDMENU")
	private Integer intIdMenu;

	@Column(name = "NBMENU")
	private String strNbMenu;

	@Column(name = "IDMENUROL")
	private Integer intIdMenuRol;

	public SiPaObtenerMenuRol() {
		super();
	}

	public Integer getIntIdMenu() {
		return intIdMenu;
	}

	public void setIntIdMenu(Integer intIdMenu) {
		this.intIdMenu = intIdMenu;
	}

	public String getStrNbMenu() {
		return strNbMenu;
	}

	public void setStrNbMenu(String strNbMenu) {
		this.strNbMenu = strNbMenu;
	}

	public Integer getIntIdMenuRol() {
		return intIdMenuRol;
	}

	public void setIntIdMenuRol(Integer intIdMenuRol) {
		this.intIdMenuRol = intIdMenuRol;
	}

}
