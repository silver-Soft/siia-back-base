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
public class SiPaTiposAcDepYRec implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2093413262159112334L;

	@Id
	@Column(name = "IDTIPOACTDEPYREC")
	private Integer intIdTipoActividadDepYRep;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strDsTipoActDepYRec;

	@Column(name = "NMCOSTOUNIVERSITARIOS")
	private String strNmCostoUniversitarios;

	@Column(name = "NMCOSTOEXTERNOS")
	private String strNmCostoExternos;

	public Integer getIntIdTipoActividadDepYRep() {
		return intIdTipoActividadDepYRep;
	}

	public void setIntIdTipoActividadDepYRep(Integer intIdTipoActividadDepYRep) {
		this.intIdTipoActividadDepYRep = intIdTipoActividadDepYRep;
	}

	public String getStrDsTipoActDepYRec() {
		return strDsTipoActDepYRec;
	}

	public void setStrDsTipoActDepYRec(String strDsTipoActDepYRec) {
		this.strDsTipoActDepYRec = strDsTipoActDepYRec;
	}

	public String getStrNmCostoUniversitarios() {
		return strNmCostoUniversitarios;
	}

	public void setStrNmCostoUniversitarios(String strNmCostoUniversitarios) {
		this.strNmCostoUniversitarios = strNmCostoUniversitarios;
	}

	public String getStrNmCostoExternos() {
		return strNmCostoExternos;
	}

	public void setStrNmCostoExternos(String strNmCostoExternos) {
		this.strNmCostoExternos = strNmCostoExternos;
	}

}
