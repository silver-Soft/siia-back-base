package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaCondicionesSalud implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8675184156106737953L;

	@Id
	@Column(name = "IDCONDICIONSALUD")
	private Long lngIdCondicionSalud;

	@Column(name = "DSCONDICIONSALUD")
	private String strDsCondicionSalud;

	@Column(name = "CLESTATUSESPECIFICAR")
	private Integer intClEstatusEspecificar;

	public Long getLngIdCondicionSalud() {
		return lngIdCondicionSalud;
	}

	public void setLngIdCondicionSalud(Long lngIdCondicionSalud) {
		this.lngIdCondicionSalud = lngIdCondicionSalud;
	}

	public String getStrDsCondicionSalud() {
		return strDsCondicionSalud;
	}

	public void setStrDsCondicionSalud(String strDsCondicionSalud) {
		this.strDsCondicionSalud = strDsCondicionSalud;
	}

	public Integer getIntClEstatusEspecificar() {
		return intClEstatusEspecificar;
	}

	public void setIntClEstatusEspecificar(Integer intClEstatusEspecificar) {
		this.intClEstatusEspecificar = intClEstatusEspecificar;
	}

}
