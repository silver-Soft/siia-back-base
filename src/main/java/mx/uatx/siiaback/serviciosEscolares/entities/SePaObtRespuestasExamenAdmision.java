package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtRespuestasExamenAdmision implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5302483121517239490L;
	@Id
	@Column(name = "FOLIO")
	private Long lngFolio;

	@Column(name = "NBASPIRANTE")
	private String strNbAspirante;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "RESPUESTAS")
	private Integer intRespuestas;
	
	@Column(name = "CORRECTAS")
	private Integer intCorrectas;
	
	@Column(name = "INCORRECTAS")
	private Integer intIncorrectas;
	
	@Column(name = "PUNTAJE")
	private Integer intPuntaje;
	
	@Column(name = "FCINICIOCONTESTADO")
	private String strFechaInicioContestado;
	
	@Column(name = "FCFINCONTESTADO")
	private String strFechaFinContestado;
	
	@Column(name = "HRINICIOCONTESTADO")
	private String strHrInicioContestado;
	
	@Column(name = "HRFINCONTESTADO")
	private String strHrFinContestado;
	
	@Column(name = "DURACION")
	private String strDuracion;
	
	public SePaObtRespuestasExamenAdmision() {
		super();
	}

	public Long getLngFolio() {
		return lngFolio;
	}

	public void setLngFolio(Long lngFolio) {
		this.lngFolio = lngFolio;
	}
	
	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public Integer getIntRespuestas() {
		return intRespuestas;
	}

	public void setIntRespuestas(Integer intRespuestas) {
		this.intRespuestas = intRespuestas;
	}

	public Integer getIntCorrectas() {
		return intCorrectas;
	}

	public void setIntCorrectas(Integer intCorrectas) {
		this.intCorrectas = intCorrectas;
	}

	public Integer getIntIncorrectas() {
		return intIncorrectas;
	}

	public void setIntIncorrectas(Integer intIncorrectas) {
		this.intIncorrectas = intIncorrectas;
	}

	public Integer getIntPuntaje() {
		return intPuntaje;
	}

	public void setIntPuntaje(Integer intPuntaje) {
		this.intPuntaje = intPuntaje;
	}

	
	public String getStrHrInicioContestado() {
		return strHrInicioContestado;
	}

	public void setStrHrInicioContestado(String strHrInicioContestado) {
		this.strHrInicioContestado = strHrInicioContestado;
	}

	public String getStrHrFinContestado() {
		return strHrFinContestado;
	}

	public void setStrHrFinContestado(String strHrFinContestado) {
		this.strHrFinContestado = strHrFinContestado;
	}

	public String getStrDuracion() {
		return strDuracion;
	}

	public void setStrDuracion(String strDuracion) {
		this.strDuracion = strDuracion;
	}

	public String getStrNbAspirante() {
		return strNbAspirante;
	}

	public void setStrNbAspirante(String strNbAspirante) {
		this.strNbAspirante = strNbAspirante;
	}

	public String getStrFechaInicioContestado() {
		return strFechaInicioContestado;
	}

	public void setStrFechaInicioContestado(String strFechaInicioContestado) {
		this.strFechaInicioContestado = strFechaInicioContestado;
	}

	public String getStrFechaFinContestado() {
		return strFechaFinContestado;
	}

	public void setStrFechaFinContestado(String strFechaFinContestado) {
		this.strFechaFinContestado = strFechaFinContestado;
	}
	
	
}
