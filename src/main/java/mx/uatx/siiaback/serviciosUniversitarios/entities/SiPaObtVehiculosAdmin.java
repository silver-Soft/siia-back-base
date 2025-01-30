package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtVehiculosAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4971195224939901771L;
	@Id
	@Column(name = "IDVEHICULOPERSONAL")
	private Long lngIdVehiculoPersonal;

	@Column(name = "IDMARCA")
	private Integer intIdMarca;
	
	@Column(name = "DSMARCA")
	private String strDsMarca;
	
	@Column(name = "MODELO")
	private String strModelo;
	
	@Column(name = "COLOR")
	private String strColor;
	
	@Column(name = "IDTIPOVEHICULO")
	private Integer intIdTipoVehiculo;
	
	@Column(name = "DSTIPOVEHICULO")
	private String strDsTipoVehiculo;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;
	
	@Column(name = "NBPROPIETARIO")
	private String strNmPropietario;
	
	@Column(name = "IDESTACIONAMIENTO")
	private Integer intIdEstacionamiento;
	
	@Column(name = "DSESTACIONAMIENTO")
	private String strDsEstacionamiento;
	
	@Column(name = "NMCAJON")
	private String strNmCajon;
	
	@Column(name = "FCALTA")
	private Date fcAlta;
	
	@Column(name = "FCBAJA")
	private Date fcBaja;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "PLACAS")
	private String strPlacas;
	
	@Column(name = "CADENAQR")
	private String strCadenaQr;
	
	@Column(name = "NBTRABAJADOR")
	private String strNbTrabajador;
	
	@Column(name = "NMTRABAJADOR")
	private String strNmTrabajador;
	
	@Column(name = "PUESTO")
	private String strPuesto;
	
	@Column(name = "AREA")
	private String strArea;
	
	@Column(name = "TIPOPERSONA")
	private String strTipoPersona;
	
	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar; 
	
	@Column(name="PERMITEIMPRIMIR")
	private boolean blnPermiteImprimir; 
	
	@Column(name="PERMITEDESCARGARTARJETA")
	private boolean blnPermiteDescargarTarjeta; 
	
	@Column(name = "CLESTATUSRESGUARDANTE")
	private Integer intClEstatusResguardante;
	
	@Column(name = "ESTATUS")
	private String strEstatus;

	
	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntClEstatusResguardante() {
		return intClEstatusResguardante;
	}

	public void setIntClEstatusResguardante(Integer intClEstatusResguardante) {
		this.intClEstatusResguardante = intClEstatusResguardante;
	}

	public String getStrTipoPersona() {
		return strTipoPersona;
	}

	public void setStrTipoPersona(String strTipoPersona) {
		this.strTipoPersona = strTipoPersona;
	}

	public Long getLngIdVehiculoPersonal() {
		return lngIdVehiculoPersonal;
	}

	public void setLngIdVehiculoPersonal(Long lngIdVehiculoPersonal) {
		this.lngIdVehiculoPersonal = lngIdVehiculoPersonal;
	}

	public Integer getIntIdMarca() {
		return intIdMarca;
	}

	public void setIntIdMarca(Integer intIdMarca) {
		this.intIdMarca = intIdMarca;
	}

	public String getStrDsMarca() {
		return strDsMarca;
	}

	public void setStrDsMarca(String strDsMarca) {
		this.strDsMarca = strDsMarca;
	}

	public String getStrModelo() {
		return strModelo;
	}

	public void setStrModelo(String strModelo) {
		this.strModelo = strModelo;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public Integer getIntIdTipoVehiculo() {
		return intIdTipoVehiculo;
	}

	public void setIntIdTipoVehiculo(Integer intIdTipoVehiculo) {
		this.intIdTipoVehiculo = intIdTipoVehiculo;
	}

	public String getStrDsTipoVehiculo() {
		return strDsTipoVehiculo;
	}

	public void setStrDsTipoVehiculo(String strDsTipoVehiculo) {
		this.strDsTipoVehiculo = strDsTipoVehiculo;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public String getStrNmPropietario() {
		return strNmPropietario;
	}

	public void setStrNmPropietario(String strNmPropietario) {
		this.strNmPropietario = strNmPropietario;
	}

	public Integer getIntIdEstacionamiento() {
		return intIdEstacionamiento;
	}

	public void setIntIdEstacionamiento(Integer intIdEstacionamiento) {
		this.intIdEstacionamiento = intIdEstacionamiento;
	}

	public String getStrDsEstacionamiento() {
		return strDsEstacionamiento;
	}

	public void setStrDsEstacionamiento(String strDsEstacionamiento) {
		this.strDsEstacionamiento = strDsEstacionamiento;
	}

	public String getStrNmCajon() {
		return strNmCajon;
	}

	public void setStrNmCajon(String strNmCajon) {
		this.strNmCajon = strNmCajon;
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

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public String getStrPlacas() {
		return strPlacas;
	}

	public void setStrPlacas(String strPlacas) {
		this.strPlacas = strPlacas;
	}

	public String getStrCadenaQr() {
		return strCadenaQr;
	}

	public void setStrCadenaQr(String strCadenaQr) {
		this.strCadenaQr = strCadenaQr;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public boolean isBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}

	public void setBlnPermiteImprimir(boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}

	public String getStrNbTrabajador() {
		return strNbTrabajador;
	}

	public void setStrNbTrabajador(String strNbTrabajador) {
		this.strNbTrabajador = strNbTrabajador;
	}

	public String getStrPuesto() {
		return strPuesto;
	}

	public void setStrPuesto(String strPuesto) {
		this.strPuesto = strPuesto;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrNmTrabajador() {
		return strNmTrabajador;
	}

	public void setStrNmTrabajador(String strNmTrabajador) {
		this.strNmTrabajador = strNmTrabajador;
	}

	public boolean isBlnPermiteDescargarTarjeta() {
		return blnPermiteDescargarTarjeta;
	}

	public void setBlnPermiteDescargarTarjeta(boolean blnPermiteDescargarTarjeta) {
		this.blnPermiteDescargarTarjeta = blnPermiteDescargarTarjeta;
	}
	
	

}
