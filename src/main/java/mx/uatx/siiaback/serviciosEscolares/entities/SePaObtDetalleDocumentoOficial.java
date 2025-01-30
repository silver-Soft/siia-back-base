package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDetalleDocumentoOficial {
	
	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "IDDOCUMENTOOFICIAL")
	private String idDocumentoOficial;
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer clNivelEducativo;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "NMFOLIODOCUMENTO")
	private Long nmFolioDocumento;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "DSESTATUSSOLICITUD")
	private String dsEstatusSolicitud;

	@Column(name = "CLESTATUSSOLICITUD")
	private Integer clEstatusSolicitud;

	@Column(name = "ARCHIVO")
	private byte[] archivo;

	@Column(name = "DOCUMENTO")
	private byte[] documento;
	
	@Column(name = "IDPERIODOEGRESO")
	private String idPeriodoEgreso;

	@Column(name = "PERMITEACEPTAR")
	private Boolean permiteAceptar;

	@Column(name = "PERMITEREVISAR")
	private Boolean permiteRevisar;

	@Column(name = "PERMITESUPERVISAR")
	private Boolean permiteSupervisar;

	@Column(name = "PERMITEVISTAPREVIA")
	private Boolean permiteVistaPrevia;
	
	@Column(name = "PERMITEDOCUMENTOFINAL")
	private Boolean permiteDocumentoFinal;
	
	@Column(name = "PERMITEGENERARDOCUMENTOFINAL")
	private Boolean permiteGenerarDocumentoFinal;
	
	@Column(name = "PERMITEENTREGARDOCUMENTO")
	private Boolean permiteEntregarDocumento;
	
	@Column(name = "PERMITEREIMPRIMIR")
	private Boolean permiteReimprimir;

	public Long getIdSolicitudDocumentoOficial() {
		return idSolicitudDocumentoOficial;
	}

	public void setIdSolicitudDocumentoOficial(Long idSolicitudDocumentoOficial) {
		this.idSolicitudDocumentoOficial = idSolicitudDocumentoOficial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getNmFolioDocumento() {
		return nmFolioDocumento;
	}

	public void setNmFolioDocumento(Long nmFolioDocumento) {
		this.nmFolioDocumento = nmFolioDocumento;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getDsEstatusSolicitud() {
		return dsEstatusSolicitud;
	}

	public void setDsEstatusSolicitud(String dsEstatusSolicitud) {
		this.dsEstatusSolicitud = dsEstatusSolicitud;
	}

	public Integer getClEstatusSolicitud() {
		return clEstatusSolicitud;
	}

	public void setClEstatusSolicitud(Integer clEstatusSolicitud) {
		this.clEstatusSolicitud = clEstatusSolicitud;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	public Boolean getPermiteAceptar() {
		return permiteAceptar;
	}

	public void setPermiteAceptar(Boolean permiteAceptar) {
		this.permiteAceptar = permiteAceptar;
	}

	public Boolean getPermiteRevisar() {
		return permiteRevisar;
	}

	public void setPermiteRevisar(Boolean permiteRevisar) {
		this.permiteRevisar = permiteRevisar;
	}

	public Boolean getPermiteSupervisar() {
		return permiteSupervisar;
	}

	public void setPermiteSupervisar(Boolean permiteSupervisar) {
		this.permiteSupervisar = permiteSupervisar;
	}

	public Boolean getPermiteVistaPrevia() {
		return permiteVistaPrevia;
	}

	public void setPermiteVistaPrevia(Boolean permiteVistaPrevia) {
		this.permiteVistaPrevia = permiteVistaPrevia;
	}

	public String getIdDocumentoOficial() {
		return idDocumentoOficial;
	}

	public void setIdDocumentoOficial(String idDocumentoOficial) {
		this.idDocumentoOficial = idDocumentoOficial;
	}

	public Boolean getPermiteDocumentoFinal() {
		return permiteDocumentoFinal;
	}

	public void setPermiteDocumentoFinal(Boolean permiteDocumentoFinal) {
		this.permiteDocumentoFinal = permiteDocumentoFinal;
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

	public Boolean getPermiteGenerarDocumentoFinal() {
		return permiteGenerarDocumentoFinal;
	}

	public void setPermiteGenerarDocumentoFinal(Boolean permiteGenerarDocumentoFinal) {
		this.permiteGenerarDocumentoFinal = permiteGenerarDocumentoFinal;
	}

	public Boolean getPermiteEntregarDocumento() {
		return permiteEntregarDocumento;
	}

	public void setPermiteEntregarDocumento(Boolean permiteEntregarDocumento) {
		this.permiteEntregarDocumento = permiteEntregarDocumento;
	}

	public Boolean getPermiteReimprimir() {
		return permiteReimprimir;
	}

	public void setPermiteReimprimir(Boolean permiteReimprimir) {
		this.permiteReimprimir = permiteReimprimir;
	}

	public String getIdPeriodoEgreso() {
		return idPeriodoEgreso;
	}

	public void setIdPeriodoEgreso(String idPeriodoEgreso) {
		this.idPeriodoEgreso = idPeriodoEgreso;
	}

}
