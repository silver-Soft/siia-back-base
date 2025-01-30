package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIMSTRANSDOCUMENTACION")
public class SiMsTransDocumentacion {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDDOCUMENTACION", sequenceName = "SIIUAT.IDDOCUMENTACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDDOCUMENTACION")
	@NotNull

	@Column(name = "IDDOCUMENTACION")
	private Long lngIdDocumentacion;
	
	@Column(name = "DSDOCUMENTOSCOMPROBACION")
	private String strDsDocumentosComprobacion;

	@Column(name = "DSDOCUMENTOSAPOYO")
	private String strDsDocumentosApoyo;

	@Column(name = "VIGENCIADOCUMENTAL")
	private String strVigenciaDocumental;
	
	@Column(name = "IDAREACAMPUS")
	private Long lngIdAreaCampus;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	public Long getLngIdDocumentacion() {
		return lngIdDocumentacion;
	}

	public void setLngIdDocumentacion(Long lngIdDocumentacion) {
		this.lngIdDocumentacion = lngIdDocumentacion;
	}

	public String getStrDsDocumentosComprobacion() {
		return strDsDocumentosComprobacion;
	}

	public void setStrDsDocumentosComprobacion(String strDsDocumentosComprobacion) {
		this.strDsDocumentosComprobacion = strDsDocumentosComprobacion;
	}

	public String getStrDsDocumentosApoyo() {
		return strDsDocumentosApoyo;
	}

	public void setStrDsDocumentosApoyo(String strDsDocumentosApoyo) {
		this.strDsDocumentosApoyo = strDsDocumentosApoyo;
	}

	public String getStrVigenciaDocumental() {
		return strVigenciaDocumental;
	}

	public void setStrVigenciaDocumental(String strVigenciaDocumental) {
		this.strVigenciaDocumental = strVigenciaDocumental;
	}

	public Long getLngIdAreaCampus() {
		return lngIdAreaCampus;
	}

	public void setLngIdAreaCampus(Long lngIdAreaCampus) {
		this.lngIdAreaCampus = lngIdAreaCampus;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getUsuarioAudit() {
		return usuarioAudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	
	
	
}
