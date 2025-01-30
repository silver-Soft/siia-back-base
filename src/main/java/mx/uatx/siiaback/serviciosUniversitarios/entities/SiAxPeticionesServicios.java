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
@Table(schema = "SIIUAT", name = "SIAXPETICIONESSERVICIOS")
public class SiAxPeticionesServicios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3571141574243479903L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPETICIONSERVICIO", sequenceName = "SIIUAT.IDPETICIONSERVICIO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPETICIONSERVICIO")
	@NotNull
	
	@Column(name = "IDPETICIONSERVICIO")
	private Long lngIdPeticionServicio;
	
	@Column(name = "IDPETICION")
	private Long lngIdPeticion;
	
	@Column(name = "IDTIPOSERVICIO")
	private Integer intIdTipoServicio;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdPeticionServicio() {
		return lngIdPeticionServicio;
	}

	public void setLngIdPeticionServicio(Long lngIdPeticionServicio) {
		this.lngIdPeticionServicio = lngIdPeticionServicio;
	}

	public Long getLngIdPeticion() {
		return lngIdPeticion;
	}

	public void setLngIdPeticion(Long lngIdPeticion) {
		this.lngIdPeticion = lngIdPeticion;
	}

	public Integer getIntIdTipoServicio() {
		return intIdTipoServicio;
	}

	public void setIntIdTipoServicio(Integer intIdTipoServicio) {
		this.intIdTipoServicio = intIdTipoServicio;
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
	
	
}
