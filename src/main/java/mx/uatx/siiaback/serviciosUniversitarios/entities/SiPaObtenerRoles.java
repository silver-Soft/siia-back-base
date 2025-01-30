package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtenerRoles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -958074300864080554L;
	@Id
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
	
	@Column(name = "PERMITEMODIFICAR")
	private Integer intPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private Integer intPermiteEliminar;
	
	public SiPaObtenerRoles() {
		super();
	}

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

	public Integer getIntPermiteModificar() {
		return intPermiteModificar;
	}

	public void setIntPermiteModificar(Integer intPermiteModificar) {
		this.intPermiteModificar = intPermiteModificar;
	}

	public Integer getIntPermiteEliminar() {
		return intPermiteEliminar;
	}

	public void setIntPermiteEliminar(Integer intPermiteEliminar) {
		this.intPermiteEliminar = intPermiteEliminar;
	}
	
	
}
