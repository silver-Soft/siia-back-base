package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
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
@Table(schema = "SERESC", name = "SEMSSOLICITUDESBECAS")
public class SeMsSolicitudesBecas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4500791286042460998L;

	@Id
	@SequenceGenerator(name = "GENERADOR_IDSOLICITUDBECA", sequenceName = "SERESC.IDSOLICITUDBECA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERADOR_IDSOLICITUDBECA")
	@Column(name = "IDSOLICITUDBECA")
	private Long lngIdSolicitudBeca;

	@Column(name = "CLSTBECA")
	private Integer intClStBeca;

	@Column(name = "CLTIPOSOLICITUDBECA")
	private Integer intClTipoSolicitudBeca;

	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;

	@Column(name = "CLSTSOLICITUD")
	private Integer intClStSolicitud;

	@Column(name = "CLSTCONTANCIAINGRESOS")
	private Integer intClStConstanciaIngresos;

	@Column(name = "CLSTCONSTANCIAPROMEDIO")
	private Integer intClStConstanciaPromedio;

	@Column(name = "FCSOLICITUD")
	@Temporal(TemporalType.DATE)
	private Date fcSolicitud;

	@Column(name = "NMPROMEDIO")
	private Double promedio;

	@Column(name = "DSRAZON1")
	private String strDsRazon1;

	@Column(name = "DSRAZON2")
	private String strDsRazon2;

	@Column(name = "DSRAZON3")
	private String strDsRazon3;

	@Column(name = "DSACTIVIDAD1")
	private String strDsActividad1;

	@Column(name = "DSACTIVIDAD2")
	private String strDsActividad2;

	@Column(name = "DSACTIVIDAD3")
	private String strDsActividad3;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.DATE)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "CLTIPOBECA")
	private Integer intClTipoBeca;

	@Column(name = "CLESTATUSESCONSEJERO")
	private Integer intClEstatusConsejero;

	@Column(name = "COMPROBANTEINGRESOS")
	@Lob
	private byte[] comprobanteIngresos;

	@Column(name = "CLTIPOBECAOTORGADA")
	private Integer intClTipoBecaOtorgada;

	public Long getLngIdSolicitudBeca() {
		return lngIdSolicitudBeca;
	}

	public void setLngIdSolicitudBeca(Long lngIdSolicitudBeca) {
		this.lngIdSolicitudBeca = lngIdSolicitudBeca;
	}

	public Integer getIntClStBeca() {
		return intClStBeca;
	}

	public void setIntClStBeca(Integer intClStBeca) {
		this.intClStBeca = intClStBeca;
	}

	public Integer getIntClTipoSolicitudBeca() {
		return intClTipoSolicitudBeca;
	}

	public void setIntClTipoSolicitudBeca(Integer intClTipoSolicitudBeca) {
		this.intClTipoSolicitudBeca = intClTipoSolicitudBeca;
	}

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public Integer getIntClStSolicitud() {
		return intClStSolicitud;
	}

	public void setIntClStSolicitud(Integer intClStSolicitud) {
		this.intClStSolicitud = intClStSolicitud;
	}

	public Integer getIntClStConstanciaIngresos() {
		return intClStConstanciaIngresos;
	}

	public void setIntClStConstanciaIngresos(Integer intClStConstanciaIngresos) {
		this.intClStConstanciaIngresos = intClStConstanciaIngresos;
	}

	public Integer getIntClStConstanciaPromedio() {
		return intClStConstanciaPromedio;
	}

	public void setIntClStConstanciaPromedio(Integer intClStConstanciaPromedio) {
		this.intClStConstanciaPromedio = intClStConstanciaPromedio;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	public String getStrDsRazon1() {
		return strDsRazon1;
	}

	public void setStrDsRazon1(String strDsRazon1) {
		this.strDsRazon1 = strDsRazon1;
	}

	public String getStrDsRazon2() {
		return strDsRazon2;
	}

	public void setStrDsRazon2(String strDsRazon2) {
		this.strDsRazon2 = strDsRazon2;
	}

	public String getStrDsRazon3() {
		return strDsRazon3;
	}

	public void setStrDsRazon3(String strDsRazon3) {
		this.strDsRazon3 = strDsRazon3;
	}

	public String getStrDsActividad1() {
		return strDsActividad1;
	}

	public void setStrDsActividad1(String strDsActividad1) {
		this.strDsActividad1 = strDsActividad1;
	}

	public String getStrDsActividad2() {
		return strDsActividad2;
	}

	public void setStrDsActividad2(String strDsActividad2) {
		this.strDsActividad2 = strDsActividad2;
	}

	public String getStrDsActividad3() {
		return strDsActividad3;
	}

	public void setStrDsActividad3(String strDsActividad3) {
		this.strDsActividad3 = strDsActividad3;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntClTipoBeca() {
		return intClTipoBeca;
	}

	public void setIntClTipoBeca(Integer intClTipoBeca) {
		this.intClTipoBeca = intClTipoBeca;
	}

	public Integer getIntClEstatusConsejero() {
		return intClEstatusConsejero;
	}

	public void setIntClEstatusConsejero(Integer intClEstatusConsejero) {
		this.intClEstatusConsejero = intClEstatusConsejero;
	}

	public byte[] getComprobanteIngresos() {
		return comprobanteIngresos;
	}

	public void setComprobanteIngresos(byte[] comprobanteIngresos) {
		this.comprobanteIngresos = comprobanteIngresos;
	}

	public Integer getIntClTipoBecaOtorgada() {
		return intClTipoBecaOtorgada;
	}

	public void setIntClTipoBecaOtorgada(Integer intClTipoBecaOtorgada) {
		this.intClTipoBecaOtorgada = intClTipoBecaOtorgada;
	}

}
