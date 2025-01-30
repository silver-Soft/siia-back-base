package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReportePromedios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 810187566118155221L;
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="MATRICULA")
	private String strMatricula;
	
	@Column(name="NOMBRE")
	private String strNombre;
	
	@Column(name="CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;

	@Column(name="DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;
	
	@Column(name="DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;
	
	@Column(name="DSCAMPUS")
	private String strDsCampus;
	
	@Column(name="PROMEDIO")
	private BigDecimal promedio;
	
	@Column(name="NMCREDITOSCURSADOS")
	private Integer intCreditos;
	
	@Column(name="ACUMULADAS")
	private Integer intAcumuladas;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

	public BigDecimal getPromedio() {
		return promedio;
	}

	public void setPromedio(BigDecimal promedio) {
		this.promedio = promedio;
	}

	public Integer getIntCreditos() {
		return intCreditos;
	}

	public void setIntCreditos(Integer intCreditos) {
		this.intCreditos = intCreditos;
	}

	public Integer getIntAcumuladas() {
		return intAcumuladas;
	}

	public void setIntAcumuladas(Integer intAcumuladas) {
		this.intAcumuladas = intAcumuladas;
	}
	
	
}
