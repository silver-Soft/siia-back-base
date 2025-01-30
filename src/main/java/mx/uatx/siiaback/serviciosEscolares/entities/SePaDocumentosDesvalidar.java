package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDocumentosDesvalidar {
	
	
	@Id
    @Column(name = "IDDOCUMENTOPERSONA")
	private Integer idDocumentoPersona;

	
	
	public Integer getIdDocumentoPersona() {
		return idDocumentoPersona;
	}

	public void setIdDocumentoPersona(Integer idDocumentoPersona) {
		this.idDocumentoPersona = idDocumentoPersona;
	}

	
}
