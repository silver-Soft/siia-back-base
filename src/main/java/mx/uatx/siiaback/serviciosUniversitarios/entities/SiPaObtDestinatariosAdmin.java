package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDestinatariosAdmin {
	
	@Id
	@Column(name = "ID_DESTINATARIO_REMITENTE")
	private Long idDestinatarioRemitente;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean permiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean permiteEliminar;

	public Long getIdDestinatarioRemitente() {
		return idDestinatarioRemitente;
	}

	public void setIdDestinatarioRemitente(Long idDestinatarioRemitente) {
		this.idDestinatarioRemitente = idDestinatarioRemitente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public boolean isPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

}
