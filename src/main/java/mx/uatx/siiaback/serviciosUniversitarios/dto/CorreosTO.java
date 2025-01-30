package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosUniversitarios.entities.SiPaCorreosUsuariosDepYRecTO;

public class CorreosTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3814673812734071486L;

	private String strCorreo;
	private String strCorreoOculto;
	private String strMensaje;
	private String strRutaArchivo;

	private String strNombreCompleto;
	private String strDatoExtra;
	
	private String urlRecuperacionPassword;
	
	private String cadenaVerificacion;
	
	private Long lngIdVisitante;

	public CorreosTO(final SiPaCorreosUsuariosDepYRecTO entidad) {
		super();
		BeanUtils.copyProperties(entidad, this);
	}

	public CorreosTO() {

	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	public String getStrRutaArchivo() {
		return strRutaArchivo;
	}

	public void setStrRutaArchivo(String strRutaArchivo) {
		this.strRutaArchivo = strRutaArchivo;
	}

	public String getStrNombreCompleto() {
		return strNombreCompleto;
	}

	public void setStrNombreCompleto(String strNombreCompleto) {
		this.strNombreCompleto = strNombreCompleto;
	}

	public String getStrDatoExtra() {
		return strDatoExtra;
	}

	public void setStrDatoExtra(String strDatoExtra) {
		this.strDatoExtra = strDatoExtra;
	}

	public String getUrlRecuperacionPassword() {
		return urlRecuperacionPassword;
	}

	public void setUrlRecuperacionPassword(String urlRecuperacionPassword) {
		this.urlRecuperacionPassword = urlRecuperacionPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCadenaVerificacion() {
		return cadenaVerificacion;
	}

	public void setCadenaVerificacion(String cadenaVerificacion) {
		this.cadenaVerificacion = cadenaVerificacion;
	}

	public String getStrCorreoOculto() {
		return strCorreoOculto;
	}

	public void setStrCorreoOculto(String strCorreoOculto) {
		this.strCorreoOculto = strCorreoOculto;
	}

	public Long getLngIdVisitante() {
		return lngIdVisitante;
	}

	public void setLngIdVisitante(Long lngIdVisitante) {
		this.lngIdVisitante = lngIdVisitante;
	}
	
	
	
	

}