/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaDatosSeguro implements Serializable {
    
    @Id
    @Column(name = "IDCOMPLEMENTARIOIMSS")
    private Integer intIdComplementarioIMSS;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCSOLICITUD")
    private Date fcSolicitud;
    
    @Column(name = "CLESTATUSACEPTADO")
    private Integer intClEstatusAceptado;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCACEPTADO")
    private Date fcAceptado;
    
    @Column(name = "NSS")
    private String strNSS;
    
    @Column(name = "NMCLINICA")
    private Long lngNmClinica;
    
    @Column(name = "DSCLINICA")
    private String strDsClinica;
    
    @Column(name = "DSESTATUSACEPTADO")
    private String strDsEstatusAceptado;
    
    @Column(name = "DSMENSAJE")
    private String strDsMensaje;
    
    @Column(name = "BLNPERMITIRGUARDAR")
    private boolean blnPermitirGuardar;
    
    @Column(name = "ESPOSGRADO")
    private boolean blnEsPosgrado;

    public Integer getIntIdComplementarioIMSS() {
        return intIdComplementarioIMSS;
    }

    public void setIntIdComplementarioIMSS(Integer intIdComplementarioIMSS) {
        this.intIdComplementarioIMSS = intIdComplementarioIMSS;
    }

    public Date getFcSolicitud() {
        return fcSolicitud;
    }

    public void setFcSolicitud(Date fcSolicitud) {
        this.fcSolicitud = fcSolicitud;
    }

    public Integer getIntClEstatusAceptado() {
        return intClEstatusAceptado;
    }

    public void setIntClEstatusAceptado(Integer intClEstatusAceptado) {
        this.intClEstatusAceptado = intClEstatusAceptado;
    }

    public Date getFcAceptado() {
        return fcAceptado;
    }

    public void setFcAceptado(Date fcAceptado) {
        this.fcAceptado = fcAceptado;
    }

    public String getStrNSS() {
        return strNSS;
    }

    public void setStrNSS(String strNSS) {
        this.strNSS = strNSS;
    }

    public Long getLngNmClinica() {
        return lngNmClinica;
    }

    public void setLngNmClinica(Long lngNmClinica) {
        this.lngNmClinica = lngNmClinica;
    }

    public String getStrDsClinica() {
        return strDsClinica;
    }

    public void setStrDsClinica(String strDsClinica) {
        this.strDsClinica = strDsClinica;
    }

    public String getStrDsEstatusAceptado() {
        return strDsEstatusAceptado;
    }

    public void setStrDsEstatusAceptado(String strDsEstatusAceptado) {
        this.strDsEstatusAceptado = strDsEstatusAceptado;
    }

    public String getStrDsMensaje() {
        return strDsMensaje;
    }

    public void setStrDsMensaje(String strDsMensaje) {
        this.strDsMensaje = strDsMensaje;
    }

    public boolean isBlnPermitirGuardar() {
        return blnPermitirGuardar;
    }

    public void setBlnPermitirGuardar(boolean blnPermitirGuardar) {
        this.blnPermitirGuardar = blnPermitirGuardar;
    }

	public boolean isBlnEsPosgrado() {
		return blnEsPosgrado;
	}

	public void setBlnEsPosgrado(boolean blnEsPosgrado) {
		this.blnEsPosgrado = blnEsPosgrado;
	}
    
    
    
}
