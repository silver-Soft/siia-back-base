package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSolicitudesDocumentosConstancias implements Serializable {
	
	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "FCAUTORIZACIONSOLICITUD")
	private Date fcAutorizacionSolicitud;
	
	@Column(name = "FCIMPRESIONDOCUMENTO")
	private Date fcImpresionDocumento;
	
	@Column(name = "FCENTREGADOCUMENTO")
	private Date fcEntregaDocumento;
	
	@Column(name = "FCFIRMASECTECNICO")
	private Date fcFirmaSecTecnico;
	
	@Column(name = "FCFIRMACYRE")
	private Date fcFirmaCyre;
	
	@Column(name = "FCREVISADO")
	private Date fcRevisado;
	
	@Column(name = "FCFIRMADIRECTOR")
	private Date fcFirmaDirector;
	
	@Column(name = "FCSUPERVISADO")
	private Date fcSupervisado;
	
	@Column(name = "ESTATUSSOLICITUD")
	private String estatusSolicitud;
	
	@Column(name = "ESTATUSELECTRONICO")
	private String estatusElectronico;
        
    @Column(name = "PERMITEIMPRIMIR")
    private Integer intPermiteImprimir;
        
        @Column(name = "ESTATUSDOCUMENTO")
        private String strEstatusDocumentos;
        
        @Column(name = "ARCHIVO")
        private byte[] archivo;
        
        @Column(name = "PERMITEDESCARGA")
        private Integer intPermiteDescarga;
        
        @Column(name = "PERMITEMODIFICAR")
        private Integer intPermiteModificar;
        
    @Column(name = "IDDOCUMENTO")
    private Integer intIdDocumento;
    
    
    @Column(name = "CORREOSOLICITANTE")
    private String strCorreoElectronico;
    
    @Column(name = "TIPOTRAMITE")
    private String strTipoTramite;
	
	public SePaSolicitudesDocumentosConstancias(){
		super();
	}

	public Long getIdSolicitudDocumentoOficial() {
		return idSolicitudDocumentoOficial;
	}

	public void setIdSolicitudDocumentoOficial(Long idSolicitudDocumentoOficial) {
		this.idSolicitudDocumentoOficial = idSolicitudDocumentoOficial;
	}

	public String getNbDocumento() {
		return nbDocumento;
	}

	public void setNbDocumento(String nbDocumento) {
		this.nbDocumento = nbDocumento;
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

	public Date getFcFirmaSecTecnico() {
		return fcFirmaSecTecnico;
	}

	public void setFcFirmaSecTecnico(Date fcFirmaSecTecnico) {
		this.fcFirmaSecTecnico = fcFirmaSecTecnico;
	}

	public Date getFcFirmaCyre() {
		return fcFirmaCyre;
	}

	public void setFcFirmaCyre(Date fcFirmaCyre) {
		this.fcFirmaCyre = fcFirmaCyre;
	}

	public Date getFcRevisado() {
		return fcRevisado;
	}

	public void setFcRevisado(Date fcRevisado) {
		this.fcRevisado = fcRevisado;
	}

	public Date getFcFirmaDirector() {
		return fcFirmaDirector;
	}

	public void setFcFirmaDirector(Date fcFirmaDirector) {
		this.fcFirmaDirector = fcFirmaDirector;
	}

	public Date getFcSupervisado() {
		return fcSupervisado;
	}

	public void setFcSupervisado(Date fcSupervisado) {
		this.fcSupervisado = fcSupervisado;
	}

    public String getEstatusSolicitud() {
        return estatusSolicitud;
    }

    public void setEstatusSolicitud(String estatusSolicitud) {
        this.estatusSolicitud = estatusSolicitud;
    }

    public String getEstatusElectronico() {
        return estatusElectronico;
    }

    public void setEstatusElectronico(String estatusElectronico) {
        this.estatusElectronico = estatusElectronico;
    }

    public Integer getIntPermiteImprimir() {
        return intPermiteImprimir;
    }

    public void setIntPermiteImprimir(Integer intPermiteImprimir) {
        this.intPermiteImprimir = intPermiteImprimir;
    }

    public String getStrEstatusDocumentos() {
        return strEstatusDocumentos;
    }

    public void setStrEstatusDocumentos(String strEstatusDocumentos) {
        this.strEstatusDocumentos = strEstatusDocumentos;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public Integer getIntPermiteDescarga() {
        return intPermiteDescarga;
    }

    public void setIntPermiteDescarga(Integer intPermiteDescarga) {
        this.intPermiteDescarga = intPermiteDescarga;
    }

	public Integer getIntPermiteModificar() {
		return intPermiteModificar;
	}

	public void setIntPermiteModificar(Integer intPermiteModificar) {
		this.intPermiteModificar = intPermiteModificar;
	}

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
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
