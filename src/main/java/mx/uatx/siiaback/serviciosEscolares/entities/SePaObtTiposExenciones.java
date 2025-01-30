package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiposExenciones {
	
	@Id
    @Column(name = "CLTIPOEXENCION")
	private Integer clTipoExencion;
	
	@Column(name = "DSTIPOEXENCION")
	private String dsTipoExencion;
	
	public Integer getClTipoExencion() {
		return clTipoExencion;
	}
	public void setClTipoExencion(Integer clTipoExencion) {
		this.clTipoExencion = clTipoExencion;
	}
	public String getDsTipoExencion() {
		return dsTipoExencion;
	}
	public void setDsTipoExencion(String dsTipoExencion) {
		this.dsTipoExencion = dsTipoExencion;
	}

}
