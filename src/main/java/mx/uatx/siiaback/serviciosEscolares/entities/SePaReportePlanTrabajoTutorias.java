package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReportePlanTrabajoTutorias {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOMBRETUTOR")
	private String strNombreTutor;
	
	@Column(name="LOGIN")
	private String strLogin;
	
	@Column(name="NOMBREALUMNO")
	private String strNombreAlumno;
	
	@Column(name="DSDIAGNOSTICOINICIAL")
	private String strDiagnostico;
	
	
	@Column(name="IDDTTAREAPLANTRABAJO")
	private String strTareaPlan;
	
	@Column(name="DSTAREAPLAN")
	private String areaPlan;
	
	@Column(name="DSESTATUSTAREATUTORIA")
	private String dsEstatusAreaTutoria;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStrNombreTutor() {
		return strNombreTutor;
	}

	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNombreAlumno() {
		return strNombreAlumno;
	}

	public void setStrNombreAlumno(String strNombreAlumno) {
		this.strNombreAlumno = strNombreAlumno;
	}

	public String getStrDiagnostico() {
		return strDiagnostico;
	}

	public void setStrDiagnostico(String strDiagnostico) {
		this.strDiagnostico = strDiagnostico;
	}

	public String getStrTareaPlan() {
		return strTareaPlan;
	}

	public void setStrTareaPlan(String strTareaPlan) {
		this.strTareaPlan = strTareaPlan;
	}

	public String getAreaPlan() {
		return areaPlan;
	}

	public void setAreaPlan(String areaPlan) {
		this.areaPlan = areaPlan;
	}

	public String getDsEstatusAreaTutoria() {
		return dsEstatusAreaTutoria;
	}

	public void setDsEstatusAreaTutoria(String dsEstatusAreaTutoria) {
		this.dsEstatusAreaTutoria = dsEstatusAreaTutoria;
	}
	

	
	

}
