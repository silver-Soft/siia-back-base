package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAcreditacionesPrograma {
	
	@Id
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

	@Column(name = "CLTIPORECONOCIMIENTO")
	private Long lngClTipoReconocimiento;
	
	@Column(name = "NMINSTITUCION")	
	private String strNmInstitucion;

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

	public Long getLngClTipoReconocimiento() {
		return lngClTipoReconocimiento;
	}

	public void setLngClTipoReconocimiento(Long lngClTipoReconocimiento) {
		this.lngClTipoReconocimiento = lngClTipoReconocimiento;
	}

	public String getStrNmInstitucion() {
		return strNmInstitucion;
	}

	public void setStrNmInstitucion(String strNmInstitucion) {
		this.strNmInstitucion = strNmInstitucion;
	}
	
	
}
