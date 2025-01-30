package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEstatusHistorial {
	
	@Id
	@Column(name = "CLESTATUSHISTACAD")
	private Integer clEstatusHistAcad;
	
	@Column(name = "DSESTATUSHISTACAD")
	private String dsEstatusHistAcad;
	
	
	public Integer getClEstatusHistAcad() {
		return clEstatusHistAcad;
	}
	public void setClEstatusHistAcad(Integer clEstatusHistAcad) {
		this.clEstatusHistAcad = clEstatusHistAcad;
	}
	public String getDsEstatusHistAcad() {
		return dsEstatusHistAcad;
	}
	public void setDsEstatusHistAcad(String dsEstatusHistAcad) {
		this.dsEstatusHistAcad = dsEstatusHistAcad;
	}

}
