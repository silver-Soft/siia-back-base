package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtEventosAsistente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1048742127073639710L;
	@Id
	@Column(name = "IDASISTENTEEVENTO")
	private Long lngIdAsistenteEvento;
	
	@Column(name = "NBEVENTOCONSTANCIA")
	private String strNbEventoConstancia;
	
	@Column(name = "FCINICIO")
	private Date dtFcInicio;
	
	@Column(name = "FCFIN")
	private Date dtFcFin;
	
	@Column(name = "DURACIONHORAS")
	private Integer intDuracionHoras;
	
	@Column(name = "PERMITECONSTANCIA")
	private boolean blnPermiteConstancia;
	
	@Column(name = "ESTATUSASISTENTE")
	private String strEstatusAsistente;
	
	public SiPaObtEventosAsistente() {
		super();
	}

	
	public Long getLngIdAsistenteEvento() {
		return lngIdAsistenteEvento;
	}


	public void setLngIdAsistenteEvento(Long lngIdAsistenteEvento) {
		this.lngIdAsistenteEvento = lngIdAsistenteEvento;
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

	public Integer getIntDuracionHoras() {
		return intDuracionHoras;
	}

	public void setIntDuracionHoras(Integer intDuracionHoras) {
		this.intDuracionHoras = intDuracionHoras;
	}

	public boolean isBlnPermiteConstancia() {
		return blnPermiteConstancia;
	}

	public void setBlnPermiteConstancia(boolean blnPermiteConstancia) {
		this.blnPermiteConstancia = blnPermiteConstancia;
	}


	public String getStrEstatusAsistente() {
		return strEstatusAsistente;
	}


	public void setStrEstatusAsistente(String strEstatusAsistente) {
		this.strEstatusAsistente = strEstatusAsistente;
	}


	
	
	
}
