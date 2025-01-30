package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaAvisos implements Serializable {
	
	@Id
	@Column(name = "IDAVISO")
	private Long lngIdAviso;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcionAviso;
	
	@Column(name = "ESTATUSAVISO")
	private String strEstatusAviso;
	
	@Column(name = "IDMENSAJEAVISO")
	private Integer intIdMensajeAviso;
	
	@Column(name = "MENSAJE")
	private String strDescripcionMensaje;
	
	@Column(name = "FCENTERADO")
	private Date fcEnterado;
        
        @Column(name = "FCCREADO")
	private Date fcCreado;
	
	public Long getLngIdAviso() {
		return lngIdAviso;
	}
	public void setLngIdAviso(Long lngIdAviso) {
		this.lngIdAviso = lngIdAviso;
	}
	public String getStrDescripcionAviso() {
		return strDescripcionAviso;
	}
	public void setStrDescripcionAviso(String strDescripcionAviso) {
		this.strDescripcionAviso = strDescripcionAviso;
	}
	public String getStrEstatusAviso() {
		return strEstatusAviso;
	}
	public void setStrEstatusAviso(String strEstatusAviso) {
		this.strEstatusAviso = strEstatusAviso;
	}
	public Integer getIntIdMensajeAviso() {
		return intIdMensajeAviso;
	}
	public void setIntIdMensajeAviso(Integer intIdMensajeAviso) {
		this.intIdMensajeAviso = intIdMensajeAviso;
	}
	public String getStrDescripcionMensaje() {
		return strDescripcionMensaje;
	}
	public void setStrDescripcionMensaje(String strDescripcionMensaje) {
		this.strDescripcionMensaje = strDescripcionMensaje;
	}
	public Date getFcEnterado() {
		return fcEnterado;
	}
	public void setFcEnterado(Date fcEnterado) {
		this.fcEnterado = fcEnterado;
	}

        public Date getFcCreado() {
            return fcCreado;
        }

        public void setFcCreado(Date fcCreado) {
            this.fcCreado = fcCreado;
        }
	
        
}
