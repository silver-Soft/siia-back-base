package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEMSALUMNOS93")
public class SeMsAlumnos93 {
	
	private Long idalumno;
	private String NMatri;
	private Date fecmov;
	private Integer noCalif;
	private Integer cons;
	private Integer numcred;
	private Long folcen;
	private Byte grado;
	private String activo;
	private Date fecha;
	private Integer folio;
	private Short AEgreso;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	private Byte sermed;
	private String carrera;
	private Double promedio;
	private Integer perfil;
	private Integer prepa;
	private Integer plantel;
	private Short edoori;
	private Short munori;
	private Short edorad;
	private Short munrad;
	private String ECalle;
	private String ENext;
	private String ENint;
	private String EColonia;
	private String ECiudad;
	private Integer ECodpos;
	private String ETelefono;
	private String PCalle;
	private String PNext;
	private String PNint;
	private String PColonia;
	private String PCiudad;
	private Short PEstado;
	private Integer PCodpos;
	private String PTelefono;
	private String aceptado;
	private String liga;
	private String usuario;
	private Long tiempo;
	private Integer periodo;
	private String matricula;
	private String sexo;
	private String edociv;
	private Short edad;
	private String conpersona;
	private Date FNac;
	private Integer nmFolioDocumento;
	
	
	@Id
	@Column(name = "IDALUMNO")
	public Long getIdalumno() {
		return this.idalumno;
	}

	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}

	@Column(name = "N_MATRI", length = 30)
	public String getNMatri() {
		return this.NMatri;
	}

	public void setNMatri(String NMatri) {
		this.NMatri = NMatri;
	}

	@Column(name = "FECMOV", length = 7)
	public Date getFecmov() {
		return this.fecmov;
	}

	public void setFecmov(Date fecmov) {
		this.fecmov = fecmov;
	}

	@Column(name = "NO_CALIF", precision = 9, scale = 0)
	public Integer getNoCalif() {
		return this.noCalif;
	}

	public void setNoCalif(Integer noCalif) {
		this.noCalif = noCalif;
	}

	@Column(name = "CONS", precision = 9, scale = 0)
	public Integer getCons() {
		return this.cons;
	}

	public void setCons(Integer cons) {
		this.cons = cons;
	}

	@Column(name = "NUMCRED", precision = 9, scale = 0)
	public Integer getNumcred() {
		return this.numcred;
	}

	public void setNumcred(Integer numcred) {
		this.numcred = numcred;
	}

	@Column(name = "FOLCEN", precision = 10, scale = 0)
	public Long getFolcen() {
		return this.folcen;
	}

	public void setFolcen(Long folcen) {
		this.folcen = folcen;
	}

	@Column(name = "GRADO", precision = 2, scale = 0)
	public Byte getGrado() {
		return this.grado;
	}

	public void setGrado(Byte grado) {
		this.grado = grado;
	}

	@Column(name = "ACTIVO", length = 10)
	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	@Column(name = "FECHA", length = 7)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "FOLIO", precision = 9, scale = 0)
	public Integer getFolio() {
		return this.folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	@Column(name = "A_EGRESO", precision = 4, scale = 0)
	public Short getAEgreso() {
		return this.AEgreso;
	}

	public void setAEgreso(Short AEgreso) {
		this.AEgreso = AEgreso;
	}

	@Column(name = "AP_PATERNO", length = 50)
	public String getApPaterno() {
		return this.apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	@Column(name = "AP_MATERNO", length = 50)
	public String getApMaterno() {
		return this.apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	@Column(name = "NOMBRE", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "SERMED", precision = 2, scale = 0)
	public Byte getSermed() {
		return this.sermed;
	}

	public void setSermed(Byte sermed) {
		this.sermed = sermed;
	}

	@Column(name = "CARRERA", length = 10)
	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Column(name = "PROMEDIO", precision = 5)
	public Double getPromedio() {
		return this.promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	@Column(name = "PERFIL", precision = 5, scale = 0)
	public Integer getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	@Column(name = "PREPA", precision = 6, scale = 0)
	public Integer getPrepa() {
		return this.prepa;
	}

	public void setPrepa(Integer prepa) {
		this.prepa = prepa;
	}

	@Column(name = "PLANTEL", precision = 5, scale = 0)
	public Integer getPlantel() {
		return this.plantel;
	}

	public void setPlantel(Integer plantel) {
		this.plantel = plantel;
	}

	@Column(name = "EDOORI", precision = 3, scale = 0)
	public Short getEdoori() {
		return this.edoori;
	}

	public void setEdoori(Short edoori) {
		this.edoori = edoori;
	}

	@Column(name = "MUNORI", precision = 3, scale = 0)
	public Short getMunori() {
		return this.munori;
	}

	public void setMunori(Short munori) {
		this.munori = munori;
	}

	@Column(name = "EDORAD", precision = 3, scale = 0)
	public Short getEdorad() {
		return this.edorad;
	}

	public void setEdorad(Short edorad) {
		this.edorad = edorad;
	}

	@Column(name = "MUNRAD", precision = 3, scale = 0)
	public Short getMunrad() {
		return this.munrad;
	}

	public void setMunrad(Short munrad) {
		this.munrad = munrad;
	}

	@Column(name = "E_CALLE", length = 80)
	public String getECalle() {
		return this.ECalle;
	}

	public void setECalle(String ECalle) {
		this.ECalle = ECalle;
	}

	@Column(name = "E_NEXT", length = 10)
	public String getENext() {
		return this.ENext;
	}

	public void setENext(String ENext) {
		this.ENext = ENext;
	}

	@Column(name = "E_NINT", length = 10)
	public String getENint() {
		return this.ENint;
	}

	public void setENint(String ENint) {
		this.ENint = ENint;
	}

	@Column(name = "E_COLONIA", length = 50)
	public String getEColonia() {
		return this.EColonia;
	}

	public void setEColonia(String EColonia) {
		this.EColonia = EColonia;
	}

	@Column(name = "E_CIUDAD", length = 60)
	public String getECiudad() {
		return this.ECiudad;
	}

	public void setECiudad(String ECiudad) {
		this.ECiudad = ECiudad;
	}

	@Column(name = "E_CODPOS", precision = 6, scale = 0)
	public Integer getECodpos() {
		return this.ECodpos;
	}

	public void setECodpos(Integer ECodpos) {
		this.ECodpos = ECodpos;
	}

	@Column(name = "E_TELEFONO", length = 20)
	public String getETelefono() {
		return this.ETelefono;
	}

	public void setETelefono(String ETelefono) {
		this.ETelefono = ETelefono;
	}

	@Column(name = "P_CALLE", length = 60)
	public String getPCalle() {
		return this.PCalle;
	}

	public void setPCalle(String PCalle) {
		this.PCalle = PCalle;
	}

	@Column(name = "P_NEXT", length = 10)
	public String getPNext() {
		return this.PNext;
	}

	public void setPNext(String PNext) {
		this.PNext = PNext;
	}

	@Column(name = "P_NINT", length = 10)
	public String getPNint() {
		return this.PNint;
	}

	public void setPNint(String PNint) {
		this.PNint = PNint;
	}

	@Column(name = "P_COLONIA", length = 50)
	public String getPColonia() {
		return this.PColonia;
	}

	public void setPColonia(String PColonia) {
		this.PColonia = PColonia;
	}

	@Column(name = "P_CIUDAD", length = 60)
	public String getPCiudad() {
		return this.PCiudad;
	}

	public void setPCiudad(String PCiudad) {
		this.PCiudad = PCiudad;
	}

	@Column(name = "P_ESTADO", precision = 3, scale = 0)
	public Short getPEstado() {
		return this.PEstado;
	}

	public void setPEstado(Short PEstado) {
		this.PEstado = PEstado;
	}

	@Column(name = "P_CODPOS", precision = 6, scale = 0)
	public Integer getPCodpos() {
		return this.PCodpos;
	}

	public void setPCodpos(Integer PCodpos) {
		this.PCodpos = PCodpos;
	}

	@Column(name = "P_TELEFONO", length = 20)
	public String getPTelefono() {
		return this.PTelefono;
	}

	public void setPTelefono(String PTelefono) {
		this.PTelefono = PTelefono;
	}

	@Column(name = "ACEPTADO", length = 30)
	public String getAceptado() {
		return this.aceptado;
	}

	public void setAceptado(String aceptado) {
		this.aceptado = aceptado;
	}

	@Column(name = "LIGA", length = 30)
	public String getLiga() {
		return this.liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	@Column(name = "USUARIO", length = 20)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "TIEMPO", precision = 15, scale = 0)
	public Long getTiempo() {
		return this.tiempo;
	}

	public void setTiempo(Long tiempo) {
		this.tiempo = tiempo;
	}

	@Column(name = "PERIODO", precision = 5, scale = 0)
	public Integer getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	@Column(name = "MATRICULA", length = 30)
	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Column(name = "SEXO", length = 5)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "EDOCIV", length = 5)
	public String getEdociv() {
		return this.edociv;
	}

	public void setEdociv(String edociv) {
		this.edociv = edociv;
	}

	@Column(name = "EDAD", precision = 3, scale = 0)
	public Short getEdad() {
		return this.edad;
	}

	public void setEdad(Short edad) {
		this.edad = edad;
	}

	@Column(name = "CONPERSONA", length = 60)
	public String getConpersona() {
		return this.conpersona;
	}

	public void setConpersona(String conpersona) {
		this.conpersona = conpersona;
	}

	@Column(name = "F_NAC", length = 7)
	public Date getFNac() {
		return this.FNac;
	}

	public void setFNac(Date FNac) {
		this.FNac = FNac;
	}

	@Column(name = "NMFOLIODOCUMENTO")
	public Integer getNmFolioDocumento() {
		return nmFolioDocumento;
	}

	public void setNmFolioDocumento(Integer nmFolioDocumento) {
		this.nmFolioDocumento = nmFolioDocumento;
	}
	
}
