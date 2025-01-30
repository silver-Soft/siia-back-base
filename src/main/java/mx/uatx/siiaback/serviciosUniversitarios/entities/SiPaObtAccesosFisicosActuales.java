package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAccesosFisicosActuales {
	
	@Id
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FECHAINGRESO")
	private Date fechaIngreso;
	
	@Column(name = "HORAINGRESO")
	private String horaIngreso;
	
	@Column(name = "ACCESOFISICO")
	private String accesoFisico;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "TIPOPERSONA")
	private String tipoPersona;
	
	@Column(name = "PERMITESALIDA")
	private Boolean permiteRegistroSalida;
	
	
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public String getAccesoFisico() {
		return accesoFisico;
	}
	public void setAccesoFisico(String accesoFisico) {
		this.accesoFisico = accesoFisico;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public Boolean getPermiteRegistroSalida() {
		return permiteRegistroSalida;
	}
	public void setPermiteRegistroSalida(Boolean permiteRegistroSalida) {
		this.permiteRegistroSalida = permiteRegistroSalida;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
