package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasPeriodoPlan implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -887654255964738367L;

	@Id
	@Column(name = "IDPLANMATERIA")
	private Long lngIdPlanMateria;

	@Column(name = "IDMATERIA")
	private Integer intIdMateria;

	@Column(name = "DSMATERIA")
	private String strMateria;

	@Column(name = "CLTIPOMATERIA")
	private String strClTipoMateria;

	@Column(name = "CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;

	@Column(name = "NMHORASDOCENCIA")
	private Integer intHorasDocencia;

	@Column(name = "NMHORASINDEPENDIENTES")
	private Integer intHorasIndependientes;

	@Column(name = "NMHORASTEORICAS")
	private Integer intHorasTeoricas;

	@Column(name = "NMHORASPRACTICAS")
	private Integer intHorasPracticas;

	@Column(name = "NMCREDITOS")
	private Integer intCreditos;

	@Column(name = "TIENEMATERIASREALES")
	private Boolean blnTieneMateriasReales;

	public Long getLngIdPlanMateria() {
		return lngIdPlanMateria;
	}

	public void setLngIdPlanMateria(Long lngIdPlanMateria) {
		this.lngIdPlanMateria = lngIdPlanMateria;
	}

	public Integer getIntIdMateria() {
		return intIdMateria;
	}

	public void setIntIdMateria(Integer intIdMateria) {
		this.intIdMateria = intIdMateria;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrClTipoMateria() {
		return strClTipoMateria;
	}

	public void setStrClTipoMateria(String strClTipoMateria) {
		this.strClTipoMateria = strClTipoMateria;
	}

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public Integer getIntHorasDocencia() {
		return intHorasDocencia;
	}

	public void setIntHorasDocencia(Integer intHorasDocencia) {
		this.intHorasDocencia = intHorasDocencia;
	}

	public Integer getIntHorasIndependientes() {
		return intHorasIndependientes;
	}

	public void setIntHorasIndependientes(Integer intHorasIndependientes) {
		this.intHorasIndependientes = intHorasIndependientes;
	}

	public Integer getIntHorasTeoricas() {
		return intHorasTeoricas;
	}

	public void setIntHorasTeoricas(Integer intHorasTeoricas) {
		this.intHorasTeoricas = intHorasTeoricas;
	}

	public Integer getIntHorasPracticas() {
		return intHorasPracticas;
	}

	public void setIntHorasPracticas(Integer intHorasPracticas) {
		this.intHorasPracticas = intHorasPracticas;
	}

	public Integer getIntCreditos() {
		return intCreditos;
	}

	public void setIntCreditos(Integer intCreditos) {
		this.intCreditos = intCreditos;
	}

	public Boolean getBlnTieneMateriasReales() {
		return blnTieneMateriasReales;
	}

	public void setBlnTieneMateriasReales(Boolean blnTieneMateriasReales) {
		this.blnTieneMateriasReales = blnTieneMateriasReales;
	}

}
