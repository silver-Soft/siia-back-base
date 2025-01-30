package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaPrValActasAbiertas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1620384598143611138L;
	@Id
	@Column(name = "IDACTA")
	private Long lngIdActa;

	public SePaPrValActasAbiertas() {
		super();
	}

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}
		
}
