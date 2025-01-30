package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteEscProcAsp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8115406905163495081L;
	@Id
	@Column(name = "IDESCUELAPROCEDENCIA")
	private Integer intIdEscuelaProcedencia;
	
	@Column(name = "NBESCUELA")
	private String strNbEscuela;

	@Column(name = "CONTESTARONSOV")
	private Integer intConstaronSov;
	
	@Column(name = "TOTAL")
	private Integer intTotal;
	
	public SePaObtDatosReporteEscProcAsp() {
		super();
	}
	
	public Integer getIntIdEscuelaProcedencia() {
		return intIdEscuelaProcedencia;
	}

	public void setIntIdEscuelaProcedencia(Integer intIdEscuelaProcedencia) {
		this.intIdEscuelaProcedencia = intIdEscuelaProcedencia;
	}

	public String getStrNbEscuela() {
		return strNbEscuela;
	}

	public void setStrNbEscuela(String strNbEscuela) {
		this.strNbEscuela = strNbEscuela;
	}

	public Integer getIntConstaronSov() {
		return intConstaronSov;
	}

	public void setIntConstaronSov(Integer intConstaronSov) {
		this.intConstaronSov = intConstaronSov;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}
	
	
}
