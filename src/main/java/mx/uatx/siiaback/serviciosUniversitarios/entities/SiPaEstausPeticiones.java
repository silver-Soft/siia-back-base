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
public class SiPaEstausPeticiones implements Serializable {

	/**
	 * lstResultado
	 */
	private static final long serialVersionUID = 3975976459528612684L;
	
	@Id
	@Column(name = "IDSTPETICION")
	private Integer intStPeticiones;
	
	@Column(name = "DSSTPETICION")
	private String strDsPeticion;
	
	@Column(name = "DSCOLOR")
	private String strDsColor;
	
	

	public Integer getIntStPeticiones() {
		return intStPeticiones;
	}

	public void setIntStPeticiones(Integer intStPeticiones) {
		this.intStPeticiones = intStPeticiones;
	}

	public String getStrDsPeticion() {
		return strDsPeticion;
	}

	public void setStrDsPeticion(String strDsPeticion) {
		this.strDsPeticion = strDsPeticion;
	}

	public String getStrDsColor() {
		return strDsColor;
	}

	public void setStrDsColor(String strDsColor) {
		this.strDsColor = strDsColor;
	}

}
