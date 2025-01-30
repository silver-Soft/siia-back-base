package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosRepEvalSerSoc {
	
	@Id
	@Column(name = "ID_SEAXSOLICITUDESSERSOC")
	private Long idSolicitudSerSoc;
	
	@Column(name = "NBESTUDIANTE")
	private String nbEstudiante;

	@Column(name = "PROGRAMA")
	private String programa;

	@Column(name = "AREA")
	private String area;

	@Column(name = "GRUPOTURNO")
	private String grupoTurno;

	@Column(name = "FCINICIO")
	private String fcInicio;

	@Column(name = "FCFIN")
	private String fcFin;

	@Column(name = "NBDEPENDENCIA")
	private String nombreDependencia;

	@Column(name = "NBJEFE")
	private String nbJefe;
	
	public Long getIdSolicitudSerSoc() {
		return idSolicitudSerSoc;
	}
	public void setIdSolicitudSerSoc(Long idSolicitudSerSoc) {
		this.idSolicitudSerSoc = idSolicitudSerSoc;
	}
	public String getNbEstudiante() {
		return nbEstudiante;
	}
	public void setNbEstudiante(String nbEstudiante) {
		this.nbEstudiante = nbEstudiante;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGrupoTurno() {
		return grupoTurno;
	}
	public void setGrupoTurno(String grupoTurno) {
		this.grupoTurno = grupoTurno;
	}
	public String getFcInicio() {
		return fcInicio;
	}
	public void setFcInicio(String fcInicio) {
		this.fcInicio = fcInicio;
	}
	public String getFcFin() {
		return fcFin;
	}
	public void setFcFin(String fcFin) {
		this.fcFin = fcFin;
	}
	public String getNombreDependencia() {
		return nombreDependencia;
	}
	public void setNombreDependencia(String nombreDependencia) {
		this.nombreDependencia = nombreDependencia;
	}
	public String getNbJefe() {
		return nbJefe;
	}
	public void setNbJefe(String nbJefe) {
		this.nbJefe = nbJefe;
	}
	

}
