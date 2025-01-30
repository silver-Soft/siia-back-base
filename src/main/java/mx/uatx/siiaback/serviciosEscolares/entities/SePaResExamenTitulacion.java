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
public class SePaResExamenTitulacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7678653396866966009L;

	@Id
    @Column(name = "IDRESULTADOEXAMENTITULACION")
	private int idResultadoExamenTitulacion;
    
    @Column(name = "DSRESULTADOEXAMENTITULACION")
    private String dsResultadoExamenTitulacion;

	public int getIdResultadoExamenTitulacion() {
		return idResultadoExamenTitulacion;
	}

	public void setIdResultadoExamenTitulacion(int idResultadoExamenTitulacion) {
		this.idResultadoExamenTitulacion = idResultadoExamenTitulacion;
	}

	public String getDsResultadoExamenTitulacion() {
		return dsResultadoExamenTitulacion;
	}

	public void setDsResultadoExamenTitulacion(String dsResultadoExamenTitulacion) {
		this.dsResultadoExamenTitulacion = dsResultadoExamenTitulacion;
	}

    
    
}
