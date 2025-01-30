package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaFamiliaresEstudiante {
	
	@Id
	@Column(name = "IDFAMILIAR")
	private Long idFamiliar;
	
	@Column(name = "NOMBRE")
	private String nbFamiliar;
	
	@Column(name = "DSPARENTEZCO")
	private String dsParentesco;
	
	@Column(name = "CLSTDEPENDENCIAECONOMICA")
	private Integer clDependenciaEconomica;

	public Long getIdFamiliar() {
		return idFamiliar;
	}

	public void setIdFamiliar(Long idFamiliar) {
		this.idFamiliar = idFamiliar;
	}

	public String getNbFamiliar() {
		return nbFamiliar;
	}

	public void setNbFamiliar(String nbFamiliar) {
		this.nbFamiliar = nbFamiliar;
	}

	public String getDsParentesco() {
		return dsParentesco;
	}

	public void setDsParentesco(String dsParentesco) {
		this.dsParentesco = dsParentesco;
	}

	public Integer getClDependenciaEconomica() {
		return clDependenciaEconomica;
	}

	public void setClDependenciaEconomica(Integer clDependenciaEconomica) {
		this.clDependenciaEconomica = clDependenciaEconomica;
	}


}
