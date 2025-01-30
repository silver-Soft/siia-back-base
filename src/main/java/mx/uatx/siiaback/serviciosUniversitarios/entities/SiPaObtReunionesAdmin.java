package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtReunionesAdmin {
	
	@Id
	@Column(name = "ID_REUNION")
	private Long idReunion;
	
	@Column(name = "CLAVE_REUNION")
	private String claveReunion;
	
	@Column(name = "TEMA")
	private String tema;
	
	@Column(name = "AREA")
	private String areaCampus;
	
	@Column(name = "FECHA_PROGRAMAR")
	private Date fcProgramar;
	
	@Column(name = "HORA")
	private String hora;
	
	@Column(name = "FECHA_REALIZACION")
	private Date fcRealizacion;

	@Column(name = "ASISTENTES")
	private String asistentes;
	
	@Column(name = "ESTATUS")
	private String estatus;
	
	@Column(name = "PERSONAREGISTRA")
	private String nombreRegistra;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean permiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean permiteEliminar;
	
	@Column(name = "PERMITEDOCUMENTOS")
	private boolean permiteDocumentos;
	
	@Column(name = "PERMITEASISTENTES")
	private boolean permiteAsistentes;
	
	@Column(name = "PERMITECERRAR")
	private boolean permiteCerrar;
	
	@Column(name = "PERMITEABRIR")
	private boolean permiteAbrir;
	
	

	public Long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	public String getClaveReunion() {
		return claveReunion;
	}

	public void setClaveReunion(String claveReunion) {
		this.claveReunion = claveReunion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Date getFcProgramar() {
		return fcProgramar;
	}

	public void setFcProgramar(Date fcProgramar) {
		this.fcProgramar = fcProgramar;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Date getFcRealizacion() {
		return fcRealizacion;
	}

	public void setFcRealizacion(Date fcRealizacion) {
		this.fcRealizacion = fcRealizacion;
	}

	public String getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(String asistentes) {
		this.asistentes = asistentes;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public boolean isPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public boolean isPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

	public boolean isPermiteDocumentos() {
		return permiteDocumentos;
	}

	public void setPermiteDocumentos(boolean permiteDocumentos) {
		this.permiteDocumentos = permiteDocumentos;
	}

	public boolean isPermiteAsistentes() {
		return permiteAsistentes;
	}

	public void setPermiteAsistentes(boolean permiteAsistentes) {
		this.permiteAsistentes = permiteAsistentes;
	}

	public String getAreaCampus() {
		return areaCampus;
	}

	public void setAreaCampus(String areaCampus) {
		this.areaCampus = areaCampus;
	}

	public String getNombreRegistra() {
		return nombreRegistra;
	}

	public void setNombreRegistra(String nombreRegistra) {
		this.nombreRegistra = nombreRegistra;
	}

	public boolean isPermiteCerrar() {
		return permiteCerrar;
	}

	public void setPermiteCerrar(boolean permiteCerrar) {
		this.permiteCerrar = permiteCerrar;
	}

	public boolean isPermiteAbrir() {
		return permiteAbrir;
	}

	public void setPermiteAbrir(boolean permiteAbrir) {
		this.permiteAbrir = permiteAbrir;
	}


}
