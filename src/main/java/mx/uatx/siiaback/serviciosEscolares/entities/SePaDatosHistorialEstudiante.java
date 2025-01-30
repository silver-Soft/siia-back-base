package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosHistorialEstudiante {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombreAlumno;

	@Column(name = "CURP")
	private String curp;

	@Column(name = "FCNACIMIENTO")
	private Date fcNacimiento;
	
	@Column(name = "FCNACIMIENTOCADENA")
	private String strFechaNacimiento;

	@Column(name = "DSESTADOCIVIL")
	private String estadoCivil;

	@Column(name = "DSESTATUSHISTACAD")
	private String estatus;

	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String dsProgramaEducativo;

	@Column(name = "NBPLANESTUDIO")
	private String dsPlanEstudios;

	@Column(name = "NBAREA")
	private String dsFacultad;

	@Column(name = "DSCAMPUS")
	private String dsCampus;

	@Column(name = "NBCALLE")
	private String calle;

	@Column(name = "NMEXTERIOR")
	private String nmExterior;

	@Column(name = "NBASENTAMIENTO")
	private String dsAsentamiento;

	@Column(name = "CODIGOPOSTAL")
	private String codigoPostal;

	@Column(name = "NBMUNICIPIO")
	private String dsMunicipio;

	@Column(name = "NBENTIDAD")
	private String dsEntidadFederativa;

	@Column(name = "NBPAIS")
	private String dsPais;
	
	@Column(name = "FOTOGRAFIA")
	private byte[] fotografia;
	
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public Date getFcNacimiento() {
		return fcNacimiento;
	}
	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}
	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}
	public String getDsPlanEstudios() {
		return dsPlanEstudios;
	}
	public void setDsPlanEstudios(String dsPlanEstudios) {
		this.dsPlanEstudios = dsPlanEstudios;
	}
	public String getDsFacultad() {
		return dsFacultad;
	}
	public void setDsFacultad(String dsFacultad) {
		this.dsFacultad = dsFacultad;
	}
	public String getDsCampus() {
		return dsCampus;
	}
	public void setDsCampus(String dsCampus) {
		this.dsCampus = dsCampus;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNmExterior() {
		return nmExterior;
	}
	public void setNmExterior(String nmExterior) {
		this.nmExterior = nmExterior;
	}
	public String getDsAsentamiento() {
		return dsAsentamiento;
	}
	public void setDsAsentamiento(String dsAsentamiento) {
		this.dsAsentamiento = dsAsentamiento;
	}
	public String getDsMunicipio() {
		return dsMunicipio;
	}
	public void setDsMunicipio(String dsMunicipio) {
		this.dsMunicipio = dsMunicipio;
	}
	public String getDsEntidadFederativa() {
		return dsEntidadFederativa;
	}
	public void setDsEntidadFederativa(String dsEntidadFederativa) {
		this.dsEntidadFederativa = dsEntidadFederativa;
	}
	public String getDsPais() {
		return dsPais;
	}
	public void setDsPais(String dsPais) {
		this.dsPais = dsPais;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public byte[] getFotografia() {
		return fotografia;
	}
	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}
	public String getStrFechaNacimiento() {
		return strFechaNacimiento;
	}
	public void setStrFechaNacimiento(String strFechaNacimiento) {
		this.strFechaNacimiento = strFechaNacimiento;
	}
	
	

}
