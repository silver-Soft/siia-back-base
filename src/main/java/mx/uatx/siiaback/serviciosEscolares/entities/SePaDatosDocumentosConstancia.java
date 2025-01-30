package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosDocumentosConstancia {

	@Id
	@Column(name = "IDDOCUMENTO")
	private Integer intIdDocumento;
	
	
	@Column(name = "IDSOLICITUDDOCTORESGUARDO")
	private Integer intIdSolicitudDocumento;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;

	public SePaDatosDocumentosConstancia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getNbDocumento() {
		return nbDocumento;
	}

	public void setNbDocumento(String nbDocumento) {
		this.nbDocumento = nbDocumento;
	}

	public Integer getIntIdSolicitudDocumento() {
		return intIdSolicitudDocumento;
	}

	public void setIntIdSolicitudDocumento(Integer intIdSolicitudDocumento) {
		this.intIdSolicitudDocumento = intIdSolicitudDocumento;
	}
	
	

}
