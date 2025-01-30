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
public class SePaTipoBeca implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7643977127084501493L;

	@Id
	@Column(name = "CLTIPOBECA")
	private Integer intIdTipoBeca;

	@Column(name = "DSTIPOBECA")
	private String strTipoBeca;

	@Column(name = "NMHORASACTIVIDADESREC")
	private String strHorasActividadesRec;

	@Column(name = "PROMEDIOMINIMO")
	private Double promedioMinimo;

	public Integer getIntIdTipoBeca() {
		return intIdTipoBeca;
	}

	public void setIntIdTipoBeca(Integer intIdTipoBeca) {
		this.intIdTipoBeca = intIdTipoBeca;
	}

	public String getStrTipoBeca() {
		return strTipoBeca;
	}

	public void setStrTipoBeca(String strTipoBeca) {
		this.strTipoBeca = strTipoBeca;
	}

	public String getStrHorasActividadesRec() {
		return strHorasActividadesRec;
	}

	public void setStrHorasActividadesRec(String strHorasActividadesRec) {
		this.strHorasActividadesRec = strHorasActividadesRec;
	}

	public Double getPromedioMinimo() {
		return promedioMinimo;
	}

	public void setPromedioMinimo(Double promedioMinimo) {
		this.promedioMinimo = promedioMinimo;
	}

}
