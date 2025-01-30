package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosConstanciaC {
	
	@Id
	@Column(name = "IDSOLICITUDBECA")
	private Long idSolicitudBeca;
	
	@Column(name = "SECRETARIO")
	private String nbSecretario;

	@Column(name = "GENEROSECRETARIO")
	private String generoSecretario;

	@Column(name = "FACULTAD")
	private String nbFacultad;

	@Column(name = "NBESTUDIANTE")
	private String nbEstudiante;

	@Column(name = "GENEROESTUDIANTE")
	private String generoEstudiante;

	@Column(name = "SEMESTRE")
	private String semestre;

	@Column(name = "NMPROMEDIO")
	private Double nmPromedio;

	@Column(name = "ATENTAMENTE")
	private String atentamente;
	
	@Column(name = "GENEROPUESTOSECRETARIO")
	private String generoTrataSecretario;
	
	@Column(name = "GENEROTIPOESTUDIANTE")
	private String generoTrataEstudiante;
	
	@Column(name = "GENEROCONSIDERADO")
	private String generoConsiderado;

	public Long getIdSolicitudBeca() {
		return idSolicitudBeca;
	}

	public void setIdSolicitudBeca(Long idSolicitudBeca) {
		this.idSolicitudBeca = idSolicitudBeca;
	}

	public String getNbSecretario() {
		return nbSecretario;
	}

	public void setNbSecretario(String nbSecretario) {
		this.nbSecretario = nbSecretario;
	}

	public String getGeneroSecretario() {
		return generoSecretario;
	}

	public void setGeneroSecretario(String generoSecretario) {
		this.generoSecretario = generoSecretario;
	}

	public String getNbFacultad() {
		return nbFacultad;
	}

	public void setNbFacultad(String nbFacultad) {
		this.nbFacultad = nbFacultad;
	}

	public String getNbEstudiante() {
		return nbEstudiante;
	}

	public void setNbEstudiante(String nbEstudiante) {
		this.nbEstudiante = nbEstudiante;
	}

	public String getGeneroEstudiante() {
		return generoEstudiante;
	}

	public void setGeneroEstudiante(String generoEstudiante) {
		this.generoEstudiante = generoEstudiante;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Double getNmPromedio() {
		return nmPromedio;
	}

	public void setNmPromedio(Double nmPromedio) {
		this.nmPromedio = nmPromedio;
	}

	public String getAtentamente() {
		return atentamente;
	}

	public void setAtentamente(String atentamente) {
		this.atentamente = atentamente;
	}

	public String getGeneroTrataSecretario() {
		return generoTrataSecretario;
	}

	public void setGeneroTrataSecretario(String generoTrataSecretario) {
		this.generoTrataSecretario = generoTrataSecretario;
	}

	public String getGeneroTrataEstudiante() {
		return generoTrataEstudiante;
	}

	public void setGeneroTrataEstudiante(String generoTrataEstudiante) {
		this.generoTrataEstudiante = generoTrataEstudiante;
	}

	public String getGeneroConsiderado() {
		return generoConsiderado;
	}

	public void setGeneroConsiderado(String generoConsiderado) {
		this.generoConsiderado = generoConsiderado;
	}

}
