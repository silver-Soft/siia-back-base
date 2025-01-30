package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeAxActaCargasAutorizar {
	
	@Id
	@Column(name = "IDACTA")
	private Long idActa;
	
	@Column(name = "IDOFERTA")
	private Long idOferta;

	public Long getIdActa() {
		return idActa;
	}

	public void setIdActa(Long idActa) {
		this.idActa = idActa;
	}

	public Long getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(Long idOferta) {
		this.idOferta = idOferta;
	}

}
