package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXFICHASSOLICITUDESINGRESO")
public class SeAxFichasSolicitudesIngreso implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8323708279986319430L;

	private static final String GENID_FICHA_SOLICITUD_INGRESO = "GENIDFICHASOLICITUDINGRESO";
	
	@Id
	@Basic(optional = false)
	@Column(name = "IDFICHASOLICITUDINGRESO")
	@SequenceGenerator(name = GENID_FICHA_SOLICITUD_INGRESO, sequenceName = "SERESC.IDFICHASOLICITUDINGRESO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_FICHA_SOLICITUD_INGRESO)
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
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();
	
	@Column(name = "TIPOCONSTANCIA")
	private String strTipoConstancia;
		
	@Column(name = "TIPOPAGO")
	private String strTipoPago;
	
	@Column(name = "FCACEPTACIONTERMINOS")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcAceptacionTerminos;
	
	
	@Column(name = "FCACEPTACIONREGLAS")
	@Temporal(TemporalType.TIMESTAMP)	
	private Date fcAceptacionReglas;
	
	@Column(name = "FOTO")
	@Lob
	private byte[] foto;
	
	
	

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

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
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

	public Date getFcAceptacionReglas() {
		return fcAceptacionReglas;
	}

	public void setFcAceptacionReglas(Date fcAceptacionReglas) {
		this.fcAceptacionReglas = fcAceptacionReglas;
	}
	
	
	
	
}
