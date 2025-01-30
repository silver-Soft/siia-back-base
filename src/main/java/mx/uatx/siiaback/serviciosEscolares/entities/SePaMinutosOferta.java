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
public class SePaMinutosOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2511495563880153277L;

	@Id
	@Column(name = "ID")
	private Integer intIdMinutosOferta;

	@Column(name = "DESCRIPCION")
	private String strDsminutoOferta;

	public Integer getIntIdMinutosOferta() {
		return intIdMinutosOferta;
	}

	public void setIntIdMinutosOferta(Integer intIdMinutosOferta) {
		this.intIdMinutosOferta = intIdMinutosOferta;
	}

	public String getStrDsminutoOferta() {
		return strDsminutoOferta;
	}

	public void setStrDsminutoOferta(String strDsminutoOferta) {
		this.strDsminutoOferta = strDsminutoOferta;
	}
	
	
	

}
