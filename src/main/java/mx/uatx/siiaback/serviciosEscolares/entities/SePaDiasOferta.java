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
public class SePaDiasOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2511495563880153277L;
	
	@Id
	@Column(name = "CLDIA")
	private Integer intClDia;

	@Column(name = "DSDIA")
	private String strDia;
	
	

	public Integer getIntClDia() {
		return intClDia;
	}

	public void setIntClDia(Integer intClDia) {
		this.intClDia = intClDia;
	}

	public String getStrDia() {
		return strDia;
	}

	public void setStrDia(String strDia) {
		this.strDia = strDia;
	}
	
	



}
