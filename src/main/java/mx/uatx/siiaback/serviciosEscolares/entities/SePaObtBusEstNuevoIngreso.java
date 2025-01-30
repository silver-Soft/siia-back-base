package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtBusEstNuevoIngreso {
	
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
	
	@Column(name = "TIENEFORMATOINS")
	private Integer tieneFormatoIns;
	
	@Column(name = "IDDOCPERSONAFORMATOINS")
	private Long idDocPersonaFormatoIns;
	
	@Column(name = "TIENEACTA")
	private Integer tieneActa;
	
	@Column(name = "IDDOCPERSONAACTA")
	private Long idDocPersonaActa;
	
	@Column(name = "TIENECERTIFICADO")
	private Integer tieneCertificado;
	
	@Column(name = "IDDOCPERSONACERTIFICADO")
	private Long idDocPersonaCertificado;
	
	@Column(name = "TIENEMEDICO")
	private Integer tieneMedico;
	
	@Column(name = "IDDOCPERSONAMEDICO")
	private Long idDocPersonaMedico;
	
	@Column(name = "TIENEBUCAL")
	private Integer tieneBucal;
	
	@Column(name = "IDDOCPERSONABUCAL")
	private Long idDocPersonaBucal;
	
	@Column(name = "TIENECURP")
	private Integer tieneCurp;
	
	@Column(name = "IDDOCPERSONACURP")
	private Long idDocPersonaCurp;
	
	@Column(name = "TIENEESTANCIA")
	private Integer tieneEstancia;
	
	@Column(name = "IDDOCPERSONAESTANCIA")
	private Long idDocPersonaEstancia;
	
	@Column(name = "TIENECEDULAPOSGRADO")
	private Integer tieneCedulaPosgrado;
	
	@Column(name = "IDDOCPERSONACEDULAPOS")
	private Long idDocPersonaCedulaPos;
	
	@Column(name = "TIENETITULOPOSGRADO")
	private Integer tieneTituloPosgrado;
	
	@Column(name = "IDDOCPERSONATITULOPOS")
	private Long idDocPersonaTituloPos;
	
	@Column(name = "TIENEOTROPOSGRADO")
	private Integer tieneOtroPosgrado;
	
	@Column(name = "IDDOCPERSONAOTROPOS")
	private Long idDocPersonaOtroPos;
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer clNivelEducativo;

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

	public Integer getTieneFormatoIns() {
		return tieneFormatoIns;
	}

	public void setTieneFormatoIns(Integer tieneFormatoIns) {
		this.tieneFormatoIns = tieneFormatoIns;
	}

	public Long getIdDocPersonaFormatoIns() {
		return idDocPersonaFormatoIns;
	}

	public void setIdDocPersonaFormatoIns(Long idDocPersonaFormatoIns) {
		this.idDocPersonaFormatoIns = idDocPersonaFormatoIns;
	}

	public Integer getTieneActa() {
		return tieneActa;
	}

	public void setTieneActa(Integer tieneActa) {
		this.tieneActa = tieneActa;
	}

	public Long getIdDocPersonaActa() {
		return idDocPersonaActa;
	}

	public void setIdDocPersonaActa(Long idDocPersonaActa) {
		this.idDocPersonaActa = idDocPersonaActa;
	}

	public Integer getTieneCertificado() {
		return tieneCertificado;
	}

	public void setTieneCertificado(Integer tieneCertificado) {
		this.tieneCertificado = tieneCertificado;
	}

	public Long getIdDocPersonaCertificado() {
		return idDocPersonaCertificado;
	}

	public void setIdDocPersonaCertificado(Long idDocPersonaCertificado) {
		this.idDocPersonaCertificado = idDocPersonaCertificado;
	}

	public Integer getTieneMedico() {
		return tieneMedico;
	}

	public void setTieneMedico(Integer tieneMedico) {
		this.tieneMedico = tieneMedico;
	}

	public Long getIdDocPersonaMedico() {
		return idDocPersonaMedico;
	}

	public void setIdDocPersonaMedico(Long idDocPersonaMedico) {
		this.idDocPersonaMedico = idDocPersonaMedico;
	}

	public Integer getTieneBucal() {
		return tieneBucal;
	}

	public void setTieneBucal(Integer tieneBucal) {
		this.tieneBucal = tieneBucal;
	}

	public Long getIdDocPersonaBucal() {
		return idDocPersonaBucal;
	}

	public void setIdDocPersonaBucal(Long idDocPersonaBucal) {
		this.idDocPersonaBucal = idDocPersonaBucal;
	}

	public Integer getTieneCurp() {
		return tieneCurp;
	}

	public void setTieneCurp(Integer tieneCurp) {
		this.tieneCurp = tieneCurp;
	}

	public Long getIdDocPersonaCurp() {
		return idDocPersonaCurp;
	}

	public void setIdDocPersonaCurp(Long idDocPersonaCurp) {
		this.idDocPersonaCurp = idDocPersonaCurp;
	}

	public Integer getTieneEstancia() {
		return tieneEstancia;
	}

	public void setTieneEstancia(Integer tieneEstancia) {
		this.tieneEstancia = tieneEstancia;
	}

	public Long getIdDocPersonaEstancia() {
		return idDocPersonaEstancia;
	}

	public void setIdDocPersonaEstancia(Long idDocPersonaEstancia) {
		this.idDocPersonaEstancia = idDocPersonaEstancia;
	}

	public Integer getTieneCedulaPosgrado() {
		return tieneCedulaPosgrado;
	}

	public void setTieneCedulaPosgrado(Integer tieneCedulaPosgrado) {
		this.tieneCedulaPosgrado = tieneCedulaPosgrado;
	}

	public Long getIdDocPersonaCedulaPos() {
		return idDocPersonaCedulaPos;
	}

	public void setIdDocPersonaCedulaPos(Long idDocPersonaCedulaPos) {
		this.idDocPersonaCedulaPos = idDocPersonaCedulaPos;
	}

	public Integer getTieneTituloPosgrado() {
		return tieneTituloPosgrado;
	}

	public void setTieneTituloPosgrado(Integer tieneTituloPosgrado) {
		this.tieneTituloPosgrado = tieneTituloPosgrado;
	}

	public Long getIdDocPersonaTituloPos() {
		return idDocPersonaTituloPos;
	}

	public void setIdDocPersonaTituloPos(Long idDocPersonaTituloPos) {
		this.idDocPersonaTituloPos = idDocPersonaTituloPos;
	}

	public Integer getTieneOtroPosgrado() {
		return tieneOtroPosgrado;
	}

	public void setTieneOtroPosgrado(Integer tieneOtroPosgrado) {
		this.tieneOtroPosgrado = tieneOtroPosgrado;
	}

	public Long getIdDocPersonaOtroPos() {
		return idDocPersonaOtroPos;
	}

	public void setIdDocPersonaOtroPos(Long idDocPersonaOtroPos) {
		this.idDocPersonaOtroPos = idDocPersonaOtroPos;
	}

	public Integer getClNivelEducativo() {
		return clNivelEducativo;
	}

	public void setClNivelEducativo(Integer clNivelEducativo) {
		this.clNivelEducativo = clNivelEducativo;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
}
