package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAsistentesCongreso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7677698819932537168L;
	@Id
	@Column(name = "IDASISTENTECONGRESO")
	private Long lngIdAsistenteCongreso;
	
	@Column(name = "NBASISTENTE")
	private String strNbAsistente;
	
	@Column(name = "APPATERNOASISTENTE")
	private String strApPaternoAsistente;
	
	@Column(name = "APMATERNOASISTENTE")
	private String strApMaternoAsistente;
	
	@Column(name = "INSTITUCIONPROCEDENCIA")
	private String strInstitucionProcedencia;
	
	@Column(name = "ACTIVIDAD")
	private String strActividad;
	
	@Column(name = "TITULOPONENCIA")
    private String strTituloPonencia;
	
	@Column(name = "CORREO")
	private String strCorreo;
	
	@Column(name = "NMTELEFONO")
	private String strNmTelefono;
	
	@Column(name = "CLESTATUSASISTIO")
	private Integer intClEstatusAsistio;
	
	@Column(name = "ASISTIO")
	private String strAsistio;
	
	@Column(name = "PERMITEVALIDARASISTENCIA")
	private Integer intPermiteValidarAsistencia;
	
	@Column(name = "PERMITEGENERARCONSTANCIA")
	private Integer intPermiteGenerarConstancia;

	public Long getLngIdAsistenteCongreso() {
		return lngIdAsistenteCongreso;
	}

	public void setLngIdAsistenteCongreso(Long lngIdAsistenteCongreso) {
		this.lngIdAsistenteCongreso = lngIdAsistenteCongreso;
	}

	public String getStrNbAsistente() {
		return strNbAsistente;
	}

	public void setStrNbAsistente(String strNbAsistente) {
		this.strNbAsistente = strNbAsistente;
	}

	public String getStrApPaternoAsistente() {
		return strApPaternoAsistente;
	}

	public void setStrApPaternoAsistente(String strApPaternoAsistente) {
		this.strApPaternoAsistente = strApPaternoAsistente;
	}

	public String getStrApMaternoAsistente() {
		return strApMaternoAsistente;
	}

	public void setStrApMaternoAsistente(String strApMaternoAsistente) {
		this.strApMaternoAsistente = strApMaternoAsistente;
	}

	public String getStrInstitucionProcedencia() {
		return strInstitucionProcedencia;
	}

	public void setStrInstitucionProcedencia(String strInstitucionProcedencia) {
		this.strInstitucionProcedencia = strInstitucionProcedencia;
	}

	public String getStrActividad() {
		return strActividad;
	}

	public void setStrActividad(String strActividad) {
		this.strActividad = strActividad;
	}

	public String getStrTituloPonencia() {
		return strTituloPonencia;
	}

	public void setStrTituloPonencia(String strTituloPonencia) {
		this.strTituloPonencia = strTituloPonencia;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}



	public String getStrNmTelefono() {
		return strNmTelefono;
	}

	public void setStrNmTelefono(String strNmTelefono) {
		this.strNmTelefono = strNmTelefono;
	}

	public Integer getIntClEstatusAsistio() {
		return intClEstatusAsistio;
	}

	public void setIntClEstatusAsistio(Integer intClEstatusAsistio) {
		this.intClEstatusAsistio = intClEstatusAsistio;
	}

	public String getStrAsistio() {
		return strAsistio;
	}

	public void setStrAsistio(String strAsistio) {
		this.strAsistio = strAsistio;
	}

	public Integer getIntPermiteValidarAsistencia() {
		return intPermiteValidarAsistencia;
	}

	public void setIntPermiteValidarAsistencia(Integer intPermiteValidarAsistencia) {
		this.intPermiteValidarAsistencia = intPermiteValidarAsistencia;
	}

	public Integer getIntPermiteGenerarConstancia() {
		return intPermiteGenerarConstancia;
	}

	public void setIntPermiteGenerarConstancia(Integer intPermiteGenerarConstancia) {
		this.intPermiteGenerarConstancia = intPermiteGenerarConstancia;
	}
	
	
}
