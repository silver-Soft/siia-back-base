package mx.uatx.siiaback.serviciosEscolares.tutorias.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtDtProyectoDeVida;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaTutoradosPrograma;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.ProyectoSentidoVidaTO;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.TutoradoProgramaTO;

@Repository
public class ConsultarProyectoSentidoVidaDAO implements Serializable {
	@Autowired
	private EntityManager em;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public List<TutoradoProgramaTO> obtenerTutoradosPrograma(final String strIdPeriodo,final Integer intIdProgEduca){
		List<TutoradoProgramaTO> resTutProg = new ArrayList<TutoradoProgramaTO>();
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTTUTORADOSPORPROGRAMA", SePaTutoradosPrograma.class);
		storedProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);//V_IDPERIODO IN VARCHAR
		storedProcedure.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);//V_IDPROGRAMACAMPUS IN NUMBER	
		storedProcedure.registerStoredProcedureParameter(3, void.class, ParameterMode.REF_CURSOR);//RESULTADOS OUT SYS_REFCURSOR
		
		storedProcedure.setParameter(1, strIdPeriodo);
		storedProcedure.setParameter(2, intIdProgEduca);
		
		@SuppressWarnings("unchecked")
		List<SePaTutoradosPrograma> resq = storedProcedure.getResultList();
		
		if (null != resq) {
			for (SePaTutoradosPrograma it : resq) {
				resTutProg.add(new TutoradoProgramaTO(it));
			}
		}
		return resTutProg;
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public List<ProyectoSentidoVidaTO> obtenerProyectosSentidoVida(final long lngIdHistorialAcademico){
		List<ProyectoSentidoVidaTO> resProySentVida = new ArrayList<ProyectoSentidoVidaTO>();
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("SERESC.SEPGTUTORIAS.PROBTDTPROYECTODEVIDA", SePaObtDtProyectoDeVida.class);
		storedProcedure.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);//V_IDHISTORIALACADEMICO IN LONG
		storedProcedure.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);//RESULTADOS OUT SYS_REFCURSOR
		
		storedProcedure.setParameter(1, lngIdHistorialAcademico);
		
		@SuppressWarnings("unchecked")
		List<SePaObtDtProyectoDeVida> resq = storedProcedure.getResultList();
		
		if (null != resq) {
			for (SePaObtDtProyectoDeVida it : resq) {
				resProySentVida.add(new ProyectoSentidoVidaTO(it));
			}
		}
		return resProySentVida;
	}
}