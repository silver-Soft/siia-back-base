package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaModalidadAntecedenteAcademico implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5263184529432708373L;

	@Id
	@Column(name = "MODALIDADES")
	private String strModalidades;

	public String getStrModalidades() {
		return strModalidades;
	}

	public void setStrModalidades(String strModalidades) {
		this.strModalidades = strModalidades;
	}

}
