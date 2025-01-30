package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAsistentesReuniones {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "AREA")
	private String area;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ROL")
	private String rol;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean permiteEliminar;
	
	@Column(name = "ASISTIO")
	private boolean asistio;
	
	@Column(name = "CORREO")
	private String correo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

	public boolean isAsistio() {
		return asistio;
	}

	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
