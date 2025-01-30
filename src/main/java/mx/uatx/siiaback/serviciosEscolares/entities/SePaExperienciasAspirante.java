package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaExperienciasAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7145596356655159646L;

	@Id
	@Column(name = "IDEXPERIENCIAPROFASP")
	private Long lngIdExperienciaProfesionalAsp;

	@Column(name = "INSTITUCION")
	private String strInstitucion;

	@Column(name = "CARGO")
	private String strCargo;

	@Column(name = "AREAADSCRIPCION")
	private String strAreaAdscripcion;

	@Column(name = "CLPAIS")
	private String strClPais;

	@Column(name = "NBPAIS")
	private String strNbPais;

	@Column(name = "CIUDAD")
	private String strCiudad;

	@Column(name = "ACTIVIDADES")
	private String strActividades;

	@Column(name = "CLESTATUSACTUAL")
	private Integer intClEstatusActual;

	@Column(name = "DSESTATUS")
	private String strDsEstatus;

	@Column(name = "FCINICIO")
	private Date fcInicio;

	@Column(name = "FCTERMINACION")
	private Date fcTerminacion;

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

	public String getStrNbPais() {
		return strNbPais;
	}

	public void setStrNbPais(String strNbPais) {
		this.strNbPais = strNbPais;
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

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
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

}
