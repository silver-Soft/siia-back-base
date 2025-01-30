package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaMateriasReportePlanEstudios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5976077291231564462L;
	
	@Id
	@Column(name = "IDPLANMATERIA")
	private Integer intIdPlanMateria;

	@Column(name = "DSMATERIA")
	private String strDsMateria;
	
	@Column(name = "DSTIPOMATERIA")
	private String strDsTipoMateria;
	
	@Column(name = "NMCREDITOS")
	private Integer intNmCreditos;
	
	@Column(name = "NMOTROSCREDITOS")
	private Integer intNmOtrosCreditos;
	
	@Column(name = "NMHORASDOCENCIA")
	private Integer intNmHorasDocencia;

	@Column(name = "NMHORASINDEPENDIENTES")
	private Integer intNmHorasIndependientes;
	
	@Column(name = "NMHORASPRACTICAS")
	private Integer intNmHorasPracticas;
	
	@Column(name = "NMHORASTEORICAS")
	private Integer intNmHorasTeoricas;
	
	@Column(name = "CVEMATERIA")
	private String strCveMateria;
	
	@Column(name = "PERIODO")
	private String strPeriodo;
	
	@Column(name = "ESTATUS")
	private String strEstatus;

	public Integer getIntIdPlanMateria() {
		return intIdPlanMateria;
	}

	public void setIntIdPlanMateria(Integer intIdPlanMateria) {
		this.intIdPlanMateria = intIdPlanMateria;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrDsTipoMateria() {
		return strDsTipoMateria;
	}

	public void setStrDsTipoMateria(String strDsTipoMateria) {
		this.strDsTipoMateria = strDsTipoMateria;
	}

	public Integer getIntNmCreditos() {
		return intNmCreditos;
	}

	public void setIntNmCreditos(Integer intNmCreditos) {
		this.intNmCreditos = intNmCreditos;
	}

	public Integer getIntNmOtrosCreditos() {
		return intNmOtrosCreditos;
	}

	public void setIntNmOtrosCreditos(Integer intNmOtrosCreditos) {
		this.intNmOtrosCreditos = intNmOtrosCreditos;
	}

	public Integer getIntNmHorasDocencia() {
		return intNmHorasDocencia;
	}

	public void setIntNmHorasDocencia(Integer intNmHorasDocencia) {
		this.intNmHorasDocencia = intNmHorasDocencia;
	}

	public Integer getIntNmHorasIndependientes() {
		return intNmHorasIndependientes;
	}

	public void setIntNmHorasIndependientes(Integer intNmHorasIndependientes) {
		this.intNmHorasIndependientes = intNmHorasIndependientes;
	}

	public Integer getIntNmHorasPracticas() {
		return intNmHorasPracticas;
	}

	public void setIntNmHorasPracticas(Integer intNmHorasPracticas) {
		this.intNmHorasPracticas = intNmHorasPracticas;
	}

	public Integer getIntNmHorasTeoricas() {
		return intNmHorasTeoricas;
	}

	public void setIntNmHorasTeoricas(Integer intNmHorasTeoricas) {
		this.intNmHorasTeoricas = intNmHorasTeoricas;
	}

	

	public String getStrCveMateria() {
		return strCveMateria;
	}

	public void setStrCveMateria(String strCveMateria) {
		this.strCveMateria = strCveMateria;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}
	
	

}
