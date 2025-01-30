package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReglasCertificado {
	
	@Id
	@Column(name = "IDDOCUMENTOOFICIALPLAN")
	private Integer idDocumentoOficialPlan;
	
	@Column(name = "IDREGLADOCUMENTOOFICIAL")
	private Integer idReglaDocumentoOficial;
	
	@Column(name = "DSVALOR")
	private String dsValor;
	
	@Column(name = "DSREGLADOCUMENTOOFICIAL")
	private String dsReglaDocumentoOficial;
	
	public Integer getIdDocumentoOficialPlan() {
		return idDocumentoOficialPlan;
	}
	public void setIdDocumentoOficialPlan(Integer idDocumentoOficialPlan) {
		this.idDocumentoOficialPlan = idDocumentoOficialPlan;
	}
	public Integer getIdReglaDocumentoOficial() {
		return idReglaDocumentoOficial;
	}
	public void setIdReglaDocumentoOficial(Integer idReglaDocumentoOficial) {
		this.idReglaDocumentoOficial = idReglaDocumentoOficial;
	}
	public String getDsValor() {
		return dsValor;
	}
	public void setDsValor(String dsValor) {
		this.dsValor = dsValor;
	}
	public String getDsReglaDocumentoOficial() {
		return dsReglaDocumentoOficial;
	}
	public void setDsReglaDocumentoOficial(String dsReglaDocumentoOficial) {
		this.dsReglaDocumentoOficial = dsReglaDocumentoOficial;
	}

}
