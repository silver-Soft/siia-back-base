package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SIAXAREASCAMPUS")
public class SiAxAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3861131015771268268L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDAREACAMPUS", sequenceName = "SIIUAT.IDAREACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDAREACAMPUS")
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "CLCAMPUS")
	private Integer intClCampus;

	@Column(name = "CLAREA")
	private Integer intClArea;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DV")
	private Integer intDv;

	@Column(name = "MATBANCO")
	private Integer intMatBanco;

	@Column(name = "IDDOMICILIO")
	private Long lngIdDomicilio;

	@Column(name = "IDPUESTOTITULAR")
	private Integer intIdPuestoTitular;

	@Column(name = "NMAREAUNIVERSITARIA")
	private String strNmAreaUniversitaria;

	@Column(name = "CLESTATUSCERTIFICADO")
	private Integer intClEstatusCertificado;

	@Column(name = "PERMITEASIGNARMISMONIVEL")
	private Boolean blnPermiteAsignarMismoNivel;

	@Column(name = "PERMITECONSULTARSUBNIVELES")
	private Boolean blnPermiteConsultarSubNiveles;

	@Column(name = "PERMITEASIGNARSUBNIVELINFERIOR")
	private Boolean blnPermiteAsignarSubNivelInferior;

	@Column(name = "PERMITEASIGNARCUALQUIERRESPONS")
	private Boolean blnPermiteAsignarCualquierRespons;

	@Column(name = "CLAVE_BIBLIOTECA")
	private String strClaveBiblioteca;

	@Column(name = "LONGITUD")
	private Long lngLongitud;

	@Column(name = "LATITUD")
	private Long lngLatitud;

	@Column(name = "IDCARTOGRAFIA")
	private Long lngIdCartografia;

	@Column(name = "CLAVE911")
	private String strClave911;

	@Column(name = "DSREFERENCIASUBICACION")
	private String strDsReferenciasUbicacion;

	@Column(name = "DSCVECALIDADCONS")
	private String strDsCalidadCons;

	@Column(name = "CLPRINCIPAL")
	private Integer intClPrincipal;

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntClCampus() {
		return intClCampus;
	}

	public void setIntClCampus(Integer intClCampus) {
		this.intClCampus = intClCampus;
	}

	public Integer getIntClArea() {
		return intClArea;
	}

	public void setIntClArea(Integer intClArea) {
		this.intClArea = intClArea;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntDv() {
		return intDv;
	}

	public void setIntDv(Integer intDv) {
		this.intDv = intDv;
	}

	public Integer getIntMatBanco() {
		return intMatBanco;
	}

	public void setIntMatBanco(Integer intMatBanco) {
		this.intMatBanco = intMatBanco;
	}

	public Long getLngIdDomicilio() {
		return lngIdDomicilio;
	}

	public void setLngIdDomicilio(Long lngIdDomicilio) {
		this.lngIdDomicilio = lngIdDomicilio;
	}

	public Integer getIntIdPuestoTitular() {
		return intIdPuestoTitular;
	}

	public void setIntIdPuestoTitular(Integer intIdPuestoTitular) {
		this.intIdPuestoTitular = intIdPuestoTitular;
	}

	public String getStrNmAreaUniversitaria() {
		return strNmAreaUniversitaria;
	}

	public void setStrNmAreaUniversitaria(String strNmAreaUniversitaria) {
		this.strNmAreaUniversitaria = strNmAreaUniversitaria;
	}

	public Integer getIntClEstatusCertificado() {
		return intClEstatusCertificado;
	}

	public void setIntClEstatusCertificado(Integer intClEstatusCertificado) {
		this.intClEstatusCertificado = intClEstatusCertificado;
	}

	public Boolean getBlnPermiteAsignarMismoNivel() {
		return blnPermiteAsignarMismoNivel;
	}

	public void setBlnPermiteAsignarMismoNivel(Boolean blnPermiteAsignarMismoNivel) {
		this.blnPermiteAsignarMismoNivel = blnPermiteAsignarMismoNivel;
	}

	public Boolean getBlnPermiteConsultarSubNiveles() {
		return blnPermiteConsultarSubNiveles;
	}

	public void setBlnPermiteConsultarSubNiveles(Boolean blnPermiteConsultarSubNiveles) {
		this.blnPermiteConsultarSubNiveles = blnPermiteConsultarSubNiveles;
	}

	public Boolean getBlnPermiteAsignarSubNivelInferior() {
		return blnPermiteAsignarSubNivelInferior;
	}

	public void setBlnPermiteAsignarSubNivelInferior(Boolean blnPermiteAsignarSubNivelInferior) {
		this.blnPermiteAsignarSubNivelInferior = blnPermiteAsignarSubNivelInferior;
	}

	public Boolean getBlnPermiteAsignarCualquierRespons() {
		return blnPermiteAsignarCualquierRespons;
	}

	public void setBlnPermiteAsignarCualquierRespons(Boolean blnPermiteAsignarCualquierRespons) {
		this.blnPermiteAsignarCualquierRespons = blnPermiteAsignarCualquierRespons;
	}

	public String getStrClaveBiblioteca() {
		return strClaveBiblioteca;
	}

	public void setStrClaveBiblioteca(String strClaveBiblioteca) {
		this.strClaveBiblioteca = strClaveBiblioteca;
	}

	public Long getLngLongitud() {
		return lngLongitud;
	}

	public void setLngLongitud(Long lngLongitud) {
		this.lngLongitud = lngLongitud;
	}

	public Long getLngLatitud() {
		return lngLatitud;
	}

	public void setLngLatitud(Long lngLatitud) {
		this.lngLatitud = lngLatitud;
	}

	public Long getLngIdCartografia() {
		return lngIdCartografia;
	}

	public void setLngIdCartografia(Long lngIdCartografia) {
		this.lngIdCartografia = lngIdCartografia;
	}

	public String getStrClave911() {
		return strClave911;
	}

	public void setStrClave911(String strClave911) {
		this.strClave911 = strClave911;
	}

	public String getStrDsReferenciasUbicacion() {
		return strDsReferenciasUbicacion;
	}

	public void setStrDsReferenciasUbicacion(String strDsReferenciasUbicacion) {
		this.strDsReferenciasUbicacion = strDsReferenciasUbicacion;
	}

	public String getStrDsCalidadCons() {
		return strDsCalidadCons;
	}

	public void setStrDsCalidadCons(String strDsCalidadCons) {
		this.strDsCalidadCons = strDsCalidadCons;
	}

	public Integer getIntClPrincipal() {
		return intClPrincipal;
	}

	public void setIntClPrincipal(Integer intClPrincipal) {
		this.intClPrincipal = intClPrincipal;
	}
}