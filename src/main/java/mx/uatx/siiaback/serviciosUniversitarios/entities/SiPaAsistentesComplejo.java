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
public class SiPaAsistentesComplejo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5319324967696666448L;

	@Id
	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strDsTipoActDepYRec;

	@Column(name = "HORAINGRESO")
	private String strHoraIngreso;

	public Long getLngIdUsuarioActDepYRec() {
		return lngIdUsuarioActDepYRec;
	}

	public void setLngIdUsuarioActDepYRec(Long lngIdUsuarioActDepYRec) {
		this.lngIdUsuarioActDepYRec = lngIdUsuarioActDepYRec;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	public String getStrDsTipoActDepYRec() {
		return strDsTipoActDepYRec;
	}

	public void setStrDsTipoActDepYRec(String strDsTipoActDepYRec) {
		this.strDsTipoActDepYRec = strDsTipoActDepYRec;
	}

	public String getStrHoraIngreso() {
		return strHoraIngreso;
	}

	public void setStrHoraIngreso(String strHoraIngreso) {
		this.strHoraIngreso = strHoraIngreso;
	}

}
