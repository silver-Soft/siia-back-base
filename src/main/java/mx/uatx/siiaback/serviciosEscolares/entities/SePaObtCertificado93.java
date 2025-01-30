package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCertificado93 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2428603211008278663L;

	@Id
	@Column(name = "ROWNUM")
	private Integer intId;
	
	@Column(name = "MATERIA")
	private String strMateria;
	
	@Column(name = "SEMESTRE")
	private Integer intSemestre;
	
	@Column(name = "CALIF_CIFRA")
	private String intCalifCifra;
	
	@Column(name = "FINAL_LETRA")
	private String strFinalLetra;
	
	@Column(name = "CREDITOS")
	private Integer intCreditos;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public Integer getIntSemestre() {
		return intSemestre;
	}

	public void setIntSemestre(Integer intSemestre) {
		this.intSemestre = intSemestre;
	}

	public String getStrFinalLetra() {
		return strFinalLetra;
	}

	public void setStrFinalLetra(String strFinalLetra) {
		this.strFinalLetra = strFinalLetra;
	}

	public Integer getIntCreditos() {
		return intCreditos;
	}

	public void setIntCreditos(Integer intCreditos) {
		this.intCreditos = intCreditos;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getIntCalifCifra() {
		return intCalifCifra;
	}

	public void setIntCalifCifra(String intCalifCifra) {
		this.intCalifCifra = intCalifCifra;
	}
	
}
