package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SI_DT_TURNOS")
public class SiDtTurnos {

	@Id
	@Column(name = "ID_TURNO")
	@SequenceGenerator(name = "generadorIdentificadorTurno", sequenceName = "SIIUAT.ID_TURNO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorTurno")
	private Long idTurno;
	
	@Column(name = "FECHA_TURNO")
	private Date fcTurno;
	
	@Column(name = "PRIMER_TURNO")
	private Integer primerTurno;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	@Column(name = "ID_HISTORIAL_LABORAL")
	private Long idHistorialLaboral;
	
	@Column(name = "ID_DT_ACTIVIDAD")
	private Long idDtActividad;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "LEIDO")
	private Integer leido;
	
	public Long getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}
	public Date getFcTurno() {
		return fcTurno;
	}
	public void setFcTurno(Date fcTurno) {
		this.fcTurno = fcTurno;
	}
	public Integer getPrimerTurno() {
		return primerTurno;
	}
	public void setPrimerTurno(Integer primerTurno) {
		this.primerTurno = primerTurno;
	}
	public String getUsuarioAudit() {
		return usuarioAudit;
	}
	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}
	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
	}
	public Long getIdDtActividad() {
		return idDtActividad;
	}
	public void setIdDtActividad(Long idDtActividad) {
		this.idDtActividad = idDtActividad;
	}
	public Date getFcAudit() {
		return fcAudit;
	}
	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}
	public Integer getLeido() {
		return leido;
	}
	public void setLeido(Integer leido) {
		this.leido = leido;
	}
	
}
