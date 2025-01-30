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
public class SiPaUsuariosCortesias implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2319053569227567983L;

	@Id
    @Column(name = "IDUSUARIOCORT")
	private Long lngIdUsuarioCort;
	
	@Column(name = "CLESTATUSCORTACTIVA")
	private Integer intClEstatusCort;
	
	@Column(name = "DSESTATUS")
	private String strDsEstatus;
	
	@Column(name = "PERSONAAUTORIZO")
	private String strPersonaAutorizo;

	public Long getLngIdUsuarioCort() {
		return lngIdUsuarioCort;
	}

	public void setLngIdUsuarioCort(Long lngIdUsuarioCort) {
		this.lngIdUsuarioCort = lngIdUsuarioCort;
	}

	public Integer getIntClEstatusCort() {
		return intClEstatusCort;
	}

	public void setIntClEstatusCort(Integer intClEstatusCort) {
		this.intClEstatusCort = intClEstatusCort;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public String getStrPersonaAutorizo() {
		return strPersonaAutorizo;
	}

	public void setStrPersonaAutorizo(String strPersonaAutorizo) {
		this.strPersonaAutorizo = strPersonaAutorizo;
	}
    
	
}
