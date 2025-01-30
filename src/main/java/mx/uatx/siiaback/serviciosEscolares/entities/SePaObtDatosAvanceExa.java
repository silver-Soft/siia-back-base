package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosAvanceExa {
	
	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long idSolicitudIngreso;
	
	@Column(name = "NBASPIRANTE")
	private String nbAspirante;
	
	@Column(name = "APPATERNO")
	private String apPaterno;
	
	@Column(name = "APMATERNO")
	private String apMaterno;
	
	@Column(name = "IDFICHASOLICITUDINGRESO")
	private Long idFichaSolicitudIngreso;
	
	@Column(name = "PROGRAMA")
	private String programa;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	@Column(name = "MENSAJE")
	private String mensaje;
	
	@Column(name = "PERMITEIMPRIMIR")
	private boolean permiteImprimir;
	
	@Column(name = "QR")
	private String strCodigoQR;
	
	@Column(name = "TIEMPORESTANTE")
	private Long tiempoRestante;
	
	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}
	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
	}
	public String getNbAspirante() {
		return nbAspirante;
	}
	public void setNbAspirante(String nbAspirante) {
		this.nbAspirante = nbAspirante;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public Long getIdFichaSolicitudIngreso() {
		return idFichaSolicitudIngreso;
	}
	public void setIdFichaSolicitudIngreso(Long idFichaSolicitudIngreso) {
		this.idFichaSolicitudIngreso = idFichaSolicitudIngreso;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isPermiteImprimir() {
		return permiteImprimir;
	}
	public void setPermiteImprimir(boolean permiteImprimir) {
		this.permiteImprimir = permiteImprimir;
	}
	public String getStrCodigoQR() {
		return strCodigoQR;
	}
	public void setStrCodigoQR(String strCodigoQR) {
		this.strCodigoQR = strCodigoQR;
	}
	public Long getTiempoRestante() {
		return tiempoRestante;
	}
	public void setTiempoRestante(Long tiempoRestante) {
		this.tiempoRestante = tiempoRestante;
	}

}
