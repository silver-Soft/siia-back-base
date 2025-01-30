package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaAspirantePosgrado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9011021074950974369L;

	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long lngIdSolicitudIngreso;

	@Column(name = "CLESTATUSSOLICITUD")
	private Integer intClEstatusSolicitud;

	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;

	@Column(name = "FCREGISTRO")
	private Date fcRegistro;

	@Column(name = "CLSPEC")
	private Integer intClSpec;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdOpcion1ProgramaEduAspirante;

	@Column(name = "EDAD")
	private Integer intIdEdad;

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	@Column(name = "NBASPIRANTE")
	private String strNombreAspirante;

	@Column(name = "APPATERNO")
	private String strApPaternoAspirante;

	@Column(name = "APMATERNO")
	private String strApMaternoAspirante;

	@Column(name = "FCNACIMIENTO")
	private Date fcNacimientoAspirante;

	@Column(name = "CURP")
	private String strCurpAspirante;

	@Column(name = "CLESTADOCIVIL")
	private Integer intIdEstadoCivilAspirante;

	@Column(name = "NBCALLE")
	private String strCalleAspirante;

	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipioLocalizacionAspirante;

	@Column(name = "CLASENTAMIENTO")
	private Long lngIdAsentamientoLocalizacionAspirante;

	@Column(name = "NMEXTERIOR")
	private String strNumeroAspirante;

	@Column(name = "IDENTIDAD")
	private Integer intIdEntidadLocalizacionAspirante;

	@Column(name = "CLGENERO")
	private Integer intIdGeneroAspirante;

	@Column(name = "NMTELEFONO")
	private Long lngTelefonoAspirante;

	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronicoAspirante;

	@Column(name = "DSESPECIALIDAD")
	private String strEspecialidadAspirante;

	@Column(name = "IDASPIRANTEPOSGRADO")
	private Long lngIdAspirantePosgrado;

	@Column(name = "FOTOGRAFIA")
	@Lob
	private byte[] archivoFoto;

	@Column(name = "CLPAISNACIMIENTO")
	private String strClPaisNacimiento;

	@Column(name = "IDENTIDADNACIMIENTO")
	private Integer intIdEntidadNacimientoAspirante;

	@Column(name = "CLAVEELECTOR")
	private String strClaveElector;

	@Column(name = "NMPASAPORTE")
	private String strNumeroPasaporte;

	@Column(name = "NACIONALIDAD")
	private String strIdPaisNacionalidadAspirante;

	@Column(name = "NMDOCTONALIDENTIDAD")
	private String strNumeroDocumentoNacionalIdentidad;

	@Column(name = "NMCELULAR")
	private Long lngTelefonoCelularAspirante;

	@Column(name = "REDESSOCIALES")
	private String strRedesSociales;

	@Column(name = "CUENTAREDSOCIAL")
	private String strCuentaRedSocial;

	@Column(name = "NMHIJOS")
	private Integer intNumeroHijos;

	@Column(name = "CLNIVELEDUCATIVOPADRE")
	private Integer intPadreIdUltimoNivelEstudios;

	@Column(name = "OCUPACIONPADRE")
	private String strPadreOcupacion;

	@Column(name = "NACIONALIDADPADRE")
	private String strPadreNacionalidad;

	@Column(name = "CLPAISNACPADRE")
	private String strPadreIdPaisNacimiento;

	@Column(name = "CDNACPADRE")
	private String strPadreCiudadNacimiento;

	@Column(name = "CLNIVELEDUCATIVOMADRE")
	private Integer intMadreIdUltimoNivelEstudios;

	@Column(name = "OCUPACIONMADRE")
	private String strMadreOcupacion;

	@Column(name = "NACIONALIDADMADRE")
	private String strMadreNacionalidad;

	@Column(name = "CLPAISNACMADRE")
	private String strMadreIdPaisNacimiento;

	@Column(name = "CDNACMADRE")
	private String strMadreCiudadNacimiento;

	@Column(name = "CLNIVELEDUCATIVOTUTOR")
	private Integer intTutorIdUltimoNivelEstudios;

	@Column(name = "OCUPACIONTUTOR")
	private String strTutorOcupacion;

	@Column(name = "NACIONALIDADTUTOR")
	private String strTutorNacionalidad;

	@Column(name = "CLPAISNACTUTOR")
	private String strTutorIdPaisNacimiento;

	@Column(name = "CDNACTUTOR")
	private String strTutorCiudadNacimiento;

	@Column(name = "CLESTATUS")
	private Integer intClEstatusSolicitudPosgrado;

	@Column(name = "PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;

	public Long getLngIdSolicitudIngreso() {
		return lngIdSolicitudIngreso;
	}

	public void setLngIdSolicitudIngreso(Long lngIdSolicitudIngreso) {
		this.lngIdSolicitudIngreso = lngIdSolicitudIngreso;
	}

	public Integer getIntClEstatusSolicitud() {
		return intClEstatusSolicitud;
	}

	public void setIntClEstatusSolicitud(Integer intClEstatusSolicitud) {
		this.intClEstatusSolicitud = intClEstatusSolicitud;
	}

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public Integer getIntIdOpcion1ProgramaEduAspirante() {
		return intIdOpcion1ProgramaEduAspirante;
	}

	public void setIntIdOpcion1ProgramaEduAspirante(Integer intIdOpcion1ProgramaEduAspirante) {
		this.intIdOpcion1ProgramaEduAspirante = intIdOpcion1ProgramaEduAspirante;
	}

	public Integer getIntIdEdad() {
		return intIdEdad;
	}

	public void setIntIdEdad(Integer intIdEdad) {
		this.intIdEdad = intIdEdad;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}

	public String getStrNombreAspirante() {
		return strNombreAspirante;
	}

	public void setStrNombreAspirante(String strNombreAspirante) {
		this.strNombreAspirante = strNombreAspirante;
	}

	public String getStrApPaternoAspirante() {
		return strApPaternoAspirante;
	}

	public void setStrApPaternoAspirante(String strApPaternoAspirante) {
		this.strApPaternoAspirante = strApPaternoAspirante;
	}

	public String getStrApMaternoAspirante() {
		return strApMaternoAspirante;
	}

	public void setStrApMaternoAspirante(String strApMaternoAspirante) {
		this.strApMaternoAspirante = strApMaternoAspirante;
	}

	public Date getFcNacimientoAspirante() {
		return fcNacimientoAspirante;
	}

	public void setFcNacimientoAspirante(Date fcNacimientoAspirante) {
		this.fcNacimientoAspirante = fcNacimientoAspirante;
	}

	public String getStrCurpAspirante() {
		return strCurpAspirante;
	}

	public void setStrCurpAspirante(String strCurpAspirante) {
		this.strCurpAspirante = strCurpAspirante;
	}

	public Integer getIntIdEstadoCivilAspirante() {
		return intIdEstadoCivilAspirante;
	}

	public void setIntIdEstadoCivilAspirante(Integer intIdEstadoCivilAspirante) {
		this.intIdEstadoCivilAspirante = intIdEstadoCivilAspirante;
	}

	public String getStrCalleAspirante() {
		return strCalleAspirante;
	}

	public void setStrCalleAspirante(String strCalleAspirante) {
		this.strCalleAspirante = strCalleAspirante;
	}

	public Long getLngIdMunicipioLocalizacionAspirante() {
		return lngIdMunicipioLocalizacionAspirante;
	}

	public void setLngIdMunicipioLocalizacionAspirante(Long lngIdMunicipioLocalizacionAspirante) {
		this.lngIdMunicipioLocalizacionAspirante = lngIdMunicipioLocalizacionAspirante;
	}

	public Long getLngIdAsentamientoLocalizacionAspirante() {
		return lngIdAsentamientoLocalizacionAspirante;
	}

	public void setLngIdAsentamientoLocalizacionAspirante(Long lngIdAsentamientoLocalizacionAspirante) {
		this.lngIdAsentamientoLocalizacionAspirante = lngIdAsentamientoLocalizacionAspirante;
	}

	public String getStrNumeroAspirante() {
		return strNumeroAspirante;
	}

	public void setStrNumeroAspirante(String strNumeroAspirante) {
		this.strNumeroAspirante = strNumeroAspirante;
	}

	public Integer getIntIdEntidadLocalizacionAspirante() {
		return intIdEntidadLocalizacionAspirante;
	}

	public void setIntIdEntidadLocalizacionAspirante(Integer intIdEntidadLocalizacionAspirante) {
		this.intIdEntidadLocalizacionAspirante = intIdEntidadLocalizacionAspirante;
	}

	public Integer getIntIdGeneroAspirante() {
		return intIdGeneroAspirante;
	}

	public void setIntIdGeneroAspirante(Integer intIdGeneroAspirante) {
		this.intIdGeneroAspirante = intIdGeneroAspirante;
	}

	public Long getLngTelefonoAspirante() {
		return lngTelefonoAspirante;
	}

	public void setLngTelefonoAspirante(Long lngTelefonoAspirante) {
		this.lngTelefonoAspirante = lngTelefonoAspirante;
	}

	public String getStrCorreoElectronicoAspirante() {
		return strCorreoElectronicoAspirante;
	}

	public void setStrCorreoElectronicoAspirante(String strCorreoElectronicoAspirante) {
		this.strCorreoElectronicoAspirante = strCorreoElectronicoAspirante;
	}

	public String getStrEspecialidadAspirante() {
		return strEspecialidadAspirante;
	}

	public void setStrEspecialidadAspirante(String strEspecialidadAspirante) {
		this.strEspecialidadAspirante = strEspecialidadAspirante;
	}

	public Long getLngIdAspirantePosgrado() {
		return lngIdAspirantePosgrado;
	}

	public void setLngIdAspirantePosgrado(Long lngIdAspirantePosgrado) {
		this.lngIdAspirantePosgrado = lngIdAspirantePosgrado;
	}

	public byte[] getArchivoFoto() {
		return archivoFoto;
	}

	public void setArchivoFoto(byte[] archivoFoto) {
		this.archivoFoto = archivoFoto;
	}

	public String getStrClPaisNacimiento() {
		return strClPaisNacimiento;
	}

	public void setStrClPaisNacimiento(String strClPaisNacimiento) {
		this.strClPaisNacimiento = strClPaisNacimiento;
	}

	public String getStrClaveElector() {
		return strClaveElector;
	}

	public void setStrClaveElector(String strClaveElector) {
		this.strClaveElector = strClaveElector;
	}

	public String getStrNumeroPasaporte() {
		return strNumeroPasaporte;
	}

	public void setStrNumeroPasaporte(String strNumeroPasaporte) {
		this.strNumeroPasaporte = strNumeroPasaporte;
	}

	public String getStrIdPaisNacionalidadAspirante() {
		return strIdPaisNacionalidadAspirante;
	}

	public void setStrIdPaisNacionalidadAspirante(String strIdPaisNacionalidadAspirante) {
		this.strIdPaisNacionalidadAspirante = strIdPaisNacionalidadAspirante;
	}

	public String getStrNumeroDocumentoNacionalIdentidad() {
		return strNumeroDocumentoNacionalIdentidad;
	}

	public void setStrNumeroDocumentoNacionalIdentidad(String strNumeroDocumentoNacionalIdentidad) {
		this.strNumeroDocumentoNacionalIdentidad = strNumeroDocumentoNacionalIdentidad;
	}

	public Long getLngTelefonoCelularAspirante() {
		return lngTelefonoCelularAspirante;
	}

	public void setLngTelefonoCelularAspirante(Long lngTelefonoCelularAspirante) {
		this.lngTelefonoCelularAspirante = lngTelefonoCelularAspirante;
	}

	public String getStrRedesSociales() {
		return strRedesSociales;
	}

	public void setStrRedesSociales(String strRedesSociales) {
		this.strRedesSociales = strRedesSociales;
	}

	public Integer getIntNumeroHijos() {
		return intNumeroHijos;
	}

	public void setIntNumeroHijos(Integer intNumeroHijos) {
		this.intNumeroHijos = intNumeroHijos;
	}

	public Integer getIntPadreIdUltimoNivelEstudios() {
		return intPadreIdUltimoNivelEstudios;
	}

	public void setIntPadreIdUltimoNivelEstudios(Integer intPadreIdUltimoNivelEstudios) {
		this.intPadreIdUltimoNivelEstudios = intPadreIdUltimoNivelEstudios;
	}

	public String getStrPadreOcupacion() {
		return strPadreOcupacion;
	}

	public void setStrPadreOcupacion(String strPadreOcupacion) {
		this.strPadreOcupacion = strPadreOcupacion;
	}

	public String getStrPadreNacionalidad() {
		return strPadreNacionalidad;
	}

	public void setStrPadreNacionalidad(String strPadreNacionalidad) {
		this.strPadreNacionalidad = strPadreNacionalidad;
	}

	public String getStrPadreIdPaisNacimiento() {
		return strPadreIdPaisNacimiento;
	}

	public void setStrPadreIdPaisNacimiento(String strPadreIdPaisNacimiento) {
		this.strPadreIdPaisNacimiento = strPadreIdPaisNacimiento;
	}

	public String getStrPadreCiudadNacimiento() {
		return strPadreCiudadNacimiento;
	}

	public void setStrPadreCiudadNacimiento(String strPadreCiudadNacimiento) {
		this.strPadreCiudadNacimiento = strPadreCiudadNacimiento;
	}

	public Integer getIntMadreIdUltimoNivelEstudios() {
		return intMadreIdUltimoNivelEstudios;
	}

	public void setIntMadreIdUltimoNivelEstudios(Integer intMadreIdUltimoNivelEstudios) {
		this.intMadreIdUltimoNivelEstudios = intMadreIdUltimoNivelEstudios;
	}

	public String getStrMadreOcupacion() {
		return strMadreOcupacion;
	}

	public void setStrMadreOcupacion(String strMadreOcupacion) {
		this.strMadreOcupacion = strMadreOcupacion;
	}

	public String getStrMadreNacionalidad() {
		return strMadreNacionalidad;
	}

	public void setStrMadreNacionalidad(String strMadreNacionalidad) {
		this.strMadreNacionalidad = strMadreNacionalidad;
	}

	public String getStrMadreIdPaisNacimiento() {
		return strMadreIdPaisNacimiento;
	}

	public void setStrMadreIdPaisNacimiento(String strMadreIdPaisNacimiento) {
		this.strMadreIdPaisNacimiento = strMadreIdPaisNacimiento;
	}

	public String getStrMadreCiudadNacimiento() {
		return strMadreCiudadNacimiento;
	}

	public void setStrMadreCiudadNacimiento(String strMadreCiudadNacimiento) {
		this.strMadreCiudadNacimiento = strMadreCiudadNacimiento;
	}

	public Integer getIntTutorIdUltimoNivelEstudios() {
		return intTutorIdUltimoNivelEstudios;
	}

	public void setIntTutorIdUltimoNivelEstudios(Integer intTutorIdUltimoNivelEstudios) {
		this.intTutorIdUltimoNivelEstudios = intTutorIdUltimoNivelEstudios;
	}

	public String getStrTutorOcupacion() {
		return strTutorOcupacion;
	}

	public void setStrTutorOcupacion(String strTutorOcupacion) {
		this.strTutorOcupacion = strTutorOcupacion;
	}

	public String getStrTutorNacionalidad() {
		return strTutorNacionalidad;
	}

	public void setStrTutorNacionalidad(String strTutorNacionalidad) {
		this.strTutorNacionalidad = strTutorNacionalidad;
	}

	public String getStrTutorIdPaisNacimiento() {
		return strTutorIdPaisNacimiento;
	}

	public void setStrTutorIdPaisNacimiento(String strTutorIdPaisNacimiento) {
		this.strTutorIdPaisNacimiento = strTutorIdPaisNacimiento;
	}

	public String getStrTutorCiudadNacimiento() {
		return strTutorCiudadNacimiento;
	}

	public void setStrTutorCiudadNacimiento(String strTutorCiudadNacimiento) {
		this.strTutorCiudadNacimiento = strTutorCiudadNacimiento;
	}

	public Integer getIntClSpec() {
		return intClSpec;
	}

	public void setIntClSpec(Integer intClSpec) {
		this.intClSpec = intClSpec;
	}

	public Integer getIntIdEntidadNacimientoAspirante() {
		return intIdEntidadNacimientoAspirante;
	}

	public void setIntIdEntidadNacimientoAspirante(Integer intIdEntidadNacimientoAspirante) {
		this.intIdEntidadNacimientoAspirante = intIdEntidadNacimientoAspirante;
	}

	public String getStrCuentaRedSocial() {
		return strCuentaRedSocial;
	}

	public void setStrCuentaRedSocial(String strCuentaRedSocial) {
		this.strCuentaRedSocial = strCuentaRedSocial;
	}

	public Integer getIntClEstatusSolicitudPosgrado() {
		return intClEstatusSolicitudPosgrado;
	}

	public void setIntClEstatusSolicitudPosgrado(Integer intClEstatusSolicitudPosgrado) {
		this.intClEstatusSolicitudPosgrado = intClEstatusSolicitudPosgrado;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

}
