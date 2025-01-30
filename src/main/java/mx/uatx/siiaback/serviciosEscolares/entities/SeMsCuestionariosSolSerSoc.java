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

import com.sun.istack.NotNull;

@Entity
@Table(schema = "SERESC", name = "SEMSCUESTIONARIOSSOLSERSOC")
public class SeMsCuestionariosSolSerSoc {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDCUESTIONARIOSOLSERSOC", sequenceName = "SERESC.IDCUESTIONARIOSOLSERSOC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCUESTIONARIOSOLSERSOC")
	@NotNull
	@Column(name = "IDCUESTIONARIOSOLSERSOC")
	private Long idCuestionarioSolSerSoc;
	
	@Column(name = "IDSOLICITUDSERSOC")
	private Long idSolicitudSerSoc;

	@Column(name = "CLESTATUSCUESTIONARIO")
	private String clEstatusCuestionario;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "FCASIGNACION")
	private Date fcAsignacion;

	@Column(name = "FCCONTESTADO")
	private Date fcContestado;

	@Column(name = "TOKEN")
	private String token;

	public Long getIdCuestionarioSolSerSoc() {
		return idCuestionarioSolSerSoc;
	}

	public void setIdCuestionarioSolSerSoc(Long idCuestionarioSolSerSoc) {
		this.idCuestionarioSolSerSoc = idCuestionarioSolSerSoc;
	}

	public Long getIdSolicitudSerSoc() {
		return idSolicitudSerSoc;
	}

	public void setIdSolicitudSerSoc(Long idSolicitudSerSoc) {
		this.idSolicitudSerSoc = idSolicitudSerSoc;
	}

	public String getClEstatusCuestionario() {
		return clEstatusCuestionario;
	}

	public void setClEstatusCuestionario(String clEstatusCuestionario) {
		this.clEstatusCuestionario = clEstatusCuestionario;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getUsuarioAudit() {
		return usuarioAudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}

	public Date getFcAsignacion() {
		return fcAsignacion;
	}

	public void setFcAsignacion(Date fcAsignacion) {
		this.fcAsignacion = fcAsignacion;
	}

	public Date getFcContestado() {
		return fcContestado;
	}

	public void setFcContestado(Date fcContestado) {
		this.fcContestado = fcContestado;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
