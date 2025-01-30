package mx.uatx.siiaback.serviciosUniversitarios.constantes;

import java.io.Serializable;

public class Constantes implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8050367022960411509L;
	
	public final static String NOMBRE_SISTEMA = "SIIA V4.0";
	
	public final static Integer NUMERO_CERO = 0;
	public final static Integer NUMERO_DOS = 2;
	public final static Long NUMERO_CERO_LONG = 0L;
	public final static String CLAVE_PAIS_MEXICO = "MX";
	public final static String DESCRIPCION_DECLARAUAT_MEXICO = "México";
	public final static String DESCRIPCION_EN_MEXICO = "En México";
        
        public final static String CICLO_ESCOLAR = "2018-2019";
	
	public final static Integer DIAS_PARA_PAGO_RECIBO = 5;
	
	public final static Integer TIPO_AREA_FACULTAD = 5;
	public final static Integer TIPO_SOLICITUD_TITULO = 2;
	
	public final static String NIVEL_EDUCATIVO_LICENCIATURA = "Licenciatura";
	
	public final static Integer ID_NIVEL_EDUCATIVO_LICENCIATURA = 4;
	
	
	public final static String DOMINIO_CORREO_MICROSOFT = "garzas.uatx.mx";
	public final static String DOMINIO_CORREO_GMAIL = "uatx.mx";
	
	public final static String CORREO_GMAIL_DUMMIE = "gmail@correo";

	public final static String MENSAJE_SIN_REGISTROS = "comun.label.sumario.msj.sin.registros";
	public final static String MENSAJE_FILTROS_MINIMOS = "comun.label.sumario.msj.filtros.minimos";
	public final static String MENSAJE_SIN_REGISTROS_BUSQUEDA = "comun.label.sumario.msj.sin.resultados.busqueda";
	public final static String MENSAJE_EXITO = "comun.msj.exito";
	public final static String MENSAJE_ERROR = "comun.msj.error";
	public final static String MENSAJE_ARTICULOS_SIN_COTIZAR = "serviciosFinancieros.compras.validacion";
	public final static String MENSAJE_CARTA_TERMINACION_SIN_CONTROL_PROGRAMAS = "servicioSocial.consulta.solicitud.msj.sin.control.programa.carta.terminacion";
	
	public final static String SESSION_MAP_SESSION = "SESSION";

	public static final String PREFIJO_TEMPORAL = "output.";
	public static final String EXT_PDF = ".pdf";
	public static final String EXT_XML = ".xml";
	public static final String EXT_JASPER = ".jasper";
	public static final String EXT_JASPER_JRXML = ".jrxml";

	public static final Integer EDAD_MINIMA_ASPIRANTE = 17;
	
	public static final Integer ID_ENTIDAD_TLAXCALA = 29;

	public static final Integer ID_ESTATUS_ACTIVO = 1;
	public static final Integer ID_INSTITUCION_UATX = 1;
	public static final Integer ID_SI = 1;
	public static final Integer ID_ESTATUS_PENDIENTE = 1;
	
	public static final String ID_ESTATUS_FOTO_ESTUDIO_CARGADA = "CARGADA";
	public static final String ID_ESTATUS_FOTO_ESTUDIO_VALIDADA = "VALIDADA";
	public static final Integer ESTATUS_SOLICITUD_TIEMPO_INGRESO = 1;
	public static final Integer ESTATUS_SOLICITUD_INGRESO = 1;
	public static final Integer ID_ESTATUS_SI_ES_TUTOR = 1;
	public static final Integer ID_ESTATUS_NO_ES_TUTOR = 2;
	public static final Integer ID_PARENTENZCO_PADRE = 1;
	public static final Integer ID_PARENTENZCO_MADRE = 2;
	public static final Integer ID_PARENTENZCO_TUTOR = 10;
	public static final Integer ID_ESTATUS_SI_DEPENDE_ECONOMICAMENTE = 1;
	public static final Integer ID_ESTATUS_NO_DEPENDE_ECONOMICAMENTE = 2;
	public static final Integer ID_AREA_CAMPUS_FACULTAD = 5;
	public static final Integer ID_TIPO_PERIODO_ESCOLAR = 1;
	public static final Integer ID_TIPO_PERIODO_PLANTILLA = 6;
	public static final String ID_TIPO_PERMISO_PERIODO1 = "General";
	public static final String ID_TIPO_PERMISO_PERIODO2 = "Por facultad";
	public static final String ID_TIPO_PERMISO_PERIODO3 = "Por programa";
	public static final Integer ESTATUS_EVALUACION_DOCENTE_CONTESTADO = 1;
	
	public static final String ESTATUS_CREADO = "Creado";
	public static final String ESTATUS_PENDIENTE = "Pendiente";
	public static final String ESTATUS_VALIDADO = "Validado";
	public static final String ESTATUS_RECHAZADO = "Rechazado";
	public static final String ESTATUS_LIBERADO = "Liberado";
	public static final String ESTATUS_CANCELADO = "Cancelado";
	
	public static final Integer ID_CONSTANCIA_LIBERACION_SERSOC = 8;
	
	public static final int ES_TUTOR_PADRE = 1;
	public static final int ES_TUTOR_MADRE = 2;
	public static final int ES_TUTOR_OTRO = 10;

	public static final String RUTA_REPORTE_ASPIRANTE = "";

	public static final String NOMBRE_REPORTE = "Reporte_actividades_";

	public static final String TIPO_PERSONA_ALUMNO = "ALUMNO";
	public static final String TIPO_PERSONA_DOCENTE = "DOCENTE";
	public static final String TIPO_PERSONA_ADMIN = "ADMINISTRATIVO";

	public static final String DOC_VALIDEZ_DIGITAL = "4";
	public static final String DOC_ESTADO_BUENO = "1";
	public static final String DOC_ESTATUS_DIGITAL = "4";
	public static final String DOC_NBFORMATO_PDF = "PDF";
	
	public static final String ESTATUS_DOCUMENTO_PERSONA_VALIDADO = "5";
	   public static final String ESTATUS_DOCUMENTO_PERSONA_DIGITALIZADO = "4";
	
	public static final Integer ESTATUS_TITULO_VALIDADO = 1;
	
	public static final String DATOS_ANTERIORES_EXP_LABORAL = "Anterior";
	public static final String DATOS_ACTUALES_EXP_LABORAL = "Actual";

	public static final Long ID_CONCEPTO_PAGO_COLEGIATURA = 2L;
        public static final Long ID_CONCEPTO_PAGO_RENTA = 289L;
	public static final String FORMATO_PESOS = "$ #,##0.00";
	public static final String CVE_ESTATUS_RECIBO_IMPRESO = "I";
	public static final String CVE_ESTATUS_RECIBO_PAGADO = "P";
	public static final String CVE_ORIGEN_PAGO_RECIBO = "S";
        public static final String CVE_ORIGEN_PAGO_RECIBO_PAGO_ELECTRONICO = "E";
	
	public static final Integer ID_ESTATUS_SOLICITUD_EXAMEN_NUEVO = 2;
	
	public static final String CVE_ESTATUS_TITULO_SOLICITADO = "1";
	public static final Integer CVE_ESTATUS_TITULO_NO_VALIDADO = 2;
	
	public static final String DES_ESTATUS_TITULO_SOLICITADO = "Solicitado";
	public static final String CVE_ESTATUS_TITULO_ELABORADO = "2";
	public static final String CVE_ESTATUS_TITULO_ENTREGADO = "3";
	
	public static final String PARAMETRO_RUTA_SAU = "WEB_SERVICE_SAU";
        
        //Estatus tutorias
        public static final Integer ESTATUS_TUTORIA_FIRMADA = 1;
        public static final Integer ESTATUS_TUTORIA_REALIZADA = 2;
        public static final Integer ESTATUS_TUTORIA_RECHAZADA = 3;
        
        public static final Integer ESTATUS_TUTORADO_ACTIVO = 1;
        
        public static final String ESTATUS_CA_RECONOCIDO= "r";
        
        public static final Character ESTATUS_INT_CA_RECONOCIDO= 'r';
        
        //EXPEDIENTE DIGITAL
        
        public static final String VALIDEZ_DOCUMENTO_DIGITAL = "4";
        public static final String ESTADO_DOCUMENTO_BUEN_ESTADO = "1";
        
        public static final String ESTATUS_DOCUMENTO_DIGITALIZADO = "4";
        
   public static final Integer ESTATUS_CL_ST_SOLICITUD_BECA_SOLICITADA = 2;
   public static final Integer ESTATUS_CL_ST_CONSTANCIA_INGRESOS_SOLICITADA = 2;
   public static final Integer ESTATUS_CL_ST_CONSTANCIA_PROMEDIO_SOLICITADA = 2;
   
   public static final Integer ID_PROVEEDORES = 6;
   public static final String NOMBRE_CONCEPTO_PROVEEDOR = "Proveedores";
   public static final Integer ESTATUS_CL_ST_BECA_SOLICITADA = 1;
   
   public static final Integer ESTATUS_SOLICITUD_ASPIRANTE_POSGRADO_NUEVA = 1;
   public static final Integer ESTATUS_SOLICITUD_ASPIRANTE_POSGRADO_ENVIADA = 2;
   
   public static final Integer ID_TIPO_BECA_AUTORREALIZACION = 6;
   
   public static final Integer ID_TIPO_TRABAJO_NINGUNO = 11;
   
   public static final Integer ID_ESTATUS_ESPECIFICAR_CONDICION_SALUD = 1;
   public static final Integer ID_ESTATUS_ESPECIFICAR_FOLIO_PROSPERA = 1;
   
   public static final int SERVICIO_SOCIAL = 1;
   public static final int TITULACION = 2;
   public static final int VINCULACION = 3;
   public static final int MOVILIDAD_INTERNACIONAL_ESTUDIANTIL = 4;
   public static final int MOVILIDAD_NACIONAL_ESTUDIANTIL = 5;
   public static final int MOVILIDAD_INTERNACIONAL_POSGRADO = 6;
   public static final int MOVILIDAD_NACIONAL_POSGRADO = 7;
   public static final int MANUTENCION = 8;
   public static final int MANUTENCION_FEDERAL = 17;
   public static final int PROYECTA_CANADA = 9;
   public static final int PROYECTA_EU = 10;
   public static final int PROYECTA_CANADA_DOCENTES = 11;
   public static final int PROYECTA_EU_DOCENTES = 12;
   
   public static final int NUMERO_MAXIMO_EJEMPLARES_SOLICITADO = 3;
   
   public static final String EST_SICOBI_PRESTAMO_SOLICITADO = "S";
   
   public static final String EST_SICOBI_PRESTAMO_INICIADO = "I";
   
   public static final String EST_SICOBI_PRESTAMO_FINALIZADO = "F";
   
   public static final int ID_CLASIFICACION_LIBRO = 277;
   
   public static final Integer ID_CVE_TELEFONO_CELULAR = 3;
   public static final Integer ID_CVE_TELEFONO_CASA = 1;
   
   public static final Integer ID_CVE_CORREO_PERSONAL = 1;
   public static final Integer ID_CVE_CORREO_ESTATUS_CONFIRMADO = 2;
   
   public static final Integer ID_CATEGORIA_DOCENTE_ACTIVA = 1;
   public static final Integer ID_CATEGORIA_DOCENTE_INACTIVA = 2;
   
   
   public static final String ID_ESTATUS_ALUMNO_PERIODO_SOLICITADO = "1";
   public static final Integer ID_ESTATUS_CREDENCIAL_ACTIVO = 1;
   public static final Integer ID_ESTATUS_SEGURO_SOCIAL_ACTIVO = 1;
   
   public static final Integer ID_ESTATUS_SEGURO_ACEPTADO = 2;
   public static final Integer ID_ESTATUS_OTORGADO_PREREGISTRO_INACTIVO = 2;
   
   public static final Integer ESTATUS_TIENE_FAMILIAR_OPORTUNIDADES = 1;
   public static final Integer ESTATUS_NO_TIENE_FAMILIAR_OPORTUNIDADES = 2;
   public static final String ESTATUS_SOLICITUD_EXPEDIENTE_TITULACION = "Solicitado";
   
   public static final String ROL_AUTORIZAR_COMPRA_CONTADOR = "AutorizarCG";
   public static final String ROL_AUTORIZAR_COMPRA_SECRETARIO = "AutorizarSA";
   public static final String ROL_COMPRAR_REQUISICION = "ValidarComprar";
   
   public static final Double IVA = .16d;
   
   public static final String ESTATUS_REQUISICION_ADQUIRIDO= "Adquirido";
   public static final String ESTATUS_REQUISICION_COTIZADO = "Cotizado";
   public static final String ESTATUS_REQUISICION_SOLICITADO = "Solicitado";
   public static final String ESTATUS_REQUISICION_CANCELADO = "Cancelado";
   public static final String ESTATUS_REQUISICION_AUTORIZADO_CONTADOR = "Autorizado Contador General";
   public static final String ESTATUS_REQUISICION_AUTORIZADO_SECRETEARIO = "Autorizado Secretario Administrativo";
   
   public static final String ESTATUS_SOLICITUD_EXPEDIENTE_AUTORIZADO = "Autorizado";
   public static final String ESTATUS_ARTICULO_AUTORIZADO = "Autorizado";
   public static final String ESTATUS_ARTICULO_PARCIALMENTE_AUTORIZADO = "Parcialmente autorizado";
   public static final String ESTATUS_ARTICULO_RECHAZADO = "Rechazado";
   public static final String ESTATUS_ARTICULO_SOLICITADO = "Solicitado";
   public static final String ESTATUS_ARTICULO_NO_AUTORIZADO = "No autorizado";
   
   public static final String ST_COMPROBACION_FISCAL_REVISION = "REVISION";
   public static final String ST_COMPROBACION_FISCAL_VALIDADO = "VALIDADO";
   public static final String ST_COMPROBACION_FISCAL_RECHAZADO = "RECHAZADO";
   public static final String ST_COMPROBACION_FISCAL_OBSERVACIONES = "OBSERVACIONES";
   
   public static final String SIN_SOLICITUD_ADJUNTADA = "serviciosFinancieros.compras.accion.guardar.sin.articulo";
   
   public final static String CLAVE_CUESTIONARIO_PERSONA_CONTESTADO = "c";
   
   
   public final static String ESTATUS_EVENTO_RECTOR_VALIDADO = "Validado";
   public final static String ESTATUS_EVENTO_RECTOR_RECHAZADO = "Rechazado";
   
   
   public final static String ESTATUS_ACTA_CERRADA = "C";
   public final static Integer ID_ORIGEN_SERVICIO_SOLICITADO = 4;
   public final static Integer ID_ORIGEN_SERVICIO_FIRMADO = 5;
   public final static Integer ID_ESTATUS_SERVICIO_SOLICITADO = 6;
   public final static Integer ID_TIPO_CATEGORIA_SIIA = 6;

   public final static Integer ID_TIPO_TUTORIA_INDIVIDUAL = 1;
   public final static String TIPO_TUTORIA_INDIVIDUAL = "Individual";
   
   public final static Integer ID_TIPO_TUTORIA_GRUPAL = 2;
   public final static String TIPO_TUTORIA_GRUPAL = "Grupal";
   
   public final static String ASUNTO_TUTORIA_PROYECTO_VIDA = "Proyecto y sentido de vida";
   
   public final static String DESCRIPCION_MEXICO = "En Mexico";
   
   public final static String DESCRIPCION_EN_EL_EXTRANJERO = "En el extranjero";
   
   public final static String DESCRIPCION_ORGANO_AUTONOMO = "ORGANO AUTONOMO";
      
   public final static Integer ANIO_ACTIVACION_PAGO_ASPIRANTES=2018;
   public final static Integer MES_ACTIVACION_PAGO_ASPIRANTES=5;
   public final static Integer DIA_ACTIVACION_PAGO_ASPIRANTES=9;
   
   public final static Integer TIPO_MOVIMIENTO_PLANTILLA = 3;
   public final static Integer TIPO_NOMBRAMIENTO_INTERINO = 2;
   public final static Integer TIPO_DESIGNACION = 1;
   
   public final static String CATALOGO_PERIODOS_OBLIGACIONES = "SIIUAT.SIPGOBLIGACIONES.PROBTANIOSOBLIGACION";
   public final static String CATALOGO_ANIOS_DECLARACION = "SIIUAT.SIPGDECLARAUAT.PROBTANIODECLARACION";
   public final static String CATALOGO_TIPO_DECLARACION = "SIIUAT.SIPGDECLARAUAT.PROBTTIPODECLARACION";
   public final static String CATALOGO_TIPO_OPERACION = "SIIUAT.SIPGDECLARAUAT.PROBTOPERACION";
   public final static String CATALOGO_PARTICIPACION = "SIIUAT.SIPGDECLARAUAT.PROBTPARTICIPACION";
   public final static String CATALOGO_PREGUNTAS_DICOTOMICAS = "SIIUAT.SIPGDECLARAUAT.PROBTRESPDICOTOMICAS";
   public final static String CATALOGO_PREGUNTAS_REDES = "SIIUAT.SIPGDECLARAUAT.PROBTREDES";
   public final static String CATALOGO_TIPO_FAMILIAR = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOFAMILIAR";
   public final static String CATALOGO_ACTOR_INTERESADO = "SIIUAT.SIPGDECLARAUAT.PROBTACTORINTERESADO";
   public final static String CATALOGO_TIPO_RELACION = "SIIUAT.SIPGDECLARAUAT.PROBTRELACION";
   public final static String CATALOGO_TIPO_RELACION_DEPENDIENTE = "SIIUAT.SIPGDECLARAUAT.PROBTRELACIONDEPENDIENTES";   
   public final static String CATALOGO_FECHA_CONCLUSION = "SIIUAT.SIPGDECLARAUAT.PROBTFECHACONCLUSION";
   public final static String CATALOGO_CONTRATO_CONCESION = "SIIUAT.SIPGDECLARAUAT.PROBTCONTRATOCONCESION";
   public final static String CATALOGO_OPERACION_VIAJES = "SIIUAT.SIPGDECLARAUAT.PROBTOPERVIAJES";
   public final static String CATALOGO_CONSANGUINIDAD = "SIIUAT.SIPGDECLARAUAT.PROBTCONSANGUINIDAD";
   public final static String CATALOGO_FAMILIAR_VIAJE = "SIIUAT.SIPGDECLARAUAT.PROBTFAMILIARVIAJE";
   public final static String CATALOGO_FRECUENCIA_PROFESIONAL = "SIIUAT.SIPGDECLARAUAT.PROBTFRECPROFESIONAL";
   public final static String CATALOGO_SERVICIO_PROFESIONAL = "SIIUAT.SIPGDECLARAUAT.PROBTSERVPROFESIONAL";
   public final static String CATALOGO_BENEFICIARIO_CONTRATO = "SIIUAT.SIPGDECLARAUAT.PROBTBENEFCONTRATO";
   public final static String CATALOGO_PERSONA_CONTRATO = "SIIUAT.SIPGDECLARAUAT.";
   public final static String CATALOGO_CONSAGUINIDAD_CONYUGE = "SIIUAT.SIPGDECLARAUAT.PROBTCONSANGUINIDADCONYUGUE";
   public final static String CATALOGO_FAMILIAR_PATROCINIO = "SIIUAT.SIPGDECLARAUAT.PROBTFAMILIARPATROCINIO";
   public final static String CATALOGO_FECHA_POSTEMPLEO = "SIIUAT.SIPGDECLARAUAT.PROBTFECHAPOSTEMPLEO";
   public final static String CATALOGO_ORDEN_GOBIERNO = "SIIUAT.SIPGDECLARAUAT.PROBTNIVELGOBIERNO";
   public final static String CATALOGO_RELACION_HABITACION = "SIIUAT.SIPGDECLARAUAT.PROBTRELACIONHABITACION";
   public final static String CATALOGO_TIPO_PERSONA = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOPERSONA";
   public final static String CATALOGO_UBICACION = "SIIUAT.SIPGDECLARAUAT.PROBTUBICACION";
   
   public final static String CATALOGO_VALOR_ADQUI_CONFORME = "SIIUAT.SIPGDECLARAUAT.PROBTVALORADQUIINMUCONFORMEA";
   public final static String CATALOGO_MOT_BAJA_INMUEBLE = "SIIUAT.SIPGDECLARAUAT.PROBTMOTIVOBAJAINMUEBLE";
   
   
   public final static String CATALOGO_TIPO_PARTICIPACION_FIDEI = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOPARTICIPACIONFIDEI";
   
   public final static String FORMA_PAGO = "SIIUAT.SIPGDECLARAUAT.PROBTFORMAPAGO";
   public final static String MOTIVO_BAJA = "SIIUAT.SIPGDECLARAUAT.PROBTMOTIVOBAJAINMUEBLE";
   
   public final static String CATALOGO_TIPO_INSTITUCION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINSTITUCION";
   public final static String CATALOGO_TIPO_PRESTADOR= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOPRESTADOR";
   public final static String CATALOGO_NATURALEZA_JURIDICA= "SIIUAT.SIPGDECLARAUAT.PROBTNATURALEZAJURIDICA";
  
   public final static String CATALOGO_TIPO_REPRESENTACION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOREPRESENTACION";
   public final static String CATALOGO_FORMA_ADQUISICION= "SIIUAT.SIPGDECLARAUAT.PROBTFORMAADQUISICION";
   public final static String CATALOGO_TIPO_METALES= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOMETALES";
   public final static String CATALOGO_TIPO_OPERACION2= "SIIUAT.SIPGDECLARAUAT.PROBTOPERACION";
   public final static String CATALOGO_TIPO_ACTIVIDAD_SERVICIO= "SIIUAT.SIPGDECLARAUAT.PROBTNACTIVIDAD";
   public final static String CATALOGO_NIVEL_GOBIERNO= "SIIUAT.SIPGDECLARAUAT.PROBTNIVELGOBIERNO";
   public final static String CATALOGO_TIPO_APOYO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOAPOYO";
   public final static String CATALOGO_TIPO_FORMA_APOYO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOFORMAAPOYO";
   public final static String CATALOGO_TIPO_BENEFICIARIO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOBENEFICIARIO";
   
   public final static String CATALOGO_NATURALEZA_VINCULO= "SIIUAT.SIPGDECLARAUAT.PROBTVINCULO";
   public final static String CATALOGO_TIPO_PARTICIPACION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOPARTICIPACION";
   public final static String CATALOGO_FRECUENCIA_PARTICIPACION= "SIIUAT.SIPGDECLARAUAT.PROBTFRECUENCIA";
   public final static String CATALOGO_TIPO_SOCIEDAD= "SIIUAT.SIPGDECLARAUAT.PROBTSOCIEDAD";
   public final static String CATALOGO_DIAS_JORNADA= "SIIUAT.SIPGDECLARAUAT.PROBTDIASJORNADA";
   public final static String CATALOGO_HORAS_JORNADA= "SIIUAT.SIPGDECLARAUAT.PROBTHORASJORNADA";
   public final static String CATALOGO_ACTIVIDAD_SCIAN= "SIIUAT.SIPGDECLARAUAT.";

   public final static String CATALOGO_DOCUMENTO_OBTENIDO= "SIIUAT.SIPGDECLARAUAT.PROBTDOCUMENTOOBTENIDO";
   public final static String CATALOGO_TIPO_ADEUDO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOADEUDO";
   public final static String CATALOGO_UNIDAD_MEDIDA= "SIIUAT.SIPGDECLARAUAT.PROBTUNIDADMEDIDA";
   public final static String CATALOGO_ESTADO_CIVIL= "SIIUAT.SIPGDECLARAUAT.PROBTESTADOCIVIL";
   public final static String CATALOGO_DEPENDENCIA_O_ENTIDAD= "SIIUAT.SIPGDECLARAUAT.PROBTDEPENDECIA";
   public final static String CATALOGO_TIPO_PARTE_RELACIONADA= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOPARTERELACIONADA";
   public final static String CATALOGO_TIPO_INFORMACION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINFORMACION";
   public final static String CATALOGO_TITULAR_BIEN= "SIIUAT.SIPGDECLARAUAT.PROBTTITULARBIEN";
   public final static String CATALOGO_TITULAR_SUELDO= "SIIUAT.SIPGDECLARAUAT.PROBTTITULARSUELDO";
   public final static String CATALOGO_TIPO_BIEN_MUEBLE= "SIIUAT.SIPGDECLARAUAT.PROBTBIENMUEBLE";
   public final static String CATALOGO_TIPO_BIEN_INMUEBLE= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOBIENESINMUEBLES";
   public final static String CATALOGO_TIPO_OTRO_BIEN_MUEBLE= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOOTROBIEN";
   public final static String CATALOGO_OTRO_BIEN_MUEBLE= "SIIUAT.SIPGDECLARAUAT.PROBTOTROBIENMUEBLE";
   public final static String CATALOGO_TIPO_INVERSION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSION";
   public final static String CATALOGO_TIPO_ESPECIFICO_INVERSION= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOESPINVERSION";
   public final static String CATALOGO_TIPO_OPERACION_FIDEICOMISO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOOPFIDEICOMISO";
   public final static String CATALOGO_PERIODO_CURSADO= "SIIUAT.SIPGDECLARAUAT.PROBTPERIODOCURSADO";
   public final static String CATALOGO_REGIMEN_MATRIMONIAL= "SIIUAT.SIPGDECLARAUAT.PROBTREGIMENMATRIMONIAL";
   public final static String CATALOGO_RELACION_ADQUISICION_ACTIVO= "SIIUAT.SIPGDECLARAUAT.PROBTRELACIONADQUISICION";
   public final static String CATALOGO_ESTATUS= "SIIUAT.SIPGDECLARAUAT.PROBTESTATUS";
   public final static String CATALOGO_NACIONAL_EXTRNAJERO= "SIIUAT.SIPGDECLARAUAT.PROBTNACIONALEXTRANJERO";
   public final static String CATALOGO_TIPO_FIDEICOMISO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOFIDEICOMISO";
   public final static String CATALOGO_TIPO_BIENES_INTANGIBLES= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOBIENINTANGIBLE";
   public final static String CATALOGO_USUFRUCTO_PATROCINIO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOUSUFRUCTO";
   public final static String CATALOGO_SECTOR= "SIIUAT.SIPGDECLARAUAT.PROBTSECTOR";
   public final static String CATALOGO_FUNCIONES= "SIIUAT.SIPGDECLARAUAT.PROBTFUNCIONES";
   public final static String CATALOGO_AMBITO= "SIIUAT.SIPGDECLARAUAT.PROBTAMBITO";
   public final static String CATALOGO_PODER= "SIIUAT.SIPGDECLARAUAT.PROBTPODER";
   public final static String CATALOGO_PAIS= "SIIUAT.SIPGDECLARAUAT.PROBTPAIS";
   public final static String CATALOGO_BENEFICIO_GRA= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOBENEFICIOGRA";
   public final static String CATALOGO_FUNCIONES_PRINCIPALES= "SIIUAT.SIPGDECLARAUAT.PROBTFUNCIONESPRINCIPALES";
   public final static String CATALOGO_OPERACION_PASIVO= "SIIUAT.SIPGDECLARAUAT.PROBTOPERACIONPASIVO";
   
   public final static String CATALOGO_TIPO_INVERSION_BANCARIA= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONBANCARIA";
   public final static String CATALOGO_TIPO_INVERSION_AFORES = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONAFORES";
   public final static String CATALOGO_TIPO_INVERSION_FONDOS = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONFONDOS";
   public final static String CATALOGO_TIPO_INVERSION_MONEDAS = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONMONEDAS";
   public final static String CATALOGO_TIPO_INVERSION_ORGANIZACION = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONORGANIZACION";
   public final static String CATALOGO_TIPO_INVERSION_SEGUROS = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONSEGUROS";
   public final static String CATALOGO_TIPO_INVERSION_VALORES = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINVERSIONVALORES";
   public final static String CATALOGO_TIPO_DECLARANTE = "SIIUAT.SIPGDECLARAUAT.PROBTTIPODECLARANTE";
   public final static String CATALOGO_ENTIDAD = "SIIUAT.SIPGDECLARAUAT.PROBTESTADO";
   public final static String CATALOGO_CATEGORIAS_NOMBRAMIENTO = "SIIUAT.SIPGDECLARAUAT.PROBTCATEGORIASNOMBRAMIENTO";
   public final static String CATALOGO_NIVEL_CATEGORIAS_NOMBRAMIENTO = "SIIUAT.SIPGDECLARAUAT.PROBTNIVELESEMPLEO";
   public final static String CATALOGO_TIPO_BIEN_ENAJENADO = "SIIUAT.SIPGDECLARAUAT.PROBTTIPOBIENENAJENADO";
   
   
   public final static String CATALOGO_TIPOS_PERSONAL= "RECHUM.RHPGEXPEDIENTEDIGITAL.PROBTTIPOPERSONAL";
   
   public final static String CATALOGO_SECCION_ESDEPED = "RECHUM.RHPGESDEPED.PROBTSECCIONESESDEPED";
   public final static String CATALOGO_APARTADOS_ESDEPED = "RECHUM.RHPGESDEPED.PROBTAPARTADOSESDEPED";
   
   
   public final static String CATALOGO_TIPO_CONS_ASPIRANTE= "SERESC.SEPGASPIRANTES.PROBTTIPOSCONSTANCIA";
   
   
   public final static String CATALOGO_NIVELES_EDUCATIVOS= "SIIUAT.SIPGDECLARAUAT.PROBTNIVELESEDUCATIVOS";
   
   public final static String CATALOGO_TIPO_PERSONAL= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOSDEPERSONAL";
   
   public final static String CATALOGO_TIPO_PERSONAL_EXP_DIG= "RECHUM.RHPGEXPEDIENTEDIGITAL.PROBTTIPOPERSONAL";
   
   public final static String CATALOGO_TIPO_INSTRUMENTO= "SIIUAT.SIPGDECLARAUAT.PROBTTIPOINSTRUMENTOGANANCIA";
   
   
   public final static String CATALOGO_PROBTTIPOSACERVOS = "PROBTTIPOSACERVOS";
   public final static String CATALOGO_PROBTTIPOSPRESTAMOSREPORTE = "PROBTTIPOSPRESTAMOSREPORTE";
   public final static String CATALOGO_PROBTIPOSREPORTES = "PROBTIPOSREPORTES";
   public final static String CATALOGO_PROBTMESESREPORTES = "PROBTMESESREPORTES";
   public final static String CATALOGO_PROBTANIOSREPORTES = "PROBTANIOSREPORTES";
   
   
   public final static String CATEGORIA_SUELDO_PUBLICO="Sueldos y Salarios Publico";
   public final static String CATEGORIA_SUELDO_OTROS="Sueldos y Salarios por Otros Empleos";
   public final static String CATEGORIA_ACTIVIDAD_PROFESIONAL="Actividad Profesional";
   public final static String CATEGORIA_ACTIVIDAD_EMPRESARIAL="Actividad Empresarial";
   public final static String CATEGORIA_ACTIVIDAD_ECON_MENOR="Actividad Economica Menor";
   public final static String CATEGORIA_ARRENDAMIENTO="Arrendamiento";
   public final static String CATEGORIA_INTERESES="Intereses";
   public final static String CATEGORIA_PREMIOS="Premios";
   public final static String CATEGORIA_OTROS_INGRESOS="Otros Ingresos";
   public final static String CATEGORIA_ENAJENACION_BIENES="Enajenacion de Bienes";
   
   public final static String FOTO_ESTUDIO_CARGADA="CARGADA";
   
   public static final Integer ESTATUS_TAREA_PLAN_TRABAJO_PENDIENTE = 1;
   public static final Integer ESTATUS_TAREA_PLAN_TRABAJO_CONCLUIDA = 2;
   
   
   public static final String ESTATUS_ENVIADO_DGP = "Enviado";
   
   
   public final static String TIPO_CANALIZACION_APOYO_PSICOLOGICO_COORDINADOR = "COORDINADOR";
   
   public final static String TIPO_CANALIZACION_APOYO_PSICOLOGICO_ESTATUS_SOLICITUD = "SOLICITUD";
   
   public final static Integer ESTATUS_CREDENCIAL_SOLICITADA = 1;
   public final static Integer ESTATUS_CREDENCIAL_VALIDADA_FAC = 2;
   public final static Integer ESTATUS_CREDENCIAL_IMPRESA = 3;
   public final static Integer ESTATUS_CREDENCIAL_ENTREGADA = 4;
   public final static Integer ESTATUS_CREDENCIAL_DEVUELTA = 5;
   
   
   public final static Integer ESTATUS_CONCLUIDO = 1;
   public final static Integer ESTATUS_ENTREGADO = 1;
   public final static Integer ESTATUS_NO_ENTREGADO = 2;
   public final static Integer ESTATUS_NO_CONCLUIDO = 2;
   public static final String ESTATUS_DATO_CURRICULAR_FINALIZADO = "FINALIZADO";
   
   
   public static final String ID_ESTATUS_ACEPTADO_ALUMNO_CARGA = "A";
   public static final String ID_ESTATUS_ACEPTADO_ALUMNO_BAJA = "B";
   public final static Integer ID_ESTATUS_SIN_EVAUACION_DOCENTE = 2;
   public static final Integer ID_TIPO_BAJA_DEFINITIVA = 2;
   public static final Integer ID_TIPO_BAJA_ADMINISTRATIVA = 1;
   
   
   public final static Integer ID_ALUMNO_ACTIVO_EN_ACTA = 1;
   public final static Integer ID_ALUMNO_INACTIVO_EN_ACTA = 2;
   
   public final static Integer ID_ESTATUS_ALUMNO_ACTIVO_ACTA = 1;
   
   
   
   public final static String ESTATUS_FACTURA_ASIGNADA = "Asignada";
   
   public final static String ESTATUS_FACTURA_REGISTRADA = "Registrada";
   
   public final static String ESTATUS_FACTURA_APLICADO = "Aplicada";
   
   public final static Integer ID_TIPO_BIEN_PATRIMONIAL_MUEBLE = 2;
   
   public final static Integer ESTATUS_NO = 2;
   
   public final static Integer EVALUACIONDOCENTE_NO = 2;
   
   public final static Integer ASPIRANTES_TIPO_DISCAPCIDAD = 10;
   
   
   public final static Integer MINUTO_EN_MILISEGUNDOS = 1000;
   
   public final static Integer MINUTO_EN_SEGUNDOS = 60;
   
   public final static Integer TIEMPO_ANTICIPACION_MENSAJE_ALERTA_EXAMEN_ADMIN = 2;
   
   public final static Integer TIEMPO_ANTICIPACION_MENSAJE_ALERTA_FINALIZADO_EXAMEN_ADMIN = 1;
   
   
   
   public final static String CATALOGO_TIPO_TRAMITES_CONTANCIAS = "SERESC.SEPGDOCUMENTOSOFICIALES.PROBTTIPOSTRAMITECONSTANCIAS";
   
   public final static Integer ID_CONSTANCIA_NO_ADEUDO_MATERIAL_BIBLIOGRAFICO = 117;
   
   public final static Integer DATOS_VALIDADOS_UPA = 4;
   
   public final static Integer ID_SIN_PUESTO = 52;
   
   public final static Integer TIPO_PLAZA_DOCENTE_EVENTUAL = 5;
   
   public final static String PASSWORD_GENERAL = "General";
   
   
   
   /**
    * Catálogos plantillas
    * 
    **/
   
   public final static String CATALOGO_NOMBRAMIENTOS= "RECHUM.RHPGPLANTILLA.PROBTCATALOGONOMBRAMIENTOS";
   public final static String CATALOGO_MOVIMIENTOS_PLANTILLA= "RECHUM.RHPGPLANTILLA.PROBTCATALOGOMOVIMIENTOS";
   public final static String CATALOGO_TIPOS_DESIGNACION= "RECHUM.RHPGPLANTILLA.PROBTCATALOGODESIGNACIONES";
   public final static String CATALOGO_CATEGORIAS= "RECHUM.RHPGPLANTILLA.PROBTCATALOGOCATNOASIGNADAS";
   public final static String CATALOGO_PROGRAMAS= "RECHUM.RHPGPLANTILLA.PROBTCATPROGRAMASNOASIGNADOS";
   public final static String CATALOGO_INSTITUCIONES_EXTERNAS = "RECHUM.RHPGPLANTILLA.PROBTINSTITUCIONESEXTERNAS";
   
   
   public final static String CATALOGO_TIPO_PLAZA = "RECHUM.RHPGPLANTILLA.PROBTTIPOSPLAZADOCENTE";
   public final static String CATALOGO_NIVEL_SNI = "RECHUM.RHPGPLANTILLA.PROBTNIVELESSNI";
   public final static String CATALOGO_NIVEL_ESDEPED = "RECHUM.RHPGPLANTILLA.PROBTNIVELESESDEPED";
   public final static String CATALOGO_AREAS_POR_CAMPUS = "RECHUM.RHPGPLANTILLA.PROBTAREASPORCAMPUS";
   
   public final static String CATALOGO_TIPO_PERMISO_DOCENTE = "RECHUM.RHPGPLANTILLA.PROBTTIPOSPERMISOS";
   
   
   
   
   
   /**
    * Constantes para comisiones
    */
   
   public static final int ID_TIPO_COMISION_RESPONSABLE_CONTROL_PATRIMONIAL = 1;
   public static final int ID_TIPO_COMISION_BIBLIOTECA = 2;
   public static final int ID_TIPO_COMISION_RESPONSABLE_COMPROBACIONES_FISCALES = 3;
   public static final int ID_TIPO_COMISION_RESPONSABLE_TUTORIAS = 5;
   public static final int ID_TIPO_COMISION_RESPONSABLE_CONTROL_ESCOLAR = 6;
   public static final int ID_TIPO_COMISION_RESPONSABLE_TITULACION = 7;
   public static final int ID_TIPO_COMISION_RESPONSABLE_TRANSPARENCIA = 8;
   public static final int ID_TIPO_COMISION_RESPONSABLE_SERVICIOS = 9;
   public static final int ID_TIPO_COMISION_RESPONSABLE_CONTROL_ACCESO = 10; 
   public static final int ID_TIPO_COMISION_RESPONSABLE_EVALUACION_CONTROL_INTERNO = 11;
   public static final int ID_TIPO_COMISION_RESPONSABLE_PLANTILLAS = 12;
   
   /**
    * Constantes para transparencia
    */
   public final static String CATALOGO_TRANSPARENCIA_ACCESOS = "SIIUAT.SIPGTRANSPARENCIA.PROBTACCESOS";
   public final static String CATALOGO_TRANSPARENCIA_FUNCIONESSUST = "SIIUAT.SIPGTRANSPARENCIA.PROBTFUNCIONESSUSTANTIVAS";
   public final static String CATALOGO_TRANSPARENCIA_PLAZOSCONSERVACION = "SIIUAT.SIPGTRANSPARENCIA.PROBTPLAZOSCONSERVACION";
   public final static String CATALOGO_TRANSPARENCIA_TECNICASSELECCION = "SIIUAT.SIPGTRANSPARENCIA.PROBTTECNICASSELECCION";
   public final static String CATALOGO_TRANSPARENCIA_VALORDOCUMENTAL = "SIIUAT.SIPGTRANSPARENCIA.PROBTVALORDOCUMENTAL";
   
   public final static String CLESTATUSPAGOMODIFICADO = "M";
   public final static String COMPLEMENTOIDPAGO = "-2003";
   
   public final static String ESTATUSCARGADODOCUMENTOESDEPED = "Cargado";
   public final static String ESTATUSVALIDADOCUMENTOESDEPED = "Validado";
   public final static String ESTATUSRECHAZADOOCUMENTOESDEPED = "Rechazado";
   
   public static final Integer ESTATUS_ACEPTADA = 2;
   public static final Integer ESTATUS_RECHAZADA = 3;
   
   /**
    * Constantes para cheques
    */
   public static final Integer ESTATUS_CHEQUE_PENDIENTE = 1;
   public static final Integer ESTATUS_CHEQUE_IMPRESO = 2;
   public static final Integer ESTATUS_CHEQUE_ENTREGADO = 3;
   public static final Integer ESTATUS_CHEQUE_PAGADO = 4;
   public static final Integer ESTATUS_CHEQUE_CANCELADO = 5;
   
   /**
	 * Constantes para modulo de Seguimiento de egresados
	 */
	public static final Long ID_CUESTIONARIO_SEGUIMIENTO_EGRESADOS_LICENCIATURA = 25L;
	public static final Long ID_CUESTIONARIO_SEGUIMIENTO_EGRESADOS_LICENCIATURA_MHIC = 26L;
	public static final Long ID_CUESTIONARIO_SEGUIMIENTO_EGRESADOS_LICENCIATURA_TS = 27L;
	public static final Long ID_CUESTIONARIO_SEGUIMIENTO_EGRESADOS_LICENCIATURA_TS_MHIC = 28L;
	public static final Long ID_CUESTIONARIO_SEGUIMIENTO_EGRESADOS_POSGRADO = 15L;
	public static final Integer CLV_AREA_TS = 18;
	public static final String ID_ESTATUS_CUESTIONARIO_PENDIENTE = "p";
	
	public static final Integer PARAM_ASIGNACION_CUEST_PER_EGRESO_ANIO = 2012;
	public static final String PARAM_ASIGNACION_CUEST_PER_EGRESO_COMPLETO = "2012-4-3";
	
	/**
	  * Constantes para AdminEmpleados
	  */

	 public static final int ID_PUESTO_SIN_PUESTO = 52;
	 public static final int SNI_NINGUNO = 5;
	 public static final String ID_NIVEL_ESDEPED_NO = "NO";
	 public static final int NM_ORDEN = 1;
	 public static final int CL_ESTATUS_PERFIL_DESEABLE_NO = 2;
   
		/**
	  * Constantes para BAJA
	  */
	 public static final int ID_ESTATUS_RESGUARDO_BAJA_DEFINITIVA = 5;
	 public static final int ID_BAJA_ESTATUS_SOLICITUD = 1;
	 public static final int ID_BAJA_ESTATUS_ACEPTADA = 2;
	 
	 public static final Long ID_INSTITUCION_BANORTE = 11118L;
	 public static final Long ID_INSTITUCION_SCOTIABANK = 12126L;
	 
	 public static final String ID_DOC_CERTIFICADO_LIC_ELEC = "86";
     public static final String ID_DOC_CERTIFICADO_MTRIA_ELEC = "87";
     public static final String ID_DOC_CERTIFICADO_DOC_ELEC = "88";
     public static final String ID_DOC_CARTA_PASANTE = "82";
     
     /**
	  * Constantes para visitantes
	  */
	 public static final Integer ESTATUS_ACTIVO_CHEC = 1;
	 
	 /**
	  * Constantes ruta imagenes
	  */
	 public static final String RUTA_IMAGENES_REPORTES = "./imagenes/";
}
