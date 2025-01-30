/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author eportillog
 */
@Entity
@Table(schema = "SERESC", name = "SEAXDOCALUMNOSSERSOC")
public class SeAxDocAlumnosSerSoc implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8231509284789346510L;

    @Id
    @Basic(optional = false)
    @Column(name = "IDDOCALUMNOSERSOC")
    @SequenceGenerator(name = "GENIDDOCALUMNOSERSOC", sequenceName = "SERESC.IDDOCALUMNOSERSOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDDOCALUMNOSERSOC")
    private Long lngIdDocumento;

    @Lob
    @Column(name = "DOCUMENTO")
    private byte[] datosArchivo;

    @Column(name = "ESTATUS")
    private String strEstatus;

    @Column(name = "MOTIVORECHAZO")
    private String strMotivoRechazo;

    @Column(name = "USUARIOAUDIT")
    private String strUsuarioLog;

    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit = new Date();

    @Column(name = "ID_SEAXSOLICITUDESSERSOC")
    private Long lngIdSolicitudServicioSocial;

    @Column(name = "IDDOCUMENTOSERSOC")
    private Integer intIdTipoDoc;

    public Long getLngIdDocumento() {
        return lngIdDocumento;
    }

    public void setLngIdDocumento(Long lngIdDocumento) {
        this.lngIdDocumento = lngIdDocumento;
    }

    public byte[] getDatosArchivo() {
        return datosArchivo;
    }

    public void setDatosArchivo(byte[] datosArchivo) {
        this.datosArchivo = datosArchivo;
    }

    public String getStrEstatus() {
        return strEstatus;
    }

    public void setStrEstatus(String strEstatus) {
        this.strEstatus = strEstatus;
    }

    public String getStrUsuarioLog() {
        return strUsuarioLog;
    }

    public void setStrUsuarioLog(String strUsuarioLog) {
        this.strUsuarioLog = strUsuarioLog;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

    public Long getLngIdSolicitudServicioSocial() {
        return lngIdSolicitudServicioSocial;
    }

    public void setLngIdSolicitudServicioSocial(Long lngIdSolicitudServicioSocial) {
        this.lngIdSolicitudServicioSocial = lngIdSolicitudServicioSocial;
    }

    public Integer getIntIdTipoDoc() {
        return intIdTipoDoc;
    }

    public void setIntIdTipoDoc(Integer intIdTipoDoc) {
        this.intIdTipoDoc = intIdTipoDoc;
    }

    public String getStrMotivoRechazo() {
        return strMotivoRechazo;
    }

    public void setStrMotivoRechazo(String strMotivoRechazo) {
        this.strMotivoRechazo = strMotivoRechazo;
    }

}
