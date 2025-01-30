package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SePaFichasSolicitudesIngreso implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8323708279986319430L;
	
	@Id
	@Column(name = "IDFICHASOLICITUDINGRESO")
	private Long lngIdFichaSolicitudIngreso;

	@Column(name = "IDSOLICITUDINGRESO")
	private Integer intIdSolicitudIngreso;
	
	@Column(name = "CONSTANCIA")
	@Lob
	private byte[] archivo;

	@Column(name = "NMPROMEDIO")
	private Double intPromedio;
	
	@Column(name = "FCFICHASOLICITUDINGRESO")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcFichaSolicitudIngreso;
	
	@Column(name = "FCPAGO")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcPago;
	
	@Column(name = "IDPAGO")
	private String strIdPago;
	
	@Column(name = "TIPOCONSTANCIA")
	private String strTipoConstancia;
		
	@Column(name = "TIPOPAGO")
	private String strTipoPago;
	
	@Column(name = "FCACEPTACIONTERMINOS")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcAceptacionTerminos;
	
	@Column(name = "FOTO")
	@Lob
	private byte[] foto;
	
	@Column(name = "PERMITERECIBOEXAMEN")
	private Boolean blnPermiteReciboExamen;
	
	@Column(name = "PERMITESOLICITARFICHA")
	private Boolean blnPermiteSolicitarFicha;
	
	@Column(name = "PERMITEGUARDAR")
	private Boolean blnPermiteGuardar;
	
	@Column(name = "PERMITEREALIZAEXAMEN")
	private Boolean blnPermiteRealizarExamen;
	
	@Column(name = "PERMITEIMPRIMIRFICHA")
	private Boolean blnPermiteImprimirFicha;
	
	@Column(name = "MENSAJEPAGO")
	private String strMensajePago;
	
	@Column(name = "SEVERIDAD")
	private String strSeveridadMensaje;

	public Long getLngIdFichaSolicitudIngreso() {
		return lngIdFichaSolicitudIngreso;
	}

	public void setLngIdFichaSolicitudIngreso(Long lngIdFichaSolicitudIngreso) {
		this.lngIdFichaSolicitudIngreso = lngIdFichaSolicitudIngreso;
	}

	public Integer getIntIdSolicitudIngreso() {
		return intIdSolicitudIngreso;
	}

	public void setIntIdSolicitudIngreso(Integer intIdSolicitudIngreso) {
		this.intIdSolicitudIngreso = intIdSolicitudIngreso;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public Double getIntPromedio() {
		return intPromedio;
	}

	public void setIntPromedio(Double intPromedio) {
		this.intPromedio = intPromedio;
	}

	public Date getFcFichaSolicitudIngreso() {
		return fcFichaSolicitudIngreso;
	}

	public void setFcFichaSolicitudIngreso(Date fcFichaSolicitudIngreso) {
		this.fcFichaSolicitudIngreso = fcFichaSolicitudIngreso;
	}

	public Date getFcPago() {
		return fcPago;
	}

	public void setFcPago(Date fcPago) {
		this.fcPago = fcPago;
	}

	public String getStrIdPago() {
		return strIdPago;
	}

	public void setStrIdPago(String strIdPago) {
		this.strIdPago = strIdPago;
	}

	public String getStrTipoConstancia() {
		return strTipoConstancia;
	}

	public void setStrTipoConstancia(String strTipoConstancia) {
		this.strTipoConstancia = strTipoConstancia;
	}

	public String getStrTipoPago() {
		return strTipoPago;
	}

	public void setStrTipoPago(String strTipoPago) {
		this.strTipoPago = strTipoPago;
	}

	public Date getFcAceptacionTerminos() {
		return fcAceptacionTerminos;
	}

	public void setFcAceptacionTerminos(Date fcAceptacionTerminos) {
		this.fcAceptacionTerminos = fcAceptacionTerminos;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Boolean getBlnPermiteReciboExamen() {
		return blnPermiteReciboExamen;
	}

	public void setBlnPermiteReciboExamen(Boolean blnPermiteReciboExamen) {
		this.blnPermiteReciboExamen = blnPermiteReciboExamen;
	}

	public Boolean getBlnPermiteSolicitarFicha() {
		return blnPermiteSolicitarFicha;
	}

	public void setBlnPermiteSolicitarFicha(Boolean blnPermiteSolicitarFicha) {
		this.blnPermiteSolicitarFicha = blnPermiteSolicitarFicha;
	}

	public Boolean getBlnPermiteGuardar() {
		return blnPermiteGuardar;
	}

	public void setBlnPermiteGuardar(Boolean blnPermiteGuardar) {
		this.blnPermiteGuardar = blnPermiteGuardar;
	}

	public Boolean getBlnPermiteRealizarExamen() {
		return blnPermiteRealizarExamen;
	}

	public void setBlnPermiteRealizarExamen(Boolean blnPermiteRealizarExamen) {
		this.blnPermiteRealizarExamen = blnPermiteRealizarExamen;
	}

	public Boolean getBlnPermiteImprimirFicha() {
		return blnPermiteImprimirFicha;
	}

	public void setBlnPermiteImprimirFicha(Boolean blnPermiteImprimirFicha) {
		this.blnPermiteImprimirFicha = blnPermiteImprimirFicha;
	}

	public String getStrMensajePago() {
		return strMensajePago;
	}

	public void setStrMensajePago(String strMensajePago) {
		this.strMensajePago = strMensajePago;
	}

	public String getStrSeveridadMensaje() {
		return strSeveridadMensaje;
	}

	public void setStrSeveridadMensaje(String strSeveridadMensaje) {
		this.strSeveridadMensaje = strSeveridadMensaje;
	}
	
	

		
}
