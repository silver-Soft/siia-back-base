package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtMateriasConstFormatoUnico implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2085836098709137077L;

	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;
	
	@Column(name = "MATERIA_REAL")
	private String strMateriaReal;

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrMateriaReal() {
		return strMateriaReal;
	}

	public void setStrMateriaReal(String strMateriaReal) {
		this.strMateriaReal = strMateriaReal;
	}
	
	

}
