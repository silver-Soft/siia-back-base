package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosArchivo {
	
	@Id
    @Column(name = "REGISTRO")
	private String registroArchivo;

	public String getRegistroArchivo() {
		return registroArchivo;
	}

	public void setRegistroArchivo(String registroArchivo) {
		this.registroArchivo = registroArchivo;
	}
	
	
	
	
	
}
