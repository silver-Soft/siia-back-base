package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteAspConFicha implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5861308813037345044L;

	@Id
	@Column(name = "FOLIOUATX")
	private Long lngFolioUatx;
	
	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "FICHA")
	private Long lngFicha;
	
	public SePaObtDatosReporteAspConFicha() {
		super();
	}

	public Long getLngFolioUatx() {
		return lngFolioUatx;
	}

	public void setLngFolioUatx(Long lngFolioUatx) {
		this.lngFolioUatx = lngFolioUatx;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Long getLngFicha() {
		return lngFicha;
	}

	public void setLngFicha(Long lngFicha) {
		this.lngFicha = lngFicha;
	}
	
	
}
