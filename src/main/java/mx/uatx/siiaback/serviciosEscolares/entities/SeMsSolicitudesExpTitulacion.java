package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ROGELIO LIMA
 */
@Entity
@Table(schema = "SERESC", name = "SEMSSOLICITUDESEXPTITULACION")
public class SeMsSolicitudesExpTitulacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2282859924114384709L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDSOLICITUDEXPTITULACION", unique = true, nullable = false)
	@SequenceGenerator(name = "GENIDSOLICITUDEXPTITULACION", sequenceName = "SERESC.IDSOLICITUDEXPTITULACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDSOLICITUDEXPTITULACION")
	private Integer intIdSolicitudExpediente;

	@Basic(optional = false)
	@Column(name = "FCSOLICITUD", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSolicitud;

	@Column(name = "FCVIGENCIA", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcVigencia;

	@Column(name = "ESTATUS", nullable = true, length = 15)
	private String strEstatusSolicitud;

	@Column(name = "FCLIBERACION", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcLiberacion;

	@Column(name = "USUARIOSOLICITA", length = 30)
	private String strUsuarioSolicita;

	@Column(name = "USUARIOLIBERA", length = 30)
	private String strUsuarioLibera;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;
	
	@Lob
	@Column(name = "ARCHIVOTITULOS", nullable = false)
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

	public String getStrEstatusSolicitud() {
		return strEstatusSolicitud;
	}

	public void setStrEstatusSolicitud(String strEstatusSolicitud) {
		this.strEstatusSolicitud = strEstatusSolicitud;
	}

	public Date getFcLiberacion() {
		return fcLiberacion;
	}

	public void setFcLiberacion(Date fcLiberacion) {
		this.fcLiberacion = fcLiberacion;
	}

	public String getStrUsuarioSolicita() {
		return strUsuarioSolicita;
	}

	public void setStrUsuarioSolicita(String strUsuarioSolicita) {
		this.strUsuarioSolicita = strUsuarioSolicita;
	}

	public String getStrUsuarioLibera() {
		return strUsuarioLibera;
	}

	public void setStrUsuarioLibera(String strUsuarioLibera) {
		this.strUsuarioLibera = strUsuarioLibera;
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

	public byte[] getArchivoZipGenerado() {
		return archivoZipGenerado;
	}

	public void setArchivoZipGenerado(byte[] archivoZipGenerado) {
		this.archivoZipGenerado = archivoZipGenerado;
	}
	
	

}
