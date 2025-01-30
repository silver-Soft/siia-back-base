package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiemposMedioEgreso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3277537804609102794L;

	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;

	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;

	@Column(name = "DSCAMPUS")
	private String strDsCampus;

	@Column(name = "NBPLANESTUDIO")
	private String strNbPlanesEstudio;

	@Column(name = "EGRESADOS")
	private Integer intEgresados;

	@Column(name = "NUMEROPERIODOS")
	private Integer intNumPeriodos;

	@Column(name = "TME")
	private Integer intTme;

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

	public String getStrNbPlanesEstudio() {
		return strNbPlanesEstudio;
	}

	public void setStrNbPlanesEstudio(String strNbPlanesEstudio) {
		this.strNbPlanesEstudio = strNbPlanesEstudio;
	}

	public Integer getIntEgresados() {
		return intEgresados;
	}

	public void setIntEgresados(Integer intEgresados) {
		this.intEgresados = intEgresados;
	}

	public Integer getIntNumPeriodos() {
		return intNumPeriodos;
	}

	public void setIntNumPeriodos(Integer intNumPeriodos) {
		this.intNumPeriodos = intNumPeriodos;
	}

	public Integer getIntTme() {
		return intTme;
	}

	public void setIntTme(Integer intTme) {
		this.intTme = intTme;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

}
