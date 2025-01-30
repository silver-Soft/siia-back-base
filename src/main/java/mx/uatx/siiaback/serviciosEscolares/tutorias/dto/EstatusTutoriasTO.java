/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaEstatusTutorias;

/**
 *
 * @author sistemas10
 */
public class EstatusTutoriasTO implements Serializable, Cloneable {
    
    private Integer intClEstatusTutoria;
    private String strDsEstatusTutoria;
    private Date fcAudit;
    private String strUsuarioAudit;

    public EstatusTutoriasTO(SePaEstatusTutorias estatus) {
        
        intClEstatusTutoria = estatus.getIntClEstatusTutoria();
        strDsEstatusTutoria = estatus.getStrDsEstatusTutoria();
        fcAudit = estatus.getFcAudit();
        strUsuarioAudit = estatus.getStrUsuarioAudit();
        
    }

    public Integer getIntClEstatusTutoria() {
        return intClEstatusTutoria;
    }

    public void setIntClEstatusTutoria(Integer intClEstatusTutoria) {
        this.intClEstatusTutoria = intClEstatusTutoria;
    }

    public String getStrDsEstatusTutoria() {
        return strDsEstatusTutoria;
    }

    public void setStrDsEstatusTutoria(String strDsEstatusTutoria) {
        this.strDsEstatusTutoria = strDsEstatusTutoria;
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
    
    
}
