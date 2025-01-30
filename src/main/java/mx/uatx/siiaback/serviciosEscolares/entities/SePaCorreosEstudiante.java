package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCorreosEstudiante {
	
	@Id
	@Column(name = "IDPERSONACORREO")
	private Long idCorreo;
	
	@Column(name = "DSCORREO")
	private String correo;
	
	@Column(name = "DSTIPOCORREO")
	private String dsTipoCorreo;

	public Long getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(Long idCorreo) {
		this.idCorreo = idCorreo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDsTipoCorreo() {
		return dsTipoCorreo;
	}

	public void setDsTipoCorreo(String dsTipoCorreo) {
		this.dsTipoCorreo = dsTipoCorreo;
	}

}
