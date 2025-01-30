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

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXACTMENSUALESSERSOC")
public class SeAxActMensualesSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1606990251601656731L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENID_ACTIVIDADESERSOC", sequenceName = "SERESC.ID_ACTIVIDADESERSOC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_ACTIVIDADESERSOC")
	@Column(name = "ID_ACTIVIDADES")
	private Long lngIdActividad;

	@Column(name = "NB_ACTIVIDAD")
	private String strNbActividad;

	@Column(name = "EQUIPO")
	private String strEquipo;

	@Column(name = "TIPO_ACTIVIDAD")
	private String strTipoActividad;

	@Column(name = "CUBR_OBJ")
	private Integer intIdCubrioObjetivo;

	@Column(name = "MAT_REQ")
	private Integer intIdMatReq;

	@Column(name = "ACOR_FROM_AC")
	private Integer intIdAcorFromAc;

	@Column(name = "NUM_ACCIONES")
	private Integer intNumAcciones;

	@Column(name = "REP_ACT_ID_REP_ACT")
	private Long lngIdReporteActividad;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	public Long getLngIdActividad() {
		return lngIdActividad;
	}

	public void setLngIdActividad(Long lngIdActividad) {
		this.lngIdActividad = lngIdActividad;
	}

	public String getStrNbActividad() {
		return strNbActividad;
	}

	public void setStrNbActividad(String strNbActividad) {
		this.strNbActividad = strNbActividad;
	}

	public String getStrEquipo() {
		return strEquipo;
	}

	public void setStrEquipo(String strEquipo) {
		this.strEquipo = strEquipo;
	}

	public String getStrTipoActividad() {
		return strTipoActividad;
	}

	public void setStrTipoActividad(String strTipoActividad) {
		this.strTipoActividad = strTipoActividad;
	}

	public Integer getIntIdAcorFromAc() {
		return intIdAcorFromAc;
	}

	public void setIntIdAcorFromAc(Integer intIdAcorFromAc) {
		this.intIdAcorFromAc = intIdAcorFromAc;
	}

	public Integer getIntNumAcciones() {
		return intNumAcciones;
	}

	public void setIntNumAcciones(Integer intNumAcciones) {
		this.intNumAcciones = intNumAcciones;
	}

	public Long getLngIdReporteActividad() {
		return lngIdReporteActividad;
	}

	public void setLngIdReporteActividad(Long lngIdReporteActividad) {
		this.lngIdReporteActividad = lngIdReporteActividad;
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

	public Integer getIntIdCubrioObjetivo() {
		return intIdCubrioObjetivo;
	}

	public void setIntIdCubrioObjetivo(Integer intIdCubrioObjetivo) {
		this.intIdCubrioObjetivo = intIdCubrioObjetivo;
	}

	public Integer getIntIdMatReq() {
		return intIdMatReq;
	}

	public void setIntIdMatReq(Integer intIdMatReq) {
		this.intIdMatReq = intIdMatReq;
	}

}
