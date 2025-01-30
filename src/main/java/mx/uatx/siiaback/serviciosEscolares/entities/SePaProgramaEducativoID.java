package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SePaProgramaEducativoID implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2680316114857103404L;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdPrograma;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;

	public SePaProgramaEducativoID() {
		super();
	}

	public Integer getIntIdPrograma() {
		return intIdPrograma;
	}

	public void setIntIdPrograma(Integer intIdPrograma) {
		this.intIdPrograma = intIdPrograma;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intIdPrograma == null) ? 0 : intIdPrograma.hashCode());
		result = prime * result + ((strPrograma == null) ? 0 : strPrograma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SePaProgramaEducativoID))
			return false;
		SePaProgramaEducativoID other = (SePaProgramaEducativoID) obj;
		if (intIdPrograma == null) {
			if (other.intIdPrograma != null)
				return false;
		} else if (!intIdPrograma.equals(other.intIdPrograma))
			return false;
		if (strPrograma == null) {
			if (other.strPrograma != null)
				return false;
		} else if (!strPrograma.equals(other.strPrograma))
			return false;
		return true;
	}

}
