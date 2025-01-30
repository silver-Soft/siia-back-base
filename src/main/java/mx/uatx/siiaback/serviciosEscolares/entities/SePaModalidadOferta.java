package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaModalidadOferta {
	
	@Id
	@Column(name = "IDMODALIDADOFERTA")
	private Integer intIdModalidadOferta;
	
	@Column(name = "NBMODALIDADOFERTA")
	private String strModalidadOferta;
	
	

	public Integer getIntIdModalidadOferta() {
		return intIdModalidadOferta;
	}

	public void setIntIdModalidadOferta(Integer intIdModalidadOferta) {
		this.intIdModalidadOferta = intIdModalidadOferta;
	}

	public String getStrModalidadOferta() {
		return strModalidadOferta;
	}

	public void setStrModalidadOferta(String strModalidadOferta) {
		this.strModalidadOferta = strModalidadOferta;
	}
	
	
	

}
