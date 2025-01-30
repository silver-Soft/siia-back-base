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
public class SiPaEvaluacionServicio{

	@Id
    @Column(name = "IDEVALUACIONSERVICIO")
	private Integer idEvaluacionServicio;
	
    @Column(name = "DSEVALUACIONSERVICIO")
    private String strDescEvaluacionServicio;
    

	public Integer getIdEvaluacionServicio() {
		return idEvaluacionServicio;
	}

	public void setIdEvaluacionServicio(Integer idEvaluacionServicio) {
		this.idEvaluacionServicio = idEvaluacionServicio;
	}

	public String getStrDescEvaluacionServicio() {
		return strDescEvaluacionServicio;
	}

	public void setStrDescEvaluacionServicio(String strDescEvaluacionServicio) {
		this.strDescEvaluacionServicio = strDescEvaluacionServicio;
	}

}
