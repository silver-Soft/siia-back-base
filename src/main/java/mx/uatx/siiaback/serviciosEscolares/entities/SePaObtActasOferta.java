package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtActasOferta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9196442291535887492L;
	@Id
	@Column(name = "IDACTA")
	private Long lngIdActa;

	@Column(name = "TIPOACREDITACION")
	private String strTipoAcreditacion;
	
	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "FECHAREGISTRO")
	private String strFechaRegistro;
	
	@Column(name = "PERMITEALUMNOS")
	private boolean blnPermiteAlumnos;
	
	@Column(name = "PERMITEABRIR")
	private boolean blnPermiteAbrir;
	
	@Column(name = "PERMITECERRAR")
	private boolean blnPermiteCerrar;
	
	@Column(name = "FECHA")
	private Date dtFecha;
	
	public SePaObtActasOferta() {
		super();
	}

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}

	public String getStrTipoAcreditacion() {
		return strTipoAcreditacion;
	}

	public void setStrTipoAcreditacion(String strTipoAcreditacion) {
		this.strTipoAcreditacion = strTipoAcreditacion;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrFechaRegistro() {
		return strFechaRegistro;
	}

	public void setStrFechaRegistro(String strFechaRegistro) {
		this.strFechaRegistro = strFechaRegistro;
	}

	public boolean isBlnPermiteAlumnos() {
		return blnPermiteAlumnos;
	}

	public void setBlnPermiteAlumnos(boolean blnPermiteAlumnos) {
		this.blnPermiteAlumnos = blnPermiteAlumnos;
	}

	public boolean isBlnPermiteAbrir() {
		return blnPermiteAbrir;
	}

	public void setBlnPermiteAbrir(boolean blnPermiteAbrir) {
		this.blnPermiteAbrir = blnPermiteAbrir;
	}

	public boolean isBlnPermiteCerrar() {
		return blnPermiteCerrar;
	}

	public void setBlnPermiteCerrar(boolean blnPermiteCerrar) {
		this.blnPermiteCerrar = blnPermiteCerrar;
	}

	public Date getDtFecha() {
		return dtFecha;
	}

	public void setDtFecha(Date dtFecha) {
		this.dtFecha = dtFecha;
	}
	
}
