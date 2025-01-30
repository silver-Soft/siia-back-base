package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtNivelesEducativosUatx implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6124869207766722776L;
	@Id
	@Column(name="CLNIVEL")
	private Integer intCLNivel;
	
	@Column(name="DSNIVEL")
	private String strDsNivel;

	public Integer getIntCLNivel() {
		return intCLNivel;
	}

	public void setIntCLNivel(Integer intCLNivel) {
		this.intCLNivel = intCLNivel;
	}

	public String getStrDsNivel() {
		return strDsNivel;
	}

	public void setStrDsNivel(String strDsNivel) {
		this.strDsNivel = strDsNivel;
	}
	
	
}
