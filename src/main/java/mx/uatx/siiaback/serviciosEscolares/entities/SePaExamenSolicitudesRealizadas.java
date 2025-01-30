package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaExamenSolicitudesRealizadas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 365545874437082775L;

	@Id
	@Column(name = "IDSOLICITUDEXAMEN")
	private Long lngIdSolicitudExamen;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strDsMateria;

	@Column(name = "DOCENTE")
	private String strNombreDocente;

	@Column(name = "DSTIPOACREDITACION")
	private String strDsTipoAcreditacion;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	public Long getLngIdSolicitudExamen() {
		return lngIdSolicitudExamen;
	}

	public void setLngIdSolicitudExamen(Long lngIdSolicitudExamen) {
		this.lngIdSolicitudExamen = lngIdSolicitudExamen;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrNombreDocente() {
		return strNombreDocente;
	}

	public void setStrNombreDocente(String strNombreDocente) {
		this.strNombreDocente = strNombreDocente;
	}

	public String getStrDsTipoAcreditacion() {
		return strDsTipoAcreditacion;
	}

	public void setStrDsTipoAcreditacion(String strDsTipoAcreditacion) {
		this.strDsTipoAcreditacion = strDsTipoAcreditacion;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

}
