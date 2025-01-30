package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEgresadosReporte {

	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	@Column(name = "CURP")
	private String strCurp;

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

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}
	
	

}