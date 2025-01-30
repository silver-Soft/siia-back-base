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

@Entity
@Table(schema = "SERESC", name = "SEAXEXPERIENCIASPROFASP")
public class SeAxExperienciasProfAsp implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5093398011490540095L;

	private static final String GENID_EXPERIENCIA_PROF_ASP = "GENIDEXPERIENCIAPROFASP";

	@Id
	@Basic(optional = false)
	@Column(name = "IDEXPERIENCIAPROFASP")
	@SequenceGenerator(name = GENID_EXPERIENCIA_PROF_ASP, sequenceName = "SERESC.IDEXPERIENCIAPROFASP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_EXPERIENCIA_PROF_ASP)
	private Long lngIdExperienciaProfesionalAsp;

	@Column(name = "INSTITUCION")
	private String strInstitucion;

	@Column(name = "CARGO")
	private String strCargo;

	@Column(name = "AREAADSCRIPCION")
	private String strAreaAdscripcion;

	@Column(name = "CLPAIS")
	private String strClPais;

	@Column(name = "CIUDAD")
	private String strCiudad;

	@Column(name = "ACTIVIDADES")
	private String strActividades;

	@Column(name = "CLESTATUSACTUAL")
	private Integer intClEstatusActual;

	@Column(name = "FCINICIO")
	@Temporal(TemporalType.DATE)
	private Date fcInicio;

	@Column(name = "FCTERMINACION")
	@Temporal(TemporalType.DATE)
	private Date fcTerminacion;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	public Long getLngIdExperienciaProfesionalAsp() {
		return lngIdExperienciaProfesionalAsp;
	}

	public void setLngIdExperienciaProfesionalAsp(Long lngIdExperienciaProfesionalAsp) {
		this.lngIdExperienciaProfesionalAsp = lngIdExperienciaProfesionalAsp;
	}

	public String getStrInstitucion() {
		return strInstitucion;
	}

	public void setStrInstitucion(String strInstitucion) {
		this.strInstitucion = strInstitucion;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrAreaAdscripcion() {
		return strAreaAdscripcion;
	}

	public void setStrAreaAdscripcion(String strAreaAdscripcion) {
		this.strAreaAdscripcion = strAreaAdscripcion;
	}

	public String getStrClPais() {
		return strClPais;
	}

	public void setStrClPais(String strClPais) {
		this.strClPais = strClPais;
	}

	public String getStrCiudad() {
		return strCiudad;
	}

	public void setStrCiudad(String strCiudad) {
		this.strCiudad = strCiudad;
	}

	public String getStrActividades() {
		return strActividades;
	}

	public void setStrActividades(String strActividades) {
		this.strActividades = strActividades;
	}

	public Integer getIntClEstatusActual() {
		return intClEstatusActual;
	}

	public void setIntClEstatusActual(Integer intClEstatusActual) {
		this.intClEstatusActual = intClEstatusActual;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcTerminacion() {
		return fcTerminacion;
	}

	public void setFcTerminacion(Date fcTerminacion) {
		this.fcTerminacion = fcTerminacion;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}

}
