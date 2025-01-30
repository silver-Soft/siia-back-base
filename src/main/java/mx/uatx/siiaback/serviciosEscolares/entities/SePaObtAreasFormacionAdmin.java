package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAreasFormacionAdmin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7580155380558962773L;
	
	@Id
	@Column(name = "IDAREAFORMACION")
	private Integer intIdAreaFormacion;
	
	@Column(name = "DSAREAFORMACION")
	private String strDsAreaFormacion;
	
	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Integer getIntIdAreaFormacion() {
		return intIdAreaFormacion;
	}

	public void setIntIdAreaFormacion(Integer intIdAreaFormacion) {
		this.intIdAreaFormacion = intIdAreaFormacion;
	}

	public String getStrDsAreaFormacion() {
		return strDsAreaFormacion;
	}

	public void setStrDsAreaFormacion(String strDsAreaFormacion) {
		this.strDsAreaFormacion = strDsAreaFormacion;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
}
