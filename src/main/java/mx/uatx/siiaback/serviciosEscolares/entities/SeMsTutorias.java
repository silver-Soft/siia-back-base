package mx.uatx.siiaback.serviciosEscolares.entities;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEMSTUTORIAS")
public class SeMsTutorias implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3126523370018528147L;

	private static final String GENID_SEMSTUTORIAS = "GENID_SEMSTUTORIAS";

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENID_SEMSTUTORIAS, sequenceName = "SERESC.IDTUTORIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEMSTUTORIAS)
	@Column(name = "IDTUTORIA")
	private Long lngIdTutoria;

	@Column(name = "NMTUTORIA")
	private Integer intNumTutoria;

	@Column(name = "FCTUTORIA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcTutoria;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "CLTIPOTUTORIA")
	private String strTipoTutoria;

	@Column(name = "DSASUNTO")
	private String strAsunto;

	@Column(name = "FISICA")
	private String strFisica;

	@Column(name = "COGNITIVA")
	private String strCognitiva;

	@Column(name = "AFECTIVA")
	private String strAfectiva;

	@Column(name = "PRODUCTIVA")
	private String strProductiva;

	@Column(name = "SOCIAL")
	private String strSocial;

	@Column(name = "ESPIRITUAL")
	private String strEspiritual;

	@Column(name = "DSOBSERVACION")
	private String strObservacion;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DSRESUMEN")
	private String strResumen;

	@Column(name = "DSFORTALEZASTUTORADO")
	private String strFortalezasTutorado;

	@Column(name = "DSSENTIDOIDENTIDAD")
	private String strSentidoIdentidad;

	@Column(name = "METAS")
	private String strMetas;

	public Long getLngIdTutoria() {
		return lngIdTutoria;
	}

	public void setLngIdTutoria(Long lngIdTutoria) {
		this.lngIdTutoria = lngIdTutoria;
	}

	public Integer getIntNumTutoria() {
		return intNumTutoria;
	}

	public void setIntNumTutoria(Integer intNumTutoria) {
		this.intNumTutoria = intNumTutoria;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
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

	public String getStrEspiritual() {
		return strEspiritual;
	}

	public void setStrEspiritual(String strEspiritual) {
		this.strEspiritual = strEspiritual;
	}

	public String getStrObservacion() {
		return strObservacion;
	}

	public void setStrObservacion(String strObservacion) {
		this.strObservacion = strObservacion;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrResumen() {
		return strResumen;
	}

	public void setStrResumen(String strResumen) {
		this.strResumen = strResumen;
	}

	public String getStrFortalezasTutorado() {
		return strFortalezasTutorado;
	}

	public void setStrFortalezasTutorado(String strFortalezasTutorado) {
		this.strFortalezasTutorado = strFortalezasTutorado;
	}

	public String getStrSentidoIdentidad() {
		return strSentidoIdentidad;
	}

	public void setStrSentidoIdentidad(String strSentidoIdentidad) {
		this.strSentidoIdentidad = strSentidoIdentidad;
	}

	public String getStrMetas() {
		return strMetas;
	}

	public void setStrMetas(String strMetas) {
		this.strMetas = strMetas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
