package mx.uatx.siiaback.serviciosEscolares.tutorias.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import mx.uatx.siiaback.serviciosEscolares.entities.SeAxPeriodosTutorias;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaPeriodoTutoria;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.PeriodoTutoriaTO;
import mx.uatx.siiaback.serviciosUniversitarios.dto.ResultadoTO;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;
import mx.uatx.siiaback.serviciosUniversitarios.entities.SiPaMensajesValidacion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class AdministrarTutoriasDAO implements Serializable {

    /**
	 * serialVersionUID
	 */
    private static final long serialVersionUID = 1382390407678391013L;

    @Autowired
    private EntityManager em;
    
    FechaHelper fcHelper = new FechaHelper();

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public List<PeriodoTutoriaTO> obtenerPeriodosTutoria(final String strIdPeriodo) throws Exception {

            final List<PeriodoTutoriaTO> lstPeriodosTutoria = new ArrayList<PeriodoTutoriaTO>();

            StoredProcedureQuery storedProcedurePerTuto = em.createStoredProcedureQuery(
                            "SERESC.SEPGTUTORIAS.PROBTPERIODOSTUTORIAS", SePaPeriodoTutoria.class);

            storedProcedurePerTuto.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);// P_IDPERIODO IN VARCHAR
            storedProcedurePerTuto.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);// P_PERIODOS OUT SYS_REFCURSOR

            storedProcedurePerTuto.setParameter(1, strIdPeriodo);

            storedProcedurePerTuto.execute();

            @SuppressWarnings("unchecked")
            final List<SePaPeriodoTutoria> lstPer = storedProcedurePerTuto.getResultList();
            
            PeriodoTutoriaTO perTutmp= null;

            for (SePaPeriodoTutoria it : lstPer) {
            	
            	perTutmp= new PeriodoTutoriaTO(it, fcHelper);  
            	
            	lstPeriodosTutoria.add(perTutmp);
            	perTutmp= null;
                    
            }

            return lstPeriodosTutoria;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void guardarPeriodoTutoria(final PeriodoTutoriaTO perTuto){

        SeAxPeriodosTutorias entidad = new SeAxPeriodosTutorias();
        
        if (null == perTuto.getLngIdPeriodoTutoria() || 0 == perTuto.getLngIdPeriodoTutoria()) {
            
            entidad = perTuto.obtenerEntidad(perTuto);
            entidad.setFcAudit(new Date());
            em.persist(entidad);
            
        } else {
            
            entidad = em.find(SeAxPeriodosTutorias.class, perTuto.getLngIdPeriodoTutoria());
            
            entidad.setFcAudit(new Date());
            entidad.setFcFin(perTuto.getFcFin());
            entidad.setFcInicio(perTuto.getFcInicio());
            entidad.setIntNmTutoria(perTuto.getIntNmTutoria());
            entidad.setStrIdPeriodo(perTuto.getStrIdPeriodo());
            entidad.setStrUsuarioAudit(perTuto.getStrUsuarioAudit());
            entidad.setIntIdAreaCampus(perTuto.getIntIdAreaCampus());
            entidad.setIntIdProgramaCampus(perTuto.getIntIdProgramaCampus());
            entidad.setStrPermiso(perTuto.getStrPermiso());
            
            em.merge(entidad);

        }
    }
    
    
    @Transactional(rollbackFor = Exception.class)
    public ResultadoTO validarGuardarPeriodoTutoria(final PeriodoTutoriaTO perTuto) throws Exception {
    	ResultadoTO res = new ResultadoTO(true);
		
        StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PRVALGUARPERIODOTUTORIA", SiPaMensajesValidacion.class);

        storedProcedure.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);//P_IDPERIODOTUTORIA IN NUMBER
        storedProcedure.registerStoredProcedureParameter(2, Date.class, ParameterMode.IN);//P_FCINICIO IN DATE
        storedProcedure.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);//P_FCFIN IN DATE
        storedProcedure.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);//P_NMTUTORIA IN NUMBER
        storedProcedure.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);//P_IDPERIODO IN VARCHAR
        storedProcedure.registerStoredProcedureParameter(6, Integer.class, ParameterMode.OUT);//P_VALIDO OUT NUMBER
        storedProcedure.registerStoredProcedureParameter(7, void.class, ParameterMode.REF_CURSOR);// P_RESULTADOS

        storedProcedure.setParameter(1, perTuto.getLngIdPeriodoTutoria());
        storedProcedure.setParameter(2, null);
        storedProcedure.setParameter(3, null);
        storedProcedure.setParameter(4, perTuto.getIntNmTutoria());
        storedProcedure.setParameter(5, perTuto.getStrIdPeriodo());

        storedProcedure.execute();				

        @SuppressWarnings("unchecked")
        final List<SiPaMensajesValidacion> resq = storedProcedure.getResultList();				
        res.setearListadoMensajesValidacion(resq);	

        final Integer intValido = (Integer) storedProcedure.getOutputParameterValue(6);
        res.setBlnValido(null != intValido && 0 != intValido);

        return res;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public ResultadoTO eliminarPeriodoTutoria(final PeriodoTutoriaTO perTuto) throws Exception {
        ResultadoTO resultadoTO = new ResultadoTO();

        try {

            SeAxPeriodosTutorias periodo = new SeAxPeriodosTutorias();		
            periodo = em.find(SeAxPeriodosTutorias.class, perTuto.getLngIdPeriodoTutoria());
            em.remove(periodo);

            resultadoTO.setBlnValido(true);

            return resultadoTO;

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            resultadoTO.setBlnValido(false);
            return resultadoTO;
        }

    }
}
