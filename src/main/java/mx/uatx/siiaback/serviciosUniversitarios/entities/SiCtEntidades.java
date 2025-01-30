package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name="SICTENTIDADES")
public class SiCtEntidades {
	
	@Id
	@Column(name = "IDENTIDAD")
	private Long idEntidad;
	
	@Column(name = "CLPAIS")
	private String clPais;
	
	@Column(name = "NBENTIDAD")
	private String nbEntidad;
	
	@Column(name = "ABREVIATURA")
	private String abreviatura;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuariAudit;
	
	@Column(name = "ABREVIATURACURP")
	private String abreviaturaCurp;
	
	@Column(name = "IDCARTOGRAFIA")
	private Long idCartografia;

	public Long getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Long idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getClPais() {
		return clPais;
	}

	public void setClPais(String clPais) {
		this.clPais = clPais;
	}

	public String getNbEntidad() {
		return nbEntidad;
	}

	public void setNbEntidad(String nbEntidad) {
		this.nbEntidad = nbEntidad;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getUsuariAudit() {
		return usuariAudit;
	}

	public void setUsuariAudit(String usuariAudit) {
		this.usuariAudit = usuariAudit;
	}

	public String getAbreviaturaCurp() {
		return abreviaturaCurp;
	}

	public void setAbreviaturaCurp(String abreviaturaCurp) {
		this.abreviaturaCurp = abreviaturaCurp;
	}

	public Long getIdCartografia() {
		return idCartografia;
	}

	public void setIdCartografia(Long idCartografia) {
		this.idCartografia = idCartografia;
	}
	

}
