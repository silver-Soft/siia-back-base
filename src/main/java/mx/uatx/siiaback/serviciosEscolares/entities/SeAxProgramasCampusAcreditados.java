package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(schema = "SERESC", name = "SEAXPROGRAMASCAMPUSACREDITADOS")
public class SeAxProgramasCampusAcreditados {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPROGRAMACAMPUSACREDITADO", sequenceName = "SERESC.IDPROGRAMACAMPUSACREDITADO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPROGRAMACAMPUSACREDITADO")
	@NotNull
	@Column(name = "IDPROGRAMACAMPUSACREDITADO")
	private Long lngIdProgramaCampusAcreditado;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long lngIdProgramaCampus;

	@Column(name = "CLESTATUSACREDITADO")
	private Integer intClEstatusAcreditado;

	@Column(name = "IDINSTITUCION")
	private Long lngIdInstitucion;

	@Column(name = "FCACREDITACION")
	private Date dteFcAcreditacion;

	@Column(name = "FCINICIO")
	private Date dteFcInicio;

	@Column(name = "FCFIN")
	private Date dteFcFin;

	@Column(name = "DSOBSERVACIONES")
	private String strDsObservaciones;

	@Column(name = "FCAUDIT")
	private Date dteFcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "CLTIPORECONOCIMIENTO")
	private Long lngClTipoReconocimiento;
	
	
	public Long getLngIdProgramaCampusAcreditado() {
		return lngIdProgramaCampusAcreditado;
	}
	public void setLngIdProgramaCampusAcreditado(Long lngIdProgramaCampusAcreditado) {
		this.lngIdProgramaCampusAcreditado = lngIdProgramaCampusAcreditado;
	}
	public Long getLngIdProgramaCampus() {
		return lngIdProgramaCampus;
	}
	public void setLngIdProgramaCampus(Long lngIdProgramaCampus) {
		this.lngIdProgramaCampus = lngIdProgramaCampus;
	}
	public Integer getIntClEstatusAcreditado() {
		return intClEstatusAcreditado;
	}
	public void setIntClEstatusAcreditado(Integer intClEstatusAcreditado) {
		this.intClEstatusAcreditado = intClEstatusAcreditado;
	}
	public Long getLngIdInstitucion() {
		return lngIdInstitucion;
	}
	public void setLngIdInstitucion(Long lngIdInstitucion) {
		this.lngIdInstitucion = lngIdInstitucion;
	}
	public Date getDteFcAcreditacion() {
		return dteFcAcreditacion;
	}
	public void setDteFcAcreditacion(Date dteFcAcreditacion) {
		this.dteFcAcreditacion = dteFcAcreditacion;
	}
	public Date getDteFcInicio() {
		return dteFcInicio;
	}
	public void setDteFcInicio(Date dteFcInicio) {
		this.dteFcInicio = dteFcInicio;
	}
	public Date getDteFcFin() {
		return dteFcFin;
	}
	public void setDteFcFin(Date dteFcFin) {
		this.dteFcFin = dteFcFin;
	}
	public String getStrDsObservaciones() {
		return strDsObservaciones;
	}
	public void setStrDsObservaciones(String strDsObservaciones) {
		this.strDsObservaciones = strDsObservaciones;
	}
	public Date getDteFcAudit() {
		return dteFcAudit;
	}
	public void setDteFcAudit(Date dteFcAudit) {
		this.dteFcAudit = dteFcAudit;
	}
	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}
	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
	public Long getLngClTipoReconocimiento() {
		return lngClTipoReconocimiento;
	}
	public void setLngClTipoReconocimiento(Long lngClTipoReconocimiento) {
		this.lngClTipoReconocimiento = lngClTipoReconocimiento;
	}
	
	

}
