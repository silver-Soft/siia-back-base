package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPlanesProgramaCampus implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1519573602903072432L;

	@Id
	@Column(name = "IDPLANESTUDIO")
	private Integer intIdPlanEstudio;

	@Column(name = "NBPLANESTUDIO")
	private String strNbPlanEstudio;

	@Column(name = "NMTOTALCREDITOS")
	private Integer intNmTotalCreditos;

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
	}

	public Integer getIntNmTotalCreditos() {
		return intNmTotalCreditos;
	}

	public void setIntNmTotalCreditos(Integer intNmTotalCreditos) {
		this.intNmTotalCreditos = intNmTotalCreditos;
	}

}
