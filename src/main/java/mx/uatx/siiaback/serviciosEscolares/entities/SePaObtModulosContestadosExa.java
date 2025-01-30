package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtModulosContestadosExa {
	
	@Id
	@Column(name = "IDAREACONOCIMIENTO")
	private Integer idAreaConocimiento;
	
	@Column(name = "DSAREACONOCIMIENTO")
	private String dsAreaConocimiento;

	public Integer getIdAreaConocimiento() {
		return idAreaConocimiento;
	}

	public void setIdAreaConocimiento(Integer idAreaConocimiento) {
		this.idAreaConocimiento = idAreaConocimiento;
	}

	public String getDsAreaConocimiento() {
		return dsAreaConocimiento;
	}

	public void setDsAreaConocimiento(String dsAreaConocimiento) {
		this.dsAreaConocimiento = dsAreaConocimiento;
	}

}
