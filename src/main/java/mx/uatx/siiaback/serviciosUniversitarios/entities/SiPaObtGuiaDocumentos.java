package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtGuiaDocumentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5317244641619686350L;
	@Id
	@Column(name = "IDGUIADOCUMENTO")
	private Long lngIdGuiaDocumento;

	@Column(name = "CLSECCION")
	private String strClSeccion;

	@Column(name = "CLSERIE")
	private String strClSerie;

	@Column(name = "DSDESCRIPCION")
	private String strDsDescripcion;

	@Column(name = "FECHASEXTREMAS")
	private String strFechasExtremas;

	@Column(name = "DSVOLUMEN")
	private String strDsVolumen;

	@Column(name = "DSUBICACION")
	private String strDsUbicacion;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "AREACAMPUS")
	private String strDsAreaCampus;
	
	public SiPaObtGuiaDocumentos() {
		super();
	}

	public Long getLngIdGuiaDocumento() {
		return lngIdGuiaDocumento;
	}

	public void setLngIdGuiaDocumento(Long lngIdGuiaDocumento) {
		this.lngIdGuiaDocumento = lngIdGuiaDocumento;
	}

	public String getStrClSeccion() {
		return strClSeccion;
	}

	public void setStrClSeccion(String strClSeccion) {
		this.strClSeccion = strClSeccion;
	}

	public String getStrClSerie() {
		return strClSerie;
	}

	public void setStrClSerie(String strClSerie) {
		this.strClSerie = strClSerie;
	}

	public String getStrDsDescripcion() {
		return strDsDescripcion;
	}

	public void setStrDsDescripcion(String strDsDescripcion) {
		this.strDsDescripcion = strDsDescripcion;
	}

	public String getStrFechasExtremas() {
		return strFechasExtremas;
	}

	public void setStrFechasExtremas(String strFechasExtremas) {
		this.strFechasExtremas = strFechasExtremas;
	}

	public String getStrDsVolumen() {
		return strDsVolumen;
	}

	public void setStrDsVolumen(String strDsVolumen) {
		this.strDsVolumen = strDsVolumen;
	}

	public String getStrDsUbicacion() {
		return strDsUbicacion;
	}

	public void setStrDsUbicacion(String strDsUbicacion) {
		this.strDsUbicacion = strDsUbicacion;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrDsAreaCampus() {
		return strDsAreaCampus;
	}

	public void setStrDsAreaCampus(String strDsAreaCampus) {
		this.strDsAreaCampus = strDsAreaCampus;
	}
	
	
}
