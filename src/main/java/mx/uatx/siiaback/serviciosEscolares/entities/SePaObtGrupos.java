package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Entity
public class SePaObtGrupos {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "CONCEPTO")
	private String strConcepto;

	@Column(name = "UNO")
	private Integer intUno;

	@Column(name = "DOS")
	private Integer intDos;

	@Column(name = "TRES")
	private Integer intTres;

	@Column(name = "CUATRO")
	private Integer intCuatro;

	@Column(name = "CINCO")
	private Integer intCinco;

	@Column(name = "SEIS")
	private Integer intSeis;

	@Column(name = "SIETE")
	private Integer intSiete;

	@Column(name = "OCHO")
	private Integer intOcho;

	@Column(name = "NUEVE")
	private Integer intNueve;

	@Column(name = "DIEZ")
	private Integer intDiez;

	public Integer getIntUno() {
		return intUno;
	}

	public void setIntUno(Integer intUno) {
		this.intUno = intUno;
	}

	public Integer getIntDos() {
		return intDos;
	}

	public void setIntDos(Integer intDos) {
		this.intDos = intDos;
	}

	public Integer getIntTres() {
		return intTres;
	}

	public void setIntTres(Integer intTres) {
		this.intTres = intTres;
	}

	public Integer getIntCuatro() {
		return intCuatro;
	}

	public void setIntCuatro(Integer intCuatro) {
		this.intCuatro = intCuatro;
	}

	public Integer getIntCinco() {
		return intCinco;
	}

	public void setIntCinco(Integer intCinco) {
		this.intCinco = intCinco;
	}

	public Integer getIntSeis() {
		return intSeis;
	}

	public void setIntSeis(Integer intSeis) {
		this.intSeis = intSeis;
	}

	public Integer getIntSiete() {
		return intSiete;
	}

	public void setIntSiete(Integer intSiete) {
		this.intSiete = intSiete;
	}

	public Integer getIntOcho() {
		return intOcho;
	}

	public void setIntOcho(Integer intOcho) {
		this.intOcho = intOcho;
	}

	public Integer getIntNueve() {
		return intNueve;
	}

	public void setIntNueve(Integer intNueve) {
		this.intNueve = intNueve;
	}

	public Integer getIntDiez() {
		return intDiez;
	}

	public void setIntDiez(Integer intDiez) {
		this.intDiez = intDiez;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrConcepto() {
		return strConcepto;
	}

	public void setStrConcepto(String strConcepto) {
		this.strConcepto = strConcepto;
	}

}