package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="SIIUAT.SIAXTRANSINFORMACIONCURRICULAR")
public class SiAxTransInformacionCurricular implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8982365281673333117L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDINFORMACIONCURRICULAR", sequenceName = "SIIUAT.IDINFORMACIONCURRICULAR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDINFORMACIONCURRICULAR")
    @NotNull
    
    @Column(name = "IDINFORMACIONCURRICULAR")
	private Long lngIdInformacionCurricular;
	
	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "CARGO")
	private String strCargo;
	
	@Column(name = "NIVELCARGO")
	private String strNivelCargo;
	
	@Column(name = "FCALTACARGO")
	private Date dtFcAltaCargo;
	
	@Column(name = "NOMBRAMIENTO")
	private String strNombramiento;
	
	@Column(name = "AREAADSCRIPCION")
	private String strAreaAdscripcion;
	
	@Column(name = "GRADOMAXIMOESTUDIOS")
	private String strGradoMaximoEstudios;
	
	@Column(name = "LICENCIATURA")
	private String strLicenciatura;
	
	@Column(name = "CLESTATUSSANCIONES")
	private Integer intClEstatusSanciones;

	@Lob
    @Column(name = "RESOLUCION")
    private byte[] btResolucion;
	
	@Column(name = "INFORMACIONADICIONAL")
	private String strInformacionAdicional;
	
	@Column(name = "TIPOVIACARGO")
	private String strTipoViaCargo;
	
	@Column(name = "NBVIACARGO")
	private String strNbViaCargo;
	
	@Column(name = "NMEXTERIORCARGO")
	private String strNmExteriorCargo;
	
	@Column(name = "NMINTERIORCARGO")
	private String strNmInteriorCargo;
	
	@Column(name = "TIPOASENTAMIENTOCARGO")
	private String strTipoAsentamientoCargo;
	
	@Column(name = "NBASENTAMIENTOCARGO")
	private String strNmAsentamientoCargo;
	
	@Column(name = "CLAVELOCALIDADCARGO")
	private String strClaveLocalidadCargo;
	
	@Column(name = "NBLOCALIDADCARGO")
	private String strNbLocalidadCargo;
	
	@Column(name = "CLAVEMUNICIPIOCARGO")
	private String strClaveMunicipioCargo;
	
	@Column(name = "NBMUNICIPIOCARGO")
	private String strNbMunicipioCargo;
	
	@Column(name = "CLAVEENTIDADCARGO")
	private String strClaveEntidadCargo;
	
	@Column(name = "NBENTIDADCARGO")
	private String strNbEntidadCargo;
	
	@Column(name = "CODIGOPOSTALCARGO")
	private String strCodigoPostalCargo;
	
	@Column(name = "NMTELEFONOCARGO")
	private String strNmTelefonoCargo;
	
	@Column(name = "CORREOOFICIALCARGO")
	private String strCorreoOficialCargo;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;
	
	@Column(name = "CLESTATUSVALIDADO")
    private Integer intClEstatusValidado;

	
	public Integer getIntClEstatusValidado() {
		return intClEstatusValidado;
	}

	public void setIntClEstatusValidado(Integer intClEstatusValidado) {
		this.intClEstatusValidado = intClEstatusValidado;
	}

	public Long getLngIdInformacionCurricular() {
		return lngIdInformacionCurricular;
	}

	public void setLngIdInformacionCurricular(Long lngIdInformacionCurricular) {
		this.lngIdInformacionCurricular = lngIdInformacionCurricular;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrNivelCargo() {
		return strNivelCargo;
	}

	public void setStrNivelCargo(String strNivelCargo) {
		this.strNivelCargo = strNivelCargo;
	}

	public Date getDtFcAltaCargo() {
		return dtFcAltaCargo;
	}

	public void setDtFcAltaCargo(Date dtFcAltaCargo) {
		this.dtFcAltaCargo = dtFcAltaCargo;
	}

	public String getStrNombramiento() {
		return strNombramiento;
	}

	public void setStrNombramiento(String strNombramiento) {
		this.strNombramiento = strNombramiento;
	}

	public String getStrAreaAdscripcion() {
		return strAreaAdscripcion;
	}

	public void setStrAreaAdscripcion(String strAreaAdscripcion) {
		this.strAreaAdscripcion = strAreaAdscripcion;
	}

	public String getStrGradoMaximoEstudios() {
		return strGradoMaximoEstudios;
	}

	public void setStrGradoMaximoEstudios(String strGradoMaximoEstudios) {
		this.strGradoMaximoEstudios = strGradoMaximoEstudios;
	}

	public String getStrLicenciatura() {
		return strLicenciatura;
	}

	public void setStrLicenciatura(String strLicenciatura) {
		this.strLicenciatura = strLicenciatura;
	}

	public Integer getIntClEstatusSanciones() {
		return intClEstatusSanciones;
	}

	public void setIntClEstatusSanciones(Integer intClEstatusSanciones) {
		this.intClEstatusSanciones = intClEstatusSanciones;
	}

	public byte[] getBtResolucion() {
		return btResolucion;
	}

	public void setBtResolucion(byte[] btResolucion) {
		this.btResolucion = btResolucion;
	}

	public String getStrInformacionAdicional() {
		return strInformacionAdicional;
	}

	public void setStrInformacionAdicional(String strInformacionAdicional) {
		this.strInformacionAdicional = strInformacionAdicional;
	}

	public String getStrTipoViaCargo() {
		return strTipoViaCargo;
	}

	public void setStrTipoViaCargo(String strTipoViaCargo) {
		this.strTipoViaCargo = strTipoViaCargo;
	}

	public String getStrNbViaCargo() {
		return strNbViaCargo;
	}

	public void setStrNbViaCargo(String strNbViaCargo) {
		this.strNbViaCargo = strNbViaCargo;
	}

	public String getStrNmExteriorCargo() {
		return strNmExteriorCargo;
	}

	public void setStrNmExteriorCargo(String strNmExteriorCargo) {
		this.strNmExteriorCargo = strNmExteriorCargo;
	}

	public String getStrNmInteriorCargo() {
		return strNmInteriorCargo;
	}

	public void setStrNmInteriorCargo(String strNmInteriorCargo) {
		this.strNmInteriorCargo = strNmInteriorCargo;
	}

	public String getStrTipoAsentamientoCargo() {
		return strTipoAsentamientoCargo;
	}

	public void setStrTipoAsentamientoCargo(String strTipoAsentamientoCargo) {
		this.strTipoAsentamientoCargo = strTipoAsentamientoCargo;
	}

	public String getStrNmAsentamientoCargo() {
		return strNmAsentamientoCargo;
	}

	public void setStrNmAsentamientoCargo(String strNmAsentamientoCargo) {
		this.strNmAsentamientoCargo = strNmAsentamientoCargo;
	}

	public String getStrClaveLocalidadCargo() {
		return strClaveLocalidadCargo;
	}

	public void setStrClaveLocalidadCargo(String strClaveLocalidadCargo) {
		this.strClaveLocalidadCargo = strClaveLocalidadCargo;
	}

	public String getStrNbLocalidadCargo() {
		return strNbLocalidadCargo;
	}

	public void setStrNbLocalidadCargo(String strNbLocalidadCargo) {
		this.strNbLocalidadCargo = strNbLocalidadCargo;
	}

	public String getStrClaveMunicipioCargo() {
		return strClaveMunicipioCargo;
	}

	public void setStrClaveMunicipioCargo(String strClaveMunicipioCargo) {
		this.strClaveMunicipioCargo = strClaveMunicipioCargo;
	}

	public String getStrNbMunicipioCargo() {
		return strNbMunicipioCargo;
	}

	public void setStrNbMunicipioCargo(String strNbMunicipioCargo) {
		this.strNbMunicipioCargo = strNbMunicipioCargo;
	}

	public String getStrClaveEntidadCargo() {
		return strClaveEntidadCargo;
	}

	public void setStrClaveEntidadCargo(String strClaveEntidadCargo) {
		this.strClaveEntidadCargo = strClaveEntidadCargo;
	}

	public String getStrNbEntidadCargo() {
		return strNbEntidadCargo;
	}

	public void setStrNbEntidadCargo(String strNbEntidadCargo) {
		this.strNbEntidadCargo = strNbEntidadCargo;
	}

	public String getStrCodigoPostalCargo() {
		return strCodigoPostalCargo;
	}

	public void setStrCodigoPostalCargo(String strCodigoPostalCargo) {
		this.strCodigoPostalCargo = strCodigoPostalCargo;
	}

	public String getStrNmTelefonoCargo() {
		return strNmTelefonoCargo;
	}

	public void setStrNmTelefonoCargo(String strNmTelefonoCargo) {
		this.strNmTelefonoCargo = strNmTelefonoCargo;
	}

	public String getStrCorreoOficialCargo() {
		return strCorreoOficialCargo;
	}

	public void setStrCorreoOficialCargo(String strCorreoOficialCargo) {
		this.strCorreoOficialCargo = strCorreoOficialCargo;
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
	
	

}
