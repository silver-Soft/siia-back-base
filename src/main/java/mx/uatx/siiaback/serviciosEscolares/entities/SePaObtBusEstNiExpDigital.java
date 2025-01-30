package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtBusEstNiExpDigital {
	
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
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer clNivelEducativo;
	
	@Column(name = "PERMITEVISUALIZARACTA")
	private Integer permiteVerActa;
	
	@Column(name = "PERMITEVALIDARACTA")
	private Integer permiteValidarActa;
	
	@Column(name = "PERMITEDESVALIDARACTA")
	private Integer permiteDesvalidarActa;
	
	@Column(name = "IDDOCPERSONAACTA")
	private Long idDocPersonaActa;
	
	@Column(name = "PERMITEVISUALIZARCERTIFICADO")
	private Integer permiteVerCertificado;
	
	@Column(name = "PERMITEVALIDARCERTIFICADO")
	private Integer permiteValidarCertificado;
	
	@Column(name = "PERMITEDESVALIDARCERTIFICADO")
	private Integer permiteDesvalidarCertificado;
	
	@Column(name = "IDDOCPERSONACERTIFICADO")
	private Long idDocPersonaCertificado;
	
	@Column(name = "PERMITEVISUALIZARMEDICO")
	private Integer permiteVerMedico;
	
	@Column(name = "PERMITEVALIDARMEDICO")
	private Integer permiteValidarMedico;
	
	@Column(name = "PERMITEDESVALIDARMEDICO")
	private Integer permiteDevalidarMedico;
	
	@Column(name = "IDDOCPERSONAMEDICO")
	private Long idDocPersonaMedico;
	
	@Column(name = "PERMITEVISUALIZARBUCAL")
	private Integer permiteVerBucal;
	
	@Column(name = "PERMITEVALIDARBUCAL")
	private Integer permiteValidarBucal;
	
	@Column(name = "PERMITEDESVALIDARBUCAL")
	private Integer permiteDesvalidarBucal;
	
	@Column(name = "IDDOCPERSONABUCAL")
	private Long idDocPersonaBucal;
	
	@Column(name = "PERMITEVISUALIZARCURP")
	private Integer permiteVerCurp;
	
	@Column(name = "PERMITEVALIDARCURP")
	private Integer permiteValidarCurp;
	
	@Column(name = "PERMITEDESVALIDARCURP")
	private Integer permiteDesvalidarCurp;
	
	@Column(name = "IDDOCPERSONACURP")
	private Long idDocPersonaCurp;
	
	@Column(name = "PERMITEVISUALIZARESTANCIA")
	private Integer permiteVerEstancia;
	
	@Column(name = "PERMITEVALIDARESTANCIA")
	private Integer permiteValidarEstancia;
	
	@Column(name = "PERMITEDESVALIDARESTANCIA")
	private Integer permiteDesvalidarEstancia;
	
	@Column(name = "IDDOCPERSONAESTANCIA")
	private Long idDocPersonaEstancia;
	
	@Column(name = "PERMITEVISUALIZARCEDULA")
	private Integer permiteVerCedula;
	
	@Column(name = "PERMITEVALIDARCEDULA")
	private Integer permiteValidarCedula;
	
	@Column(name = "PERMITEDESVALIDARCEDULA")
	private Integer permiteDesvalidarCedula;
	
	@Column(name = "IDDOCPERSONACEDULA")
	private Long idDocPersonaCedula;
	
	@Column(name = "PERMITEVISUALIZARCEDULAMAE")
	private Integer permiteVerCedulaMae;
	
	@Column(name = "PERMITEVALIDARCEDULAMAE")
	private Integer permiteValidarCedulaMae;
	
	@Column(name = "PERMITEDESVALIDARCEDULAMAE")
	private Integer permiteDesvalidarCedulaMae;
	
	@Column(name = "IDDOCPERSONACEDULAMAE")
	private Long idDocPersonaCedulaMae;
	
	@Column(name = "PERMITEVISUALIZARTITULO")
	private Integer permiteVerTitulo;
	
	@Column(name = "PERMITEVALIDARTITULO")
	private Integer permiteValidarTitulo;
	
	@Column(name = "PERMITEDESVALIDARTITULO")
	private Integer permiteDesvalidarTitulo;
	
	@Column(name = "IDDOCPERSONATITULO")
	private Long idDocPersonaTitulo;
	
	@Column(name = "PERMITEVISUALIZARTITULOMAE")
	private Integer permiteVerTituloMae;
	
	@Column(name = "PERMITEVALIDARTITULOMAE")
	private Integer permiteValidarTituloMae;
	
	@Column(name = "PERMITEDESVALIDARTITULOMAE")
	private Integer permiteDesvalidarTituloMae;
	
	@Column(name = "IDDOCPERSONATITULOMAE")
	private Long idDocPersonaTituloMae;
	
	@Column(name = "PERMITEVISUALIZAROTRO")
	private Integer permiteVerOtro;
	
	@Column(name = "PERMITEVALIDAROTRO")
	private Integer permiteValidarOtro;
	
	@Column(name = "PERMITEDESVALIDAROTRO")
	private Integer permiteDesvalidarOtro;
	
	@Column(name = "IDDOCPERSONAOTRO")
	private Long idDocPersonaOtro;
	
	@Column(name = "PERMITEVISUALIZAROTRO2")
	private Integer permiteVerOtro2;
	
	@Column(name = "PERMITEVALIDAROTRO2")
	private Integer permiteValidarOtro2;
	
	@Column(name = "PERMITEDESVALIDAROTRO2")
	private Integer permiteDesvalidarOtro2;
	
	@Column(name = "IDDOCPERSONAOTRO2")
	private Long idDocPersonaOtro2;
	
	@Column(name = "PERMITEVISUALIZAROTRO3")
	private Integer permiteVerOtro3;
	
	@Column(name = "PERMITEVALIDAROTRO3")
	private Integer permiteValidarOtro3;
	
	@Column(name = "PERMITEDESVALIDAROTRO3")
	private Integer permiteDesvalidarOtro3;
	
	@Column(name = "IDDOCPERSONAOTRO3")
	private Long idDocPersonaOtro3;
	
	@Column(name = "PERMITEVISUALIZARCURR")
	private Integer permiteVerCurr;
	
	@Column(name = "PERMITEVALIDARCURR")
	private Integer permiteValidarCurr;
	
	@Column(name = "PERMITEDESVALIDARCURR")
	private Integer permiteDesvalidarCurr;
	
	@Column(name = "IDDOCPERSONACURR")
	private Long idDocPersonaCurr;
	
	@Column(name = "PERMITEVISUALIZAROTROIDI")
	private Integer permiteVerOtroIdi;
	
	@Column(name = "PERMITEVALIDAROTROIDI")
	private Integer permiteValidarOtroIdi;
	
	@Column(name = "PERMITEDESVALIDAROTROIDI")
	private Integer permiteDesvalidarOtroIdi;
	
	@Column(name = "IDDOCPERSONAOTROIDI")
	private Long idDocPersonaOtroIdi;

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

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getClNivelEducativo() {
		return clNivelEducativo;
	}

	public void setClNivelEducativo(Integer clNivelEducativo) {
		this.clNivelEducativo = clNivelEducativo;
	}

	public Integer getPermiteVerActa() {
		return permiteVerActa;
	}

	public void setPermiteVerActa(Integer permiteVerActa) {
		this.permiteVerActa = permiteVerActa;
	}

	public Integer getPermiteValidarActa() {
		return permiteValidarActa;
	}

	public void setPermiteValidarActa(Integer permiteValidarActa) {
		this.permiteValidarActa = permiteValidarActa;
	}

	public Integer getPermiteDesvalidarActa() {
		return permiteDesvalidarActa;
	}

	public void setPermiteDesvalidarActa(Integer permiteDesvalidarActa) {
		this.permiteDesvalidarActa = permiteDesvalidarActa;
	}

	public Long getIdDocPersonaActa() {
		return idDocPersonaActa;
	}

	public void setIdDocPersonaActa(Long idDocPersonaActa) {
		this.idDocPersonaActa = idDocPersonaActa;
	}

	public Integer getPermiteVerCertificado() {
		return permiteVerCertificado;
	}

	public void setPermiteVerCertificado(Integer permiteVerCertificado) {
		this.permiteVerCertificado = permiteVerCertificado;
	}

	public Integer getPermiteValidarCertificado() {
		return permiteValidarCertificado;
	}

	public void setPermiteValidarCertificado(Integer permiteValidarCertificado) {
		this.permiteValidarCertificado = permiteValidarCertificado;
	}

	public Integer getPermiteDesvalidarCertificado() {
		return permiteDesvalidarCertificado;
	}

	public void setPermiteDesvalidarCertificado(Integer permiteDesvalidarCertificado) {
		this.permiteDesvalidarCertificado = permiteDesvalidarCertificado;
	}

	public Long getIdDocPersonaCertificado() {
		return idDocPersonaCertificado;
	}

	public void setIdDocPersonaCertificado(Long idDocPersonaCertificado) {
		this.idDocPersonaCertificado = idDocPersonaCertificado;
	}

	public Integer getPermiteVerMedico() {
		return permiteVerMedico;
	}

	public void setPermiteVerMedico(Integer permiteVerMedico) {
		this.permiteVerMedico = permiteVerMedico;
	}

	public Integer getPermiteValidarMedico() {
		return permiteValidarMedico;
	}

	public void setPermiteValidarMedico(Integer permiteValidarMedico) {
		this.permiteValidarMedico = permiteValidarMedico;
	}

	public Integer getPermiteDevalidarMedico() {
		return permiteDevalidarMedico;
	}

	public void setPermiteDevalidarMedico(Integer permiteDevalidarMedico) {
		this.permiteDevalidarMedico = permiteDevalidarMedico;
	}

	public Long getIdDocPersonaMedico() {
		return idDocPersonaMedico;
	}

	public void setIdDocPersonaMedico(Long idDocPersonaMedico) {
		this.idDocPersonaMedico = idDocPersonaMedico;
	}

	public Integer getPermiteVerBucal() {
		return permiteVerBucal;
	}

	public void setPermiteVerBucal(Integer permiteVerBucal) {
		this.permiteVerBucal = permiteVerBucal;
	}

	public Integer getPermiteValidarBucal() {
		return permiteValidarBucal;
	}

	public void setPermiteValidarBucal(Integer permiteValidarBucal) {
		this.permiteValidarBucal = permiteValidarBucal;
	}

	public Integer getPermiteDesvalidarBucal() {
		return permiteDesvalidarBucal;
	}

	public void setPermiteDesvalidarBucal(Integer permiteDesvalidarBucal) {
		this.permiteDesvalidarBucal = permiteDesvalidarBucal;
	}

	public Long getIdDocPersonaBucal() {
		return idDocPersonaBucal;
	}

	public void setIdDocPersonaBucal(Long idDocPersonaBucal) {
		this.idDocPersonaBucal = idDocPersonaBucal;
	}

	public Integer getPermiteVerCurp() {
		return permiteVerCurp;
	}

	public void setPermiteVerCurp(Integer permiteVerCurp) {
		this.permiteVerCurp = permiteVerCurp;
	}

	public Integer getPermiteValidarCurp() {
		return permiteValidarCurp;
	}

	public void setPermiteValidarCurp(Integer permiteValidarCurp) {
		this.permiteValidarCurp = permiteValidarCurp;
	}

	public Integer getPermiteDesvalidarCurp() {
		return permiteDesvalidarCurp;
	}

	public void setPermiteDesvalidarCurp(Integer permiteDesvalidarCurp) {
		this.permiteDesvalidarCurp = permiteDesvalidarCurp;
	}

	public Long getIdDocPersonaCurp() {
		return idDocPersonaCurp;
	}

	public void setIdDocPersonaCurp(Long idDocPersonaCurp) {
		this.idDocPersonaCurp = idDocPersonaCurp;
	}

	public Integer getPermiteVerEstancia() {
		return permiteVerEstancia;
	}

	public void setPermiteVerEstancia(Integer permiteVerEstancia) {
		this.permiteVerEstancia = permiteVerEstancia;
	}

	public Integer getPermiteValidarEstancia() {
		return permiteValidarEstancia;
	}

	public void setPermiteValidarEstancia(Integer permiteValidarEstancia) {
		this.permiteValidarEstancia = permiteValidarEstancia;
	}

	public Integer getPermiteDesvalidarEstancia() {
		return permiteDesvalidarEstancia;
	}

	public void setPermiteDesvalidarEstancia(Integer permiteDesvalidarEstancia) {
		this.permiteDesvalidarEstancia = permiteDesvalidarEstancia;
	}

	public Long getIdDocPersonaEstancia() {
		return idDocPersonaEstancia;
	}

	public void setIdDocPersonaEstancia(Long idDocPersonaEstancia) {
		this.idDocPersonaEstancia = idDocPersonaEstancia;
	}

	public Integer getPermiteVerCedula() {
		return permiteVerCedula;
	}

	public void setPermiteVerCedula(Integer permiteVerCedula) {
		this.permiteVerCedula = permiteVerCedula;
	}

	public Integer getPermiteValidarCedula() {
		return permiteValidarCedula;
	}

	public void setPermiteValidarCedula(Integer permiteValidarCedula) {
		this.permiteValidarCedula = permiteValidarCedula;
	}

	public Integer getPermiteDesvalidarCedula() {
		return permiteDesvalidarCedula;
	}

	public void setPermiteDesvalidarCedula(Integer permiteDesvalidarCedula) {
		this.permiteDesvalidarCedula = permiteDesvalidarCedula;
	}

	public Long getIdDocPersonaCedula() {
		return idDocPersonaCedula;
	}

	public void setIdDocPersonaCedula(Long idDocPersonaCedula) {
		this.idDocPersonaCedula = idDocPersonaCedula;
	}

	public Integer getPermiteVerTitulo() {
		return permiteVerTitulo;
	}

	public void setPermiteVerTitulo(Integer permiteVerTitulo) {
		this.permiteVerTitulo = permiteVerTitulo;
	}

	public Integer getPermiteValidarTitulo() {
		return permiteValidarTitulo;
	}

	public void setPermiteValidarTitulo(Integer permiteValidarTitulo) {
		this.permiteValidarTitulo = permiteValidarTitulo;
	}

	public Integer getPermiteDesvalidarTitulo() {
		return permiteDesvalidarTitulo;
	}

	public void setPermiteDesvalidarTitulo(Integer permiteDesvalidarTitulo) {
		this.permiteDesvalidarTitulo = permiteDesvalidarTitulo;
	}

	public Long getIdDocPersonaTitulo() {
		return idDocPersonaTitulo;
	}

	public void setIdDocPersonaTitulo(Long idDocPersonaTitulo) {
		this.idDocPersonaTitulo = idDocPersonaTitulo;
	}

	public Integer getPermiteVerOtro() {
		return permiteVerOtro;
	}

	public void setPermiteVerOtro(Integer permiteVerOtro) {
		this.permiteVerOtro = permiteVerOtro;
	}

	public Integer getPermiteValidarOtro() {
		return permiteValidarOtro;
	}

	public void setPermiteValidarOtro(Integer permiteValidarOtro) {
		this.permiteValidarOtro = permiteValidarOtro;
	}

	public Integer getPermiteDesvalidarOtro() {
		return permiteDesvalidarOtro;
	}

	public void setPermiteDesvalidarOtro(Integer permiteDesvalidarOtro) {
		this.permiteDesvalidarOtro = permiteDesvalidarOtro;
	}

	public Long getIdDocPersonaOtro() {
		return idDocPersonaOtro;
	}

	public void setIdDocPersonaOtro(Long idDocPersonaOtro) {
		this.idDocPersonaOtro = idDocPersonaOtro;
	}

	public Integer getPermiteVerOtro2() {
		return permiteVerOtro2;
	}

	public void setPermiteVerOtro2(Integer permiteVerOtro2) {
		this.permiteVerOtro2 = permiteVerOtro2;
	}

	public Integer getPermiteValidarOtro2() {
		return permiteValidarOtro2;
	}

	public void setPermiteValidarOtro2(Integer permiteValidarOtro2) {
		this.permiteValidarOtro2 = permiteValidarOtro2;
	}

	public Integer getPermiteDesvalidarOtro2() {
		return permiteDesvalidarOtro2;
	}

	public void setPermiteDesvalidarOtro2(Integer permiteDesvalidarOtro2) {
		this.permiteDesvalidarOtro2 = permiteDesvalidarOtro2;
	}

	public Long getIdDocPersonaOtro2() {
		return idDocPersonaOtro2;
	}

	public void setIdDocPersonaOtro2(Long idDocPersonaOtro2) {
		this.idDocPersonaOtro2 = idDocPersonaOtro2;
	}

	public Integer getPermiteVerOtro3() {
		return permiteVerOtro3;
	}

	public void setPermiteVerOtro3(Integer permiteVerOtro3) {
		this.permiteVerOtro3 = permiteVerOtro3;
	}

	public Integer getPermiteValidarOtro3() {
		return permiteValidarOtro3;
	}

	public void setPermiteValidarOtro3(Integer permiteValidarOtro3) {
		this.permiteValidarOtro3 = permiteValidarOtro3;
	}

	public Integer getPermiteDesvalidarOtro3() {
		return permiteDesvalidarOtro3;
	}

	public void setPermiteDesvalidarOtro3(Integer permiteDesvalidarOtro3) {
		this.permiteDesvalidarOtro3 = permiteDesvalidarOtro3;
	}

	public Long getIdDocPersonaOtro3() {
		return idDocPersonaOtro3;
	}

	public void setIdDocPersonaOtro3(Long idDocPersonaOtro3) {
		this.idDocPersonaOtro3 = idDocPersonaOtro3;
	}

	public Integer getPermiteVerCurr() {
		return permiteVerCurr;
	}

	public void setPermiteVerCurr(Integer permiteVerCurr) {
		this.permiteVerCurr = permiteVerCurr;
	}

	public Integer getPermiteValidarCurr() {
		return permiteValidarCurr;
	}

	public void setPermiteValidarCurr(Integer permiteValidarCurr) {
		this.permiteValidarCurr = permiteValidarCurr;
	}

	public Integer getPermiteDesvalidarCurr() {
		return permiteDesvalidarCurr;
	}

	public void setPermiteDesvalidarCurr(Integer permiteDesvalidarCurr) {
		this.permiteDesvalidarCurr = permiteDesvalidarCurr;
	}

	public Long getIdDocPersonaCurr() {
		return idDocPersonaCurr;
	}

	public void setIdDocPersonaCurr(Long idDocPersonaCurr) {
		this.idDocPersonaCurr = idDocPersonaCurr;
	}

	public Integer getPermiteVerOtroIdi() {
		return permiteVerOtroIdi;
	}

	public void setPermiteVerOtroIdi(Integer permiteVerOtroIdi) {
		this.permiteVerOtroIdi = permiteVerOtroIdi;
	}

	public Integer getPermiteValidarOtroIdi() {
		return permiteValidarOtroIdi;
	}

	public void setPermiteValidarOtroIdi(Integer permiteValidarOtroIdi) {
		this.permiteValidarOtroIdi = permiteValidarOtroIdi;
	}

	public Integer getPermiteDesvalidarOtroIdi() {
		return permiteDesvalidarOtroIdi;
	}

	public void setPermiteDesvalidarOtroIdi(Integer permiteDesvalidarOtroIdi) {
		this.permiteDesvalidarOtroIdi = permiteDesvalidarOtroIdi;
	}

	public Long getIdDocPersonaOtroIdi() {
		return idDocPersonaOtroIdi;
	}

	public void setIdDocPersonaOtroIdi(Long idDocPersonaOtroIdi) {
		this.idDocPersonaOtroIdi = idDocPersonaOtroIdi;
	}

	public Integer getPermiteVerTituloMae() {
		return permiteVerTituloMae;
	}

	public void setPermiteVerTituloMae(Integer permiteVerTituloMae) {
		this.permiteVerTituloMae = permiteVerTituloMae;
	}

	public Integer getPermiteValidarTituloMae() {
		return permiteValidarTituloMae;
	}

	public void setPermiteValidarTituloMae(Integer permiteValidarTituloMae) {
		this.permiteValidarTituloMae = permiteValidarTituloMae;
	}

	public Integer getPermiteDesvalidarTituloMae() {
		return permiteDesvalidarTituloMae;
	}

	public void setPermiteDesvalidarTituloMae(Integer permiteDesvalidarTituloMae) {
		this.permiteDesvalidarTituloMae = permiteDesvalidarTituloMae;
	}

	public Long getIdDocPersonaTituloMae() {
		return idDocPersonaTituloMae;
	}

	public void setIdDocPersonaTituloMae(Long idDocPersonaTituloMae) {
		this.idDocPersonaTituloMae = idDocPersonaTituloMae;
	}

	public Integer getPermiteVerCedulaMae() {
		return permiteVerCedulaMae;
	}

	public void setPermiteVerCedulaMae(Integer permiteVerCedulaMae) {
		this.permiteVerCedulaMae = permiteVerCedulaMae;
	}

	public Integer getPermiteValidarCedulaMae() {
		return permiteValidarCedulaMae;
	}

	public void setPermiteValidarCedulaMae(Integer permiteValidarCedulaMae) {
		this.permiteValidarCedulaMae = permiteValidarCedulaMae;
	}

	public Integer getPermiteDesvalidarCedulaMae() {
		return permiteDesvalidarCedulaMae;
	}

	public void setPermiteDesvalidarCedulaMae(Integer permiteDesvalidarCedulaMae) {
		this.permiteDesvalidarCedulaMae = permiteDesvalidarCedulaMae;
	}

	public Long getIdDocPersonaCedulaMae() {
		return idDocPersonaCedulaMae;
	}

	public void setIdDocPersonaCedulaMae(Long idDocPersonaCedulaMae) {
		this.idDocPersonaCedulaMae = idDocPersonaCedulaMae;
	}
	
	
}
