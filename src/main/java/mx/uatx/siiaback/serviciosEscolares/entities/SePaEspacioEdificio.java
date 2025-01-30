/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaEspacioEdificio implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2511495563880153277L;

	@Id
	@Column(name = "IDESPACIO")
	private Integer intIdEspcio;

	@Column(name = "NBESPACIO")
	private String strNombreEspacio;
	
	

	public SePaEspacioEdificio() {
		super();
	}



	public Integer getIntIdEspcio() {
		return intIdEspcio;
	}



	public void setIntIdEspcio(Integer intIdEspcio) {
		this.intIdEspcio = intIdEspcio;
	}



	public String getStrNombreEspacio() {
		return strNombreEspacio;
	}



	public void setStrNombreEspacio(String strNombreEspacio) {
		this.strNombreEspacio = strNombreEspacio;
	}
	
	

	
	
	
}
