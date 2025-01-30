package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSolicitudesMovilidadEst implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -172942864350504081L;

	@Id
	@Column(name = "IDSOLICITUDMOVILIDAD")
	private Long lngIdSolicitudMovilidad;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;
	
	@Column(name = "DSCONVOCATORIA")
	private String strDsConvocatoria;
	
	@Column(name = "IDTIPOMOVILIDAD")
	private Integer intIdTipoMovilidad;
	
	@Column(name = "DSTIPOMOVILIDAD")
	private String strDsTipoMovilidad;
	
	@Column(name = "IDINSTITUCIONDESTINO")
	private Long lngIdInstitucionDestino;
	
	@Column(name = "NBINSTITUCIONDESTINO")
	private String strNbInstitucionDestino;

	@Column(name = "IDENTIDADDESTINO")
	private Integer intIdEntidadDestino;
	
	@Column(name = "NBENTIDADDESTINO")
	private String strNbEntidadDestino;
	
	@Column(name = "FACULTADDESTINO")
	private String strFacultadDestino;
	
	@Column(name = "PRORAMAEDUCATIVODESTINO")
	private String strProgramaEducativoDestino;
	
	@Column(name = "DIRECCIONUNIVERSIDADDESTINO")
	private String strDireccionUniversidadDestino;
	
	@Column(name = "IDPROGRAMAMOVILIDAD")
	private Integer intProgramaMovilidad;
	
	@Column(name = "DSPROGRAMAMOVILIDAD")
	private String strDsProgramaMovilidad;
	
	@Column(name = "CLESTATUSSOLICITUDMOVILIDAD")
	private Integer intClEstatusSolicitudMovilidad;
	
	@Column(name = "DSESTATUSSOLICITUDMOVILIDAD")
	private String strDsEstatusSolicitudMovilidad;
	
	@Column(name = "IDTIPOMODALIDAD")
	private Integer intIdTipoModalidad;
	
	@Column(name = "TIPOMODALIDAD")
	private String strTipoModalidad;
	
	@Column(name = "NMPASAPORTE")
	private String strNmPasaporte;
	
	@Column(name = "CLESTATUSSOLICITUDBECA")
	private Integer intClEstatusSolictudBeca;
	
	@Column(name = "STSOLICITUDBECA")
	private String strStSolicitudBeca;
	
	@Column(name = "DSTIPOBECA")
	private String strDsTipoBeca;
	
	//@Column(name = "CLTIPOBECA")
	//private Integer intClTipoBeca;
	
	@Column(name = "NBCONTACTO")
	private String strNbContacto;
	
	@Column(name = "APPATERNOCONTACTO")
	private String strApPaternoContacto;
	
	@Column(name = "APMATERNOCONTACTO")
	private String strApMaternoContacto;
	
	@Column(name = "CLPARENTESCO")
	private Integer intClParentesco;
	
	@Column(name = "DSPARENTEZCO")
	private String strDsParentezco;
	
	@Column(name = "CORREOELECTRONICOCONTACTO")
	private String strCorreoElectronicoContacto;
	
	@Column(name = "NMCELULARCONTACTO")
	private String strNmCelularContacto;
	
	@Column(name = "IDTIPOBECAMOVILIDAD")
	private Integer intIdTipoBecaMovilidad;
	
	@Column(name = "DSTIPOBECAMOVILIDAD")
	private String strDsTipoBecaMovilidad;
	
	@Column(name = "PERMITELIMINAR")
	private boolean blnPermiteEliminar;
	
	@Column(name = "PERMITEMODICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEDESCARGAR")
	private boolean blnPermiteDescargar;

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

	public String getStrDsConvocatoria() {
		return strDsConvocatoria;
	}

	public void setStrDsConvocatoria(String strDsConvocatoria) {
		this.strDsConvocatoria = strDsConvocatoria;
	}

	public Integer getIntIdTipoMovilidad() {
		return intIdTipoMovilidad;
	}

	public void setIntIdTipoMovilidad(Integer intIdTipoMovilidad) {
		this.intIdTipoMovilidad = intIdTipoMovilidad;
	}

	public String getStrDsTipoMovilidad() {
		return strDsTipoMovilidad;
	}

	public void setStrDsTipoMovilidad(String strDsTipoMovilidad) {
		this.strDsTipoMovilidad = strDsTipoMovilidad;
	}

	public Long getLngIdInstitucionDestino() {
		return lngIdInstitucionDestino;
	}

	public void setLngIdInstitucionDestino(Long lngIdInstitucionDestino) {
		this.lngIdInstitucionDestino = lngIdInstitucionDestino;
	}

	public String getStrNbInstitucionDestino() {
		return strNbInstitucionDestino;
	}

	public void setStrNbInstitucionDestino(String strNbInstitucionDestino) {
		this.strNbInstitucionDestino = strNbInstitucionDestino;
	}

	public Integer getIntIdEntidadDestino() {
		return intIdEntidadDestino;
	}

	public void setIntIdEntidadDestino(Integer intIdEntidadDestino) {
		this.intIdEntidadDestino = intIdEntidadDestino;
	}

	public String getStrNbEntidadDestino() {
		return strNbEntidadDestino;
	}

	public void setStrNbEntidadDestino(String strNbEntidadDestino) {
		this.strNbEntidadDestino = strNbEntidadDestino;
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

	public String getStrDsProgramaMovilidad() {
		return strDsProgramaMovilidad;
	}

	public void setStrDsProgramaMovilidad(String strDsProgramaMovilidad) {
		this.strDsProgramaMovilidad = strDsProgramaMovilidad;
	}

	public Integer getIntClEstatusSolicitudMovilidad() {
		return intClEstatusSolicitudMovilidad;
	}

	public void setIntClEstatusSolicitudMovilidad(Integer intClEstatusSolicitudMovilidad) {
		this.intClEstatusSolicitudMovilidad = intClEstatusSolicitudMovilidad;
	}

	public String getStrDsEstatusSolicitudMovilidad() {
		return strDsEstatusSolicitudMovilidad;
	}

	public void setStrDsEstatusSolicitudMovilidad(String strDsEstatusSolicitudMovilidad) {
		this.strDsEstatusSolicitudMovilidad = strDsEstatusSolicitudMovilidad;
	}

	public Integer getIntIdTipoModalidad() {
		return intIdTipoModalidad;
	}

	public void setIntIdTipoModalidad(Integer intIdTipoModalidad) {
		this.intIdTipoModalidad = intIdTipoModalidad;
	}

	public String getStrTipoModalidad() {
		return strTipoModalidad;
	}

	public void setStrTipoModalidad(String strTipoModalidad) {
		this.strTipoModalidad = strTipoModalidad;
	}

	public String getStrNmPasaporte() {
		return strNmPasaporte;
	}

	public void setStrNmPasaporte(String strNmPasaporte) {
		this.strNmPasaporte = strNmPasaporte;
	}

	public Integer getIntClEstatusSolictudBeca() {
		return intClEstatusSolictudBeca;
	}

	public void setIntClEstatusSolictudBeca(Integer intClEstatusSolictudBeca) {
		this.intClEstatusSolictudBeca = intClEstatusSolictudBeca;
	}

	public String getStrStSolicitudBeca() {
		return strStSolicitudBeca;
	}

	public void setStrStSolicitudBeca(String strStSolicitudBeca) {
		this.strStSolicitudBeca = strStSolicitudBeca;
	}

	public String getStrDsTipoBeca() {
		return strDsTipoBeca;
	}

	public void setStrDsTipoBeca(String strDsTipoBeca) {
		this.strDsTipoBeca = strDsTipoBeca;
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

	public String getStrDsParentezco() {
		return strDsParentezco;
	}

	public void setStrDsParentezco(String strDsParentezco) {
		this.strDsParentezco = strDsParentezco;
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

	public String getStrDsTipoBecaMovilidad() {
		return strDsTipoBecaMovilidad;
	}

	public void setStrDsTipoBecaMovilidad(String strDsTipoBecaMovilidad) {
		this.strDsTipoBecaMovilidad = strDsTipoBecaMovilidad;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public boolean isBlnPermiteDescargar() {
		return blnPermiteDescargar;
	}

	public void setBlnPermiteDescargar(boolean blnPermiteDescargar) {
		this.blnPermiteDescargar = blnPermiteDescargar;
	}
	
	
	
}
