package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDocumentosSolicitudServicioSocial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8414056240082609006L;

	@Id
	@Column(name = "IDDOCALUMNOSERSOC")
	private Long lngIdDocumento;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "NBDOCUMENTO")
	private String strNombre;

	@Column(name = "TIPODOCUMENTO")
	private String strTipoDocumento;
	
	@Column(name = "IDDOCUMENTOSERSOC")
	private Integer intIdTipoDoc;
        
        @Column(name = "MOTIVORECHAZO")
	private String strMotivoRechazo;

	public Long getLngIdDocumento() {
		return lngIdDocumento;
	}

	public void setLngIdDocumento(Long lngIdDocumento) {
		this.lngIdDocumento = lngIdDocumento;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrTipoDocumento() {
		return strTipoDocumento;
	}

	public void setStrTipoDocumento(String strTipoDocumento) {
		this.strTipoDocumento = strTipoDocumento;
	}

	public Integer getIntIdTipoDoc() {
		return intIdTipoDoc;
	}

	public void setIntIdTipoDoc(Integer intIdTipoDoc) {
		this.intIdTipoDoc = intIdTipoDoc;
	}

    public String getStrMotivoRechazo() {
        return strMotivoRechazo;
    }

    public void setStrMotivoRechazo(String strMotivoRechazo) {
        this.strMotivoRechazo = strMotivoRechazo;
    }

}
