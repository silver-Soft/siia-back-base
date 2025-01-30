package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhPaObtSolicitudesBecasDict {
	
	@Id
    @Column(name = "IDSOLICITUDBECA")
	private Long idSolicitudBeca;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "NMPROMEDIO")
	private Double nmPromedio;

	@Column(name = "CLPERIODOCURSADO")
	private Integer clPeriodo;

	@Column(name = "DSTIPOSOLICITUDBECA")
	private String dsTipoSolicitudBeca;

	@Column(name = "DSTIPOBECASOL")
	private String dsTipoBecaSol;

	@Column(name = "CLTIPOBECAOTORGADA")
	private Integer clTipoBecaOtorgada;

	@Column(name = "DSTIPOBECAOTO")
	private String dsTipoBecaOto;

	@Column(name = "ESCONSEJERO")
	private String esConsejero;
	
	@Column(name = "ACEPTADA")
	private Integer aceptada;
	
	@Column(name = "CLSTBECA")
	private Integer clEstatusSolicitud;
	
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long idCuestionarioPersona;
	
	@Column(name = "PERMITEACEPTAR")
	private Integer permiteAceptarIndividual;
	
	public Long getIdSolicitudBeca() {
		return idSolicitudBeca;
	}
	public void setIdSolicitudBeca(Long idSolicitudBeca) {
		this.idSolicitudBeca = idSolicitudBeca;
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
	public Double getNmPromedio() {
		return nmPromedio;
	}
	public void setNmPromedio(Double nmPromedio) {
		this.nmPromedio = nmPromedio;
	}
	public Integer getClPeriodo() {
		return clPeriodo;
	}
	public void setClPeriodo(Integer clPeriodo) {
		this.clPeriodo = clPeriodo;
	}
	public String getDsTipoSolicitudBeca() {
		return dsTipoSolicitudBeca;
	}
	public void setDsTipoSolicitudBeca(String dsTipoSolicitudBeca) {
		this.dsTipoSolicitudBeca = dsTipoSolicitudBeca;
	}
	public String getDsTipoBecaSol() {
		return dsTipoBecaSol;
	}
	public void setDsTipoBecaSol(String dsTipoBecaSol) {
		this.dsTipoBecaSol = dsTipoBecaSol;
	}
	public Integer getClTipoBecaOtorgada() {
		return clTipoBecaOtorgada;
	}
	public void setClTipoBecaOtorgada(Integer clTipoBecaOtorgada) {
		this.clTipoBecaOtorgada = clTipoBecaOtorgada;
	}
	public String getDsTipoBecaOto() {
		return dsTipoBecaOto;
	}
	public void setDsTipoBecaOto(String dsTipoBecaOto) {
		this.dsTipoBecaOto = dsTipoBecaOto;
	}
	public String getEsConsejero() {
		return esConsejero;
	}
	public void setEsConsejero(String esConsejero) {
		this.esConsejero = esConsejero;
	}
	public Integer getAceptada() {
		return aceptada;
	}
	public void setAceptada(Integer aceptada) {
		this.aceptada = aceptada;
	}
	public Integer getClEstatusSolicitud() {
		return clEstatusSolicitud;
	}
	public void setClEstatusSolicitud(Integer clEstatusSolicitud) {
		this.clEstatusSolicitud = clEstatusSolicitud;
	}
	public Long getIdCuestionarioPersona() {
		return idCuestionarioPersona;
	}
	public void setIdCuestionarioPersona(Long idCuestionarioPersona) {
		this.idCuestionarioPersona = idCuestionarioPersona;
	}
	public Integer getPermiteAceptarIndividual() {
		return permiteAceptarIndividual;
	}
	public void setPermiteAceptarIndividual(Integer permiteAceptarIndividual) {
		this.permiteAceptarIndividual = permiteAceptarIndividual;
	}

}
