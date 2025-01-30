package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaActividadesMensualesSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7329765107327963496L;

	@Id
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

	@Column(name = "DSCUBR_OBJ")
	private String strCubrioObjetivo;

	@Column(name = "MAT_REQ")
	private Integer intIdMatReq;

	@Column(name = "DSMAT_REQ")
	private String strMatReq;

	@Column(name = "ACOR_FROM_AC")
	private Integer intIdAcorFromAc;

	@Column(name = "NUM_ACCIONES")
	private Integer intNumAcciones;

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

	public String getStrCubrioObjetivo() {
		return strCubrioObjetivo;
	}

	public void setStrCubrioObjetivo(String strCubrioObjetivo) {
		this.strCubrioObjetivo = strCubrioObjetivo;
	}

	public Integer getIntIdMatReq() {
		return intIdMatReq;
	}

	public void setIntIdMatReq(Integer intIdMatReq) {
		this.intIdMatReq = intIdMatReq;
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

	public Integer getIntIdCubrioObjetivo() {
		return intIdCubrioObjetivo;
	}

	public void setIntIdCubrioObjetivo(Integer intIdCubrioObjetivo) {
		this.intIdCubrioObjetivo = intIdCubrioObjetivo;
	}

	public String getStrMatReq() {
		return strMatReq;
	}

	public void setStrMatReq(String strMatReq) {
		this.strMatReq = strMatReq;
	}
	
	
}
