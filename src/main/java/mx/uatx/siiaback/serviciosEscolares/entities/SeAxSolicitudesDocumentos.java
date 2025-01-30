package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author zerodkpg
 */
@Entity
@Table(schema = "SERESC", name = "SEAXSOLICITUDESDOCUMENTOS")
public class SeAxSolicitudesDocumentos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4179250488947251272L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	@SequenceGenerator(name = "GENIDSOLICITUDDOCUMENTOOFICIAL", sequenceName = "SERESC.IDSOLICITUDDOCUMENTOOFICIAL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDSOLICITUDDOCUMENTOOFICIAL")
	private Long lngIdSolicitudDocOficial;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "IDDOCUMENTOOFICIAL")
	private Integer intIdDocumentoOficial;

	@Column(name = "FCSOLICITUD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcSolicitud;

	@Column(name = "FCAUTORIZACIONSOLICITUD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAutorizacionSolicitud;

	@Column(name = "FCIMPRESIONDOCUMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcImpresionDocumento;

	@Column(name = "FCENTREGADOCUMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcEntregaDocumento;

	@Column(name = "NMFOLIODOCUMENTO")
	private Long lngFolioDocumento;

	@Column(name = "CLEXENCIONPAGO")
	private Long lngClExencionPago;

	@Column(name = "CLESTATUSSOLICITUD")
	private Long lngClEstatusSolicitud;

	@Column(name = "NMIMPRESIONESDOCUMENTO")
	private Long lngNumeroImpresionesDocumento;

	@Column(name = "IDPAGO")
	private Long lngIdPago;
        
        @Column(name = "IDPAGOELECTRONICO")
	private String strIdPagoElectronico;

	@Column(name = "DSDIRIGIDOA")
	private String strDirigidoA;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DOCUMENTO")
	@Lob
	private byte[] documento;

	@Column(name = "FIRMASECTECNICO")
	private String strFirmaSecTecnico;

	@Column(name = "IDPERSONASECTECNICO")
	private Long lngIdPersonaSecTecnico;

	@Column(name = "FCFIRMASECTECNICO")
	private Date fcFirmaSecTecnico;

	@Column(name = "FIRMACYRE")
	private String strFirmaCyRe;

	@Column(name = "IDPERSONACYRE")
	private Long lngIdPersonaCyRe;

	@Column(name = "FCFIRMACYRE")
	private Date fcFirmaCyRe;
	
	@Column(name = "FIRMADIRECTOR")
	private String strFirmaDirector;

	@Column(name = "IDPERSONADIRECTOR")
	private Long lngIdPersonaDirector;

	@Column(name = "FCFIRMADIRECTOR")
	private Date fcFirmaDirector;

	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;

	@Column(name = "CLSTREVISADO")
	private Integer intClStRevisado;

	@Column(name = "IDPERSONAREVISA")
	private Long lngIdPersonaRevisa;

	@Column(name = "FCREVISADO")
	private Date fcRevisado;

	@Column(name = "ARCHIVO")
	@Lob
	private byte[] archivo;
        
    @Column(name = "CLSTSUPERVISADO")
    private Integer intClStSupervisado;
        
    @Column(name = "FCSUPERVISADO")
    private Date fcSupervisado;
        
    @Column(name = "IDPERSONASUPERVISO")
    private Long lngIdPersonaSuperviso;
        
    @Column(name = "CLESTATUSELECTRONICO")
    private Integer intClStElectronico;
    
    @Column(name= "PERIODOVACACIONAL")
    private String strPeriodoVacacional;
    
    @Column(name= "CORREOSOLICITANTE")
    private String strCorreoElectronico;
    
    @Column(name = "TIPOTRAMITE")
	private String strTipoTramite;
    

	public Long getLngIdSolicitudDocOficial() {
		return lngIdSolicitudDocOficial;
	}

	public void setLngIdSolicitudDocOficial(Long lngIdSolicitudDocOficial) {
		this.lngIdSolicitudDocOficial = lngIdSolicitudDocOficial;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Integer getIntIdDocumentoOficial() {
		return intIdDocumentoOficial;
	}

	public void setIntIdDocumentoOficial(Integer intIdDocumentoOficial) {
		this.intIdDocumentoOficial = intIdDocumentoOficial;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcAutorizacionSolicitud() {
		return fcAutorizacionSolicitud;
	}

	public void setFcAutorizacionSolicitud(Date fcAutorizacionSolicitud) {
		this.fcAutorizacionSolicitud = fcAutorizacionSolicitud;
	}

	public Date getFcImpresionDocumento() {
		return fcImpresionDocumento;
	}

	public void setFcImpresionDocumento(Date fcImpresionDocumento) {
		this.fcImpresionDocumento = fcImpresionDocumento;
	}

	public Date getFcEntregaDocumento() {
		return fcEntregaDocumento;
	}

	public void setFcEntregaDocumento(Date fcEntregaDocumento) {
		this.fcEntregaDocumento = fcEntregaDocumento;
	}

	public Long getLngFolioDocumento() {
		return lngFolioDocumento;
	}

	public void setLngFolioDocumento(Long lngFolioDocumento) {
		this.lngFolioDocumento = lngFolioDocumento;
	}

	public Long getLngClExencionPago() {
		return lngClExencionPago;
	}

	public void setLngClExencionPago(Long lngClExencionPago) {
		this.lngClExencionPago = lngClExencionPago;
	}

	public Long getLngClEstatusSolicitud() {
		return lngClEstatusSolicitud;
	}

	public void setLngClEstatusSolicitud(Long lngClEstatusSolicitud) {
		this.lngClEstatusSolicitud = lngClEstatusSolicitud;
	}

	public Long getLngNumeroImpresionesDocumento() {
		return lngNumeroImpresionesDocumento;
	}

	public void setLngNumeroImpresionesDocumento(Long lngNumeroImpresionesDocumento) {
		this.lngNumeroImpresionesDocumento = lngNumeroImpresionesDocumento;
	}

	public Long getLngIdPago() {
		return lngIdPago;
	}

	public void setLngIdPago(Long lngIdPago) {
		this.lngIdPago = lngIdPago;
	}

	public String getStrDirigidoA() {
		return strDirigidoA;
	}

	public void setStrDirigidoA(String strDirigidoA) {
		this.strDirigidoA = strDirigidoA;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	public String getStrFirmaSecTecnico() {
		return strFirmaSecTecnico;
	}

	public void setStrFirmaSecTecnico(String strFirmaSecTecnico) {
		this.strFirmaSecTecnico = strFirmaSecTecnico;
	}

	public Long getLngIdPersonaSecTecnico() {
		return lngIdPersonaSecTecnico;
	}

	public void setLngIdPersonaSecTecnico(Long lngIdPersonaSecTecnico) {
		this.lngIdPersonaSecTecnico = lngIdPersonaSecTecnico;
	}

	public Date getFcFirmaSecTecnico() {
		return fcFirmaSecTecnico;
	}

	public void setFcFirmaSecTecnico(Date fcFirmaSecTecnico) {
		this.fcFirmaSecTecnico = fcFirmaSecTecnico;
	}

	public String getStrFirmaCyRe() {
		return strFirmaCyRe;
	}

	public void setStrFirmaCyRe(String strFirmaCyRe) {
		this.strFirmaCyRe = strFirmaCyRe;
	}

	public Long getLngIdPersonaCyRe() {
		return lngIdPersonaCyRe;
	}

	public void setLngIdPersonaCyRe(Long lngIdPersonaCyRe) {
		this.lngIdPersonaCyRe = lngIdPersonaCyRe;
	}

	public Date getFcFirmaCyRe() {
		return fcFirmaCyRe;
	}

	public void setFcFirmaCyRe(Date fcFirmaCyRe) {
		this.fcFirmaCyRe = fcFirmaCyRe;
	}

	public String getStrCadenaOriginal() {
		return strCadenaOriginal;
	}

	public void setStrCadenaOriginal(String strCadenaOriginal) {
		this.strCadenaOriginal = strCadenaOriginal;
	}

	public Integer getIntClStRevisado() {
		return intClStRevisado;
	}

	public void setIntClStRevisado(Integer intClStRevisado) {
		this.intClStRevisado = intClStRevisado;
	}

	public Long getLngIdPersonaRevisa() {
		return lngIdPersonaRevisa;
	}

	public void setLngIdPersonaRevisa(Long lngIdPersonaRevisa) {
		this.lngIdPersonaRevisa = lngIdPersonaRevisa;
	}

	public Date getFcRevisado() {
		return fcRevisado;
	}

	public void setFcRevisado(Date fcRevisado) {
		this.fcRevisado = fcRevisado;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getStrFirmaDirector() {
		return strFirmaDirector;
	}

	public void setStrFirmaDirector(String strFirmaDirector) {
		this.strFirmaDirector = strFirmaDirector;
	}

	public Long getLngIdPersonaDirector() {
		return lngIdPersonaDirector;
	}

	public void setLngIdPersonaDirector(Long lngIdPersonaDirector) {
		this.lngIdPersonaDirector = lngIdPersonaDirector;
	}

	public Date getFcFirmaDirector() {
		return fcFirmaDirector;
	}

	public void setFcFirmaDirector(Date fcFirmaDirector) {
		this.fcFirmaDirector = fcFirmaDirector;
	}

    public Integer getIntClStSupervisado() {
        return intClStSupervisado;
    }

    public void setIntClStSupervisado(Integer intClStSupervisado) {
        this.intClStSupervisado = intClStSupervisado;
    }

    public Date getFcSupervisado() {
        return fcSupervisado;
    }

    public void setFcSupervisado(Date fcSupervisado) {
        this.fcSupervisado = fcSupervisado;
    }

    public Long getLngIdPersonaSuperviso() {
        return lngIdPersonaSuperviso;
    }

    public void setLngIdPersonaSuperviso(Long lngIdPersonaSuperviso) {
        this.lngIdPersonaSuperviso = lngIdPersonaSuperviso;
    }

    public Integer getIntClStElectronico() {
        return intClStElectronico;
    }

    public void setIntClStElectronico(Integer intClStElectronico) {
        this.intClStElectronico = intClStElectronico;
    }

    public String getStrIdPagoElectronico() {
        return strIdPagoElectronico;
    }

    public void setStrIdPagoElectronico(String strIdPagoElectronico) {
        this.strIdPagoElectronico = strIdPagoElectronico;
    }

	public String getStrPeriodoVacacional() {
		return strPeriodoVacacional;
	}

	public void setStrPeriodoVacacional(String strPeriodoVacacional) {
		this.strPeriodoVacacional = strPeriodoVacacional;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrTipoTramite() {
		return strTipoTramite;
	}

	public void setStrTipoTramite(String strTipoTramite) {
		this.strTipoTramite = strTipoTramite;
	}

	
    
    
        
}
