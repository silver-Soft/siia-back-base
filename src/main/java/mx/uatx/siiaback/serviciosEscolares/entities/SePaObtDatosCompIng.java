package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosCompIng {
	
	@Id
	@Column(name = "IDFICHASOLICITUDINGRESO")
	private Long lngIdFichaSolicitudIngreso;
	
	@Column(name = "CADENAQRREGISTRO")
	private String cadenaQrRegistro;
	
	@Column(name = "CADENAQRSOV")
	private String cadenaQrSov;

	public Long getLngIdFichaSolicitudIngreso() {
		return lngIdFichaSolicitudIngreso;
	}

	public void setLngIdFichaSolicitudIngreso(Long lngIdFichaSolicitudIngreso) {
		this.lngIdFichaSolicitudIngreso = lngIdFichaSolicitudIngreso;
	}

	public String getCadenaQrRegistro() {
		return cadenaQrRegistro;
	}

	public void setCadenaQrRegistro(String cadenaQrRegistro) {
		this.cadenaQrRegistro = cadenaQrRegistro;
	}

	public String getCadenaQrSov() {
		return cadenaQrSov;
	}

	public void setCadenaQrSov(String cadenaQrSov) {
		this.cadenaQrSov = cadenaQrSov;
	}
	
	

}
