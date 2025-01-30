package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCredencialesFacultad {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ESTATUS")
	private String estatus;
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "PERMITEENTREGAR")
	private Integer permiteEntregar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Integer getPermiteEntregar() {
		return permiteEntregar;
	}

	public void setPermiteEntregar(Integer permiteEntregar) {
		this.permiteEntregar = permiteEntregar;
	}

}
