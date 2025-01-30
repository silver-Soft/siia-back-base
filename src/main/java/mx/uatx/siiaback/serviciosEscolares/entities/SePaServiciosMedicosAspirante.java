package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaServiciosMedicosAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7613929453242687921L;

	@Id
	@Column(name = "IDSERVICIOMEDICOASPIRANTE")
	private Long lngIdServicioMedicoAspirante;

	@Column(name = "TIPOSEGURO")
	private String strTipoSeguro;

	@Column(name = "ASEGURADORA")
	private String strAseguradora;

	@Column(name = "NMPOLIZA")
	private String strNumeroPoliza;

	@Column(name = "DSCLINICA")
	private String strNombreClinica;

	@Column(name = "FCINICIOVIGENCIA")
	private Date fcInicioVigencia;

	@Column(name = "FCFINVIGENCIA")
	private Date fcFinVigencia;

	public Long getLngIdServicioMedicoAspirante() {
		return lngIdServicioMedicoAspirante;
	}

	public void setLngIdServicioMedicoAspirante(Long lngIdServicioMedicoAspirante) {
		this.lngIdServicioMedicoAspirante = lngIdServicioMedicoAspirante;
	}

	public String getStrTipoSeguro() {
		return strTipoSeguro;
	}

	public void setStrTipoSeguro(String strTipoSeguro) {
		this.strTipoSeguro = strTipoSeguro;
	}

	public String getStrAseguradora() {
		return strAseguradora;
	}

	public void setStrAseguradora(String strAseguradora) {
		this.strAseguradora = strAseguradora;
	}

	public String getStrNumeroPoliza() {
		return strNumeroPoliza;
	}

	public void setStrNumeroPoliza(String strNumeroPoliza) {
		this.strNumeroPoliza = strNumeroPoliza;
	}

	public String getStrNombreClinica() {
		return strNombreClinica;
	}

	public void setStrNombreClinica(String strNombreClinica) {
		this.strNombreClinica = strNombreClinica;
	}

	public Date getFcInicioVigencia() {
		return fcInicioVigencia;
	}

	public void setFcInicioVigencia(Date fcInicioVigencia) {
		this.fcInicioVigencia = fcInicioVigencia;
	}

	public Date getFcFinVigencia() {
		return fcFinVigencia;
	}

	public void setFcFinVigencia(Date fcFinVigencia) {
		this.fcFinVigencia = fcFinVigencia;
	}

}
