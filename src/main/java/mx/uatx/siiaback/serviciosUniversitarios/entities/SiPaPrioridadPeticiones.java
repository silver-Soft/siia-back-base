/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaPrioridadPeticiones{

	@Id
	@Column(name = "IDPRIORIDAD")
	private Integer intIdPrioridad;

	@Column(name = "DSPRIORIDAD")
	private String strDsPrioridad;
	
	
	public Integer getIntIdPrioridad() {
		return intIdPrioridad;
	}

	public void setIntIdPrioridad(Integer intIdPrioridad) {
		this.intIdPrioridad = intIdPrioridad;
	}

	public String getStrDsPrioridad() {
		return strDsPrioridad;
	}

	public void setStrDsPrioridad(String strDsPrioridad) {
		this.strDsPrioridad = strDsPrioridad;
	}
	
}
