package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMotivosRechazoFotoFirma {
	
	@Id
	@Column(name = "ID")
	private Integer idMotivo;
	
	@Column(name = "DSRESPUESTA")
	private String dsMotivo;

	public Integer getIdMotivo() {
		return idMotivo;
	}

	public void setIdMotivo(Integer idMotivo) {
		this.idMotivo = idMotivo;
	}

	public String getDsMotivo() {
		return dsMotivo;
	}

	public void setDsMotivo(String dsMotivo) {
		this.dsMotivo = dsMotivo;
	}

}
