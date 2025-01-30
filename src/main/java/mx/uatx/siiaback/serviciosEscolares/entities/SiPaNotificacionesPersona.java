package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaNotificacionesPersona implements Serializable {
	
	@Id
    @Column(name = "IDNOTIFICACIONMOVIL")
	private Long idNotificacionMovil;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "MENSAJE")
	private String mensaje;

	@Column(name = "FECHANOTIFICACION")
	private Date fcNotificacion;

	@Column(name = "ESTATUSNOTIFICACION")
	private String estatus;

	public Long getIdNotificacionMovil() {
		return idNotificacionMovil;
	}

	public void setIdNotificacionMovil(Long idNotificacionMovil) {
		this.idNotificacionMovil = idNotificacionMovil;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFcNotificacion() {
		return fcNotificacion;
	}

	public void setFcNotificacion(Date fcNotificacion) {
		this.fcNotificacion = fcNotificacion;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	

}
