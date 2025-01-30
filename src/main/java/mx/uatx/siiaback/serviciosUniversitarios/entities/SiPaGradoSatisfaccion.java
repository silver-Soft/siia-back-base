/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SiPaGradoSatisfaccion{

	@Id
    @Column(name = "IDGRADOSATISFACCION")
	private Integer intIdGradoSatisfaccion;
	
    
    @Column(name = "DSGRADOSATISFACCION")
    private String strdescGradoSatisfaccion;


	public Integer getIntIdGradoSatisfaccion() {
		return intIdGradoSatisfaccion;
	}


	public void setIntIdGradoSatisfaccion(Integer intIdGradoSatisfaccion) {
		this.intIdGradoSatisfaccion = intIdGradoSatisfaccion;
	}


	public String getStrdescGradoSatisfaccion() {
		return strdescGradoSatisfaccion;
	}


	public void setStrdescGradoSatisfaccion(String strdescGradoSatisfaccion) {
		this.strdescGradoSatisfaccion = strdescGradoSatisfaccion;
	}
    
    
}
