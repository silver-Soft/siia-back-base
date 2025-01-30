/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaTipoPago implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7904157919943725970L;

	@Id
	@Column(name = "MEMBRESIA")
	private String strTipoPago;

	public String getStrTipoPago() {
		return strTipoPago;
	}

	public void setStrTipoPago(String strTipoPago) {
		this.strTipoPago = strTipoPago;
	}

}
