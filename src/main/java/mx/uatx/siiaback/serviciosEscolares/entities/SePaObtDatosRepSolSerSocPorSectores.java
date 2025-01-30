package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosRepSolSerSocPorSectores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8326146251864823787L;
	@Id
	@Column(name = "SECTOR")
	private String strSector;
	
	@Column(name = "NUMERO")
	private Long lngNumero;
	
	public SePaObtDatosRepSolSerSocPorSectores() {
		super();
	}

	public String getStrSector() {
		return strSector;
	}

	public void setStrSector(String strSector) {
		this.strSector = strSector;
	}

	public Long getLngNumero() {
		return lngNumero;
	}

	public void setLngNumero(Long lngNumero) {
		this.lngNumero = lngNumero;
	}
	
}
