/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaTipoAcreditacion implements Serializable {
    
    @Id
    @Column(name = "ID")
    private Integer intId;
    
    @Column(name = "TIPOACREDITACION")
    private String strTipoAcreditacion;

    public Integer getIntId() {
        return intId;
    }

    public void setIntId(Integer intId) {
        this.intId = intId;
    }

    public String getStrTipoAcreditacion() {
        return strTipoAcreditacion;
    }

    public void setStrTipoAcreditacion(String strTipoAcreditacion) {
        this.strTipoAcreditacion = strTipoAcreditacion;
    }
    
}
