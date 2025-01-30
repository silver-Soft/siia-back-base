package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCostoAspiranteFicha {
	
	@Id
	@Column(name = "IDCONVOCATORIA")
	private Long lngIdPagoRecibo;

	public Long getLngIdPagoRecibo() {
		return lngIdPagoRecibo;
	}

	public void setLngIdPagoRecibo(Long lngIdPagoRecibo) {
		this.lngIdPagoRecibo = lngIdPagoRecibo;
	}
	
	}
