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
public class SiPaDiasSemanas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2359582196047268537L;
	
	@Id
	@Column(name = "DIA")
	private String strDia;

	public String getStrDia() {
		return strDia;
	}

	public void setStrDia(String strDia) {
		this.strDia = strDia;
	}

}
