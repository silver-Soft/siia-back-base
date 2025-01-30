package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaFamiliaresAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7924289032649725814L;

	@Id
	@Column(name = "IDFAMILIAR")
	private Long lngIdFamiliar;

	@Column(name = "CLPARENTEZCO")
	private Integer intClParentezco;

	@Column(name = "TIPOFAMILIAR")
	private String strTipoFamiliar;

	@Column(name = "CLESTATUSESTUTOR")
	private Integer intClEstatusEsTutor;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidadDomicilioTutor;
	
	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipioDomicilioTutor;
	
	@Column(name = "CLASENTAMIENTO")
	private Long lngIdAsentamientoDomicilioTutor;
	
	@Column(name = "NBCALLE")
	private String strCalleTutor;
	
	@Column(name = "NMTELEFONO")
	private Long lngTelefonoTutor;
	
	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronicoTutor;
	
	@Column(name = "NMEXTERIOR")
	private String strNumeroTutor;

	public Long getLngIdFamiliar() {
		return lngIdFamiliar;
	}

	public void setLngIdFamiliar(Long lngIdFamiliar) {
		this.lngIdFamiliar = lngIdFamiliar;
	}

	public Integer getIntClParentezco() {
		return intClParentezco;
	}

	public void setIntClParentezco(Integer intClParentezco) {
		this.intClParentezco = intClParentezco;
	}

	public String getStrTipoFamiliar() {
		return strTipoFamiliar;
	}

	public void setStrTipoFamiliar(String strTipoFamiliar) {
		this.strTipoFamiliar = strTipoFamiliar;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
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

	public Integer getIntClEstatusEsTutor() {
		return intClEstatusEsTutor;
	}

	public void setIntClEstatusEsTutor(Integer intClEstatusEsTutor) {
		this.intClEstatusEsTutor = intClEstatusEsTutor;
	}

	public Integer getIntIdEntidadDomicilioTutor() {
		return intIdEntidadDomicilioTutor;
	}

	public void setIntIdEntidadDomicilioTutor(Integer intIdEntidadDomicilioTutor) {
		this.intIdEntidadDomicilioTutor = intIdEntidadDomicilioTutor;
	}

	public Long getLngIdMunicipioDomicilioTutor() {
		return lngIdMunicipioDomicilioTutor;
	}

	public void setLngIdMunicipioDomicilioTutor(Long lngIdMunicipioDomicilioTutor) {
		this.lngIdMunicipioDomicilioTutor = lngIdMunicipioDomicilioTutor;
	}

	public Long getLngIdAsentamientoDomicilioTutor() {
		return lngIdAsentamientoDomicilioTutor;
	}

	public void setLngIdAsentamientoDomicilioTutor(Long lngIdAsentamientoDomicilioTutor) {
		this.lngIdAsentamientoDomicilioTutor = lngIdAsentamientoDomicilioTutor;
	}

	public String getStrCalleTutor() {
		return strCalleTutor;
	}

	public void setStrCalleTutor(String strCalleTutor) {
		this.strCalleTutor = strCalleTutor;
	}

	public Long getLngTelefonoTutor() {
		return lngTelefonoTutor;
	}

	public void setLngTelefonoTutor(Long lngTelefonoTutor) {
		this.lngTelefonoTutor = lngTelefonoTutor;
	}

	public String getStrCorreoElectronicoTutor() {
		return strCorreoElectronicoTutor;
	}

	public void setStrCorreoElectronicoTutor(String strCorreoElectronicoTutor) {
		this.strCorreoElectronicoTutor = strCorreoElectronicoTutor;
	}

	public String getStrNumeroTutor() {
		return strNumeroTutor;
	}

	public void setStrNumeroTutor(String strNumeroTutor) {
		this.strNumeroTutor = strNumeroTutor;
	}

}
