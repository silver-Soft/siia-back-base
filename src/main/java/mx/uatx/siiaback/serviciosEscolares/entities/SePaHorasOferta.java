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
public class SePaHorasOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2511495563880153277L;

	@Id
	@Column(name = "ID")
	private Integer intIdHoraOferta;

	@Column(name = "DESCRIPCION")
	private String strDsHoraOferta;

	public Integer getIntIdHoraOferta() {
		return intIdHoraOferta;
	}

	public void setIntIdHoraOferta(Integer intIdHoraOferta) {
		this.intIdHoraOferta = intIdHoraOferta;
	}

	public String getStrDsHoraOferta() {
		return strDsHoraOferta;
	}

	public void setStrDsHoraOferta(String strDsHoraOferta) {
		this.strDsHoraOferta = strDsHoraOferta;
	}
	
	
	


}
