package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSolicitudesBecasExcel {
	
	@Id
    @Column(name = "ID")
	private Integer id;
	
	@Column(name = "FOLIOSOLICITUD")
	private Long folioSolicitud;

	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "LICENCIATURA")
	private String licenciatura;

	@Column(name = "FACULTAD")
	private String facultad;

	@Column(name = "SEMESTRE")
	private Integer semestre;

	@Column(name = "PROMEDIO")
	private Double promedio;

	@Column(name = "TIPOBECA")
	private String tipoBeca;

	@Column(name = "TIPOBECAOTORGADA")
	private String tipoBecaOtorgada;

	@Column(name = "TIPOSOLICITUD")
	private String tipoSolicitud;

	@Column(name = "ACUMULADAS")
	private Integer acumuladas;

	@Column(name = "OTROTIPOBECA")
	private String otroTipoBeca;

	@Column(name = "FCSOLICITUD")
	private String fcSolicitud;

	@Column(name = "AREA1")
	private String area1;

	@Column(name = "AREA2")
	private String area2;

	@Column(name = "GENERO")
	private String genero;

	@Column(name = "INGRESOS")
	private String ingresos;

	@Column(name = "CURP")
	private String curp;
	
	@Column(name = "ESTATUSHISTORIALACAD")
	private String estatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLicenciatura() {
		return licenciatura;
	}

	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	public String getTipoBeca() {
		return tipoBeca;
	}

	public void setTipoBeca(String tipoBeca) {
		this.tipoBeca = tipoBeca;
	}

	public String getTipoBecaOtorgada() {
		return tipoBecaOtorgada;
	}

	public void setTipoBecaOtorgada(String tipoBecaOtorgada) {
		this.tipoBecaOtorgada = tipoBecaOtorgada;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public Integer getAcumuladas() {
		return acumuladas;
	}

	public void setAcumuladas(Integer acumuladas) {
		this.acumuladas = acumuladas;
	}

	public String getOtroTipoBeca() {
		return otroTipoBeca;
	}

	public void setOtroTipoBeca(String otroTipoBeca) {
		this.otroTipoBeca = otroTipoBeca;
	}

	public String getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(String fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getArea1() {
		return area1;
	}

	public void setArea1(String area1) {
		this.area1 = area1;
	}

	public String getArea2() {
		return area2;
	}

	public void setArea2(String area2) {
		this.area2 = area2;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Long getFolioSolicitud() {
		return folioSolicitud;
	}

	public void setFolioSolicitud(Long folioSolicitud) {
		this.folioSolicitud = folioSolicitud;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
