package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTutoresEstudiante {
	
	@Id
	@Column(name = "IDTUTOR")
	private Long idTutor;
	
	@Column(name = "DSPERIODOMES")
	private String dsPeridoEscolar;
	
	@Column(name = "TUTOR")
	private String nbTutor;

	public Long getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Long idTutor) {
		this.idTutor = idTutor;
	}

	public String getDsPeridoEscolar() {
		return dsPeridoEscolar;
	}

	public void setDsPeridoEscolar(String dsPeridoEscolar) {
		this.dsPeridoEscolar = dsPeridoEscolar;
	}

	public String getNbTutor() {
		return nbTutor;
	}

	public void setNbTutor(String nbTutor) {
		this.nbTutor = nbTutor;
	}
	
	

}
