package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTransDocumentacion {
	
	@Id
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
	
	@Column(name = "AREACAMPUS")
	private String strDsAreaCampus;

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

	public String getStrDsAreaCampus() {
		return strDsAreaCampus;
	}

	public void setStrDsAreaCampus(String strDsAreaCampus) {
		this.strDsAreaCampus = strDsAreaCampus;
	}

}
