package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaPermisos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8709111751478999435L;
	
	@Id
	@Column(name = "NBMENU")
	private String strPermiso;

	public String getStrPermiso() {
		return strPermiso;
	}

	public void setStrPermiso(String strPermiso) {
		this.strPermiso = strPermiso;
	}

}
