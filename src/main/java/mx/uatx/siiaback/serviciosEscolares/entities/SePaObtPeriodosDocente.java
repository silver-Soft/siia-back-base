package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodosDocente implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3484539640181157277L;

	@Id
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFINAL")
	private Date fcFinal;

	public SePaObtPeriodosDocente() {
		super();
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFinal() {
		return fcFinal;
	}

	public void setFcFinal(Date fcFinal) {
		this.fcFinal = fcFinal;
	}

}
