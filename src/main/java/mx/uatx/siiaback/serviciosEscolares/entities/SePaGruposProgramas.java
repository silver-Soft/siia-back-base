package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaGruposProgramas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6938643957865105056L;
	@Id
	@Column(name = "IDGRUPOPROGRAMA")
	private Integer intIdGrupoPrograma;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "DSPROGRAMACAMPUS")
	private String strDsProgramaCampus;
	
	@Column(name = "DSGRUPOPROGRAMA")
	private String strDsGrupoPrograma;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	public SePaGruposProgramas() {
		super();
	}

	
	public Integer getIntIdGrupoPrograma() {
		return intIdGrupoPrograma;
	}

	public void setIntIdGrupoPrograma(Integer intIdGrupoPrograma) {
		this.intIdGrupoPrograma = intIdGrupoPrograma;
	}

	public String getStrDsProgramaCampus() {
		return strDsProgramaCampus;
	}

	public void setStrDsProgramaCampus(String strDsProgramaCampus) {
		this.strDsProgramaCampus = strDsProgramaCampus;
	}

	public String getStrDsGrupoPrograma() {
		return strDsGrupoPrograma;
	}

	public void setStrDsGrupoPrograma(String strDsGrupoPrograma) {
		this.strDsGrupoPrograma = strDsGrupoPrograma;
	}


	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}


	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}


	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}


	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}


	
	
}
