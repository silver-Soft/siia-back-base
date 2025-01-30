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
public class SePaPeriodoBeca implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2511495563880153277L;

	@Id
	@Column(name = "IDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

}
