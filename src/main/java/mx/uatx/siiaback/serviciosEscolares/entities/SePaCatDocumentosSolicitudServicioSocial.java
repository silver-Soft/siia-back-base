/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaCatDocumentosSolicitudServicioSocial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -573302418878140708L;

	@Id
	@Column(name = "IDDOCUMENTOSERSOC")
	private Integer intIdDocumentoSerSoc;

	@Column(name = "NBDOCUMENTO")
	private String strNbDocumento;

	@Column(name = "TIPODOCUMENTO")
	private String strTipoDocumento;

	@Column(name = "ESTATUS")
	private String strEstatus;

	public Integer getIntIdDocumentoSerSoc() {
		return intIdDocumentoSerSoc;
	}

	public void setIntIdDocumentoSerSoc(Integer intIdDocumentoSerSoc) {
		this.intIdDocumentoSerSoc = intIdDocumentoSerSoc;
	}

	public String getStrNbDocumento() {
		return strNbDocumento;
	}

	public void setStrNbDocumento(String strNbDocumento) {
		this.strNbDocumento = strNbDocumento;
	}

	public String getStrTipoDocumento() {
		return strTipoDocumento;
	}

	public void setStrTipoDocumento(String strTipoDocumento) {
		this.strTipoDocumento = strTipoDocumento;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

}
