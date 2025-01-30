package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSolicitudDocOfi {
	
	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "PROGRAMA")
	private String programa;

	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;

	@Column(name = "CLESTATUSELECTRONICO")
	private Integer clEstatusDigital;
	
	@Column(name = "CLESTATUSDIGITAL")
	private String estatusDocumentoElectronico;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "FCIMPRESIONDOCUMENTO")
	private Date fcImpresionDocumento;
	
	@Column(name = "FCENTREGADOCUMENTO")
	private Date fcEntregaDocumento;
	
	@Column(name = "FCAUTORIZACIONSOLICITUD")
	private Date fcAutorizacionSolicitud;

	@Column(name = "DSESTATUSSOLICITUD")
	private String dsEstatusSolicitud;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean permiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteEliminar;
	
	@Column(name = "PERMITEXML")
	private Boolean permiteXml;

	public Long getIdSolicitudDocumentoOficial() {
		return idSolicitudDocumentoOficial;
	}

	public void setIdSolicitudDocumentoOficial(Long idSolicitudDocumentoOficial) {
		this.idSolicitudDocumentoOficial = idSolicitudDocumentoOficial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getNbDocumento() {
		return nbDocumento;
	}

	public void setNbDocumento(String nbDocumento) {
		this.nbDocumento = nbDocumento;
	}

	public Integer getClEstatusDigital() {
		return clEstatusDigital;
	}

	public void setClEstatusDigital(Integer clEstatusDigital) {
		this.clEstatusDigital = clEstatusDigital;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcImpresionDocumento() {
		return fcImpresionDocumento;
	}

	public void setFcImpresionDocumento(Date fcImpresionDocumento) {
		this.fcImpresionDocumento = fcImpresionDocumento;
	}

	public String getDsEstatusSolicitud() {
		return dsEstatusSolicitud;
	}

	public void setDsEstatusSolicitud(String dsEstatusSolicitud) {
		this.dsEstatusSolicitud = dsEstatusSolicitud;
	}

	public Boolean getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public Boolean getPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(Boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

	public Date getFcEntregaDocumento() {
		return fcEntregaDocumento;
	}

	public void setFcEntregaDocumento(Date fcEntregaDocumento) {
		this.fcEntregaDocumento = fcEntregaDocumento;
	}

	public Date getFcAutorizacionSolicitud() {
		return fcAutorizacionSolicitud;
	}

	public void setFcAutorizacionSolicitud(Date fcAutorizacionSolicitud) {
		this.fcAutorizacionSolicitud = fcAutorizacionSolicitud;
	}

	public String getEstatusDocumentoElectronico() {
		return estatusDocumentoElectronico;
	}

	public void setEstatusDocumentoElectronico(String estatusDocumentoElectronico) {
		this.estatusDocumentoElectronico = estatusDocumentoElectronico;
	}

	public Boolean getPermiteXml() {
		return permiteXml;
	}

	public void setPermiteXml(Boolean permiteXml) {
		this.permiteXml = permiteXml;
	}

}
