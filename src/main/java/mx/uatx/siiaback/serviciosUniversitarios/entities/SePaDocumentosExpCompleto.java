package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDocumentosExpCompleto {
	
	@Id
	@Column(name = "IDDOCUMENTO")
	private Integer idDocumento;
	
	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;
	
	

	public SePaDocumentosExpCompleto() {
		super();
	}
	
	

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
