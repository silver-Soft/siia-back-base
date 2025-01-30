package mx.uatx.siiaback.serviciosEscolares.tutorias.dao;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mx.uatx.siiaback.serviciosEscolares.entities.SeAxTutorias;
import mx.uatx.siiaback.serviciosEscolares.entities.SeDtTareasPlanDTrabajo;
import mx.uatx.siiaback.serviciosEscolares.entities.SeMsDiagnosticosIniciales;
import mx.uatx.siiaback.serviciosEscolares.entities.SeMsTutorias;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtBitacoraTutoriasTutor;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtDiagnosticoPlanTutorado;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtPeriodosTutoriasTutor;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtTareasPlanTutorado;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtTutoradosTutor;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.DiagnosticoPlanTutoradoTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.PeriodoTutoriaTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.RealizarTutoriaTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.TareaPlanTutoradoTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.TutoradoTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.TutoriaBitacora;
import mx.uatx.siiaback.serviciosUniversitarios.constantes.Constantes;
import mx.uatx.siiaback.serviciosUniversitarios.dto.ResultadoTO;
import mx.uatx.siiaback.serviciosUniversitarios.enums.SeveridadMensajeEnum;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class RealizarTutoriasDAO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4263406589904916707L;

	@Autowired
	private EntityManager em;

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	private FechaHelper fcHelp = new FechaHelper();

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<PeriodoTutoriaTO> obtenerPeriodosTutor(final Long lngIdHistorialLaboral) {

		final List<PeriodoTutoriaTO> lstPeriodos = new ArrayList<PeriodoTutoriaTO>();

		final StoredProcedureQuery storedProcedureDatosAlumno = em.createStoredProcedureQuery(
				"SERESC.SEPGTUTORIAS.PROBTPERIODOSTUTORIASTUTOR", SePaObtPeriodosTutoriasTutor.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);// P_IDHISTLAB_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);// P_PERIODOS_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, lngIdHistorialLaboral);

		storedProcedureDatosAlumno.execute();

		@SuppressWarnings("unchecked")
		final List<SePaObtPeriodosTutoriasTutor> lstSecciones = storedProcedureDatosAlumno.getResultList();

		for (SePaObtPeriodosTutoriasTutor it : lstSecciones) {
			lstPeriodos.add(new PeriodoTutoriaTO(it));
		}
		return lstPeriodos;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<TutoradoTO> buscarTutorados(final RealizarTutoriaTO tutoradoBuscar) throws Exception {

		final List<TutoradoTO> lstTutorados = new ArrayList<TutoradoTO>();

		StoredProcedureQuery storedProcedureDatosAlumno = em
				.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTTUTORADOSTUTOR", SePaObtTutoradosTutor.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);// P_IDHISTLAB_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);// P_IDPERIODO_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(3, void.class, ParameterMode.REF_CURSOR);// P_PERIODOS_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, tutoradoBuscar.getLngIdHistorialLaboral());
		storedProcedureDatosAlumno.setParameter(2, tutoradoBuscar.getStrIdPeriodo());

		storedProcedureDatosAlumno.execute();

		@SuppressWarnings("unchecked")
		final List<SePaObtTutoradosTutor> lstSecciones = storedProcedureDatosAlumno.getResultList();

		for (SePaObtTutoradosTutor it : lstSecciones) {
			lstTutorados.add(new TutoradoTO(it));
		}
		return lstTutorados;
	}
	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<TutoradoTO> buscarTutoradosPorPrograma(final RealizarTutoriaTO tutoradoBuscar) throws Exception {

		final List<TutoradoTO> lstTutorados = new ArrayList<TutoradoTO>();

		StoredProcedureQuery storedProcedureDatosAlumno = em
				.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTTUTORADOSTUTORPORPROGRAMA", SePaObtTutoradosTutor.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);// P_IDHISTLAB_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);// P_IDPERIODO_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);// P_IDPERIODO_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(4, void.class, ParameterMode.REF_CURSOR);// P_PERIODOS_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, tutoradoBuscar.getLngIdHistorialLaboral());
		storedProcedureDatosAlumno.setParameter(2, tutoradoBuscar.getStrIdPeriodo());
		storedProcedureDatosAlumno.setParameter(3, tutoradoBuscar.getIntIdProgramaCampus());

		storedProcedureDatosAlumno.execute();

		@SuppressWarnings("unchecked")
		final List<SePaObtTutoradosTutor> lstSecciones = storedProcedureDatosAlumno.getResultList();

		for (SePaObtTutoradosTutor it : lstSecciones) {
			lstTutorados.add(new TutoradoTO(it));
		}
		return lstTutorados;
	}
	
	

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public ResultadoTO validarAgregarTutoria(final RealizarTutoriaTO agregarTutoriaTo) throws Exception {
		final ResultadoTO res = new ResultadoTO(true);

		final StoredProcedureQuery storedProcedureDatosAlumno = em.createStoredProcedureQuery(
				"SERESC.SEPGTUTORIAS.PROBTDATOSSIGUIENTETUTORIA", SePaObtTutoradosTutor.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);// P_IDSTUTOR_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, Boolean.class, ParameterMode.OUT);// P_PERMITEREALIZARTUTORIA_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(3, Integer.class, ParameterMode.OUT);// P_NMTUTORIA_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(4, Boolean.class, ParameterMode.OUT);// P_ESPROYECTODEVIDA_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		
		storedProcedureDatosAlumno.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);// P_MENSAJE_IN_VARCHAR2

		storedProcedureDatosAlumno.setParameter(1, agregarTutoriaTo.getStrIdsTutorados());

		storedProcedureDatosAlumno.execute();

		agregarTutoriaTo.setBlnPermiteRealizarTutoria((Boolean) storedProcedureDatosAlumno.getOutputParameterValue(2));

		final Object intNumeroTutoria = storedProcedureDatosAlumno.getOutputParameterValue(3);
		if (intNumeroTutoria != null) {
			agregarTutoriaTo.setIntNumeroTutoria(Integer.parseInt(intNumeroTutoria.toString()));
		}

		agregarTutoriaTo.setBlnEsProyectoVida((Boolean) storedProcedureDatosAlumno.getOutputParameterValue(4));

		if (agregarTutoriaTo.isBlnEsProyectoVida()) {
			agregarTutoriaTo.setStrAsunto(Constantes.ASUNTO_TUTORIA_PROYECTO_VIDA);
		}

		final Object strMensaje = storedProcedureDatosAlumno.getOutputParameterValue(5);
		if (strMensaje != null) {
			res.agregarMensajeValidacion(SeveridadMensajeEnum.ALERTA, strMensaje.toString());
		}
		
		
		
		final Object strFisica = storedProcedureDatosAlumno.getOutputParameterValue(6);
		if (strFisica != null) {
			agregarTutoriaTo.setStrFisica(strFisica.toString());
		}
		
		final Object strCognitiva = storedProcedureDatosAlumno.getOutputParameterValue(7);
		if (strCognitiva != null) {
			agregarTutoriaTo.setStrCognitiva(strCognitiva.toString());
		}
		
		final Object strAfectivo = storedProcedureDatosAlumno.getOutputParameterValue(8);
		if (strAfectivo != null) {
			agregarTutoriaTo.setStrAfectiva(strAfectivo.toString());
		}		
		
		final Object strProductivo = storedProcedureDatosAlumno.getOutputParameterValue(9);
		if (strProductivo != null) {
			agregarTutoriaTo.setStrProductiva(strProductivo.toString());
		}		
		
		final Object strSocial = storedProcedureDatosAlumno.getOutputParameterValue(10);
		if (strSocial != null) {
			agregarTutoriaTo.setStrSocial(strSocial.toString());
		}		
		
		final Object strEspiritual = storedProcedureDatosAlumno.getOutputParameterValue(11);
		if (strEspiritual != null) {
			agregarTutoriaTo.setStrEspiritual(strEspiritual.toString());
		}

		
		
		res.setBlnValido(agregarTutoriaTo.isBlnPermiteRealizarTutoria());
		res.setObjeto(agregarTutoriaTo);

		return res;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void guardarTutoria(final RealizarTutoriaTO realizarTutoria) throws Exception {

		final SeMsTutorias entidadTut = new SeMsTutorias();

		entidadTut.setIntNumTutoria(realizarTutoria.getIntNumeroTutoria());

		entidadTut.setStrFisica(realizarTutoria.getStrFisica());
		entidadTut.setStrCognitiva(realizarTutoria.getStrCognitiva());
		entidadTut.setStrAfectiva(realizarTutoria.getStrAfectiva());
		entidadTut.setStrProductiva(realizarTutoria.getStrProductiva());
		entidadTut.setStrSocial(realizarTutoria.getStrSocial());
		entidadTut.setStrEspiritual(realizarTutoria.getStrEspiritual());

		entidadTut.setFcTutoria(realizarTutoria.getFcTutoria());
		entidadTut.setStrUsuarioAudit(realizarTutoria.getStrUsuarioAudit());
		entidadTut.setFcAudit(realizarTutoria.getFcAudit());
		entidadTut.setStrTipoTutoria(realizarTutoria.getIntTipoTutoria().toString());
		entidadTut.setStrAsunto(realizarTutoria.getStrAsunto());
		entidadTut.setStrObservacion(realizarTutoria.getStrObservacionesPrivadas());
		entidadTut.setStrResumen(realizarTutoria.getStrDescripcion());

		em.persist(entidadTut);
		em.flush();

		SeAxTutorias relTuturiaEntidad = null;
		for (Long it : realizarTutoria.getLstTutorados()) {

			relTuturiaEntidad = new SeAxTutorias();
			relTuturiaEntidad.setIdtutor(it);
			relTuturiaEntidad.setIdtutoria(entidadTut.getLngIdTutoria());
			relTuturiaEntidad.setFcaudit(entidadTut.getFcAudit());
			
			relTuturiaEntidad.setUsuarioaudit(entidadTut.getStrUsuarioAudit());
						
			relTuturiaEntidad.setNmtutoria(obtenerNumeroTutoria(it));
			
			relTuturiaEntidad.setClestatustutoria(Constantes.ESTATUS_TUTORIA_REALIZADA);

			em.persist(relTuturiaEntidad);
		}
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void eliminarTutoriaAx(final Long idTutoriaAx) throws Exception {
		em.remove(em.find(SeAxTutorias.class, idTutoriaAx));
    }

	@Transactional(rollbackFor = Exception.class)
	public byte[] obtenerDocumentoCeneval(final Long lngIdSolicitudIngreso) throws Exception {

		final StoredProcedureQuery storedProcedure = em
				.createStoredProcedureQuery("SERESC.SEPGASPIRANTES.PROBTCOMPROBANTECENEVAL");
		storedProcedure.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);// P_IDSOLICITUDINGRESO_IN_NUMBER
		storedProcedure.registerStoredProcedureParameter(2, Blob.class, ParameterMode.OUT);// P_COMPROBANTECENEVAL_OUT_BLOB

		storedProcedure.setParameter(1, lngIdSolicitudIngreso);
		storedProcedure.execute();

		final Object res = storedProcedure.getOutputParameterValue(2);

		if (null != res) {

			final Blob tmpBlob = (Blob) res;
			final int blobLength = (int) tmpBlob.length();
			final byte[] byteResultado = tmpBlob.getBytes(1, blobLength);
			tmpBlob.free();

			return byteResultado;
		}

		return null;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<DiagnosticoPlanTutoradoTO> obtenerDiagnosticoPlanTutorado(final TutoradoTO tutorado) throws Exception {

		final List<DiagnosticoPlanTutoradoTO> lstDiagnosticoPlanTutorado = new ArrayList<DiagnosticoPlanTutoradoTO>();

		StoredProcedureQuery storedProcedureDatosAlumno = em
				.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTDIAGNOSTICOPLANTUTORADO", SePaObtDiagnosticoPlanTutorado.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);//P_IDTUTOR_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);//P_BITACORAPLAN_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, tutorado.getLngIdTutor());

		@SuppressWarnings("unchecked")
		final List<SePaObtDiagnosticoPlanTutorado> lstSecciones = storedProcedureDatosAlumno.getResultList();

		for (SePaObtDiagnosticoPlanTutorado it : lstSecciones) {
			lstDiagnosticoPlanTutorado.add(new DiagnosticoPlanTutoradoTO(it, tutorado.getLngIdTutor()));
		}
		return lstDiagnosticoPlanTutorado;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void guardarDiagnostico(final DiagnosticoPlanTutoradoTO diagnosticoPlanTo) throws Exception {
		SeMsDiagnosticosIniciales entidad = null;
		
		if (diagnosticoPlanTo.getLngIdDiagnosticoInicial() == null || diagnosticoPlanTo.getLngIdDiagnosticoInicial().equals(0l)) {
			entidad = new SeMsDiagnosticosIniciales();
			
			entidad.setLngIdTutor(diagnosticoPlanTo.getLngIdTutor());
		} else {
			entidad = em.find(SeMsDiagnosticosIniciales.class, diagnosticoPlanTo.getLngIdDiagnosticoInicial());
			em.refresh(entidad);
		}
		
		if (entidad.getFcDiagnosticoInicial() == null) {
			entidad.setFcDiagnosticoInicial(diagnosticoPlanTo.getFcAudit());
		}
		
		entidad.setStrUsuarioAudit(diagnosticoPlanTo.getStrUsuarioAudit());
		entidad.setFcAudit(diagnosticoPlanTo.getFcAudit());
		
		entidad.setStrDiagnosticoInicial(diagnosticoPlanTo.getStrDiagnosticoInicial());		
		entidad.setFcModDiagnosticoInicial(diagnosticoPlanTo.getFcAudit());		

		if (diagnosticoPlanTo.getLngIdDiagnosticoInicial() == null || diagnosticoPlanTo.getLngIdDiagnosticoInicial().equals(0l)) {
			em.persist(entidad);
			em.flush();
		} else {
			em.merge(entidad);
			em.flush();
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<TareaPlanTutoradoTO> obtenerTareasPlanTutorado(final DiagnosticoPlanTutoradoTO diagnosticoPlanTo) throws Exception {

		final List<TareaPlanTutoradoTO> lstTareas = new ArrayList<TareaPlanTutoradoTO>();

		StoredProcedureQuery storedProcedureDatosAlumno = em
				.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTTAREASPLANTUTORADO", SePaObtTareasPlanTutorado.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);//P_IDDIAGNOSTICOINICIAL_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);//P_TAREASPLAN_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, diagnosticoPlanTo.getLngIdDiagnosticoInicial());
		
		@SuppressWarnings("unchecked")
		final List<SePaObtTareasPlanTutorado> lstSecciones = storedProcedureDatosAlumno.getResultList();

		for (SePaObtTareasPlanTutorado it : lstSecciones) {
			lstTareas.add(new TareaPlanTutoradoTO(it, fcHelp));
		}
		return lstTareas;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void guardarTareaPlanTrabajo(final TareaPlanTutoradoTO tareaTO) throws Exception {
		final SeDtTareasPlanDTrabajo entidad = new SeDtTareasPlanDTrabajo();
		
		entidad.setLngIdDiagnosticoInicial(tareaTO.getLngIdDiagnosticoInicial());
		entidad.setIntClEstatusTareaPlan(tareaTO.getIntClEstatusTareaPlan());
		entidad.setStrUsuarioAudit(tareaTO.getStrUsuarioAudit());
		entidad.setFcAudit(tareaTO.getFcAudit());
		entidad.setFcInicioAreaPlan(tareaTO.getFcInicioTareaPlan());
		entidad.setFcFinAreaPlan(tareaTO.getFcFinTareaPlan());
		entidad.setStrTareaPlan(tareaTO.getStrTareaPlan());
		
		em.persist(entidad);
		em.flush();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void concluirTareaPlanTrabajo(final TareaPlanTutoradoTO tareaTO) throws Exception {
		final SeDtTareasPlanDTrabajo entidad = em.find(SeDtTareasPlanDTrabajo.class, tareaTO.getLngIdTareaPlanTrabajo());
		
		entidad.setIntClEstatusTareaPlan(tareaTO.getIntClEstatusTareaPlan());
		entidad.setStrUsuarioAudit(tareaTO.getStrUsuarioAudit());
		entidad.setFcAudit(tareaTO.getFcAudit());
		
		em.merge(entidad);
		em.flush();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void eliminarTareaPlanTrabajo(final Long lngIdTareaPlanTrabajo) throws Exception {
		em.remove(em.find(SeDtTareasPlanDTrabajo.class, lngIdTareaPlanTrabajo));
    }
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void guardarPlanTrabajo(final DiagnosticoPlanTutoradoTO diagnosticoPlanTo) throws Exception {
		SeMsDiagnosticosIniciales entidad = null;
		
		if (diagnosticoPlanTo.getLngIdDiagnosticoInicial() == null || diagnosticoPlanTo.getLngIdDiagnosticoInicial().equals(0l)) {
			entidad = new SeMsDiagnosticosIniciales();
			entidad.setLngIdTutor(diagnosticoPlanTo.getLngIdTutor());
		} else {
			entidad = em.find(SeMsDiagnosticosIniciales.class, diagnosticoPlanTo.getLngIdDiagnosticoInicial());
			em.refresh(entidad);
		}

		if (entidad.getFcPlanTrabajo() == null) {
			entidad.setFcPlanTrabajo(diagnosticoPlanTo.getFcAudit());
		}
		
		entidad.setStrUsuarioAudit(diagnosticoPlanTo.getStrUsuarioAudit());
		entidad.setFcAudit(diagnosticoPlanTo.getFcAudit());
		
		entidad.setFcModPlanTrabajo(diagnosticoPlanTo.getFcAudit());
		entidad.setStrConclusion(diagnosticoPlanTo.getStrConclusion());
		entidad.setStrObjetivo(diagnosticoPlanTo.getStrObjetivo());		

		if (diagnosticoPlanTo.getLngIdDiagnosticoInicial() == null || diagnosticoPlanTo.getLngIdDiagnosticoInicial().equals(0l)) {
			em.persist(entidad);
			em.flush();
			
			diagnosticoPlanTo.setLngIdDiagnosticoInicial(entidad.getLngIdDiagnosticoInicial());
		} else {
			em.merge(entidad);
			em.flush();
		}
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<TutoriaBitacora> consultarBitacora(final TutoradoTO tutoriadoTO) throws Exception {

		final List<TutoriaBitacora> lstTutorias = new ArrayList<TutoriaBitacora>();

		StoredProcedureQuery storedProcedureDatosAlumno = em
				.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTBITACORATUTORIASTUTOR", SePaObtBitacoraTutoriasTutor.class);

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);//P_IDTUTOR_IN_NUMBER
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);//P_BITACORA_OUT_SYS_REFCURSOR

		storedProcedureDatosAlumno.setParameter(1, tutoriadoTO.getLngIdTutor());

		@SuppressWarnings("unchecked")
		final List<SePaObtBitacoraTutoriasTutor> lstTutoriasRes = storedProcedureDatosAlumno.getResultList();

		for (SePaObtBitacoraTutoriasTutor it : lstTutoriasRes) {
			lstTutorias.add(new TutoriaBitacora(it, fcHelp));
		}
		return lstTutorias;
	}
	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public Integer obtenerNumeroTutoria(Long it) throws Exception {
	
		final StoredProcedureQuery storedProcedureDatosAlumno = em.createStoredProcedureQuery(
				"SERESC.SEPGTUTORIAS.PROBTNUMEROTUTORIA");

		storedProcedureDatosAlumno.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);// P_IDSTUTOR_IN_VARCHAR2
		storedProcedureDatosAlumno.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);// P_PERMITEREALIZARTUTORIA_IN_NUMBER
		

		storedProcedureDatosAlumno.setParameter(1, it);

		storedProcedureDatosAlumno.execute();

		 Integer noTutoria = (Integer) storedProcedureDatosAlumno.getOutputParameterValue(2);


		return noTutoria;
	}
}
