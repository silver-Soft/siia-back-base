/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaParametrosDGP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String intId;

	@Column(name = "ENDPOINT")
	private String strEndPoint;

	@Column(name = "SERVER")
	private String strServer;

	@Column(name = "USUARIO")
	private String strusuario;

	@Column(name = "CONTRASENIA")
	private String strContrasenia;
	
	

	public SePaParametrosDGP() {
		super();
	}



	public String getIntId() {
		return intId;
	}



	public void setIntId(String intId) {
		this.intId = intId;
	}



	public String getStrEndPoint() {
		return strEndPoint;
	}



	public void setStrEndPoint(String strEndPoint) {
		this.strEndPoint = strEndPoint;
	}



	public String getStrServer() {
		return strServer;
	}



	public void setStrServer(String strServer) {
		this.strServer = strServer;
	}



	public String getStrusuario() {
		return strusuario;
	}



	public void setStrusuario(String strusuario) {
		this.strusuario = strusuario;
	}



	public String getStrContrasenia() {
		return strContrasenia;
	}



	public void setStrContrasenia(String strContrasenia) {
		this.strContrasenia = strContrasenia;
	}
	
	
	

	
	
	

}
