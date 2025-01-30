package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtVisitantes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4173028811305068432L;

	@Id
	@Column(name="IDVISITANTE", length = 9)
	private Long lngIdVisitante;
	
	@Column(name="NBVISITANTE", length = 80)
	private String strNbVisitante;
	
	@Column(name="CADENAQR")
	private String strCadenaQr;
	
	@Column(name="CORREO", length = 40)
	private String strCorreo;
	
	@Column(name="TELEFONO", length = 25)
	private String strTelefono;
	
	@Column(name="FCALTA")
	private Date fcAlta;
	
	@Column(name="FCBAJA")
	private Date fcBaja;
	
	@Column(name="DSESTATUS", length = 8)
	private String strDsEstatus;
	
	@Column(name="TIPO", length = 30)
	private String strDsTipo;
	
	@Column(name="PERMITEREENVIAR")
	private Boolean blnPermiteReenviar;
	
	@Column(name = "PERMITEMODIFICAR")
	 private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	public Long getLngIdVisitante() {
		return lngIdVisitante;
	}

	public void setLngIdVisitante(Long lngIdVisitante) {
		this.lngIdVisitante = lngIdVisitante;
	}

	public String getStrNbVisitante() {
		return strNbVisitante;
	}

	public void setStrNbVisitante(String strNbVisitante) {
		this.strNbVisitante = strNbVisitante;
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

	public Date getFcAlta() {
		return fcAlta;
	}

	public void setFcAlta(Date fcAlta) {
		this.fcAlta = fcAlta;
	}

	public Date getFcBaja() {
		return fcBaja;
	}

	public void setFcBaja(Date fcBaja) {
		this.fcBaja = fcBaja;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public Boolean getBlnPermiteReenviar() {
		return blnPermiteReenviar;
	}

	public void setBlnPermiteReenviar(Boolean blnPermiteReenviar) {
		this.blnPermiteReenviar = blnPermiteReenviar;
	}

	public String getStrCadenaQr() {
		return strCadenaQr;
	}

	public void setStrCadenaQr(String strCadenaQr) {
		this.strCadenaQr = strCadenaQr;
	}

	public String getStrDsTipo() {
		return strDsTipo;
	}

	public void setStrDsTipo(String strDsTipo) {
		this.strDsTipo = strDsTipo;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
}