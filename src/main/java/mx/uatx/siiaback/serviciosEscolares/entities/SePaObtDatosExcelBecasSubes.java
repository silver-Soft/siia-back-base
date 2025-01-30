package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosExcelBecasSubes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1548831317448062066L;
	@Id
	@Column(name = "IDREGISTROPRONABES")
	private Long lngIdRegistroPronabes;
	
	@Column(name = "NOPROG")
	private Integer intNoProg;
	
	@Column(name = "FOLIO")
	private Long lngFolio;

	@Column(name = "CURP")
	private String strCurp;
	
	@Column(name = "APELLIDOPATERNO")
	private String strApellidoPaterno;

	@Column(name = "APELLIDOMATERNO")
	private String strApellidoMaterno;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "FCNACIMIENTO")
	private String strFcNacimiento;
	
	@Column(name = "EDADACTUAL")
	private Integer intEdadActual;
	
	@Column(name = "ENTIDADNACIMIENTO")
	private String strEntidadNacimiento;
	
	@Column(name = "GENERO")
	private String strGenero;

	@Column(name = "ESTADOCIVIL")
	private String strEstadoCivil;
	
	@Column(name = "NACIONALIDAD")
	private String strNacionalidad;
	
	@Column(name = "TELEFONOFIJO")
	private String strTelefonoFijo;
	
	@Column(name = "TELEFONOCELULAR")
	private String strTelefonoCelular;
	
	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronico;
	
	@Column(name = "CALLE")
	private String strCalle;
	
	@Column(name = "NUMERO")
	private String strNumero;
	
	@Column(name = "COLONIA")
	private String strColonia;
	
	@Column(name = "LOCALIDAD")
	private String strLocalidad;
	
	@Column(name = "NBMUNICIPIO")
	private String strNmMunicipio;
	
	@Column(name = "ENTIDAD")
	private String strEntidad;
	
	@Column(name = "CP")
	private String strCP;
	
	@Column(name = "ZONADERESIDENCIA")
	private String strZonaResidencia;
	
	@Column(name = "GRUPOINDIGENA")
	private String strGrupoIndigena;
	
	@Column(name = "FAMILIARBENEFICIOOPORTUNIDADES")
	private String strFamiliarBeneficioOportunidades;
	
	@Column(name = "FOLIOFAMILIARBENEFICIOOPOR")
	private String strFolioFamiliarBeneficioOpor;
	
	@Column(name = "ALUMNAEMBARAZADA")
	private String strAlumnaEmbarazada;
	
	@Column(name = "ESMADREOPADRE")
	private String strEsMadreoPadre;
	
	@Column(name = "DISCAPCITADO")
	private String strDiscapacitado;
	
	@Column(name = "TIPODISCAPACIDAD")
	private String strTipoDiscacidad;
	
	@Column(name = "MUNICIPIODONDEESTUDIA")
	private String strMunicipioDondeEstudia;
	
	@Column(name = "INSTITUCIONDONDEESTUDIA")
	private String strInstitucionDondeEstudia;
	
	@Column(name = "CARRERA")
	private String strCarrera;
	
	@Column(name = "CLAVECARRERA")
	private String strClaveCarrera;
	
	@Column(name = "DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;
	
	@Column(name = "TOTALDEPERIODOS")
	private Integer intTotaldePeriodos;
	
	@Column(name = "TIPODEPERIODO")
	private String strTipodePeriodo;
	
	@Column(name = "INSCRITOALSEMESTRE")
	private String strInscritoalSemestre;
	
	@Column(name = "PROMEDIOGENERAL")
	private BigDecimal promedioGeneral;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "ALUMNOREGULAR")
	private String strAlumnoRegular;
	
	@Column(name = "INGRESOFAMILIAR")
	private Integer intIngresoFamiliar;
	
	@Column(name = "NUMERODEINTEGRANTESENELHOGAR")
	private Integer intNumnerodeIntegrantesenelHogar;
	
	@Column(name = "GASTOMENSUALPORTRANSPORTE")
	private Integer intGastoMensualPorTransporte;

	@Column(name = "TIPOSOLICITUDDEBECA")
	private String strTipoSolicituddeBeca;
	
	@Column(name = "NUMERODELATARJETABANCARIA")
	private Long lngNumerodelaTarjetBancaria;
	
	@Column(name = "MONTODELABECA")
	private Integer intMontodelaBeca;
	
	@Column(name = "NOMBREBECA")
	private String strNombreBeca;


	public SePaObtDatosExcelBecasSubes() {
		super();
	}
	
	public Long getLngIdRegistroPronabes() {
		return lngIdRegistroPronabes;
	}

	public void setLngIdRegistroPronabes(Long lngIdRegistroPronabes) {
		this.lngIdRegistroPronabes = lngIdRegistroPronabes;
	}

	public Integer getIntNoProg() {
		return intNoProg;
	}

	public void setIntNoProg(Integer intNoProg) {
		this.intNoProg = intNoProg;
	}

	public Long getLngFolio() {
		return lngFolio;
	}

	public void setLngFolio(Long lngFolio) {
		this.lngFolio = lngFolio;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrFcNacimiento() {
		return strFcNacimiento;
	}

	public void setStrFcNacimiento(String strFcNacimiento) {
		this.strFcNacimiento = strFcNacimiento;
	}

	public Integer getIntEdadActual() {
		return intEdadActual;
	}

	public void setIntEdadActual(Integer intEdadActual) {
		this.intEdadActual = intEdadActual;
	}

	public String getStrEntidadNacimiento() {
		return strEntidadNacimiento;
	}

	public void setStrEntidadNacimiento(String strEntidadNacimiento) {
		this.strEntidadNacimiento = strEntidadNacimiento;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public String getStrEstadoCivil() {
		return strEstadoCivil;
	}

	public void setStrEstadoCivil(String strEstadoCivil) {
		this.strEstadoCivil = strEstadoCivil;
	}

	public String getStrNacionalidad() {
		return strNacionalidad;
	}

	public void setStrNacionalidad(String strNacionalidad) {
		this.strNacionalidad = strNacionalidad;
	}

	public String getStrTelefonoFijo() {
		return strTelefonoFijo;
	}

	public void setStrTelefonoFijo(String strTelefonoFijo) {
		this.strTelefonoFijo = strTelefonoFijo;
	}

	public String getStrTelefonoCelular() {
		return strTelefonoCelular;
	}

	public void setStrTelefonoCelular(String strTelefonoCelular) {
		this.strTelefonoCelular = strTelefonoCelular;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrCalle() {
		return strCalle;
	}

	public void setStrCalle(String strCalle) {
		this.strCalle = strCalle;
	}

	public String getStrNumero() {
		return strNumero;
	}

	public void setStrNumero(String strNumero) {
		this.strNumero = strNumero;
	}

	public String getStrLocalidad() {
		return strLocalidad;
	}

	public void setStrLocalidad(String strLocalidad) {
		this.strLocalidad = strLocalidad;
	}

	public String getStrNmMunicipio() {
		return strNmMunicipio;
	}

	public void setStrNmMunicipio(String strNmMunicipio) {
		this.strNmMunicipio = strNmMunicipio;
	}

	public String getStrEntidad() {
		return strEntidad;
	}

	public void setStrEntidad(String strEntidad) {
		this.strEntidad = strEntidad;
	}

	public String getStrCP() {
		return strCP;
	}

	public void setStrCP(String strCP) {
		this.strCP = strCP;
	}

	public String getStrZonaResidencia() {
		return strZonaResidencia;
	}

	public void setStrZonaResidencia(String strZonaResidencia) {
		this.strZonaResidencia = strZonaResidencia;
	}

	public String getStrGrupoIndigena() {
		return strGrupoIndigena;
	}

	public void setStrGrupoIndigena(String strGrupoIndigena) {
		this.strGrupoIndigena = strGrupoIndigena;
	}

	public String getStrFamiliarBeneficioOportunidades() {
		return strFamiliarBeneficioOportunidades;
	}

	public void setStrFamiliarBeneficioOportunidades(String strFamiliarBeneficioOportunidades) {
		this.strFamiliarBeneficioOportunidades = strFamiliarBeneficioOportunidades;
	}

	public String getStrFolioFamiliarBeneficioOpor() {
		return strFolioFamiliarBeneficioOpor;
	}

	public void setStrFolioFamiliarBeneficioOpor(String strFolioFamiliarBeneficioOpor) {
		this.strFolioFamiliarBeneficioOpor = strFolioFamiliarBeneficioOpor;
	}

	public String getStrAlumnaEmbarazada() {
		return strAlumnaEmbarazada;
	}

	public void setStrAlumnaEmbarazada(String strAlumnaEmbarazada) {
		this.strAlumnaEmbarazada = strAlumnaEmbarazada;
	}

	public String getStrEsMadreoPadre() {
		return strEsMadreoPadre;
	}

	public void setStrEsMadreoPadre(String strEsMadreoPadre) {
		this.strEsMadreoPadre = strEsMadreoPadre;
	}

	public String getStrDiscapacitado() {
		return strDiscapacitado;
	}

	public void setStrDiscapacitado(String strDiscapacitado) {
		this.strDiscapacitado = strDiscapacitado;
	}

	public String getStrTipoDiscacidad() {
		return strTipoDiscacidad;
	}

	public void setStrTipoDiscacidad(String strTipoDiscacidad) {
		this.strTipoDiscacidad = strTipoDiscacidad;
	}

	public String getStrMunicipioDondeEstudia() {
		return strMunicipioDondeEstudia;
	}

	public void setStrMunicipioDondeEstudia(String strMunicipioDondeEstudia) {
		this.strMunicipioDondeEstudia = strMunicipioDondeEstudia;
	}

	public String getStrInstitucionDondeEstudia() {
		return strInstitucionDondeEstudia;
	}

	public void setStrInstitucionDondeEstudia(String strInstitucionDondeEstudia) {
		this.strInstitucionDondeEstudia = strInstitucionDondeEstudia;
	}

	public String getStrCarrera() {
		return strCarrera;
	}

	public void setStrCarrera(String strCarrera) {
		this.strCarrera = strCarrera;
	}

	public String getStrClaveCarrera() {
		return strClaveCarrera;
	}

	public void setStrClaveCarrera(String strClaveCarrera) {
		this.strClaveCarrera = strClaveCarrera;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
	}

	public Integer getIntTotaldePeriodos() {
		return intTotaldePeriodos;
	}

	public void setIntTotaldePeriodos(Integer intTotaldePeriodos) {
		this.intTotaldePeriodos = intTotaldePeriodos;
	}

	public String getStrTipodePeriodo() {
		return strTipodePeriodo;
	}

	public void setStrTipodePeriodo(String strTipodePeriodo) {
		this.strTipodePeriodo = strTipodePeriodo;
	}

	public String getStrInscritoalSemestre() {
		return strInscritoalSemestre;
	}

	public void setStrInscritoalSemestre(String strInscritoalSemestre) {
		this.strInscritoalSemestre = strInscritoalSemestre;
	}

	public BigDecimal getPromedioGeneral() {
		return promedioGeneral;
	}

	public void setPromedioGeneral(BigDecimal promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrAlumnoRegular() {
		return strAlumnoRegular;
	}

	public void setStrAlumnoRegular(String strAlumnoRegular) {
		this.strAlumnoRegular = strAlumnoRegular;
	}

	public Integer getIntIngresoFamiliar() {
		return intIngresoFamiliar;
	}

	public void setIntIngresoFamiliar(Integer intIngresoFamiliar) {
		this.intIngresoFamiliar = intIngresoFamiliar;
	}

	public Integer getIntNumnerodeIntegrantesenelHogar() {
		return intNumnerodeIntegrantesenelHogar;
	}

	public void setIntNumnerodeIntegrantesenelHogar(Integer intNumnerodeIntegrantesenelHogar) {
		this.intNumnerodeIntegrantesenelHogar = intNumnerodeIntegrantesenelHogar;
	}

	

	public Integer getIntGastoMensualPorTransporte() {
		return intGastoMensualPorTransporte;
	}

	public void setIntGastoMensualPorTransporte(Integer intGastoMensualPorTransporte) {
		this.intGastoMensualPorTransporte = intGastoMensualPorTransporte;
	}

	public Integer getIntMontodelaBeca() {
		return intMontodelaBeca;
	}

	public void setIntMontodelaBeca(Integer intMontodelaBeca) {
		this.intMontodelaBeca = intMontodelaBeca;
	}

	public String getStrTipoSolicituddeBeca() {
		return strTipoSolicituddeBeca;
	}

	public void setStrTipoSolicituddeBeca(String strTipoSolicituddeBeca) {
		this.strTipoSolicituddeBeca = strTipoSolicituddeBeca;
	}

	public Long getLngNumerodelaTarjetBancaria() {
		return lngNumerodelaTarjetBancaria;
	}

	public void setLngNumerodelaTarjetBancaria(Long lngNumerodelaTarjetBancaria) {
		this.lngNumerodelaTarjetBancaria = lngNumerodelaTarjetBancaria;
	}

	
	public String getStrColonia() {
		return strColonia;
	}

	public void setStrColonia(String strColonia) {
		this.strColonia = strColonia;
	}

	public String getStrNombreBeca() {
		return strNombreBeca;
	}

	public void setStrNombreBeca(String strNombreBeca) {
		this.strNombreBeca = strNombreBeca;
	}
	
	
}
