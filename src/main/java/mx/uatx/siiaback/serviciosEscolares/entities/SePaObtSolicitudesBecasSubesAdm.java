package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSolicitudesBecasSubesAdm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7297623729044030485L;
	@Id
	@Column(name = "IDREGISTROPRONABES")
	private Integer intRegistroPronabes;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "DSTIPOBECAPRONABES")
	private String strTipoBecaPronabes;

	@Column(name = "TIPOSOLICITUDBECA")
	private String strTipoSolicitudBeca;

	@Column(name = "INGRESOFAMILIAR")
	private Long lngIngresoFamiliar;

	@Column(name = "INTEGRANTES")
	private Integer intIntegrantes;

	@Column(name = "FCSOLICITUD")
	private Date fcFcSolicitud;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "OTORGADA")
	private String strOtorgada;

	@Column(name = "CLSTSOLICITUD")
	private Integer intClStSolicitud;

	@Column(name = "CLSTOTORGADA")
	private Short intClStOtor;

	@Column(name = "FOLIOSUBES")
	private String strFolioSubes;

	@Column(name = "PERMITEOTORGAR")
	private boolean blnPermiteOtorgar;

	@Column(name = "PERMITEVALIDAR")
	private boolean blnPermiteValidar;

	@Column(name = "PERMITECONSTANCIA")
	private boolean blnPermiteConstancia;

	public SePaObtSolicitudesBecasSubesAdm() {
		super();
	}

	public Integer getIntRegistroPronabes() {
		return intRegistroPronabes;
	}

	public void setIntRegistroPronabes(Integer intRegistroPronabes) {
		this.intRegistroPronabes = intRegistroPronabes;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrTipoBecaPronabes() {
		return strTipoBecaPronabes;
	}

	public void setStrTipoBecaPronabes(String strTipoBecaPronabes) {
		this.strTipoBecaPronabes = strTipoBecaPronabes;
	}

	public String getStrTipoSolicitudBeca() {
		return strTipoSolicitudBeca;
	}

	public void setStrTipoSolicitudBeca(String strTipoSolicitudBeca) {
		this.strTipoSolicitudBeca = strTipoSolicitudBeca;
	}

	public Long getLngIngresoFamiliar() {
		return lngIngresoFamiliar;
	}

	public void setLngIngresoFamiliar(Long lngIngresoFamiliar) {
		this.lngIngresoFamiliar = lngIngresoFamiliar;
	}

	public Integer getIntIntegrantes() {
		return intIntegrantes;
	}

	public void setIntIntegrantes(Integer intIntegrantes) {
		this.intIntegrantes = intIntegrantes;
	}

	public Date getFcFcSolicitud() {
		return fcFcSolicitud;
	}

	public void setFcFcSolicitud(Date fcFcSolicitud) {
		this.fcFcSolicitud = fcFcSolicitud;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrOtorgada() {
		return strOtorgada;
	}

	public void setStrOtorgada(String strOtorgada) {
		this.strOtorgada = strOtorgada;
	}

	public Integer getIntClStSolicitud() {
		return intClStSolicitud;
	}

	public void setIntClStSolicitud(Integer intClStSolicitud) {
		this.intClStSolicitud = intClStSolicitud;
	}

	public Short getIntClStOtor() {
		return intClStOtor;
	}

	public void setIntClStOtor(Short intClStOtor) {
		this.intClStOtor = intClStOtor;
	}

	public boolean isBlnPermiteOtorgar() {
		return blnPermiteOtorgar;
	}

	public void setBlnPermiteOtorgar(boolean blnPermiteOtorgar) {
		this.blnPermiteOtorgar = blnPermiteOtorgar;
	}

	public boolean isBlnPermiteValidar() {
		return blnPermiteValidar;
	}

	public void setBlnPermiteValidar(boolean blnPermiteValidar) {
		this.blnPermiteValidar = blnPermiteValidar;
	}

	public boolean isBlnPermiteConstancia() {
		return blnPermiteConstancia;
	}

	public void setBlnPermiteConstancia(boolean blnPermiteConstancia) {
		this.blnPermiteConstancia = blnPermiteConstancia;
	}

	public String getStrFolioSubes() {
		return strFolioSubes;
	}

	public void setStrFolioSubes(String strFolioSubes) {
		this.strFolioSubes = strFolioSubes;
	}

}
