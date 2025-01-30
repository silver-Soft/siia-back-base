package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEAXSECCIONCUESTIONARIO")
public class SeAxSeccionCuestionario {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSECCIONCUESTIONARIO", sequenceName = "SERESC.IDSECCIONCUESTIONARIO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSECCIONCUESTIONARIO")
	@Column(name = "IDSECCIONCUESTIONARIO")
	private Integer intIdSeccionCuestionario;

	@Column(name = "IDCUESTIONARIO")
	private Integer intIdCuestionario;

	@Column(name = "IDSECCION")
	private Integer intIdSeccion;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "NMORDEN")
	private Integer intNmOrden;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdSeccionCuestionario() {
		return intIdSeccionCuestionario;
	}

	public void setIntIdSeccionCuestionario(Integer intIdSeccionCuestionario) {
		this.intIdSeccionCuestionario = intIdSeccionCuestionario;
	}

	public Integer getIntIdCuestionario() {
		return intIdCuestionario;
	}

	public void setIntIdCuestionario(Integer intIdCuestionario) {
		this.intIdCuestionario = intIdCuestionario;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntNmOrden() {
		return intNmOrden;
	}

	public void setIntNmOrden(Integer intNmOrden) {
		this.intNmOrden = intNmOrden;
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

	public Integer getIntIdSeccion() {
		return intIdSeccion;
	}

	public void setIntIdSeccion(Integer intIdSeccion) {
		this.intIdSeccion = intIdSeccion;
	}

}