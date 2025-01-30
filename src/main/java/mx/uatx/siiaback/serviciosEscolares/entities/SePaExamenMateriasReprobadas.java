package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaExamenMateriasReprobadas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 546375637028837380L;

	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strDsMateria;

	@Column(name = "DOCENTE")
	private String strNombreDocente;

	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrNombreDocente() {
		return strNombreDocente;
	}

	public void setStrNombreDocente(String strNombreDocente) {
		this.strNombreDocente = strNombreDocente;
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

}
