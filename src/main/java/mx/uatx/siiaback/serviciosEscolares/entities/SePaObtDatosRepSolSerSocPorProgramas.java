package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosRepSolSerSocPorProgramas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6998823832452855675L;
	@Id
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "NUMERO")
	private Long lngNumero;
	
	public SePaObtDatosRepSolSerSocPorProgramas() {
		super();
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public Long getLngNumero() {
		return lngNumero;
	}

	public void setLngNumero(Long lngNumero) {
		this.lngNumero = lngNumero;
	}
	
}
