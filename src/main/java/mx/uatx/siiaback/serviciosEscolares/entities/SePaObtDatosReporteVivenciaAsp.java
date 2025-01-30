package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteVivenciaAsp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4564562194120452912L;
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "TOTAL")
	private Integer intTotal;
	
	@Column(name = "APLICARONSOV")
	private Integer intAplicaronSov;

	@Column(name = "COINCIDE")
	private Integer intCoincide;
	
	@Column(name = "NO_COINCIDE")
	private Integer intNo_Coincide;
	
	@Column(name = "ASISTE")
	private Integer intAsiste;
	
	public SePaObtDatosReporteVivenciaAsp(){
		super();
	}
	
	

	public Integer getIntId() {
		return intId;
	}



	public void setIntId(Integer intId) {
		this.intId = intId;
	}



	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

	public Integer getIntAplicaronSov() {
		return intAplicaronSov;
	}

	public void setIntAplicaronSov(Integer intAplicaronSov) {
		this.intAplicaronSov = intAplicaronSov;
	}

	public Integer getIntCoincide() {
		return intCoincide;
	}

	public void setIntCoincide(Integer intCoincide) {
		this.intCoincide = intCoincide;
	}

	public Integer getIntNo_Coincide() {
		return intNo_Coincide;
	}

	public void setIntNo_Coincide(Integer intNo_Coincide) {
		this.intNo_Coincide = intNo_Coincide;
	}

	public Integer getIntAsiste() {
		return intAsiste;
	}

	public void setIntAsiste(Integer intAsiste) {
		this.intAsiste = intAsiste;
	}
	
	
}
