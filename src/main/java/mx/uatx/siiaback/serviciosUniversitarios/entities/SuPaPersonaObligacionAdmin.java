package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SuPaPersonaObligacionAdmin {

	@Id
	@Column(name = "IDOBLIGACION")
	private Integer idObligacion;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "DSESTATUS")
	private String strDsEstatus;

	@Column(name = "FCACEPTADO")
	private Date dteFcAceptado;

	@Column(name = "PERMITEIMPRIMIR")
	private Integer permiteImprimir;

	@Column(name = "FIRMA")
	@Lob
	private byte[] firmaUsuario;

	@Column(name = "CADENAFIRMA")
	private String strDescFirma;

	@Column(name = "FCLETRA")
	private String strFecha;

	public SuPaPersonaObligacionAdmin() {
		super();
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public Date getDteFcAceptado() {
		return dteFcAceptado;
	}

	public void setDteFcAceptado(Date dteFcAceptado) {
		this.dteFcAceptado = dteFcAceptado;
	}

	public Integer getPermiteImprimir() {
		return permiteImprimir;
	}

	public void setPermiteImprimir(Integer permiteImprimir) {
		this.permiteImprimir = permiteImprimir;
	}

	public byte[] getFirmaUsuario() {
		return firmaUsuario;
	}

	public void setFirmaUsuario(byte[] firmaUsuario) {
		this.firmaUsuario = firmaUsuario;
	}

	public String getStrDescFirma() {
		return strDescFirma;
	}

	public void setStrDescFirma(String strDescFirma) {
		this.strDescFirma = strDescFirma;
	}

	public String getStrFecha() {
		return strFecha;
	}

	public void setStrFecha(String strFecha) {
		this.strFecha = strFecha;
	}

}
