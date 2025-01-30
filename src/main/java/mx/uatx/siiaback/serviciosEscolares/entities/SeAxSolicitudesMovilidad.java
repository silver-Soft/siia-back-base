package mx.uatx.siiaback.serviciosEscolares.entities;

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
@Table(schema = "SERESC", name="SEAXSOLICITUDESMOVILIDAD")
public class SeAxSolicitudesMovilidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5391770552400896641L;
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSOLICITUDMOVILIDAD", sequenceName = "SERESC.IDSOLICITUDMOVILIDAD", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSOLICITUDMOVILIDAD")
	
	@Column(name = "IDSOLICITUDMOVILIDAD")
	private Long lngIdSolicitudMovilidad;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;
	
	@Column(name = "IDTIPOMOVILIDAD")
	private Integer intIdTipoMovilidad;
	
	@Column(name = "IDINSTITUCIONDESTINO")
	private Long lngIdInstitucionDestino;

	@Column(name = "IDENTIDADDESTINO")
	private Integer intIdEntidadDestino;
	
	@Column(name = "FACULTADDESTINO")
	private String strFacultadDestino;
	
	@Column(name = "PRORAMAEDUCATIVODESTINO")
	private String strProgramaEducativoDestino;
	
	@Column(name = "DIRECCIONUNIVERSIDADDESTINO")
	private String strDireccionUniversidadDestino;
	
	@Column(name = "IDPROGRAMAMOVILIDAD")
	private Integer intProgramaMovilidad;
	
	@Column(name = "CLESTATUSSOLICITUDMOVILIDAD")
	private Integer intClEstatusSolicitudMovilidad;
	
	@Column(name = "IDTIPOMODALIDAD")
	private Integer intIdTipoModalidad;
	
	@Column(name = "NMPASAPORTE")
	private String strNmPasaporte;
	
	@Column(name = "CLTIPOBECA")
	private Integer intClTipoBeca;
	
	@Column(name = "NBCONTACTO")
	private String strNbContacto;
	
	@Column(name = "APPATERNOCONTACTO")
	private String strApPaternoContacto;
	
	@Column(name = "APMATERNOCONTACTO")
	private String strApMaternoContacto;
	
	@Column(name = "CLPARENTESCO")
	private Integer intClParentesco;
	
	@Column(name = "CORREOELECTRONICOCONTACTO")
	private String strCorreoElectronicoContacto;
	
	@Column(name = "NMCELULARCONTACTO")
	private String strNmCelularContacto;
	
	@Column(name = "IDTIPOBECAMOVILIDAD")
	private Integer intIdTipoBecaMovilidad;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdSolicitudMovilidad() {
		return lngIdSolicitudMovilidad;
	}

	public void setLngIdSolicitudMovilidad(Long lngIdSolicitudMovilidad) {
		this.lngIdSolicitudMovilidad = lngIdSolicitudMovilidad;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public Integer getIntIdTipoMovilidad() {
		return intIdTipoMovilidad;
	}

	public void setIntIdTipoMovilidad(Integer intIdTipoMovilidad) {
		this.intIdTipoMovilidad = intIdTipoMovilidad;
	}

	public Long getLngIdInstitucionDestino() {
		return lngIdInstitucionDestino;
	}

	public void setLngIdInstitucionDestino(Long lngIdInstitucionDestino) {
		this.lngIdInstitucionDestino = lngIdInstitucionDestino;
	}

	public Integer getIntIdEntidadDestino() {
		return intIdEntidadDestino;
	}

	public void setIntIdEntidadDestino(Integer intIdEntidadDestino) {
		this.intIdEntidadDestino = intIdEntidadDestino;
	}

	public String getStrFacultadDestino() {
		return strFacultadDestino;
	}

	public void setStrFacultadDestino(String strFacultadDestino) {
		this.strFacultadDestino = strFacultadDestino;
	}

	public String getStrProgramaEducativoDestino() {
		return strProgramaEducativoDestino;
	}

	public void setStrProgramaEducativoDestino(String strProgramaEducativoDestino) {
		this.strProgramaEducativoDestino = strProgramaEducativoDestino;
	}

	public String getStrDireccionUniversidadDestino() {
		return strDireccionUniversidadDestino;
	}

	public void setStrDireccionUniversidadDestino(String strDireccionUniversidadDestino) {
		this.strDireccionUniversidadDestino = strDireccionUniversidadDestino;
	}

	public Integer getIntProgramaMovilidad() {
		return intProgramaMovilidad;
	}

	public void setIntProgramaMovilidad(Integer intProgramaMovilidad) {
		this.intProgramaMovilidad = intProgramaMovilidad;
	}

	public Integer getIntClEstatusSolicitudMovilidad() {
		return intClEstatusSolicitudMovilidad;
	}

	public void setIntClEstatusSolicitudMovilidad(Integer intClEstatusSolicitudMovilidad) {
		this.intClEstatusSolicitudMovilidad = intClEstatusSolicitudMovilidad;
	}

	public Integer getIntIdTipoModalidad() {
		return intIdTipoModalidad;
	}

	public void setIntIdTipoModalidad(Integer intIdTipoModalidad) {
		this.intIdTipoModalidad = intIdTipoModalidad;
	}

	public String getStrNmPasaporte() {
		return strNmPasaporte;
	}

	public void setStrNmPasaporte(String strNmPasaporte) {
		this.strNmPasaporte = strNmPasaporte;
	}

	public Integer getIntClTipoBeca() {
		return intClTipoBeca;
	}

	public void setIntClTipoBeca(Integer intClTipoBeca) {
		this.intClTipoBeca = intClTipoBeca;
	}

	public String getStrNbContacto() {
		return strNbContacto;
	}

	public void setStrNbContacto(String strNbContacto) {
		this.strNbContacto = strNbContacto;
	}

	public String getStrApPaternoContacto() {
		return strApPaternoContacto;
	}

	public void setStrApPaternoContacto(String strApPaternoContacto) {
		this.strApPaternoContacto = strApPaternoContacto;
	}

	public String getStrApMaternoContacto() {
		return strApMaternoContacto;
	}

	public void setStrApMaternoContacto(String strApMaternoContacto) {
		this.strApMaternoContacto = strApMaternoContacto;
	}

	public Integer getIntClParentesco() {
		return intClParentesco;
	}

	public void setIntClParentesco(Integer intClParentesco) {
		this.intClParentesco = intClParentesco;
	}

	public String getStrCorreoElectronicoContacto() {
		return strCorreoElectronicoContacto;
	}

	public void setStrCorreoElectronicoContacto(String strCorreoElectronicoContacto) {
		this.strCorreoElectronicoContacto = strCorreoElectronicoContacto;
	}

	public String getStrNmCelularContacto() {
		return strNmCelularContacto;
	}

	public void setStrNmCelularContacto(String strNmCelularContacto) {
		this.strNmCelularContacto = strNmCelularContacto;
	}

	public Integer getIntIdTipoBecaMovilidad() {
		return intIdTipoBecaMovilidad;
	}

	public void setIntIdTipoBecaMovilidad(Integer intIdTipoBecaMovilidad) {
		this.intIdTipoBecaMovilidad = intIdTipoBecaMovilidad;
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
