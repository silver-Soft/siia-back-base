package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoAcreditacionesEstudiantes {
	
	@Id
	@Column(name = "CLTIPOACREDITACION")
	private Long clTipoAcreditacion;
	
	@Column(name = "DSTIPOACREDITACION")
	private String dsTipoAcreditacion;

	public Long getClTipoAcreditacion() {
		return clTipoAcreditacion;
	}

	public void setClTipoAcreditacion(Long clTipoAcreditacion) {
		this.clTipoAcreditacion = clTipoAcreditacion;
	}

	public String getDsTipoAcreditacion() {
		return dsTipoAcreditacion;
	}

	public void setDsTipoAcreditacion(String dsTipoAcreditacion) {
		this.dsTipoAcreditacion = dsTipoAcreditacion;
	}

}
