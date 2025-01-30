package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaCifras implements Serializable {
	
	@Id
	@Column(name = "DATO")
	private String strDato;
	
	@Column(name = "VALOR")
	private String strValor;
	
	@Column(name = "LIMITE")
	private Long lngLimite;
	
	@Column(name = "ORDEN")
	private Integer intOrden;
	
	@Column(name = "COLOR")
	private String strColor;
	
	@Column(name = "ICONO")
	private String strIcono;
	
	
	public String getStrDato() {
		return strDato;
	}
	public void setStrDato(String strDato) {
		this.strDato = strDato;
	}
	public String getStrValor() {
		return strValor;
	}
	public void setStrValor(String strValor) {
		this.strValor = strValor;
	}
	public Long getLngLimite() {
		return lngLimite;
	}
	public void setLngLimite(Long lngLimite) {
		this.lngLimite = lngLimite;
	}
	public Integer getIntOrden() {
		return intOrden;
	}
	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}
	public String getStrColor() {
		return strColor;
	}
	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	public String getStrIcono() {
		return strIcono;
	}
	public void setStrIcono(String strIcono) {
		this.strIcono = strIcono;
	}
	
}










