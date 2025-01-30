package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSolicitudBeca implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9050215479779618828L;

	@Id
	@Column(name = "IDSOLICITUDBECA")
	private Long lngIdSolicitudBeca;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	@Column(name = "IDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;
	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	@Column(name = "CLTIPOSOLICITUDBECA")
	private Integer intClTipoSolicitudBeca;
	@Column(name = "DSTIPOSOLICITUDBECA")
	private String strDsTipoSolicitudBeca;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;

	@Column(name = "CLTIPOBECA")
	private Integer intClTipoBeca;
	@Column(name = "DSTIPOBECA")
	private String strDsTipoBeca;

	@Column(name = "CLTIPOBECAOTORGADA")
	private Integer intClTipoBecaOtorgada;
	@Column(name = "DSBECAOTORGADA")
	private String strDsTipoBecaOtorgada;
	
	@Column(name = "CLSTBECA")
	private Integer intClStBeca;
	@Column(name = "CLSTCONTANCIAINGRESOS")
	private Integer intClStConstanciaIngresos;
	@Column(name = "CLSTCONSTANCIAPROMEDIO")
	private Integer intClStConstanciaPromedio;
	@Column(name = "CLESTATUSESCONSEJERO")
	private Integer intClEstatusConsejero;
	@Column(name = "CLSTSOLICITUD")
	private Integer intClStSolicitud;
	@Column(name = "DSSTBECA")
	private String strDsStBeca;

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

	@Column(name = "NMPROMEDIO")
	private Double promedio;
	@Column(name = "PROMEDIOMINIMO")
	private Double promedioMinimo;
	@Column(name = "NMHORASACTIVIDADESREC")
	private String strNmHorasActividadesRec;

	@Column(name = "PERIODOCURSADO")
	private Integer intPeriodoCursado;

	@Column(name = "PERIODOMESES")
	private String strPeriodoMeses;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean permiteModificar;

	@Column(name = "PERMITECONSTANCIA")
	private Boolean permiteConstancia;
	
	@Column(name = "CADENAQR")
	private String strCadenaQr;

	public Long getLngIdSolicitudBeca() {
		return lngIdSolicitudBeca;
	}

	public void setLngIdSolicitudBeca(Long lngIdSolicitudBeca) {
		this.lngIdSolicitudBeca = lngIdSolicitudBeca;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public Integer getIntClTipoSolicitudBeca() {
		return intClTipoSolicitudBeca;
	}

	public void setIntClTipoSolicitudBeca(Integer intClTipoSolicitudBeca) {
		this.intClTipoSolicitudBeca = intClTipoSolicitudBeca;
	}

	public String getStrDsTipoSolicitudBeca() {
		return strDsTipoSolicitudBeca;
	}

	public void setStrDsTipoSolicitudBeca(String strDsTipoSolicitudBeca) {
		this.strDsTipoSolicitudBeca = strDsTipoSolicitudBeca;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public Integer getIntClTipoBeca() {
		return intClTipoBeca;
	}

	public void setIntClTipoBeca(Integer intClTipoBeca) {
		this.intClTipoBeca = intClTipoBeca;
	}

	public String getStrDsTipoBeca() {
		return strDsTipoBeca;
	}

	public void setStrDsTipoBeca(String strDsTipoBeca) {
		this.strDsTipoBeca = strDsTipoBeca;
	}

	public Integer getIntClTipoBecaOtorgada() {
		return intClTipoBecaOtorgada;
	}

	public void setIntClTipoBecaOtorgada(Integer intClTipoBecaOtorgada) {
		this.intClTipoBecaOtorgada = intClTipoBecaOtorgada;
	}

	public Integer getIntClStBeca() {
		return intClStBeca;
	}

	public void setIntClStBeca(Integer intClStBeca) {
		this.intClStBeca = intClStBeca;
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

	public Integer getIntClEstatusConsejero() {
		return intClEstatusConsejero;
	}

	public void setIntClEstatusConsejero(Integer intClEstatusConsejero) {
		this.intClEstatusConsejero = intClEstatusConsejero;
	}

	public Integer getIntClStSolicitud() {
		return intClStSolicitud;
	}

	public void setIntClStSolicitud(Integer intClStSolicitud) {
		this.intClStSolicitud = intClStSolicitud;
	}

	public String getStrDsStBeca() {
		return strDsStBeca;
	}

	public void setStrDsStBeca(String strDsStBeca) {
		this.strDsStBeca = strDsStBeca;
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

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	public Double getPromedioMinimo() {
		return promedioMinimo;
	}

	public void setPromedioMinimo(Double promedioMinimo) {
		this.promedioMinimo = promedioMinimo;
	}

	public String getStrNmHorasActividadesRec() {
		return strNmHorasActividadesRec;
	}

	public void setStrNmHorasActividadesRec(String strNmHorasActividadesRec) {
		this.strNmHorasActividadesRec = strNmHorasActividadesRec;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public Boolean getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public Boolean getPermiteConstancia() {
		return permiteConstancia;
	}

	public void setPermiteConstancia(Boolean permiteConstancia) {
		this.permiteConstancia = permiteConstancia;
	}

	public Integer getIntPeriodoCursado() {
		return intPeriodoCursado;
	}

	public void setIntPeriodoCursado(Integer intPeriodoCursado) {
		this.intPeriodoCursado = intPeriodoCursado;
	}

	public String getStrPeriodoMeses() {
		return strPeriodoMeses;
	}

	public void setStrPeriodoMeses(String strPeriodoMeses) {
		this.strPeriodoMeses = strPeriodoMeses;
	}

	public String getStrDsTipoBecaOtorgada() {
		return strDsTipoBecaOtorgada;
	}

	public void setStrDsTipoBecaOtorgada(String strDsTipoBecaOtorgada) {
		this.strDsTipoBecaOtorgada = strDsTipoBecaOtorgada;
	}

	public String getStrCadenaQr() {
		return strCadenaQr;
	}

	public void setStrCadenaQr(String strCadenaQr) {
		this.strCadenaQr = strCadenaQr;
	}

}
