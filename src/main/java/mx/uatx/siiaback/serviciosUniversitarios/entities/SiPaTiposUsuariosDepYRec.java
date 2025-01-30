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
public class SiPaTiposUsuariosDepYRec implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3796759690311956801L;
	
	@Id
	@Column(name = "TIPOUSUARIO")
	private String strTipoUsuario;

	public String getStrTipoUsuario() {
		return strTipoUsuario;
	}

	public void setStrTipoUsuario(String strTipoUsuario) {
		this.strTipoUsuario = strTipoUsuario;
	}

}
