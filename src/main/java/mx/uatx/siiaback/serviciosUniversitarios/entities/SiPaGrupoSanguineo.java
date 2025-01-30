package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaGrupoSanguineo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1073278445306672282L;

	@Id
	@Column(name = "IDGRUPOSANGUINEO")
	private Integer intIdGrupoSanguineo;

	@Column(name = "DSGRUPOSANGUINEO")
	private String strDsGrupoSanguineo;

	public SiPaGrupoSanguineo() {
		super();
	}

	public Integer getIntIdGrupoSanguineo() {
		return intIdGrupoSanguineo;
	}

	public void setIntIdGrupoSanguineo(Integer intIdGrupoSanguineo) {
		this.intIdGrupoSanguineo = intIdGrupoSanguineo;
	}

	public String getStrDsGrupoSanguineo() {
		return strDsGrupoSanguineo;
	}

	public void setStrDsGrupoSanguineo(String strDsGrupoSanguineo) {
		this.strDsGrupoSanguineo = strDsGrupoSanguineo;
	}

}
