package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SIIUAT", name = "SIMSPERIODOS")
public class SiMsPeriodos {

	@Id
	@Column(name = "IDPERIODO")
	private String intIdPeriodo;
	
	@Column(name = "DSPERIODOMES")
	private String strDescripcionMes;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDescripcion;
	
	@Column(name = "DSPERIODOSEP")
	private String strDescripcionSep;

	@Column(name = "FCINICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicio;

	@Column(name = "FCFINAL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcFinal;
	
	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcaudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioaudit;
	
	@Column(name = "CLESTATUSPERIODO")
	private Integer clestatusperiodo;
	
	@Column(name = "CLTIPOPERIODO")
	private String cltipoperiodo;
	
	@Column(name = "NMORDEN")
	private Integer nmorden;
	
	@Column(name = "CLTIPOCICLO")
	private Integer clTipoCiclo;
	
	

	public SiMsPeriodos() {

	}

	public String getIntIdPeriodo() {
		return intIdPeriodo;
	}

	public void setIntIdPeriodo(String intIdPeriodo) {
		this.intIdPeriodo = intIdPeriodo;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFinal() {
		return fcFinal;
	}

	public void setFcFinal(Date fcFinal) {
		this.fcFinal = fcFinal;
	}

	public Date getFcaudit() {
		return fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	public String getUsuarioaudit() {
		return usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}

	public Integer getClestatusperiodo() {
		return clestatusperiodo;
	}

	public void setClestatusperiodo(Integer clestatusperiodo) {
		this.clestatusperiodo = clestatusperiodo;
	}

	public Integer getNmorden() {
		return nmorden;
	}

	public void setNmorden(Integer nmorden) {
		this.nmorden = nmorden;
	}

	public String getCltipoperiodo() {
		return cltipoperiodo;
	}

	public void setCltipoperiodo(String cltipoperiodo) {
		this.cltipoperiodo = cltipoperiodo;
	}

	public String getStrDescripcionMes() {
		return strDescripcionMes;
	}

	public void setStrDescripcionMes(String strDescripcionMes) {
		this.strDescripcionMes = strDescripcionMes;
	}

	public String getStrDescripcionSep() {
		return strDescripcionSep;
	}

	public void setStrDescripcionSep(String strDescripcionSep) {
		this.strDescripcionSep = strDescripcionSep;
	}

	public Integer getClTipoCiclo() {
		return clTipoCiclo;
	}

	public void setClTipoCiclo(Integer clTipoCiclo) {
		this.clTipoCiclo = clTipoCiclo;
	}

}
