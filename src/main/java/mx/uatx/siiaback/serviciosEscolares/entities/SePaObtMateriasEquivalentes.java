package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasEquivalentes {
	
	@Id
	@Column(name = "IDEQUIVALENCIA")
	private Long idEquivalencia;
	
	@Column(name = "IDPLANMATERIAEQ")
	private Long idPlanMateriaEq;
	
	@Column(name = "DSMATERIA")
	private String dsMateria;

	public Long getIdEquivalencia() {
		return idEquivalencia;
	}

	public void setIdEquivalencia(Long idEquivalencia) {
		this.idEquivalencia = idEquivalencia;
	}

	public Long getIdPlanMateriaEq() {
		return idPlanMateriaEq;
	}

	public void setIdPlanMateriaEq(Long idPlanMateriaEq) {
		this.idPlanMateriaEq = idPlanMateriaEq;
	}

	public String getDsMateria() {
		return dsMateria;
	}

	public void setDsMateria(String dsMateria) {
		this.dsMateria = dsMateria;
	}

}
