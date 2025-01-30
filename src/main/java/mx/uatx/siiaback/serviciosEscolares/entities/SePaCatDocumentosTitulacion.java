package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCatDocumentosTitulacion {

	@Id
    @Column(name = "ID")
	private Integer idDocumento;
	
    @Column(name = "DESCRIPCION")
	private String strDocumento;
    
    
    
	public SePaCatDocumentosTitulacion() {

	}

	
	
	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getStrDocumento() {
		return strDocumento;
	}

	public void setStrDocumento(String strDocumento) {
		this.strDocumento = strDocumento;
	}
     
}
