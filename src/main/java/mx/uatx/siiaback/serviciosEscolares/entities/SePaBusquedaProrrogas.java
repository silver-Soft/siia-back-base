package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBusquedaProrrogas implements Serializable {
	@Id
	@Column(name = "IDPRORROGAINS")
	private Long idProrrogaIns;
	
	@Column(name = "IDPERIODO")
	private String idPeriodo;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFINAL")
	private Date fcFin;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "PROGRAMCAMPUS")
	private String dsProgramaCampus;
	
	@Column(name = "AREACAMPUS")
	private String dsAreaCampus;
	
	@Column(name = "PERMITEMODIFICAR")
	private Integer permiteModificar;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodo;
	
	public SePaBusquedaProrrogas() {
		super();
	}

	public Long getIdProrrogaIns() {
		return idProrrogaIns;
	}

	public void setIdProrrogaIns(Long idProrrogaIns) {
		this.idProrrogaIns = idProrrogaIns;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}

	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}

	public String getDsProgramaCampus() {
		return dsProgramaCampus;
	}

	public void setDsProgramaCampus(String dsProgramaCampus) {
		this.dsProgramaCampus = dsProgramaCampus;
	}

	public String getDsAreaCampus() {
		return dsAreaCampus;
	}

	public void setDsAreaCampus(String dsAreaCampus) {
		this.dsAreaCampus = dsAreaCampus;
	}

	public Integer getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Integer permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}
	
	

}
