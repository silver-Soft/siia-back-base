package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtBusquedaUsuariosPermisos {
	
	@Id
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "LOGIN")
	private String login;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PERMITEVERROLES")
	private boolean permiteVerRoles;
	
	@Column(name = "PERMITEVERGRUPOS")
	private boolean permiteVerGrupos;
	
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isPermiteVerRoles() {
		return permiteVerRoles;
	}
	public void setPermiteVerRoles(boolean permiteVerRoles) {
		this.permiteVerRoles = permiteVerRoles;
	}
	public boolean isPermiteVerGrupos() {
		return permiteVerGrupos;
	}
	public void setPermiteVerGrupos(boolean permiteVerGrupos) {
		this.permiteVerGrupos = permiteVerGrupos;
	}

}
