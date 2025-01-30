package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDatosReinscripcion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2547424226247211924L;

	@Id
	@Column(name = "NBPLANESTUDIO")
	private String strNbPlanEstudio;

	@Column(name = "IDCOMPLEMENTARIOIMSS")
	private Long lngIdComplementarioImss;

	@Column(name = "NSS")
	private String strNumeroSeguroSocial;

	@Column(name = "CLESTATUSACEPTADO")
	private Integer intClEstatusAceptado;

	@Column(name = "CLESTADOCIVIL")
	private Integer intClEstadoCivil;

	@Column(name = "DSESTADOCIVIL")
	private String strDsEstadoCivil;

	@Column(name = "IDTIPOTRABAJO")
	private Integer intIdTipoTrabajo;

	@Column(name = "CLSTESBENEFICIARIOPROSPERA")
	private Integer intClEsBeneficiarioProspera;

	@Column(name = "FOLIOFAMILIAPROSPERA")
	private String strFolioFamiliaProspera;

	@Column(name = "IDTIPODISCAPACIDAD")
	private Integer intIdTipoDiscapacidad;

	@Column(name = "IDLENGUAINDIGENA")
	private Integer intIdLenguaIndigena;

	@Column(name = "CURP")
	private String strCurp;

	@Column(name = "IDPERSONASALUD")
	private Long lngIdPersonaSalud;

	@Column(name = "IDGRUPOSANGUINEO")
	private Integer intIdGrupoSanguineo;

	@Column(name = "IDCONDICIONSALUD")
	private Long lngCondicionSalud;

	@Column(name = "DSESPECIFICARCONDSALUD")
	private String strDsEspecificarCondSalud;

	@Column(name = "FOTOGRAFIA")
	private byte[] fotografia;

	@Column(name = "IMAGEN")
	private byte[] imagen;

	@Column(name = "IDDOMICILIO")
	private Long lngIdDomicilio;

	@Column(name = "NBCALLE")
	private String strNbCalle;

	@Column(name = "NMEXTERIOR")
	private String strNmExterior;

	@Column(name = "CLASENTAMIENTO")
	private Long lngClAsentamiento;

	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipio;

	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;

	@Column(name = "IDPERSONACORREO")
	private Long lngIdPersonaCorreo;

	@Column(name = "CORREO")
	private String strCorreo;

	@Column(name = "IDPERSONATELEFONOCEL")
	private Long lngIdPersonaTelefonoCel;

	@Column(name = "AREACEL")
	private Long lngAreaCel;

	@Column(name = "TELEFONOCEL")
	private Long lngTelefonoCel;

	@Column(name = "IDPERSONATELEFONOCASA")
	private Long lngIdPersonaTelefonoCasa;

	@Column(name = "AREACASA")
	private Long lngAreaCasa;

	@Column(name = "TELEFONOCASA")
	private Long lngTelefonoCasa;

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
	}

	public Long getLngIdComplementarioImss() {
		return lngIdComplementarioImss;
	}

	public void setLngIdComplementarioImss(Long lngIdComplementarioImss) {
		this.lngIdComplementarioImss = lngIdComplementarioImss;
	}

	public String getStrNumeroSeguroSocial() {
		return strNumeroSeguroSocial;
	}

	public void setStrNumeroSeguroSocial(String strNumeroSeguroSocial) {
		this.strNumeroSeguroSocial = strNumeroSeguroSocial;
	}

	public Integer getIntClEstatusAceptado() {
		return intClEstatusAceptado;
	}

	public void setIntClEstatusAceptado(Integer intClEstatusAceptado) {
		this.intClEstatusAceptado = intClEstatusAceptado;
	}

	public Integer getIntClEstadoCivil() {
		return intClEstadoCivil;
	}

	public void setIntClEstadoCivil(Integer intClEstadoCivil) {
		this.intClEstadoCivil = intClEstadoCivil;
	}

	public String getStrDsEstadoCivil() {
		return strDsEstadoCivil;
	}

	public void setStrDsEstadoCivil(String strDsEstadoCivil) {
		this.strDsEstadoCivil = strDsEstadoCivil;
	}

	public Integer getIntIdTipoTrabajo() {
		return intIdTipoTrabajo;
	}

	public void setIntIdTipoTrabajo(Integer intIdTipoTrabajo) {
		this.intIdTipoTrabajo = intIdTipoTrabajo;
	}

	public Integer getIntClEsBeneficiarioProspera() {
		return intClEsBeneficiarioProspera;
	}

	public void setIntClEsBeneficiarioProspera(Integer intClEsBeneficiarioProspera) {
		this.intClEsBeneficiarioProspera = intClEsBeneficiarioProspera;
	}

	public String getStrFolioFamiliaProspera() {
		return strFolioFamiliaProspera;
	}

	public void setStrFolioFamiliaProspera(String strFolioFamiliaProspera) {
		this.strFolioFamiliaProspera = strFolioFamiliaProspera;
	}

	public Integer getIntIdTipoDiscapacidad() {
		return intIdTipoDiscapacidad;
	}

	public void setIntIdTipoDiscapacidad(Integer intIdTipoDiscapacidad) {
		this.intIdTipoDiscapacidad = intIdTipoDiscapacidad;
	}

	public Integer getIntIdLenguaIndigena() {
		return intIdLenguaIndigena;
	}

	public void setIntIdLenguaIndigena(Integer intIdLenguaIndigena) {
		this.intIdLenguaIndigena = intIdLenguaIndigena;
	}

	public Long getLngIdPersonaSalud() {
		return lngIdPersonaSalud;
	}

	public void setLngIdPersonaSalud(Long lngIdPersonaSalud) {
		this.lngIdPersonaSalud = lngIdPersonaSalud;
	}

	public Integer getIntIdGrupoSanguineo() {
		return intIdGrupoSanguineo;
	}

	public void setIntIdGrupoSanguineo(Integer intIdGrupoSanguineo) {
		this.intIdGrupoSanguineo = intIdGrupoSanguineo;
	}

	public Long getLngCondicionSalud() {
		return lngCondicionSalud;
	}

	public void setLngCondicionSalud(Long lngCondicionSalud) {
		this.lngCondicionSalud = lngCondicionSalud;
	}

	public String getStrDsEspecificarCondSalud() {
		return strDsEspecificarCondSalud;
	}

	public void setStrDsEspecificarCondSalud(String strDsEspecificarCondSalud) {
		this.strDsEspecificarCondSalud = strDsEspecificarCondSalud;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public Long getLngIdDomicilio() {
		return lngIdDomicilio;
	}

	public void setLngIdDomicilio(Long lngIdDomicilio) {
		this.lngIdDomicilio = lngIdDomicilio;
	}

	public String getStrNbCalle() {
		return strNbCalle;
	}

	public void setStrNbCalle(String strNbCalle) {
		this.strNbCalle = strNbCalle;
	}

	public String getStrNmExterior() {
		return strNmExterior;
	}

	public void setStrNmExterior(String strNmExterior) {
		this.strNmExterior = strNmExterior;
	}

	public Long getLngClAsentamiento() {
		return lngClAsentamiento;
	}

	public void setLngClAsentamiento(Long lngClAsentamiento) {
		this.lngClAsentamiento = lngClAsentamiento;
	}

	public Long getLngIdMunicipio() {
		return lngIdMunicipio;
	}

	public void setLngIdMunicipio(Long lngIdMunicipio) {
		this.lngIdMunicipio = lngIdMunicipio;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

	public Long getLngIdPersonaCorreo() {
		return lngIdPersonaCorreo;
	}

	public void setLngIdPersonaCorreo(Long lngIdPersonaCorreo) {
		this.lngIdPersonaCorreo = lngIdPersonaCorreo;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public Long getLngIdPersonaTelefonoCel() {
		return lngIdPersonaTelefonoCel;
	}

	public void setLngIdPersonaTelefonoCel(Long lngIdPersonaTelefonoCel) {
		this.lngIdPersonaTelefonoCel = lngIdPersonaTelefonoCel;
	}

	public Long getLngIdPersonaTelefonoCasa() {
		return lngIdPersonaTelefonoCasa;
	}

	public void setLngIdPersonaTelefonoCasa(Long lngIdPersonaTelefonoCasa) {
		this.lngIdPersonaTelefonoCasa = lngIdPersonaTelefonoCasa;
	}

	public Long getLngAreaCel() {
		return lngAreaCel;
	}

	public void setLngAreaCel(Long lngAreaCel) {
		this.lngAreaCel = lngAreaCel;
	}

	public Long getLngTelefonoCel() {
		return lngTelefonoCel;
	}

	public void setLngTelefonoCel(Long lngTelefonoCel) {
		this.lngTelefonoCel = lngTelefonoCel;
	}

	public Long getLngAreaCasa() {
		return lngAreaCasa;
	}

	public void setLngAreaCasa(Long lngAreaCasa) {
		this.lngAreaCasa = lngAreaCasa;
	}

	public Long getLngTelefonoCasa() {
		return lngTelefonoCasa;
	}

	public void setLngTelefonoCasa(Long lngTelefonoCasa) {
		this.lngTelefonoCasa = lngTelefonoCasa;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

}
