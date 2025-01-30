package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaExpedienteTitulacion implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7718287583822235508L;

	@Id
	@Column(name = "IDSOLICITUDEXPTITULACION")
	private Integer intIdSolicitudExpediente;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "FCVIGENCIA")
	private Date fcVigencia;

	@Column(name = "FCLIBERACION")
	private Date fcLiberacion;

	@Column(name = "ESTATUS")
	private String strEstatusSolicitud;

	@Column(name = "USUARIOLIBERA")
	private String strUsuarioLibera;

	@Column(name = "USUARIOSOLICITA")
	private String strUsuarioSolicita;
	
	@Column(name = "TOTALSOLICITUDES")
	private Integer intTotalSolicitudes;
	
	@Column(name = "TOTALFIRMADOS")
	private Integer intTotalFirmados;
	
	@Column(name = "FOLIORECEPPROFESIONES")
	private Integer intNumeroLote;
	
	@Column(name = "PERMITEENVIO")
	private Integer intPermiteEnvio;
	
	@Column(name = "PERMITECONSULTAPROCESO")
	private Integer intPermiteCosnultaProceso;
	
	@Column(name = "SOLICITUDESAUTORIZADAS")
	private Integer intTotalSolicitudesAutorizadas;

	@Column(name = "PERMITEFIRMAR")
	private Boolean blnPermiteFirmar;
	
	@Lob
	@Column(name = "ARCHIVOTITULOS")
	private byte[] archivoZipGenerado;
	
	public Integer getIntIdSolicitudExpediente() {
		return intIdSolicitudExpediente;
	}

	public void setIntIdSolicitudExpediente(Integer intIdSolicitudExpediente) {
		this.intIdSolicitudExpediente = intIdSolicitudExpediente;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcVigencia() {
		return fcVigencia;
	}

	public void setFcVigencia(Date fcVigencia) {
		this.fcVigencia = fcVigencia;
	}

	public Date getFcLiberacion() {
		return fcLiberacion;
	}

	public void setFcLiberacion(Date fcLiberacion) {
		this.fcLiberacion = fcLiberacion;
	}

	public String getStrEstatusSolicitud() {
		return strEstatusSolicitud;
	}

	public void setStrEstatusSolicitud(String strEstatusSolicitud) {
		this.strEstatusSolicitud = strEstatusSolicitud;
	}

	public String getStrUsuarioLibera() {
		return strUsuarioLibera;
	}

	public void setStrUsuarioLibera(String strUsuarioLibera) {
		this.strUsuarioLibera = strUsuarioLibera;
	}

	public String getStrUsuarioSolicita() {
		return strUsuarioSolicita;
	}

	public void setStrUsuarioSolicita(String strUsuarioSolicita) {
		this.strUsuarioSolicita = strUsuarioSolicita;
	}

	public Integer getIntTotalSolicitudes() {
		return intTotalSolicitudes;
	}

	public void setIntTotalSolicitudes(Integer intTotalSolicitudes) {
		this.intTotalSolicitudes = intTotalSolicitudes;
	}

	public Integer getIntTotalSolicitudesAutorizadas() {
		return intTotalSolicitudesAutorizadas;
	}

	public void setIntTotalSolicitudesAutorizadas(Integer intTotalSolicitudesAutorizadas) {
		this.intTotalSolicitudesAutorizadas = intTotalSolicitudesAutorizadas;
	}

	public Integer getIntTotalFirmados() {
		return intTotalFirmados;
	}

	public void setIntTotalFirmados(Integer intTotalFirmados) {
		this.intTotalFirmados = intTotalFirmados;
	}

	public Integer getIntPermiteEnvio() {
		return intPermiteEnvio;
	}

	public void setIntPermiteEnvio(Integer intPermiteEnvio) {
		this.intPermiteEnvio = intPermiteEnvio;
	}

	public Integer getIntPermiteCosnultaProceso() {
		return intPermiteCosnultaProceso;
	}

	public void setIntPermiteCosnultaProceso(Integer intPermiteCosnultaProceso) {
		this.intPermiteCosnultaProceso = intPermiteCosnultaProceso;
	}

	public Integer getIntNumeroLote() {
		return intNumeroLote;
	}

	public void setIntNumeroLote(Integer intNumeroLote) {
		this.intNumeroLote = intNumeroLote;
	}

	public Boolean getBlnPermiteFirmar() {
		return blnPermiteFirmar;
	}

	public void setBlnPermiteFirmar(Boolean blnPermiteFirmar) {
		this.blnPermiteFirmar = blnPermiteFirmar;
	}

	public byte[] getArchivoZipGenerado() {
		return archivoZipGenerado;
	}

	public void setArchivoZipGenerado(byte[] archivoZipGenerado) {
		this.archivoZipGenerado = archivoZipGenerado;
	}
	
	
	
}
