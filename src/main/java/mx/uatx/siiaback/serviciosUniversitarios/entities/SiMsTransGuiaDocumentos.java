package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
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
@Table(schema = "SIIUAT", name="SIMSTRANSGUIADOCUMENTOS")
public class SiMsTransGuiaDocumentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6732015552304455990L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGUIADOCUMENTO", sequenceName = "SIIUAT.IDGUIADOCUMENTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGUIADOCUMENTO")
    @NotNull
    
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
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOADIT")
    private String strUsuarioAudit;

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

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}	
	
	
}
