package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaAsistentesEventos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 827699442033472628L;
	@Id
	@Column(name = "IDASISTENTEEVENTO")
	private Long lngIdAsistenteEvento;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "CORREO")
	private String strCorreo;
	
	@Column(name = "TELEFONO")
	private String strTelefono;
	
	@Column(name = "LOGIN")
	private String strLogin;
	
	@Column(name = "ESTATUSASISTENTE")
    private String strEstatusAsistente;
	
	@Column(name = "PERMITEVALIDAR")
    private boolean blnPermiteValidar;
	
	@Column(name = "PERMITEIMPRIMIR")
    private boolean blnPermiteImprimir;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
		
	public SiPaAsistentesEventos() {
		super();
	}

	
	public Long getLngIdAsistenteEvento() {
		return lngIdAsistenteEvento;
	}


	public void setLngIdAsistenteEvento(Long lngIdAsistenteEvento) {
		this.lngIdAsistenteEvento = lngIdAsistenteEvento;
	}


	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}


	public String getStrEstatusAsistente() {
		return strEstatusAsistente;
	}


	public void setStrEstatusAsistente(String strEstatusAsistente) {
		this.strEstatusAsistente = strEstatusAsistente;
	}


	public boolean isBlnPermiteValidar() {
		return blnPermiteValidar;
	}


	public void setBlnPermiteValidar(boolean blnPermiteValidar) {
		this.blnPermiteValidar = blnPermiteValidar;
	}


	public boolean isBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}


	public void setBlnPermiteImprimir(boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}


	public String getStrPrograma() {
		return strPrograma;
	}


	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}


	public String getStrFacultad() {
		return strFacultad;
	}


	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}
	
	
}
