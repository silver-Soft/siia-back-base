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
public class SiPaTipoTrabajo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4946769607732737371L;

	@Id
	@Column(name = "IDTIPOTRABAJO")
	private Integer intIdTipoTrabajo;

	@Column(name = "DSTIPOTRABAJO")
	private String strDsTipoTrabajo;

	public Integer getIntIdTipoTrabajo() {
		return intIdTipoTrabajo;
	}

	public void setIntIdTipoTrabajo(Integer intIdTipoTrabajo) {
		this.intIdTipoTrabajo = intIdTipoTrabajo;
	}

	public String getStrDsTipoTrabajo() {
		return strDsTipoTrabajo;
	}

	public void setStrDsTipoTrabajo(String strDsTipoTrabajo) {
		this.strDsTipoTrabajo = strDsTipoTrabajo;
	}

}
