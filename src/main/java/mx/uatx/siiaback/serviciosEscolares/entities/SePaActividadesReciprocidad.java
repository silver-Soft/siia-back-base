package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaActividadesReciprocidad implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3716183031309986621L;

	@Id
	@Column(name = "IDAREAACTIVIDADBECA")
	private Long lngIdAreaActividadBeca;

	@Column(name = "DSAREAACTIVIDADBECA")
	private String strDsAreaActividadBeca;

	public Long getLngIdAreaActividadBeca() {
		return lngIdAreaActividadBeca;
	}

	public void setLngIdAreaActividadBeca(Long lngIdAreaActividadBeca) {
		this.lngIdAreaActividadBeca = lngIdAreaActividadBeca;
	}

	public String getStrDsAreaActividadBeca() {
		return strDsAreaActividadBeca;
	}

	public void setStrDsAreaActividadBeca(String strDsAreaActividadBeca) {
		this.strDsAreaActividadBeca = strDsAreaActividadBeca;
	}

}
