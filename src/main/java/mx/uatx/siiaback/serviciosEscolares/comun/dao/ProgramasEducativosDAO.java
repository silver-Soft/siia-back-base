package mx.uatx.siiaback.serviciosEscolares.comun.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;


import mx.uatx.siiaback.serviciosEscolares.comun.dto.ProgramaEducativoTO;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtProgramaCampus;
//import mx.uatx.siia.serviciosEscolares.modelo.SePaObtProgramaCampus;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class ProgramasEducativosDAO implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1445039064441698965L;
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	

        @Autowired
	private EntityManager em;	

	
	/**
	 * Obtener los programas educativos que imparten las facultades
	 * @return List<ProgramaEducativoTO>
	 */
		public List<ProgramaEducativoTO> obtenerProgramasEducativos(final String strLogin) {
		List<ProgramaEducativoTO> lstResultado = new ArrayList<ProgramaEducativoTO>();
	
		StoredProcedureQuery storedProcedure = em.createStoredProcedureQuery("SERESC.SEPGSIIA.PROBTPROGRAMASCAMPUS", SePaObtProgramaCampus.class);
		storedProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);//V_IDAREACAMPUS IN NUMBER
		storedProcedure.registerStoredProcedureParameter(2, void.class, ParameterMode.REF_CURSOR);//RESULTADOS OUT SYS_REFCURSOR
		
		
		storedProcedure.setParameter(1, strLogin);
		
		@SuppressWarnings("unchecked")
		List<SePaObtProgramaCampus> resq = storedProcedure.getResultList();
		
		if (null != resq) {
			ProgramaEducativoTO programa ;
			
			for (SePaObtProgramaCampus it : resq) {
				
				programa = new ProgramaEducativoTO();
				BeanUtils.copyProperties(it, programa);
				
				lstResultado.add(programa);
			}
		}
	
		return lstResultado;
    }
		
	

	
}