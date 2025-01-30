package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaListaAspirantePosgrado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6472950845384784627L;

	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long lngIdSolicitudIngreso;

	@Column(name = "NBASPIRANTE")
	private String strNombreAspirante;

	@Column(name = "APPATERNO")
	private String strApPaternoAspirante;

	@Column(name = "APMATERNO")
	private String strApMaternoAspirante;

	@Column(name = "DSGENERO")
	private String strGenero;

	@Column(name = "FCNACIMIENTO")
	private Date fcNacimiento;

	@Column(name = "REGISTROTERMINADO")
	private String strRegistroTerminado;

	public Long getLngIdSolicitudIngreso() {
		return lngIdSolicitudIngreso;
	}

	public void setLngIdSolicitudIngreso(Long lngIdSolicitudIngreso) {
		this.lngIdSolicitudIngreso = lngIdSolicitudIngreso;
	}

	public String getStrNombreAspirante() {
		return strNombreAspirante;
	}

	public void setStrNombreAspirante(String strNombreAspirante) {
		this.strNombreAspirante = strNombreAspirante;
	}

	public String getStrApPaternoAspirante() {
		return strApPaternoAspirante;
	}

	public void setStrApPaternoAspirante(String strApPaternoAspirante) {
		this.strApPaternoAspirante = strApPaternoAspirante;
	}

	public String getStrApMaternoAspirante() {
		return strApMaternoAspirante;
	}

	public void setStrApMaternoAspirante(String strApMaternoAspirante) {
		this.strApMaternoAspirante = strApMaternoAspirante;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public Date getFcNacimiento() {
		return fcNacimiento;
	}

	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}

	public String getStrRegistroTerminado() {
		return strRegistroTerminado;
	}

	public void setStrRegistroTerminado(String strRegistroTerminado) {
		this.strRegistroTerminado = strRegistroTerminado;
	}

}
