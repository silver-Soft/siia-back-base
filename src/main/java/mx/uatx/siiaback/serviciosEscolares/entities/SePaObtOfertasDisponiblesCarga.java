package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtOfertasDisponiblesCarga {
	
	@Id
	@Column(name = "IDOFERTA")
	private Long idOferta;
	
	@Column(name = "DSMATERIA")
	private String dsMateria;
	
	@Column(name = "DOCENTE")
	private String docente;
	
	@Column(name = "CUPO")
	private Integer cupo;
	
	@Column(name = "MODALIDAD")
	private String modalidad;
	
	@Column(name = "PERMITEAGREGAR")
	private Boolean permiteAgregar;
	
	@Column(name = "PERMITECONSULTAR")
	private Boolean permiteConsultar;
	
	public Long getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(Long idOferta) {
		this.idOferta = idOferta;
	}
	public String getDsMateria() {
		return dsMateria;
	}
	public void setDsMateria(String dsMateria) {
		this.dsMateria = dsMateria;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public Integer getCupo() {
		return cupo;
	}
	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public Boolean getPermiteAgregar() {
		return permiteAgregar;
	}
	public void setPermiteAgregar(Boolean permiteAgregar) {
		this.permiteAgregar = permiteAgregar;
	}
	public Boolean getPermiteConsultar() {
		return permiteConsultar;
	}
	public void setPermiteConsultar(Boolean permiteConsultar) {
		this.permiteConsultar = permiteConsultar;
	}

}
