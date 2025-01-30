package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteMovilidadTutorias {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBREALUMNO")
	private String strNbAlumno;

	@Column(name = "DSGENTILICIO")
	private String strDsGentilicio;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbAlumno() {
		return strNbAlumno;
	}

	public void setStrNbAlumno(String strNbAlumno) {
		this.strNbAlumno = strNbAlumno;
	}

	public String getStrDsGentilicio() {
		return strDsGentilicio;
	}

	public void setStrDsGentilicio(String strDsGentilicio) {
		this.strDsGentilicio = strDsGentilicio;
	}

}
