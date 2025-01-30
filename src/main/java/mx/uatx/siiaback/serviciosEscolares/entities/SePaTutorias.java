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
public class SePaTutorias implements Serializable {
    
    @Id
    @Column(name = "IDTUTORIAAX")
    private Long lngIdTutoriaAx;
    
    @Column(name = "DSASUNTO")
    private String strDsAsunto;
    
    @Column(name = "DSRESUMEN")
    private String strDsResumen;
    
    @Column(name = "TUTOR")
    private String strDsTutor;
    
    @Column(name = "FCTUTORIA")
    private Date fcTutoria;
    
    @Column(name = "DSTIPOTUTORIA")
    private String strDsTipoTutoria;
    
    @Column(name = "DSESTATUSTUTORIA")
    private String strDsEstatusTutoria;

    public Long getLngIdTutoriaAx() {
        return lngIdTutoriaAx;
    }

    public void setLngIdTutoriaAx(Long lngIdTutoriaAx) {
        this.lngIdTutoriaAx = lngIdTutoriaAx;
    }

    public String getStrDsAsunto() {
        return strDsAsunto;
    }

    public void setStrDsAsunto(String strDsAsunto) {
        this.strDsAsunto = strDsAsunto;
    }

    public String getStrDsResumen() {
        return strDsResumen;
    }

    public void setStrDsResumen(String strDsResumen) {
        this.strDsResumen = strDsResumen;
    }

    public String getStrDsTutor() {
        return strDsTutor;
    }

    public void setStrDsTutor(String strDsTutor) {
        this.strDsTutor = strDsTutor;
    }

    public Date getFcTutoria() {
        return fcTutoria;
    }

    public void setFcTutoria(Date fcTutoria) {
        this.fcTutoria = fcTutoria;
    }

    public String getStrDsTipoTutoria() {
        return strDsTipoTutoria;
    }

    public void setStrDsTipoTutoria(String strDsTipoTutoria) {
        this.strDsTipoTutoria = strDsTipoTutoria;
    }

    public String getStrDsEstatusTutoria() {
        return strDsEstatusTutoria;
    }

    public void setStrDsEstatusTutoria(String strDsEstatusTutoria) {
        this.strDsEstatusTutoria = strDsEstatusTutoria;
    }
    
    
    
}
