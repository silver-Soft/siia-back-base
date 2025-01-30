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
public class SePaEdificioProgramaCampus implements Serializable {

	@Id
	@Column(name = "IDEDIFICIO")
	private Long lngIdEdificio;

	@Column(name = "DSEDIFICIO")
	private String strDescEdificio;

	@Column(name = "NBTIPOEDIFICIO")
	private String strTipoEdificio;
	
	

	public SePaEdificioProgramaCampus() {
		super();
	}
	
	

	public Long getLngIdEdificio() {
		return lngIdEdificio;
	}

	public void setLngIdEdificio(Long lngIdEdificio) {
		this.lngIdEdificio = lngIdEdificio;
	}

	public String getStrDescEdificio() {
		return strDescEdificio;
	}

	public void setStrDescEdificio(String strDescEdificio) {
		this.strDescEdificio = strDescEdificio;
	}

	public String getStrTipoEdificio() {
		return strTipoEdificio;
	}

	public void setStrTipoEdificio(String strTipoEdificio) {
		this.strTipoEdificio = strTipoEdificio;
	}

}
