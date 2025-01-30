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
public class SiPaHorario implements Serializable {

	/**
	 * lstResultado
	 */
	private static final long serialVersionUID = 3975976459528612684L;
	
	@Id
	@Column(name = "horario")
	private String strHorario;

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

}
