package mx.uatx.siiaback.serviciosEscolares.tutorias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.uatx.siiaback.serviciosEscolares.tutorias.business.AdministrarTutoresBusiness;
import mx.uatx.siiaback.serviciosEscolares.tutorias.dto.BusquedaTutoresTO;

import mx.uatx.siiaback.serviciosEscolares.comun.dto.ProgramaEducativoTO;


@RestController
@RequestMapping("/api/base") 
public class AdministrarTutoresService {
	
	@Autowired
	private AdministrarTutoresBusiness administrarTutoresBusiness;
	
	@PostMapping(value = "/obtProgramas")
	public List<ProgramaEducativoTO> llenarListadoProgramasEducativos(@RequestBody BusquedaTutoresTO to) {
		List<ProgramaEducativoTO> lst = administrarTutoresBusiness.obtenerProgramasEducativos(to.getStrUsuario());
		return lst;
	}
	
	
}
