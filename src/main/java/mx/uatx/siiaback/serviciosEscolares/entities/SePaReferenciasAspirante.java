package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReferenciasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -947114994376273654L;

	@Id
	@Column(name = "IDREFERENCIAACADEMICAASP")
	private Long lngIdReferenciaAcademicaAsp;

	@Column(name = "NBREFERENCIA")
	private String strNbReferencia;

	@Column(name = "CARGO")
	private String strCargo;

	@Column(name = "INSTITUCIONREFER")
	private String strInstitucionReferencia;

	@Column(name = "NMTELEFONO")
	private String strNumTelefono;

	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronico;

	public Long getLngIdReferenciaAcademicaAsp() {
		return lngIdReferenciaAcademicaAsp;
	}

	public void setLngIdReferenciaAcademicaAsp(Long lngIdReferenciaAcademicaAsp) {
		this.lngIdReferenciaAcademicaAsp = lngIdReferenciaAcademicaAsp;
	}

	public String getStrNbReferencia() {
		return strNbReferencia;
	}

	public void setStrNbReferencia(String strNbReferencia) {
		this.strNbReferencia = strNbReferencia;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrInstitucionReferencia() {
		return strInstitucionReferencia;
	}

	public void setStrInstitucionReferencia(String strInstitucionReferencia) {
		this.strInstitucionReferencia = strInstitucionReferencia;
	}

	public String getStrNumTelefono() {
		return strNumTelefono;
	}

	public void setStrNumTelefono(String strNumTelefono) {
		this.strNumTelefono = strNumTelefono;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

}
