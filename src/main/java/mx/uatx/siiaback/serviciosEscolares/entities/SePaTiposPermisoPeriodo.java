package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTiposPermisoPeriodo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1046405754951810077L;
	
	@Id
	@Column(name = "TIPOPERMISO")
	private String strTipoPermiso;

	public SePaTiposPermisoPeriodo() {
		super();
	}

	public String getStrTipoPermiso() {
		return strTipoPermiso;
	}

	public void setStrTipoPermiso(String strTipoPermiso) {
		this.strTipoPermiso = strTipoPermiso;
	}

}
