package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtBusValFotoFirma {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NBPERSONA")
	private String nbPersona;
	
	@Column(name = "APPATERNO")
	private String apPaterno;
	
	@Column(name = "APMATERNO")
	private String apMaterno;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "IDFOTOPERSONA")
	private Long idFoto;
	
	@Column(name = "STFOTOPERSONA")
	private String estatusFoto;
	
	@Column(name = "IDFIRMAPERSONA")
	private Long idFirma;
	
	@Column(name = "STFIRMAPERSONA")
	private String estatusFirma;

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

	public String getNbPersona() {
		return nbPersona;
	}

	public void setNbPersona(String nbPersona) {
		this.nbPersona = nbPersona;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public Long getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(Long idFoto) {
		this.idFoto = idFoto;
	}

	public String getEstatusFoto() {
		return estatusFoto;
	}

	public void setEstatusFoto(String estatusFoto) {
		this.estatusFoto = estatusFoto;
	}

	public Long getIdFirma() {
		return idFirma;
	}

	public void setIdFirma(Long idFirma) {
		this.idFirma = idFirma;
	}

	public String getEstatusFirma() {
		return estatusFirma;
	}

	public void setEstatusFirma(String estatusFirma) {
		this.estatusFirma = estatusFirma;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

}
