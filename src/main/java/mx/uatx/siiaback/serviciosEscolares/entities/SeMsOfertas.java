/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEMSOFERTAS")
public class SeMsOfertas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6264941179301386063L;

	private static final String GENID_OFERTA = "GENIDOFERTA";

	@Id
	@Basic(optional = false)
	@Column(name = "IDOFERTA")
	@SequenceGenerator(name = GENID_OFERTA, sequenceName = "SERESC.IDOFERTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_OFERTA)
	private Long lngIdOferta;

	@Column(name = "CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "CLTURNOS")
	private String strClTurno;

	@Column(name = "CLESTATUSOFERTA")
	private String intIdEstatus;

	@Column(name = "IDMATERIAREAL")
	private Integer intIdMateria;

	@Column(name = "IDGRUPOPROGRAMA")
	private Integer intIdGrupoPrograma;

	@Column(name = "NMMINIMOALUMNOS")
	private Integer intNumMinimoAlumnos;

	@Column(name = "NMMAXIMOALUMNOS")
	private Integer intNumMaximoAlumnos;

	@Column(name = "NMHORAS")
	private Integer intNumHoras;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "NMCUPOFORANEOS")
	private Integer intCupoForaneos;
	
	@Column(name = "IDMODALIDADOFERTA")
	private Integer intIdModalidadOferta;

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrClTurno() {
		return strClTurno;
	}

	public void setStrClTurno(String strClTurno) {
		this.strClTurno = strClTurno;
	}

	public String getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(String intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public Integer getIntIdMateria() {
		return intIdMateria;
	}

	public void setIntIdMateria(Integer intIdMateria) {
		this.intIdMateria = intIdMateria;
	}

	public Integer getIntIdGrupoPrograma() {
		return intIdGrupoPrograma;
	}

	public void setIntIdGrupoPrograma(Integer intIdGrupoPrograma) {
		this.intIdGrupoPrograma = intIdGrupoPrograma;
	}

	public Integer getIntNumMinimoAlumnos() {
		return intNumMinimoAlumnos;
	}

	public void setIntNumMinimoAlumnos(Integer intNumMinimoAlumnos) {
		this.intNumMinimoAlumnos = intNumMinimoAlumnos;
	}

	public Integer getIntNumMaximoAlumnos() {
		return intNumMaximoAlumnos;
	}

	public void setIntNumMaximoAlumnos(Integer intNumMaximoAlumnos) {
		this.intNumMaximoAlumnos = intNumMaximoAlumnos;
	}

	public Integer getIntNumHoras() {
		return intNumHoras;
	}

	public void setIntNumHoras(Integer intNumHoras) {
		this.intNumHoras = intNumHoras;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Integer getIntCupoForaneos() {
		return intCupoForaneos;
	}

	public void setIntCupoForaneos(Integer intCupoForaneos) {
		this.intCupoForaneos = intCupoForaneos;
	}

	public Integer getIntIdModalidadOferta() {
		return intIdModalidadOferta;
	}

	public void setIntIdModalidadOferta(Integer intIdModalidadOferta) {
		this.intIdModalidadOferta = intIdModalidadOferta;
	}


	
	

}
