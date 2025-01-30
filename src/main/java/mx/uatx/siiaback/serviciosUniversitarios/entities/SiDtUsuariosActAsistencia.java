/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SIIUAT", name = "SIDTUSUARIOSACTASISTENCIA")
public class SiDtUsuariosActAsistencia implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4985498446670141703L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENIDUSUARIOACTASISTENCIA", sequenceName = "SIIUAT.IDUSUARIOACTASISTENCIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDUSUARIOACTASISTENCIA")
	@Column(name = "IDUSUARIOACTASISTENCIA")
	private Long lngIdUsuarioActAsistencia;

	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	@Column(name = "FCASISTENCIA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcRegistroUsuario;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	@Column(name = "IP")
	private String strIp;

	@Column(name = "LATITUDLONGITUD")
	private String strLatitudLongitud;

	public Long getLngIdUsuarioActAsistencia() {
		return lngIdUsuarioActAsistencia;
	}

	public void setLngIdUsuarioActAsistencia(Long lngIdUsuarioActAsistencia) {
		this.lngIdUsuarioActAsistencia = lngIdUsuarioActAsistencia;
	}

	public Long getLngIdUsuarioActDepYRec() {
		return lngIdUsuarioActDepYRec;
	}

	public void setLngIdUsuarioActDepYRec(Long lngIdUsuarioActDepYRec) {
		this.lngIdUsuarioActDepYRec = lngIdUsuarioActDepYRec;
	}

	public Date getFcRegistroUsuario() {
		return fcRegistroUsuario;
	}

	public void setFcRegistroUsuario(Date fcRegistroUsuario) {
		this.fcRegistroUsuario = fcRegistroUsuario;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrIp() {
		return strIp;
	}

	public void setStrIp(String strIp) {
		this.strIp = strIp;
	}

	public String getStrLatitudLongitud() {
		return strLatitudLongitud;
	}

	public void setStrLatitudLongitud(String strLatitudLongitud) {
		this.strLatitudLongitud = strLatitudLongitud;
	}

}
