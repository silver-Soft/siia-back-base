package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParametrosCorreoTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4971225716435156037L;

	private String strUsuario;
	private String strContrasenia;
	private String strPuerto;
	private String strHost;
	private String strTls;
	private String strAut;
	private String strDebug;
	private String strRemitente;

	private String strAsunto;
	private List<CorreosTO> lstCorreos;

	public ParametrosCorreoTO() {
		super();
		lstCorreos = new ArrayList<CorreosTO>();
	}

	public ParametrosCorreoTO(final String strUsuario, final String strContrasenia, final String strPuerto,
			final String strHost, final String strTls, final String strAut, final String strDebug,
			final String strRemitente) {
		super();
		this.strUsuario = strUsuario;
		this.strContrasenia = strContrasenia;
		this.strPuerto = strPuerto;
		this.strHost = strHost;
		this.strTls = strTls;
		this.strAut = strAut;
		this.strDebug = strDebug;
		this.strRemitente = strRemitente;
	}
	
	public ParametrosCorreoTO(final String strUsuario, final String strContrasenia,
			final String strHost, final String strPuerto) {
		super();
		this.strUsuario = strUsuario;
		this.strContrasenia = strContrasenia;
		this.strHost = strHost;
		this.strPuerto = strPuerto;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public String getStrContrasenia() {
		return strContrasenia;
	}

	public void setStrContrasenia(String strContrasenia) {
		this.strContrasenia = strContrasenia;
	}

	public String getStrPuerto() {
		return strPuerto;
	}

	public void setStrPuerto(String strPuerto) {
		this.strPuerto = strPuerto;
	}

	public String getStrHost() {
		return strHost;
	}

	public void setStrHost(String strHost) {
		this.strHost = strHost;
	}

	public String getStrTls() {
		return strTls;
	}

	public void setStrTls(String strTls) {
		this.strTls = strTls;
	}

	public String getStrAut() {
		return strAut;
	}

	public void setStrAut(String strAut) {
		this.strAut = strAut;
	}

	public String getStrAsunto() {
		return strAsunto;
	}

	public void setStrAsunto(String strAsunto) {
		this.strAsunto = strAsunto;
	}

	public List<CorreosTO> getLstCorreos() {
		return lstCorreos;
	}

	public void setLstCorreos(List<CorreosTO> lstCorreos) {
		this.lstCorreos = lstCorreos;
	}

	public String getStrDebug() {
		return strDebug;
	}

	public void setStrDebug(String strDebug) {
		this.strDebug = strDebug;
	}

	public String getStrRemitente() {
		return strRemitente;
	}

	public void setStrRemitente(String strRemitente) {
		this.strRemitente = strRemitente;
	}

}
