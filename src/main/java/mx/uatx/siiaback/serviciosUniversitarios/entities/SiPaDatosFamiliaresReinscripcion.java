package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDatosFamiliaresReinscripcion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6110423476171244766L;

	@Id
	@Column(name = "IDFAMILIAR")
	private Long lngIdFamiliar;

	@Column(name = "CLPARENTEZCO")
	private Integer intClParentezco;

	@Column(name = "CLSTDEPENDENCIAECONOMICA")
	private Integer intClDependenciaEconomica;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "CLESTATUSESTUTOR")
	private Integer intClEstatusEsTutor;

	@Column(name = "NBCALLE")
	private String strNbCalle;

	@Column(name = "CLASENTAMIENTO")
	private Long lngClAsentamiento;

	@Column(name = "NMEXTERIOR")
	private String strNmExterior;

	@Column(name = "NMTELEFONO")
	private Long lngNmTelefono;

	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronico;

	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipio;

	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;

	public Long getLngIdFamiliar() {
		return lngIdFamiliar;
	}

	public void setLngIdFamiliar(Long lngIdFamiliar) {
		this.lngIdFamiliar = lngIdFamiliar;
	}

	public Integer getIntClParentezco() {
		return intClParentezco;
	}

	public void setIntClParentezco(Integer intClParentezco) {
		this.intClParentezco = intClParentezco;
	}

	public Integer getIntClDependenciaEconomica() {
		return intClDependenciaEconomica;
	}

	public void setIntClDependenciaEconomica(Integer intClDependenciaEconomica) {
		this.intClDependenciaEconomica = intClDependenciaEconomica;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public Integer getIntClEstatusEsTutor() {
		return intClEstatusEsTutor;
	}

	public void setIntClEstatusEsTutor(Integer intClEstatusEsTutor) {
		this.intClEstatusEsTutor = intClEstatusEsTutor;
	}

	public String getStrNbCalle() {
		return strNbCalle;
	}

	public void setStrNbCalle(String strNbCalle) {
		this.strNbCalle = strNbCalle;
	}

	public Long getLngClAsentamiento() {
		return lngClAsentamiento;
	}

	public void setLngClAsentamiento(Long lngClAsentamiento) {
		this.lngClAsentamiento = lngClAsentamiento;
	}

	public String getStrNmExterior() {
		return strNmExterior;
	}

	public void setStrNmExterior(String strNmExterior) {
		this.strNmExterior = strNmExterior;
	}

	public Long getLngNmTelefono() {
		return lngNmTelefono;
	}

	public void setLngNmTelefono(Long lngNmTelefono) {
		this.lngNmTelefono = lngNmTelefono;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public Long getLngIdMunicipio() {
		return lngIdMunicipio;
	}

	public void setLngIdMunicipio(Long lngIdMunicipio) {
		this.lngIdMunicipio = lngIdMunicipio;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

}
