package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtTiposMateriaPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8370279266271051110L;
	@Id
	@Column(name="CLTIPOMATERIA")
	private String strClTipoMateria;
	
	@Column(name="DSTIPOMATERIA")
	private String strDsTipoMateria;

	public String getStrClTipoMateria() {
		return strClTipoMateria;
	}

	public void setStrClTipoMateria(String strClTipoMateria) {
		this.strClTipoMateria = strClTipoMateria;
	}

	public String getStrDsTipoMateria() {
		return strDsTipoMateria;
	}

	public void setStrDsTipoMateria(String strDsTipoMateria) {
		this.strDsTipoMateria = strDsTipoMateria;
	}
	
	
}
