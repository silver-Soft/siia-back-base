package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtBitacoraTutoriasTutor implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9098887713673599077L;

	@Id
	@Column(name = "IDTUTORIAAX")
	private Long lngIdTutoriaAx;

	@Column(name = "DSTIPOTUTORIA")
	private String strTipoTutoria;

	@Column(name = "DSASUNTO")
	private String strAsunto;

	@Column(name = "DSRESUMEN")
	private String strResumen;

	@Column(name = "DSOBSERVACION")
	private String strObservacion;

	@Column(name = "DSESTATUSTUTORIA")
	private String strEstatusTutoria;

	@Column(name = "FCTUTORIA")
	private Date fcTutoria;

	@Column(name = "HORA")
	private String strHora;

	@Column(name = "NMTUTORIA")
	private Integer intNmTutoria;

	@Column(name = "TIENEPROYECTO")
	private Boolean blnTieneProyecto;

	@Column(name = "FISICA")
	private String strFisica;

	@Column(name = "COGNITIVA")
	private String strCognitiva;

	@Column(name = "AFECTIVA")
	private String strAfectiva;

	@Column(name = "ESPIRITUAL")
	private String strEspiritual;

	@Column(name = "PRODUCTIVA")
	private String strProductiva;

	@Column(name = "SOCIAL")
	private String strSocial;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Long getLngIdTutoriaAx() {
		return lngIdTutoriaAx;
	}

	public void setLngIdTutoriaAx(Long lngIdTutoriaAx) {
		this.lngIdTutoriaAx = lngIdTutoriaAx;
	}

	public String getStrTipoTutoria() {
		return strTipoTutoria;
	}

	public void setStrTipoTutoria(String strTipoTutoria) {
		this.strTipoTutoria = strTipoTutoria;
	}

	public String getStrAsunto() {
		return strAsunto;
	}

	public void setStrAsunto(String strAsunto) {
		this.strAsunto = strAsunto;
	}

	public String getStrResumen() {
		return strResumen;
	}

	public void setStrResumen(String strResumen) {
		this.strResumen = strResumen;
	}

	public String getStrObservacion() {
		return strObservacion;
	}

	public void setStrObservacion(String strObservacion) {
		this.strObservacion = strObservacion;
	}

	public String getStrEstatusTutoria() {
		return strEstatusTutoria;
	}

	public void setStrEstatusTutoria(String strEstatusTutoria) {
		this.strEstatusTutoria = strEstatusTutoria;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public String getStrHora() {
		return strHora;
	}

	public void setStrHora(String strHora) {
		this.strHora = strHora;
	}

	public Integer getIntNmTutoria() {
		return intNmTutoria;
	}

	public void setIntNmTutoria(Integer intNmTutoria) {
		this.intNmTutoria = intNmTutoria;
	}

	public Boolean getBlnTieneProyecto() {
		return blnTieneProyecto;
	}

	public void setBlnTieneProyecto(Boolean blnTieneProyecto) {
		this.blnTieneProyecto = blnTieneProyecto;
	}

	public String getStrFisica() {
		return strFisica;
	}

	public void setStrFisica(String strFisica) {
		this.strFisica = strFisica;
	}

	public String getStrCognitiva() {
		return strCognitiva;
	}

	public void setStrCognitiva(String strCognitiva) {
		this.strCognitiva = strCognitiva;
	}

	public String getStrAfectiva() {
		return strAfectiva;
	}

	public void setStrAfectiva(String strAfectiva) {
		this.strAfectiva = strAfectiva;
	}

	public String getStrEspiritual() {
		return strEspiritual;
	}

	public void setStrEspiritual(String strEspiritual) {
		this.strEspiritual = strEspiritual;
	}

	public String getStrProductiva() {
		return strProductiva;
	}

	public void setStrProductiva(String strProductiva) {
		this.strProductiva = strProductiva;
	}

	public String getStrSocial() {
		return strSocial;
	}

	public void setStrSocial(String strSocial) {
		this.strSocial = strSocial;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

}
