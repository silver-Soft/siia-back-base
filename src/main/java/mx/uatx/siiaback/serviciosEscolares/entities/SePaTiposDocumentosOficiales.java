package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTiposDocumentosOficiales implements Serializable {
	@Id
	@Column(name = "IDDOCUMENTO")
	private Integer idDocumento;
	
	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNbDocumento() {
		return nbDocumento;
	}

	public void setNbDocumento(String nbDocumento) {
		this.nbDocumento = nbDocumento;
	}
}