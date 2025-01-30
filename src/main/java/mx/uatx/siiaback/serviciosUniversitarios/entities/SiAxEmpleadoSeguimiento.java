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
@Table(schema = "SIIUAT", name = "SI_AX_EMPLEADOS_SEGUIMIENTO")
public class SiAxEmpleadoSeguimiento {
	
	@Id
	@Column(name = "ID_EMPLEADO_SEGUIMIENTO")
	@SequenceGenerator(name = "generadorIdentificadorEmpSeg", sequenceName = "SIIUAT.ID_EMPLEADO_SEGUIMIENTO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorEmpSeg")
	private Long idEmpleadoSeguimiento;
	
	@Column(name = "ID_HISTORIAL_LABORAL")
	private Long idHistorialLaboral;
	
	@Column(name = "ID_ACTIVIDAD")
	private Long idActividad;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;

	public Long getIdEmpleadoSeguimiento() {
		return idEmpleadoSeguimiento;
	}

	public void setIdEmpleadoSeguimiento(Long idEmpleadoSeguimiento) {
		this.idEmpleadoSeguimiento = idEmpleadoSeguimiento;
	}

	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}

	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
	}

	public Long getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
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

}
