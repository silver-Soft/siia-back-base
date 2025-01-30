package mx.uatx.siiaback.serviciosEscolares.entities;
// Generated 9/03/2010 11:26:21 AM by Hibernate Tools 3.2.2.GA

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@Table(schema = "SERESC", name = "SEMSCUESTIONARIOSPERSONAS")
public class SeMsCuestionariosPersonas implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3065579755449441390L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDCUESTIONARIOPERSONA", sequenceName = "SERESC.IDCUESTIONARIOPERSONA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCUESTIONARIOPERSONA")
	@NotNull
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long lngIdCuestionarioPersona;

	@Column(name = "IDCUESTIONARIO")
	private Long lngIdCuestionario;

	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	@Column(name = "CLESTATUSCUESTIONARIO")
	private String strClEstatusCuestionario;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCASIGNACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAsignacion;

	@Column(name = "FCCONTESTADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcConstestado;

	@Column(name = "CLESTATUSOBLIGATORIO")
	private Integer intClEstatusObligatorio;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "CLAVE")
	private String strClave;

	public Long getLngIdCuestionarioPersona() {
		return lngIdCuestionarioPersona;
	}

	public void setLngIdCuestionarioPersona(Long lngIdCuestionarioPersona) {
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

	public Long getLngIdCuestionario() {
		return lngIdCuestionario;
	}

	public void setLngIdCuestionario(Long lngIdCuestionario) {
		this.lngIdCuestionario = lngIdCuestionario;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public String getStrClEstatusCuestionario() {
		return strClEstatusCuestionario;
	}

	public void setStrClEstatusCuestionario(String strClEstatusCuestionario) {
		this.strClEstatusCuestionario = strClEstatusCuestionario;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
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

	public Date getFcAsignacion() {
		return fcAsignacion;
	}

	public void setFcAsignacion(Date fcAsignacion) {
		this.fcAsignacion = fcAsignacion;
	}

	public Date getFcConstestado() {
		return fcConstestado;
	}

	public void setFcConstestado(Date fcConstestado) {
		this.fcConstestado = fcConstestado;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrClave() {
		return strClave;
	}

	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}

	public Integer getIntClEstatusObligatorio() {
		return intClEstatusObligatorio;
	}

	public void setIntClEstatusObligatorio(Integer intClEstatusObligatorio) {
		this.intClEstatusObligatorio = intClEstatusObligatorio;
	}

}
