package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCohorte {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	@Column(name = "UNO_H")
	private Integer intUnoHombres;

	@Column(name = "UNO_M")
	private Integer intUnoMujeres;

	@Column(name = "DOS_H")
	private Integer intDosHombres;

	@Column(name = "DOS_M")
	private Integer intDosMujeres;

	@Column(name = "TRES_H")
	private Integer intTresHombres;

	@Column(name = "TRES_M")
	private Integer intTresMujeres;

	@Column(name = "CUATRO_H")
	private Integer intCuatroHombres;

	@Column(name = "CUATRO_M")
	private Integer intCuatroMujeres;

	@Column(name = "CINCO_H")
	private Integer intCincoHombres;

	@Column(name = "CINCO_M")
	private Integer intCincoMujeres;

	@Column(name = "SEIS_H")
	private Integer intSeisHombres;

	@Column(name = "SEIS_M")
	private Integer intSeisMujeres;

	@Column(name = "SIETE_H")
	private Integer intSieteHombres;

	@Column(name = "SIETE_M")
	private Integer intSieteMujeres;

	@Column(name = "OCHO_H")
	private Integer intOchoHombres;

	@Column(name = "OCHO_M")
	private Integer intOchoMujeres;

	@Column(name = "NUEVE_H")
	private Integer intNueveHombres;

	@Column(name = "NUEVE_M")
	private Integer intNueveMujeres;

	@Column(name = "DIEZ_H")
	private Integer intDiezHombres;

	@Column(name = "DIEZ_M")
	private Integer intDiezMujeres;

	@Column(name = "SUB_H")
	private Integer intSubH;

	@Column(name = "SUB_M")
	private Integer intSubM;

	@Column(name = "TOTAL")
	private Integer intTotal;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public Integer getIntUnoHombres() {
		return intUnoHombres;
	}

	public void setIntUnoHombres(Integer intUnoHombres) {
		this.intUnoHombres = intUnoHombres;
	}

	public Integer getIntUnoMujeres() {
		return intUnoMujeres;
	}

	public void setIntUnoMujeres(Integer intUnoMujeres) {
		this.intUnoMujeres = intUnoMujeres;
	}

	public Integer getIntDosHombres() {
		return intDosHombres;
	}

	public void setIntDosHombres(Integer intDosHombres) {
		this.intDosHombres = intDosHombres;
	}

	public Integer getIntDosMujeres() {
		return intDosMujeres;
	}

	public void setIntDosMujeres(Integer intDosMujeres) {
		this.intDosMujeres = intDosMujeres;
	}

	public Integer getIntTresHombres() {
		return intTresHombres;
	}

	public void setIntTresHombres(Integer intTresHombres) {
		this.intTresHombres = intTresHombres;
	}

	public Integer getIntTresMujeres() {
		return intTresMujeres;
	}

	public void setIntTresMujeres(Integer intTresMujeres) {
		this.intTresMujeres = intTresMujeres;
	}

	public Integer getIntCuatroHombres() {
		return intCuatroHombres;
	}

	public void setIntCuatroHombres(Integer intCuatroHombres) {
		this.intCuatroHombres = intCuatroHombres;
	}

	public Integer getIntCuatroMujeres() {
		return intCuatroMujeres;
	}

	public void setIntCuatroMujeres(Integer intCuatroMujeres) {
		this.intCuatroMujeres = intCuatroMujeres;
	}

	public Integer getIntCincoHombres() {
		return intCincoHombres;
	}

	public void setIntCincoHombres(Integer intCincoHombres) {
		this.intCincoHombres = intCincoHombres;
	}

	public Integer getIntCincoMujeres() {
		return intCincoMujeres;
	}

	public void setIntCincoMujeres(Integer intCincoMujeres) {
		this.intCincoMujeres = intCincoMujeres;
	}

	public Integer getIntSeisHombres() {
		return intSeisHombres;
	}

	public void setIntSeisHombres(Integer intSeisHombres) {
		this.intSeisHombres = intSeisHombres;
	}

	public Integer getIntSeisMujeres() {
		return intSeisMujeres;
	}

	public void setIntSeisMujeres(Integer intSeisMujeres) {
		this.intSeisMujeres = intSeisMujeres;
	}

	public Integer getIntSieteHombres() {
		return intSieteHombres;
	}

	public void setIntSieteHombres(Integer intSieteHombres) {
		this.intSieteHombres = intSieteHombres;
	}

	public Integer getIntSieteMujeres() {
		return intSieteMujeres;
	}

	public void setIntSieteMujeres(Integer intSieteMujeres) {
		this.intSieteMujeres = intSieteMujeres;
	}

	public Integer getIntOchoHombres() {
		return intOchoHombres;
	}

	public void setIntOchoHombres(Integer intOchoHombres) {
		this.intOchoHombres = intOchoHombres;
	}

	public Integer getIntOchoMujeres() {
		return intOchoMujeres;
	}

	public void setIntOchoMujeres(Integer intOchoMujeres) {
		this.intOchoMujeres = intOchoMujeres;
	}

	public Integer getIntNueveHombres() {
		return intNueveHombres;
	}

	public void setIntNueveHombres(Integer intNueveHombres) {
		this.intNueveHombres = intNueveHombres;
	}

	public Integer getIntNueveMujeres() {
		return intNueveMujeres;
	}

	public void setIntNueveMujeres(Integer intNueveMujeres) {
		this.intNueveMujeres = intNueveMujeres;
	}

	public Integer getIntDiezHombres() {
		return intDiezHombres;
	}

	public void setIntDiezHombres(Integer intDiezHombres) {
		this.intDiezHombres = intDiezHombres;
	}

	public Integer getIntDiezMujeres() {
		return intDiezMujeres;
	}

	public void setIntDiezMujeres(Integer intDiezMujeres) {
		this.intDiezMujeres = intDiezMujeres;
	}

	public Integer getIntSubH() {
		return intSubH;
	}

	public void setIntSubH(Integer intSubH) {
		this.intSubH = intSubH;
	}

	public Integer getIntSubM() {
		return intSubM;
	}

	public void setIntSubM(Integer intSubM) {
		this.intSubM = intSubM;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

}