package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRespEgresados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8913160150182394250L;

	@Id
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "AP_PATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "CAMPUS")
	private String strCampus;

	@Column(name = "P_825")
	private String strDomicilioCalle;

	@Column(name = "P_826")
	private Integer intDomicilioNumero;

	@Column(name = "P_827")
	private String strDomicilioColonia;

	@Column(name = "P_828")
	private String strDomicilioLocalidad;

	@Column(name = "P_829")
	private String strDomicilioMunicipio;

	@Column(name = "P_830")
	private Integer intDomicilioCP;

	@Column(name = "P_831")
	private Long lngDomicilioTelCasa;

	@Column(name = "P_832")
	private Long lngDomicilioTelCel;

	@Column(name = "P_833")
	private String strDomicilioCorreoElec;

	@Column(name = "P_834")
	private String strDomicilioFacebook;

	@Column(name = "P_835")
	private String strDomicilioTwitter;

	@Column(name = "P_836")
	private String strSexo;

	@Column(name = "P_961")
	private Integer intEdad;

	@Column(name = "P_838")
	private String strEstadoCivil;

	@Column(name = "P_1065")
	private String strOcupacion;

	@Column(name = "P_1184")
	private String strEspecificaOcupacion;

	@Column(name = "P_1067")
	private Integer intEstudiosConcluidos;

	@Column(name = "P_1068")
	private Integer intPersonasIngresoFamiliar;

	@Column(name = "P_1069")
	private Integer intIngresoFamiliar;

	@Column(name = "P_1070")
	private Integer intFuentesEconomicas;

	@Column(name = "P_1071")
	private String strTitulo;

	@Column(name = "P_1072")
	private String strCedula;

	@Column(name = "P_1073")
	private String strOpcionTitulado;

	@Column(name = "P_1074")
	private String strTiempoEgresoaTitulacion;

	@Column(name = "P_1075")
	private String strActividadesSerSoc;

	@Column(name = "P_1185")
	private String strEspecificaActividadesSerSoc;

	@Column(name = "P_1076")
	private String strActividadesPracPro;

	@Column(name = "P_1077")
	private String strEstudioPosteriorLic;

	@Column(name = "P_1078")
	private String strEspecificaEstudioPosteriorLic;

	@Column(name = "P_1079")
	private String strTipoInstitucion;

	@Column(name = "P_1080")
	private String strAreaEstudios;

	@Column(name = "P_1081")
	private String strDificultadConseguirEmpleo;

	@Column(name = "P_1271")
	private String strEspecificaDificultadConseguirEmpleo;

	@Column(name = "P_1082")
	private String strTiempoPrimerEmpleo;

	@Column(name = "P_1083")
	private Integer intNumEmpleos;

	@Column(name = "P_1084")
	private String strRazonContratado;

	@Column(name = "P_1186")
	private String strEspecificaRazonContratado;

	@Column(name = "P_1085")
	private String strOrgEmpresaEmpleoActual;

	@Column(name = "P_1187")
	private String strEspecificaOrgEmpresaEmpleoAct;

	@Column(name = "P_1086")
	private String strTipoActividadEmpleo;

	@Column(name = "P_1087")
	private String strTipoContratoEmpleo;

	@Column(name = "P_1088")
	private String strTiempoJornadaLaboral;

	@Column(name = "P_1089")
	private String strCoincidenciaEmpleoPerfil;

	@Column(name = "P_1090")
	private String strRequisitosDesempeñoEmpleo;

	@Column(name = "P_1091")
	private Long lngSalarioMensual;

	@Column(name = "P_1092")
	private String strEntidadUbicadaEmpleo;

	@Column(name = "P_1093")
	private String strDatosEmpresa;

	@Column(name = "P_1094")
	private String strDireccionEmpresa;

	@Column(name = "P_1096")
	private Long lngTelefonoEmpresa;

	@Column(name = "P_1097")
	private String strNombreJefeInmediato;

	@Column(name = "P_1098")
	private String strSitioWeb;

	@Column(name = "P_1099")
	private String strFormacionProfesionalRecibida;

	@Column(name = "P_1100")
	private String strCalidadInstyServUni;

	@Column(name = "P_1101")
	private String strCalidadInstyServFac;

	@Column(name = "P_1102")
	private String strDesempeñoProfesores;

	@Column(name = "P_1103")
	private String strContenidosProgram;

	@Column(name = "P_1104")
	private String strMetodosEnseñanzaAprendizaje;

	@Column(name = "P_1105")
	private String strTipoCientifico;

	@Column(name = "P_1106")
	private String strTipoHumanista;

	@Column(name = "P_1107")
	private String strDisciplina;

	@Column(name = "P_1108")
	private String strComunicacionOralEscyGraf;

	@Column(name = "P_1109")
	private String strBusquedaInformacion;

	@Column(name = "P_1110")
	private String strAnaliticaLogica;

	@Column(name = "P_1111")
	private String strAplicarConocimientos;

	@Column(name = "P_1112")
	private String strTecnicasDisciplina;

	@Column(name = "P_1113")
	private String strIdentificacionySolProblemas;

	@Column(name = "P_1114")
	private String strTrabajarEnEquipo;

	@Column(name = "P_1115")
	private String strResponsabilidadYCompromiso;

	@Column(name = "P_1116")
	private String strIniciativaYTomarDesiciones;

	@Column(name = "P_1117")
	private String strRecomiendasReforzar;

	@Column(name = "P_1118")
	private String strConocimientosAdquiridos;

	@Column(name = "P_1119")
	private String strUtilizarAdquiridoEtica;

	@Column(name = "P_1120")
	private String strRazonEleccionUat;

	@Column(name = "P_1189")
	private String strEspecificaRazonEleccionUat;

	@Column(name = "P_1121")
	private String strAsociacionesEgresados;

	@Column(name = "P_1123")
	private String strEspecificarAsociacionesEgresados;

	@Column(name = "P_1122")
	private String strInformacionContactoUatx;

	@Column(name = "P_1125")
	private String strRecibirInfoCorreo;

	@Column(name = "P_1126")
	private String strRecibirInfoFacebook;

	public String getStrNombre() {
		return strNombre;
	}

	public SePaObtRespEgresados() {
		super();
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

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrDomicilioCalle() {
		return strDomicilioCalle;
	}

	public void setStrDomicilioCalle(String strDomicilioCalle) {
		this.strDomicilioCalle = strDomicilioCalle;
	}

	public Integer getIntDomicilioNumero() {
		return intDomicilioNumero;
	}

	public void setIntDomicilioNumero(Integer intDomicilioNumero) {
		this.intDomicilioNumero = intDomicilioNumero;
	}

	public String getStrDomicilioColonia() {
		return strDomicilioColonia;
	}

	public void setStrDomicilioColonia(String strDomicilioColonia) {
		this.strDomicilioColonia = strDomicilioColonia;
	}

	public String getStrDomicilioLocalidad() {
		return strDomicilioLocalidad;
	}

	public void setStrDomicilioLocalidad(String strDomicilioLocalidad) {
		this.strDomicilioLocalidad = strDomicilioLocalidad;
	}

	public String getStrDomicilioMunicipio() {
		return strDomicilioMunicipio;
	}

	public void setStrDomicilioMunicipio(String strDomicilioMunicipio) {
		this.strDomicilioMunicipio = strDomicilioMunicipio;
	}

	public Integer getIntDomicilioCP() {
		return intDomicilioCP;
	}

	public void setIntDomicilioCP(Integer intDomicilioCP) {
		this.intDomicilioCP = intDomicilioCP;
	}

	public Long getLngDomicilioTelCasa() {
		return lngDomicilioTelCasa;
	}

	public void setLngDomicilioTelCasa(Long lngDomicilioTelCasa) {
		this.lngDomicilioTelCasa = lngDomicilioTelCasa;
	}

	public Long getLngDomicilioTelCel() {
		return lngDomicilioTelCel;
	}

	public void setLngDomicilioTelCel(Long lngDomicilioTelCel) {
		this.lngDomicilioTelCel = lngDomicilioTelCel;
	}

	public String getStrDomicilioCorreoElec() {
		return strDomicilioCorreoElec;
	}

	public void setStrDomicilioCorreoElec(String strDomicilioCorreoElec) {
		this.strDomicilioCorreoElec = strDomicilioCorreoElec;
	}

	public String getStrDomicilioFacebook() {
		return strDomicilioFacebook;
	}

	public void setStrDomicilioFacebook(String strDomicilioFacebook) {
		this.strDomicilioFacebook = strDomicilioFacebook;
	}

	public String getStrDomicilioTwitter() {
		return strDomicilioTwitter;
	}

	public void setStrDomicilioTwitter(String strDomicilioTwitter) {
		this.strDomicilioTwitter = strDomicilioTwitter;
	}

	public String getStrSexo() {
		return strSexo;
	}

	public void setStrSexo(String strSexo) {
		this.strSexo = strSexo;
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public String getStrEstadoCivil() {
		return strEstadoCivil;
	}

	public void setStrEstadoCivil(String strEstadoCivil) {
		this.strEstadoCivil = strEstadoCivil;
	}

	public String getStrOcupacion() {
		return strOcupacion;
	}

	public void setStrOcupacion(String strOcupacion) {
		this.strOcupacion = strOcupacion;
	}

	public String getStrEspecificaOcupacion() {
		return strEspecificaOcupacion;
	}

	public void setStrEspecificaOcupacion(String strEspecificaOcupacion) {
		this.strEspecificaOcupacion = strEspecificaOcupacion;
	}

	public Integer getIntEstudiosConcluidos() {
		return intEstudiosConcluidos;
	}

	public void setIntEstudiosConcluidos(Integer intEstudiosConcluidos) {
		this.intEstudiosConcluidos = intEstudiosConcluidos;
	}

	public Integer getIntPersonasIngresoFamiliar() {
		return intPersonasIngresoFamiliar;
	}

	public void setIntPersonasIngresoFamiliar(Integer intPersonasIngresoFamiliar) {
		this.intPersonasIngresoFamiliar = intPersonasIngresoFamiliar;
	}

	public Integer getIntIngresoFamiliar() {
		return intIngresoFamiliar;
	}

	public void setIntIngresoFamiliar(Integer intIngresoFamiliar) {
		this.intIngresoFamiliar = intIngresoFamiliar;
	}

	public Integer getIntFuentesEconomicas() {
		return intFuentesEconomicas;
	}

	public void setIntFuentesEconomicas(Integer intFuentesEconomicas) {
		this.intFuentesEconomicas = intFuentesEconomicas;
	}

	public String getStrTitulo() {
		return strTitulo;
	}

	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}

	public String getStrCedula() {
		return strCedula;
	}

	public void setStrCedula(String strCedula) {
		this.strCedula = strCedula;
	}

	public String getStrOpcionTitulado() {
		return strOpcionTitulado;
	}

	public void setStrOpcionTitulado(String strOpcionTitulado) {
		this.strOpcionTitulado = strOpcionTitulado;
	}

	public String getStrTiempoEgresoaTitulacion() {
		return strTiempoEgresoaTitulacion;
	}

	public void setStrTiempoEgresoaTitulacion(String strTiempoEgresoaTitulacion) {
		this.strTiempoEgresoaTitulacion = strTiempoEgresoaTitulacion;
	}

	public String getStrActividadesSerSoc() {
		return strActividadesSerSoc;
	}

	public void setStrActividadesSerSoc(String strActividadesSerSoc) {
		this.strActividadesSerSoc = strActividadesSerSoc;
	}

	public String getStrEspecificaActividadesSerSoc() {
		return strEspecificaActividadesSerSoc;
	}

	public void setStrEspecificaActividadesSerSoc(String strEspecificaActividadesSerSoc) {
		this.strEspecificaActividadesSerSoc = strEspecificaActividadesSerSoc;
	}

	public String getStrActividadesPracPro() {
		return strActividadesPracPro;
	}

	public void setStrActividadesPracPro(String strActividadesPracPro) {
		this.strActividadesPracPro = strActividadesPracPro;
	}

	public String getStrEstudioPosteriorLic() {
		return strEstudioPosteriorLic;
	}

	public void setStrEstudioPosteriorLic(String strEstudioPosteriorLic) {
		this.strEstudioPosteriorLic = strEstudioPosteriorLic;
	}

	public String getStrEspecificaEstudioPosteriorLic() {
		return strEspecificaEstudioPosteriorLic;
	}

	public void setStrEspecificaEstudioPosteriorLic(String strEspecificaEstudioPosteriorLic) {
		this.strEspecificaEstudioPosteriorLic = strEspecificaEstudioPosteriorLic;
	}

	public String getStrTipoInstitucion() {
		return strTipoInstitucion;
	}

	public void setStrTipoInstitucion(String strTipoInstitucion) {
		this.strTipoInstitucion = strTipoInstitucion;
	}

	public String getStrAreaEstudios() {
		return strAreaEstudios;
	}

	public void setStrAreaEstudios(String strAreaEstudios) {
		this.strAreaEstudios = strAreaEstudios;
	}

	public String getStrDificultadConseguirEmpleo() {
		return strDificultadConseguirEmpleo;
	}

	public void setStrDificultadConseguirEmpleo(String strDificultadConseguirEmpleo) {
		this.strDificultadConseguirEmpleo = strDificultadConseguirEmpleo;
	}

	public String getStrEspecificaDificultadConseguirEmpleo() {
		return strEspecificaDificultadConseguirEmpleo;
	}

	public void setStrEspecificaDificultadConseguirEmpleo(String strEspecificaDificultadConseguirEmpleo) {
		this.strEspecificaDificultadConseguirEmpleo = strEspecificaDificultadConseguirEmpleo;
	}

	public String getStrTiempoPrimerEmpleo() {
		return strTiempoPrimerEmpleo;
	}

	public void setStrTiempoPrimerEmpleo(String strTiempoPrimerEmpleo) {
		this.strTiempoPrimerEmpleo = strTiempoPrimerEmpleo;
	}

	public Integer getIntNumEmpleos() {
		return intNumEmpleos;
	}

	public void setIntNumEmpleos(Integer intNumEmpleos) {
		this.intNumEmpleos = intNumEmpleos;
	}

	public String getStrRazonContratado() {
		return strRazonContratado;
	}

	public void setStrRazonContratado(String strRazonContratado) {
		this.strRazonContratado = strRazonContratado;
	}

	public String getStrEspecificaRazonContratado() {
		return strEspecificaRazonContratado;
	}

	public void setStrEspecificaRazonContratado(String strEspecificaRazonContratado) {
		this.strEspecificaRazonContratado = strEspecificaRazonContratado;
	}

	public String getStrOrgEmpresaEmpleoActual() {
		return strOrgEmpresaEmpleoActual;
	}

	public void setStrOrgEmpresaEmpleoActual(String strOrgEmpresaEmpleoActual) {
		this.strOrgEmpresaEmpleoActual = strOrgEmpresaEmpleoActual;
	}

	public String getStrEspecificaOrgEmpresaEmpleoAct() {
		return strEspecificaOrgEmpresaEmpleoAct;
	}

	public void setStrEspecificaOrgEmpresaEmpleoAct(String strEspecificaOrgEmpresaEmpleoAct) {
		this.strEspecificaOrgEmpresaEmpleoAct = strEspecificaOrgEmpresaEmpleoAct;
	}

	public String getStrTipoActividadEmpleo() {
		return strTipoActividadEmpleo;
	}

	public void setStrTipoActividadEmpleo(String strTipoActividadEmpleo) {
		this.strTipoActividadEmpleo = strTipoActividadEmpleo;
	}

	public String getStrTipoContratoEmpleo() {
		return strTipoContratoEmpleo;
	}

	public void setStrTipoContratoEmpleo(String strTipoContratoEmpleo) {
		this.strTipoContratoEmpleo = strTipoContratoEmpleo;
	}

	public String getStrTiempoJornadaLaboral() {
		return strTiempoJornadaLaboral;
	}

	public void setStrTiempoJornadaLaboral(String strTiempoJornadaLaboral) {
		this.strTiempoJornadaLaboral = strTiempoJornadaLaboral;
	}

	public String getStrCoincidenciaEmpleoPerfil() {
		return strCoincidenciaEmpleoPerfil;
	}

	public void setStrCoincidenciaEmpleoPerfil(String strCoincidenciaEmpleoPerfil) {
		this.strCoincidenciaEmpleoPerfil = strCoincidenciaEmpleoPerfil;
	}

	public String getStrRequisitosDesempeñoEmpleo() {
		return strRequisitosDesempeñoEmpleo;
	}

	public void setStrRequisitosDesempeñoEmpleo(String strRequisitosDesempeñoEmpleo) {
		this.strRequisitosDesempeñoEmpleo = strRequisitosDesempeñoEmpleo;
	}

	public Long getLngSalarioMensual() {
		return lngSalarioMensual;
	}

	public void setLngSalarioMensual(Long lngSalarioMensual) {
		this.lngSalarioMensual = lngSalarioMensual;
	}

	public String getStrEntidadUbicadaEmpleo() {
		return strEntidadUbicadaEmpleo;
	}

	public void setStrEntidadUbicadaEmpleo(String strEntidadUbicadaEmpleo) {
		this.strEntidadUbicadaEmpleo = strEntidadUbicadaEmpleo;
	}

	public String getStrDatosEmpresa() {
		return strDatosEmpresa;
	}

	public void setStrDatosEmpresa(String strDatosEmpresa) {
		this.strDatosEmpresa = strDatosEmpresa;
	}

	public String getStrDireccionEmpresa() {
		return strDireccionEmpresa;
	}

	public void setStrDireccionEmpresa(String strDireccionEmpresa) {
		this.strDireccionEmpresa = strDireccionEmpresa;
	}

	public Long getLngTelefonoEmpresa() {
		return lngTelefonoEmpresa;
	}

	public void setLngTelefonoEmpresa(Long lngTelefonoEmpresa) {
		this.lngTelefonoEmpresa = lngTelefonoEmpresa;
	}

	public String getStrNombreJefeInmediato() {
		return strNombreJefeInmediato;
	}

	public void setStrNombreJefeInmediato(String strNombreJefeInmediato) {
		this.strNombreJefeInmediato = strNombreJefeInmediato;
	}

	public String getStrSitioWeb() {
		return strSitioWeb;
	}

	public void setStrSitioWeb(String strSitioWeb) {
		this.strSitioWeb = strSitioWeb;
	}

	public String getStrFormacionProfesionalRecibida() {
		return strFormacionProfesionalRecibida;
	}

	public void setStrFormacionProfesionalRecibida(String strFormacionProfesionalRecibida) {
		this.strFormacionProfesionalRecibida = strFormacionProfesionalRecibida;
	}

	public String getStrCalidadInstyServUni() {
		return strCalidadInstyServUni;
	}

	public void setStrCalidadInstyServUni(String strCalidadInstyServUni) {
		this.strCalidadInstyServUni = strCalidadInstyServUni;
	}

	public String getStrCalidadInstyServFac() {
		return strCalidadInstyServFac;
	}

	public void setStrCalidadInstyServFac(String strCalidadInstyServFac) {
		this.strCalidadInstyServFac = strCalidadInstyServFac;
	}

	public String getStrDesempeñoProfesores() {
		return strDesempeñoProfesores;
	}

	public void setStrDesempeñoProfesores(String strDesempeñoProfesores) {
		this.strDesempeñoProfesores = strDesempeñoProfesores;
	}

	public String getStrContenidosProgram() {
		return strContenidosProgram;
	}

	public void setStrContenidosProgram(String strContenidosProgram) {
		this.strContenidosProgram = strContenidosProgram;
	}

	public String getStrMetodosEnseñanzaAprendizaje() {
		return strMetodosEnseñanzaAprendizaje;
	}

	public void setStrMetodosEnseñanzaAprendizaje(String strMetodosEnseñanzaAprendizaje) {
		this.strMetodosEnseñanzaAprendizaje = strMetodosEnseñanzaAprendizaje;
	}

	public String getStrTipoCientifico() {
		return strTipoCientifico;
	}

	public void setStrTipoCientifico(String strTipoCientifico) {
		this.strTipoCientifico = strTipoCientifico;
	}

	public String getStrTipoHumanista() {
		return strTipoHumanista;
	}

	public void setStrTipoHumanista(String strTipoHumanista) {
		this.strTipoHumanista = strTipoHumanista;
	}

	public String getStrDisciplina() {
		return strDisciplina;
	}

	public void setStrDisciplina(String strDisciplina) {
		this.strDisciplina = strDisciplina;
	}

	public String getStrComunicacionOralEscyGraf() {
		return strComunicacionOralEscyGraf;
	}

	public void setStrComunicacionOralEscyGraf(String strComunicacionOralEscyGraf) {
		this.strComunicacionOralEscyGraf = strComunicacionOralEscyGraf;
	}

	public String getStrBusquedaInformacion() {
		return strBusquedaInformacion;
	}

	public void setStrBusquedaInformacion(String strBusquedaInformacion) {
		this.strBusquedaInformacion = strBusquedaInformacion;
	}

	public String getStrAnaliticaLogica() {
		return strAnaliticaLogica;
	}

	public void setStrAnaliticaLogica(String strAnaliticaLogica) {
		this.strAnaliticaLogica = strAnaliticaLogica;
	}

	public String getStrAplicarConocimientos() {
		return strAplicarConocimientos;
	}

	public void setStrAplicarConocimientos(String strAplicarConocimientos) {
		this.strAplicarConocimientos = strAplicarConocimientos;
	}

	public String getStrTecnicasDisciplina() {
		return strTecnicasDisciplina;
	}

	public void setStrTecnicasDisciplina(String strTecnicasDisciplina) {
		this.strTecnicasDisciplina = strTecnicasDisciplina;
	}

	public String getStrIdentificacionySolProblemas() {
		return strIdentificacionySolProblemas;
	}

	public void setStrIdentificacionySolProblemas(String strIdentificacionySolProblemas) {
		this.strIdentificacionySolProblemas = strIdentificacionySolProblemas;
	}

	public String getStrTrabajarEnEquipo() {
		return strTrabajarEnEquipo;
	}

	public void setStrTrabajarEnEquipo(String strTrabajarEnEquipo) {
		this.strTrabajarEnEquipo = strTrabajarEnEquipo;
	}

	public String getStrResponsabilidadYCompromiso() {
		return strResponsabilidadYCompromiso;
	}

	public void setStrResponsabilidadYCompromiso(String strResponsabilidadYCompromiso) {
		this.strResponsabilidadYCompromiso = strResponsabilidadYCompromiso;
	}

	public String getStrIniciativaYTomarDesiciones() {
		return strIniciativaYTomarDesiciones;
	}

	public void setStrIniciativaYTomarDesiciones(String strIniciativaYTomarDesiciones) {
		this.strIniciativaYTomarDesiciones = strIniciativaYTomarDesiciones;
	}

	public String getStrRecomiendasReforzar() {
		return strRecomiendasReforzar;
	}

	public void setStrRecomiendasReforzar(String strRecomiendasReforzar) {
		this.strRecomiendasReforzar = strRecomiendasReforzar;
	}

	public String getStrConocimientosAdquiridos() {
		return strConocimientosAdquiridos;
	}

	public void setStrConocimientosAdquiridos(String strConocimientosAdquiridos) {
		this.strConocimientosAdquiridos = strConocimientosAdquiridos;
	}

	public String getStrUtilizarAdquiridoEtica() {
		return strUtilizarAdquiridoEtica;
	}

	public void setStrUtilizarAdquiridoEtica(String strUtilizarAdquiridoEtica) {
		this.strUtilizarAdquiridoEtica = strUtilizarAdquiridoEtica;
	}

	public String getStrRazonEleccionUat() {
		return strRazonEleccionUat;
	}

	public void setStrRazonEleccionUat(String strRazonEleccionUat) {
		this.strRazonEleccionUat = strRazonEleccionUat;
	}

	public String getStrEspecificaRazonEleccionUat() {
		return strEspecificaRazonEleccionUat;
	}

	public void setStrEspecificaRazonEleccionUat(String strEspecificaRazonEleccionUat) {
		this.strEspecificaRazonEleccionUat = strEspecificaRazonEleccionUat;
	}

	public String getStrAsociacionesEgresados() {
		return strAsociacionesEgresados;
	}

	public void setStrAsociacionesEgresados(String strAsociacionesEgresados) {
		this.strAsociacionesEgresados = strAsociacionesEgresados;
	}

	public String getStrEspecificarAsociacionesEgresados() {
		return strEspecificarAsociacionesEgresados;
	}

	public void setStrEspecificarAsociacionesEgresados(String strEspecificarAsociacionesEgresados) {
		this.strEspecificarAsociacionesEgresados = strEspecificarAsociacionesEgresados;
	}

	public String getStrInformacionContactoUatx() {
		return strInformacionContactoUatx;
	}

	public void setStrInformacionContactoUatx(String strInformacionContactoUatx) {
		this.strInformacionContactoUatx = strInformacionContactoUatx;
	}

	public String getStrRecibirInfoCorreo() {
		return strRecibirInfoCorreo;
	}

	public void setStrRecibirInfoCorreo(String strRecibirInfoCorreo) {
		this.strRecibirInfoCorreo = strRecibirInfoCorreo;
	}

	public String getStrRecibirInfoFacebook() {
		return strRecibirInfoFacebook;
	}

	public void setStrRecibirInfoFacebook(String strRecibirInfoFacebook) {
		this.strRecibirInfoFacebook = strRecibirInfoFacebook;
	}

}