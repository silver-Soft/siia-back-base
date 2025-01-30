package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAutorizarEstudiantesCarga {
	
	@Id
	@Column(name="IDTUTOR")
	private Long idTutor;
	
	@Column(name="IDALUMNOPERIODO")
	private Long idAlumnoPeriodo;

	@Column(name="IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;

	@Column(name="MATRICULA")
	private String matricula;

	@Column(name="ALUMNO")
	private String nbAlumno;

	@Column(name="DSSTALUMNOPERIODO")
	private String dsEstatusAlumnoPeriodo;
	
	@Column(name="IDCUESTIONARIOPERSONA")
	private Long idCuestionario;
	
	@Column(name="PROGRAMA")
	private String dsProgramaEducativo;

	@Column(name="PERMITEMOSTRARCARGA")
	private Integer permiteMostrarCarga;

	@Column(name="PERMITEENTREVISTA")
	private Integer permiteEntrevista;

	public Long getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Long idTutor) {
		this.idTutor = idTutor;
	}

	public Long getIdAlumnoPeriodo() {
		return idAlumnoPeriodo;
	}

	public void setIdAlumnoPeriodo(Long idAlumnoPeriodo) {
		this.idAlumnoPeriodo = idAlumnoPeriodo;
	}

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNbAlumno() {
		return nbAlumno;
	}

	public void setNbAlumno(String nbAlumno) {
		this.nbAlumno = nbAlumno;
	}

	public String getDsEstatusAlumnoPeriodo() {
		return dsEstatusAlumnoPeriodo;
	}

	public void setDsEstatusAlumnoPeriodo(String dsEstatusAlumnoPeriodo) {
		this.dsEstatusAlumnoPeriodo = dsEstatusAlumnoPeriodo;
	}

	public Integer getPermiteMostrarCarga() {
		return permiteMostrarCarga;
	}

	public void setPermiteMostrarCarga(Integer permiteMostrarCarga) {
		this.permiteMostrarCarga = permiteMostrarCarga;
	}

	public Integer getPermiteEntrevista() {
		return permiteEntrevista;
	}

	public void setPermiteEntrevista(Integer permiteEntrevista) {
		this.permiteEntrevista = permiteEntrevista;
	}

	public Long getIdCuestionario() {
		return idCuestionario;
	}

	public void setIdCuestionario(Long idCuestionario) {
		this.idCuestionario = idCuestionario;
	}

	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}

	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}

}
