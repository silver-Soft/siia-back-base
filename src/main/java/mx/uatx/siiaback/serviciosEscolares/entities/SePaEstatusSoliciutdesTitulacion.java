package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEstatusSoliciutdesTitulacion {


	@Id
    @Column(name = "ID")
	private String idEstatusSolicitud;
    
    @Column(name = "DESCRIPCION")
    private String dsDescripcion;
    
    

	public String getIdEstatusSolicitud() {
		return idEstatusSolicitud;
	}

	public void setIdEstatusSolicitud(String idEstatusSolicitud) {
		this.idEstatusSolicitud = idEstatusSolicitud;
	}

	public String getDsDescripcion() {
		return dsDescripcion;
	}

	public void setDsDescripcion(String dsDescripcion) {
		this.dsDescripcion = dsDescripcion;
	}
    
    
    
	
}
