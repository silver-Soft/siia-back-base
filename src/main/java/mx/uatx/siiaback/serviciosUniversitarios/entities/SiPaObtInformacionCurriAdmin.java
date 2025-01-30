package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtInformacionCurriAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3425146368016837688L;
	@Id
	@Column(name = "IDINFORMACIONCURRICULAR")
	private Long lngIdInformacionCurricular;
	
	@Column(name = "NMEMPLEADO")
	private String strNmEmpleado;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "AREAADSCRIPCION")
	private String strAreaAdscripcion;
	
	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;
	
	@Column(name = "CLESTATUSVALIDADO")
    private Integer intClEstatusValidado;
	
	@Column(name = "DSESTATUS")
    private String strEstatus;
	
	@Column(name="PERMITECONSULTAR")
	private boolean blnPermiteConsultar;
	
	@Column(name = "PERMITEVALIDAR")
    private boolean blnPermiteValidar;
	
	@Column(name = "PERMITEDESVALIDAR")
    private boolean blnPermiteDesValidar;

	public Long getLngIdInformacionCurricular() {
		return lngIdInformacionCurricular;
	}

	public void setLngIdInformacionCurricular(Long lngIdInformacionCurricular) {
		this.lngIdInformacionCurricular = lngIdInformacionCurricular;
	}

	public String getStrNmEmpleado() {
		return strNmEmpleado;
	}

	public void setStrNmEmpleado(String strNmEmpleado) {
		this.strNmEmpleado = strNmEmpleado;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public boolean isBlnPermiteConsultar() {
		return blnPermiteConsultar;
	}

	public void setBlnPermiteConsultar(boolean blnPermiteConsultar) {
		this.blnPermiteConsultar = blnPermiteConsultar;
	}

	public String getStrAreaAdscripcion() {
		return strAreaAdscripcion;
	}

	public void setStrAreaAdscripcion(String strAreaAdscripcion) {
		this.strAreaAdscripcion = strAreaAdscripcion;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
	}

	public Integer getIntClEstatusValidado() {
		return intClEstatusValidado;
	}

	public void setIntClEstatusValidado(Integer intClEstatusValidado) {
		this.intClEstatusValidado = intClEstatusValidado;
	}

	public boolean isBlnPermiteValidar() {
		return blnPermiteValidar;
	}

	public void setBlnPermiteValidar(boolean blnPermiteValidar) {
		this.blnPermiteValidar = blnPermiteValidar;
	}

	public boolean isBlnPermiteDesValidar() {
		return blnPermiteDesValidar;
	}

	public void setBlnPermiteDesValidar(boolean blnPermiteDesValidar) {
		this.blnPermiteDesValidar = blnPermiteDesValidar;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	} 
	
	
	
}
