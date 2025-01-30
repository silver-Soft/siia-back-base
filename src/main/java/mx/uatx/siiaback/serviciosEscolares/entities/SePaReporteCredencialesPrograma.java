package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteCredencialesPrograma {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "DSCAMPUS")
	private String strCampus;

	@Column(name = "IMPRESAS")
	private Integer intImpresas;

	@Column(name = "PORIMPRIMIR")
	private Integer intPorImprimir;

	@Column(name = "SINFOTO")
	private Integer intSinFoto;

	@Column(name = "SINFIRMA")
	private Integer intSinFirma;

	@Column(name = "SINVALIDARFOTO")
	private Integer intSinValidarFoto;

	@Column(name = "SINVALIDARFIRMA")
	private Integer intSinValidarFirma;

	@Column(name = "SINVALIDAR")
	private Integer intSinValidar;

	@Column(name = "FOTORECHAZADA")
	private Integer intFotoRechazada;

	@Column(name = "FIRMARECHAZADA")
	private Integer intFirmaRechazada;

	@Column(name = "RECHAZADAS")
	private Integer intRechazadas;

	@Column(name = "INSCRITOS")
	private Integer intInscritos;

	@Column(name = "REINSCRITOS")
	private Integer intReinscritos;

	public SePaReporteCredencialesPrograma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public Integer getIntImpresas() {
		return intImpresas;
	}

	public void setIntImpresas(Integer intImpresas) {
		this.intImpresas = intImpresas;
	}

	public Integer getIntPorImprimir() {
		return intPorImprimir;
	}

	public void setIntPorImprimir(Integer intPorImprimir) {
		this.intPorImprimir = intPorImprimir;
	}

	public Integer getIntSinFoto() {
		return intSinFoto;
	}

	public void setIntSinFoto(Integer intSinFoto) {
		this.intSinFoto = intSinFoto;
	}

	public Integer getIntSinFirma() {
		return intSinFirma;
	}

	public void setIntSinFirma(Integer intSinFirma) {
		this.intSinFirma = intSinFirma;
	}

	public Integer getIntSinValidarFoto() {
		return intSinValidarFoto;
	}

	public void setIntSinValidarFoto(Integer intSinValidarFoto) {
		this.intSinValidarFoto = intSinValidarFoto;
	}

	public Integer getIntSinValidarFirma() {
		return intSinValidarFirma;
	}

	public void setIntSinValidarFirma(Integer intSinValidarFirma) {
		this.intSinValidarFirma = intSinValidarFirma;
	}

	public Integer getIntSinValidar() {
		return intSinValidar;
	}

	public void setIntSinValidar(Integer intSinValidar) {
		this.intSinValidar = intSinValidar;
	}

	public Integer getIntFirmaRechazada() {
		return intFirmaRechazada;
	}

	public void setIntFirmaRechazada(Integer intFirmaRechazada) {
		this.intFirmaRechazada = intFirmaRechazada;
	}

	public Integer getIntRechazadas() {
		return intRechazadas;
	}

	public void setIntRechazadas(Integer intRechazadas) {
		this.intRechazadas = intRechazadas;
	}

	public Integer getIntFotoRechazada() {
		return intFotoRechazada;
	}

	public void setIntFotoRechazada(Integer intFotoRechazada) {
		this.intFotoRechazada = intFotoRechazada;
	}

	public Integer getIntInscritos() {
		return intInscritos;
	}

	public void setIntInscritos(Integer intInscritos) {
		this.intInscritos = intInscritos;
	}

	public Integer getIntReinscritos() {
		return intReinscritos;
	}

	public void setIntReinscritos(Integer intReinscritos) {
		this.intReinscritos = intReinscritos;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}
	
	

}
