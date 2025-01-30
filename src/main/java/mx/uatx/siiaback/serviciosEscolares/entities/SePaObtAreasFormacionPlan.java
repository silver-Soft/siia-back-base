package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAreasFormacionPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3067267389539519371L;
	@Id	
	@Column(name="IDPLANAREAFORMACION")
	private Integer intIdPlanAreaFormacion;
	
	@Column(name="IDAREAFORMACION")
	private Integer intIdAreaFormacion;
	
	@Column(name="DSAREAFORMACION")
	private String strDsAreaFormacion;
	
	@Column(name="MODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="ELIMINAR")
	private boolean blnPermiteEliminar;

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

	public Integer getIntIdPlanAreaFormacion() {
		return intIdPlanAreaFormacion;
	}

	public void setIntIdPlanAreaFormacion(Integer intIdPlanAreaFormacion) {
		this.intIdPlanAreaFormacion = intIdPlanAreaFormacion;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	
}
