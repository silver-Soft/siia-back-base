package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtRolesPermitidos {
	
	@Id
	@Column(name = "IDROL")
	private Integer idRol;
	
	@Column(name = "NBROL")
	private String nbRol;
	
	@Column(name = "DSROL")
	private String dsRol;
	
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNbRol() {
		return nbRol;
	}
	public void setNbRol(String nbRol) {
		this.nbRol = nbRol;
	}
	public String getDsRol() {
		return dsRol;
	}
	public void setDsRol(String dsRol) {
		this.dsRol = dsRol;
	}
	

}
