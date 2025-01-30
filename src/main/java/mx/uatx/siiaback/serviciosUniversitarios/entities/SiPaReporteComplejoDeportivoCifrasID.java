/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SiPaReporteComplejoDeportivoCifrasID implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2870102366101139697L;

	@Column(name = "TIPOUSUARIO")
	private String strTipoUsuario;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strDsTipoActDepYRec;

	public String getStrTipoUsuario() {
		return strTipoUsuario;
	}

	public void setStrTipoUsuario(String strTipoUsuario) {
		this.strTipoUsuario = strTipoUsuario;
	}

	public String getStrDsTipoActDepYRec() {
		return strDsTipoActDepYRec;
	}

	public void setStrDsTipoActDepYRec(String strDsTipoActDepYRec) {
		this.strDsTipoActDepYRec = strDsTipoActDepYRec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((strDsTipoActDepYRec == null) ? 0 : strDsTipoActDepYRec.hashCode());
		result = prime * result + ((strTipoUsuario == null) ? 0 : strTipoUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SiPaReporteComplejoDeportivoCifrasID))
			return false;
		SiPaReporteComplejoDeportivoCifrasID other = (SiPaReporteComplejoDeportivoCifrasID) obj;
		if (strDsTipoActDepYRec == null) {
			if (other.strDsTipoActDepYRec != null)
				return false;
		} else if (!strDsTipoActDepYRec.equals(other.strDsTipoActDepYRec))
			return false;
		if (strTipoUsuario == null) {
			if (other.strTipoUsuario != null)
				return false;
		} else if (!strTipoUsuario.equals(other.strTipoUsuario))
			return false;
		return true;
	}
	
	
}
