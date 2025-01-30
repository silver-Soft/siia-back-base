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

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaSolicitudCredencial implements Serializable {
    
    @Id
    @Column(name = "IDCREDENCIALPERSONA")
    private Long lngIdCredencialPersona;
    
    @Column(name = "DSPERIODOTEMPORADA")
    private String strDsPeriodoTemporada;
    
    @Column(name = "DSSTCREDENCIAL")
    private String strDsStCredencial;
    
    @Column(name = "FCSOLICITUD")
    private Date fcSolicitud;
    
    @Column(name = "FCIMPRESION")
    private Date fcImpresion;
    
    @Column(name = "FCENTREGA")
    private Date fcEntrega;
    
    @Column(name = "PERMITEIMPRIMIR")
    private Integer permiteImprimir;
    
    @Column(name = "IDPROGRAMACAMPUS")
    private Long lngIdProgramaCampus;
    

    public Long getLngIdCredencialPersona() {
        return lngIdCredencialPersona;
    }

    public void setLngIdCredencialPersona(Long lngIdCredencialPersona) {
        this.lngIdCredencialPersona = lngIdCredencialPersona;
    }

    public String getStrDsPeriodoTemporada() {
        return strDsPeriodoTemporada;
    }

    public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
        this.strDsPeriodoTemporada = strDsPeriodoTemporada;
    }

    public String getStrDsStCredencial() {
        return strDsStCredencial;
    }

    public void setStrDsStCredencial(String strDsStCredencial) {
        this.strDsStCredencial = strDsStCredencial;
    }

    public Date getFcSolicitud() {
        return fcSolicitud;
    }

    public void setFcSolicitud(Date fcSolicitud) {
        this.fcSolicitud = fcSolicitud;
    }

    public Date getFcImpresion() {
        return fcImpresion;
    }

    public void setFcImpresion(Date fcImpresion) {
        this.fcImpresion = fcImpresion;
    }

    public Date getFcEntrega() {
        return fcEntrega;
    }

    public void setFcEntrega(Date fcEntrega) {
        this.fcEntrega = fcEntrega;
    }

	public Integer getPermiteImprimir() {
		return permiteImprimir;
	}

	public void setPermiteImprimir(Integer permiteImprimir) {
		this.permiteImprimir = permiteImprimir;
	}

	public Long getLngIdProgramaCampus() {
		return lngIdProgramaCampus;
	}

	public void setLngIdProgramaCampus(Long lngIdProgramaCampus) {
		this.lngIdProgramaCampus = lngIdProgramaCampus;
	}
    
    
    
    
}
