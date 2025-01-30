package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaRepresentanteRector implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2257282870203658439L;

	@Id
	@Column(name = "IDHISTORIALLABORAL")
	private Integer intIdHostorialLaboral;

	@Column(name = "NOMBRE")
	private String strNombreRepresentante;

	
	public SiPaRepresentanteRector() {
		super();
	}


	public Integer getIntIdHostorialLaboral() {
		return intIdHostorialLaboral;
	}


	public void setIntIdHostorialLaboral(Integer intIdHostorialLaboral) {
		this.intIdHostorialLaboral = intIdHostorialLaboral;
	}


	public String getStrNombreRepresentante() {
		return strNombreRepresentante;
	}


	public void setStrNombreRepresentante(String strNombreRepresentante) {
		this.strNombreRepresentante = strNombreRepresentante;
	}

	
	
	
	

}
