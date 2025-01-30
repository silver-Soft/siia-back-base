package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteGeneralAsp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2728494148031555374L;	
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "ESTINTERESADOS")
	private Integer intEstInteresados;
	
	@Column(name = "HOMBRES")
	private Integer intHombres;

	@Column(name = "MUJERES")
	private Integer intMujeres;
	
	@Column(name = "ASPIRANTES")
	private Integer intAspirantes;
	
	@Column(name = "HOMBRESASP")
	private Integer intHombresAsp;
	
	@Column(name = "MUJERESASP")
	private Integer intMujeresAsp;

	@Column(name = "APLICARONSOV")
	private Integer intAplicaronSov;
	
	@Column(name = "VIVENCIA")
	private Integer intVivencia;

	@Column(name = "ACEPTADOS")
	private Integer intAceptados;
	
	@Column(name = "HOMBRESACP")
	private Integer intHombresAcep;
	
	@Column(name = "MUJERESACP")
	private Integer intMujeresAcep;
	
	@Column(name = "MATRICULADOS")
	private Integer intMatriculados;
	
	@Column(name = "HOMBRESMAT")
	private Integer intHombresMat;

	@Column(name = "MUJERESMAT")
	private Integer intMujeresMat;
	
	@Column(name = "INSCRITOS")
	private Integer intInscritos;
	
	@Column(name = "HOMBRESINS")
	private Integer intHombresIns;
	
	@Column(name = "MUJERESINS")
	private Integer intMujeresIns;
	
	public SePaObtDatosReporteGeneralAsp() {
		super();
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public Integer getIntEstInteresados() {
		return intEstInteresados;
	}

	public void setIntEstInteresados(Integer intEstInteresados) {
		this.intEstInteresados = intEstInteresados;
	}

	public Integer getIntHombres() {
		return intHombres;
	}

	public void setIntHombres(Integer intHombres) {
		this.intHombres = intHombres;
	}

	public Integer getIntMujeres() {
		return intMujeres;
	}

	public void setIntMujeres(Integer intMujeres) {
		this.intMujeres = intMujeres;
	}

	public Integer getIntAspirantes() {
		return intAspirantes;
	}

	public void setIntAspirantes(Integer intAspirantes) {
		this.intAspirantes = intAspirantes;
	}

	public Integer getIntHombresAsp() {
		return intHombresAsp;
	}

	public void setIntHombresAsp(Integer intHombresAsp) {
		this.intHombresAsp = intHombresAsp;
	}

	public Integer getIntMujeresAsp() {
		return intMujeresAsp;
	}

	public void setIntMujeresAsp(Integer intMujeresAsp) {
		this.intMujeresAsp = intMujeresAsp;
	}

	public Integer getIntAplicaronSov() {
		return intAplicaronSov;
	}

	public void setIntAplicaronSov(Integer intAplicaronSov) {
		this.intAplicaronSov = intAplicaronSov;
	}

	public Integer getIntVivencia() {
		return intVivencia;
	}

	public void setIntVivencia(Integer intVivencia) {
		this.intVivencia = intVivencia;
	}

	public Integer getIntAceptados() {
		return intAceptados;
	}

	public void setIntAceptados(Integer intAceptados) {
		this.intAceptados = intAceptados;
	}

	public Integer getIntHombresAcep() {
		return intHombresAcep;
	}

	public void setIntHombresAcep(Integer intHombresAcep) {
		this.intHombresAcep = intHombresAcep;
	}

	public Integer getIntMujeresAcep() {
		return intMujeresAcep;
	}

	public void setIntMujeresAcep(Integer intMujeresAcep) {
		this.intMujeresAcep = intMujeresAcep;
	}

	public Integer getIntMatriculados() {
		return intMatriculados;
	}

	public void setIntMatriculados(Integer intMatriculados) {
		this.intMatriculados = intMatriculados;
	}

	public Integer getIntHombresMat() {
		return intHombresMat;
	}

	public void setIntHombresMat(Integer intHombresMat) {
		this.intHombresMat = intHombresMat;
	}

	public Integer getIntMujeresMat() {
		return intMujeresMat;
	}

	public void setIntMujeresMat(Integer intMujeresMat) {
		this.intMujeresMat = intMujeresMat;
	}

	public Integer getIntInscritos() {
		return intInscritos;
	}

	public void setIntInscritos(Integer intInscritos) {
		this.intInscritos = intInscritos;
	}

	public Integer getIntHombresIns() {
		return intHombresIns;
	}

	public void setIntHombresIns(Integer intHombresIns) {
		this.intHombresIns = intHombresIns;
	}

	public Integer getIntMujeresIns() {
		return intMujeresIns;
	}

	public void setIntMujeresIns(Integer intMujeresIns) {
		this.intMujeresIns = intMujeresIns;
	}
	
	
}
