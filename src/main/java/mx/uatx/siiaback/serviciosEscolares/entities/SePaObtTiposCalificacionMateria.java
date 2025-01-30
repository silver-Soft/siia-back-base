package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiposCalificacionMateria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4829331113068974257L;

	@Id
	@Column(name="IDTIPOCALIFICACION")
	private Integer intIdTipoCalificacion;
	
	@Column(name="DSTIPOCALIFICACION")
	private String strDsTipoCalificacion;

	public Integer getIntIdTipoCalificacion() {
		return intIdTipoCalificacion;
	}

	public void setIntIdTipoCalificacion(Integer intIdTipoCalificacion) {
		this.intIdTipoCalificacion = intIdTipoCalificacion;
	}

	public String getStrDsTipoCalificacion() {
		return strDsTipoCalificacion;
	}

	public void setStrDsTipoCalificacion(String strDsTipoCalificacion) {
		this.strDsTipoCalificacion = strDsTipoCalificacion;
	}	
	
}
