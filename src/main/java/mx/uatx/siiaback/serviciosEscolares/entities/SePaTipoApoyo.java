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
public class SePaTipoApoyo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7678653396866966009L;

	@Id
	@Column(name = "ID")
	private String intIdTipoApoyo;

	@Column(name = "DESCRIPCION")
	private String strdescripcion;
	


	

	public String getIntIdTipoApoyo() {
		return intIdTipoApoyo;
	}

	public void setIntIdTipoApoyo(String intIdTipoApoyo) {
		this.intIdTipoApoyo = intIdTipoApoyo;
	}

	public String getStrdescripcion() {
		return strdescripcion;
	}

	public void setStrdescripcion(String strdescripcion) {
		this.strdescripcion = strdescripcion;
	}

}
