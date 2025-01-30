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
public class SePaTiposTitulacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7678653396866966009L;

	@Id
    @Column(name = "CLTIPOTITULACION")
    private Integer intIdTipoTitulo;

    @Column(name = "DSTIPOTITULACION")
    private String strObservaciones;

	

	public Integer getIntIdTipoTitulo() {
		return intIdTipoTitulo;
	}

	public void setIntIdTipoTitulo(Integer intIdTipoTitulo) {
		this.intIdTipoTitulo = intIdTipoTitulo;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}
    
    
	
    
}
