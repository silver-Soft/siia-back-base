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
@Table(schema = "SERESC", name = "SEAXGRUPOSRESPUESTAS")
public class SeAxGruposRespuestas {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDAXGRUPORESPUESTA", sequenceName = "SERESC.IDAXGRUPORESPUESTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDAXGRUPORESPUESTA")

	@Column(name = "IDAXGRUPORESPUESTA")
	private Integer intIdAxGrupoRespuesta;

	@Column(name = "IDGRUPORESPUESTA")
	private Integer intIdGrupoRespuesta;

	@Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;

	@Column(name = "NMPUNTOS")
	private Double intNmPuntos;

	@Column(name = "NMORDEN")
	private Integer intNmOrden;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdAxGrupoRespuesta() {
		return intIdAxGrupoRespuesta;
	}

	public void setIntIdAxGrupoRespuesta(Integer intIdAxGrupoRespuesta) {
		this.intIdAxGrupoRespuesta = intIdAxGrupoRespuesta;
	}

	public Integer getIntIdGrupoRespuesta() {
		return intIdGrupoRespuesta;
	}

	public void setIntIdGrupoRespuesta(Integer intIdGrupoRespuesta) {
		this.intIdGrupoRespuesta = intIdGrupoRespuesta;
	}

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

	public Double getIntNmPuntos() {
		return intNmPuntos;
	}

	public void setIntNmPuntos(Double intNmPuntos) {
		this.intNmPuntos = intNmPuntos;
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

	
}