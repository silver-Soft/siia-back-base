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
public class SePaEstatusCredencial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDSTCREDENCIAL")
	private Integer intIdIitulo;


	@Column(name = "DSSTCREDENCIAL")
	private String strEstatus;
	


	public SePaEstatusCredencial() {
		super();
	}


	public Integer getIntIdIitulo() {
		return intIdIitulo;
	}


	public void setIntIdIitulo(Integer intIdIitulo) {
		this.intIdIitulo = intIdIitulo;
	}


	public String getStrEstatus() {
		return strEstatus;
	}


	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

}
