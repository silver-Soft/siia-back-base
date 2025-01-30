package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtEmpleadosArea {
	
	@Id
	@Column(name="IDTITULARPUESTO")
	private Long idTitularPuesto;
	
	@Column(name="NBPERSONA")
	private String nbPersona;

	@Column(name="APPATERNO")
	private String apPaterno;

	@Column(name="APMATERNO")
	private String apMaterno;

	@Column(name="NBPUESTO")
	private String nbPuesto;

	@Column(name="IDHISTORIALLABORAL")
	private Long idHistorialLaboral;

	@Column(name="LOGIN")
	private String login;

	@Column(name="NMEMPLEADO")
	private String nmEmpleado;

	@Column(name="CORREO")
	private String correo;

	public Long getIdTitularPuesto() {
		return idTitularPuesto;
	}

	public void setIdTitularPuesto(Long idTitularPuesto) {
		this.idTitularPuesto = idTitularPuesto;
	}

	public String getNbPersona() {
		return nbPersona;
	}

	public void setNbPersona(String nbPersona) {
		this.nbPersona = nbPersona;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getNbPuesto() {
		return nbPuesto;
	}

	public void setNbPuesto(String nbPuesto) {
		this.nbPuesto = nbPuesto;
	}

	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}

	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNmEmpleado() {
		return nmEmpleado;
	}

	public void setNmEmpleado(String nmEmpleado) {
		this.nmEmpleado = nmEmpleado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
