package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIMSVEHICULOSPERSONAL")
public class SiMsVehiculosPersonal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5045212358788756073L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDVEHICULOPERSONAL", sequenceName = "SIIUAT.IDVEHICULOPERSONAL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDVEHICULOPERSONAL")
	@NotNull
	@Column(name = "IDVEHICULOPERSONAL")
	private Long lngIdVehiculoPersonal;

	@Column(name = "IDMARCA")
	private Integer intIdMarca;
	
	@Column(name = "MODELO")
	private String strModelo;
	
	@Column(name = "COLOR")
	private String strColor;
	
	@Column(name = "IDTIPOVEHICULO")
	private Integer intIdTipoVehiculo;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;
	
	@Column(name = "IDESTACIONAMIENTO")
	private Integer intIdEstacionamiento;
	
	@Column(name = "NMCAJON")
	private String strNmCajon;
	
	@Column(name = "FCALTA")
	private Date fcAlta;
	
	@Column(name = "FCBAJA")
	private Date fcBaja;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "PLACAS")
	private String strPlacas;
	
	@Lob
    @Column(name = "TARJETACIRCULACION")
    private byte[] tarjetaCirculacion;
	
	@Column(name = "TIPOPERSONA")
	private String strTipoPersona;
	
	@Column(name = "CLESTATUSRESGUARDANTE")
	private Integer intClEstatusResguardante;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
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

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Integer getIntIdEstacionamiento() {
		return intIdEstacionamiento;
	}

	public void setIntIdEstacionamiento(Integer intIdEstacionamiento) {
		this.intIdEstacionamiento = intIdEstacionamiento;
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

	public String getStrPlacas() {
		return strPlacas;
	}

	public void setStrPlacas(String strPlacas) {
		this.strPlacas = strPlacas;
	}

	public byte[] getTarjetaCirculacion() {
		return tarjetaCirculacion;
	}

	public void setTarjetaCirculacion(byte[] tarjetaCirculacion) {
		this.tarjetaCirculacion = tarjetaCirculacion;
	}

	public Integer getIntClEstatusResguardante() {
		return intClEstatusResguardante;
	}

	public void setIntClEstatusResguardante(Integer intClEstatusResguardante) {
		this.intClEstatusResguardante = intClEstatusResguardante;
	}


	
}
