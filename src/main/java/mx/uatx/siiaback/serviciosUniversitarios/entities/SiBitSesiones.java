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

@Entity
@Table(schema = "SIIUAT", name = "SIBITSESIONES")
public class SiBitSesiones implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -420469857358705561L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENIDSESION", sequenceName = "SIIUAT.IDSESION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDSESION")
	@Column(name = "IDSESION")
	private Long lngIdSesion;

	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	@Column(name = "FCSESION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSesion;

	@Column(name = "DIRECCIONIP")
	private String strDireccionIp;

	@Column(name = "NBMAQUINA")
	private String strNbMaquina;

	@Column(name = "SISTEMA")
	private String strSistema;

	@Column(name = "LATITUD")
	private Double dbLatitud;

	@Column(name = "LONGITUD")
	private Double dbLongitud;

	public SiBitSesiones() {
		super();
	}

	public Long getLngIdSesion() {
		return lngIdSesion;
	}

	public void setLngIdSesion(Long lngIdSesion) {
		this.lngIdSesion = lngIdSesion;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Date getFcSesion() {
		return fcSesion;
	}

	public void setFcSesion(Date fcSesion) {
		this.fcSesion = fcSesion;
	}

	public String getStrDireccionIp() {
		return strDireccionIp;
	}

	public void setStrDireccionIp(String strDireccionIp) {
		this.strDireccionIp = strDireccionIp;
	}

	public String getStrNbMaquina() {
		return strNbMaquina;
	}

	public void setStrNbMaquina(String strNbMaquina) {
		this.strNbMaquina = strNbMaquina;
	}

	public String getStrSistema() {
		return strSistema;
	}

	public void setStrSistema(String strSistema) {
		this.strSistema = strSistema;
	}

	public Double getDbLatitud() {
		return dbLatitud;
	}

	public void setDbLatitud(Double dbLatitud) {
		this.dbLatitud = dbLatitud;
	}

	public Double getDbLongitud() {
		return dbLongitud;
	}

	public void setDbLongitud(Double dbLongitud) {
		this.dbLongitud = dbLongitud;
	}

}
