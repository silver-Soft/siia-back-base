package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtEventosConstanciasVigente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7461945065661024286L;
	@Id
	@Column(name = "IDEVENTOCONSTANCIA")
	private Long lngIdEventoConstancia;
	
	@Column(name = "NBEVENTOCONSTANCIA")
	private String strNbEventoConstancia;
	
	@Column(name = "FCINICIO")
	private Date dtFcInicio;
	
	@Column(name = "FCFIN")
	private Date dtFcFin;
	
	public SiPaObtEventosConstanciasVigente(){
		super();
	}

	public Long getLngIdEventoConstancia() {
		return lngIdEventoConstancia;
	}

	public void setLngIdEventoConstancia(Long lngIdEventoConstancia) {
		this.lngIdEventoConstancia = lngIdEventoConstancia;
	}

	public String getStrNbEventoConstancia() {
		return strNbEventoConstancia;
	}

	public void setStrNbEventoConstancia(String strNbEventoConstancia) {
		this.strNbEventoConstancia = strNbEventoConstancia;
	}

	public Date getDtFcInicio() {
		return dtFcInicio;
	}

	public void setDtFcInicio(Date dtFcInicio) {
		this.dtFcInicio = dtFcInicio;
	}

	public Date getDtFcFin() {
		return dtFcFin;
	}

	public void setDtFcFin(Date dtFcFin) {
		this.dtFcFin = dtFcFin;
	}

}
