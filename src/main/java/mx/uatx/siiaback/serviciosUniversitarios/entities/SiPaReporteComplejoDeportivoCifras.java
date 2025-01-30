/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author sistemas10
 */
@Entity
public class SiPaReporteComplejoDeportivoCifras implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5022187712936578339L;

	@EmbeddedId
	private SiPaReporteComplejoDeportivoCifrasID id;

	@Column(name = "Cantidad")
	private Long lngCantidad;

	public SiPaReporteComplejoDeportivoCifrasID getId() {
		return id;
	}

	public void setId(SiPaReporteComplejoDeportivoCifrasID id) {
		this.id = id;
	}

	public Long getLngCantidad() {
		return lngCantidad;
	}

	public void setLngCantidad(Long lngCantidad) {
		this.lngCantidad = lngCantidad;
	}

}
