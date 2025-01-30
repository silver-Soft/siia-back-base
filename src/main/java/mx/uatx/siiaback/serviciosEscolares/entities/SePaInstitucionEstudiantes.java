package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaInstitucionEstudiantes {
	
	@Id
	@Column(name = "IDINSTITUCION")
	private Long idInstitucion;
	
	@Column(name = "NMINSTITUCION")
	private String nmInstitucion;
	
	public Long getIdInstitucion() {
		return idInstitucion;
	}
	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	public String getNmInstitucion() {
		return nmInstitucion;
	}
	public void setNmInstitucion(String nmInstitucion) {
		this.nmInstitucion = nmInstitucion;
	}

}
