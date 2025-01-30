package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoCalificacionEstudiantes {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TIPO")
	private String tipoCalificacion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoCalificacion() {
		return tipoCalificacion;
	}
	public void setTipoCalificacion(String tipoCalificacion) {
		this.tipoCalificacion = tipoCalificacion;
	}

}
