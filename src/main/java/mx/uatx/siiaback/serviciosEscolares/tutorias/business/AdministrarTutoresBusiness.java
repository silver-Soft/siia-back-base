
package mx.uatx.siiaback.serviciosEscolares.tutorias.business;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;


import mx.uatx.siiaback.serviciosEscolares.comun.dao.ProgramasEducativosDAO;
import mx.uatx.siiaback.serviciosEscolares.comun.dto.ProgramaEducativoTO;

@Service
@Configurable
public class AdministrarTutoresBusiness implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3602953008470618577L;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	protected transient ProgramasEducativosDAO programasDAO;
	
	
	public List<ProgramaEducativoTO> obtenerProgramasEducativos(final String strLogin) {

		return programasDAO.obtenerProgramasEducativos(strLogin);
	}
	
	
	
}
