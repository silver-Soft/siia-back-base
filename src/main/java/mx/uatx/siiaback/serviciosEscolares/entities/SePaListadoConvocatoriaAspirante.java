package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaListadoConvocatoriaAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2528318897653106837L;

	@Id
	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;

	@Column(name = "DSCONVOCATORIA")
	private String strDsConvocatoria;

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public String getStrDsConvocatoria() {
		return strDsConvocatoria;
	}

	public void setStrDsConvocatoria(String strDsConvocatoria) {
		this.strDsConvocatoria = strDsConvocatoria;
	}

}
