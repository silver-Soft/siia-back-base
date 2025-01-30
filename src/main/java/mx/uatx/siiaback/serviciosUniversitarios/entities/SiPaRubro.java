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

/**
 *
 * @author sistemas10
 */
@Entity
public class SiPaRubro implements Serializable{

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1707423094738948758L;
	@Id
    @Column(name = "ID")
    private String idRubro;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	public String getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(String idRubro) {
		this.idRubro = idRubro;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	
	
	
	
	
       
    
}
