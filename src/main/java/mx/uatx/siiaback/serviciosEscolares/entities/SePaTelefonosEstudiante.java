package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTelefonosEstudiante {
	
	@Id
	@Column(name = "IDPERSONATELEFONO")
	private Long idTelefono;
	
	@Column(name = "NMTELEFONO")
	private String nmTelefono;
	
	@Column(name = "DSTIPOTELEFONO")
	private String dsTipoTelefono;

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getNmTelefono() {
		return nmTelefono;
	}

	public void setNmTelefono(String nmTelefono) {
		this.nmTelefono = nmTelefono;
	}

	public String getDsTipoTelefono() {
		return dsTipoTelefono;
	}

	public void setDsTipoTelefono(String dsTipoTelefono) {
		this.dsTipoTelefono = dsTipoTelefono;
	}

}
