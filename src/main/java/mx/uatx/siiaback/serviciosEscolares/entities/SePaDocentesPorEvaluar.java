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
public class SePaDocentesPorEvaluar implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5423664363004612395L;

	@Id
	@Column(name = "IDOFERTADOCENTE")
	private Long lngIdOfertaDocente;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strDsMateria;

	@Column(name = "DOCENTE")
	private String strDocente;

	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	public Long getLngIdOfertaDocente() {
		return lngIdOfertaDocente;
	}

	public void setLngIdOfertaDocente(Long lngIdOfertaDocente) {
		this.lngIdOfertaDocente = lngIdOfertaDocente;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

}
