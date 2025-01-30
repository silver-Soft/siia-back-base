package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIROLES")
public class SiRoles implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 667619634457023965L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDROL", sequenceName = "SIIUAT.IDROL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDROL")
	@NotNull
	
	@Column(name = "IDROL")
	private Integer intIdRol;
	
	@Column(name = "NBROL")
	private String strNbRol;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "IDGRUPO")
	private Long lngIdGrupo;

	public Integer getIntIdRol() {
		return intIdRol;
	}

	public void setIntIdRol(Integer intIdRol) {
		this.intIdRol = intIdRol;
	}

	public String getStrNbRol() {
		return strNbRol;
	}

	public void setStrNbRol(String strNbRol) {
		this.strNbRol = strNbRol;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Long getLngIdGrupo() {
		return lngIdGrupo;
	}

	public void setLngIdGrupo(Long lngIdGrupo) {
		this.lngIdGrupo = lngIdGrupo;
	}
		
}
