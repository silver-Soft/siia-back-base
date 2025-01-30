package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSeccionesCuestionarioTutoria implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 986872637490027449L;

	@Id
	@Column(name = "IDSECENTREVISTA")
	private Long lngIdSeccionEntrevista;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	public Long getLngIdSeccionEntrevista() {
		return lngIdSeccionEntrevista;
	}

	public void setLngIdSeccionEntrevista(Long lngIdSeccionEntrevista) {
		this.lngIdSeccionEntrevista = lngIdSeccionEntrevista;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

}
