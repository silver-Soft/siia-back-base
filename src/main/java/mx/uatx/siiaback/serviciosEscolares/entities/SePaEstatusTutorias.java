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
public class SePaEstatusTutorias implements Serializable {
    
    @Id
    @Column(name = "CLESTATUSTUTORIA")
    private Integer intClEstatusTutoria;
    
    @Column(name = "DSESTATUSTUTORIA")
    private String strDsEstatusTutoria;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCAUDIT")
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

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
