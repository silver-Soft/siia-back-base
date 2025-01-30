package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosRepSolSerSocPorFacultades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1412802944724690653L;
	@Id
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "NUMERO")
	private Long lngNumero;
	
	public SePaObtDatosRepSolSerSocPorFacultades() {
		super();
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public Long getLngNumero() {
		return lngNumero;
	}

	public void setLngNumero(Long lngNumero) {
		this.lngNumero = lngNumero;
	}
	
}
