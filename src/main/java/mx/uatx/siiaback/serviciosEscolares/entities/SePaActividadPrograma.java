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
public class SePaActividadPrograma implements Serializable {
    
    @Id
    @Column(name = "ID_ACT_PROG")
    private Integer intIdActProg;
    
    @Column(name = "ACTIVIDAD")
    private String strActividad;
    
    @Column(name = "MES_ACTIVIDAD")
    private String strMesActividad;
    
    @Column(name = "CTRL_PROG_ID_CTRL_PROG")
    private Long LngIdCtrlProg;

    public Integer getIntIdActProg() {
        return intIdActProg;
    }

    public void setIntIdActProg(Integer intIdActProg) {
        this.intIdActProg = intIdActProg;
    }

    public String getStrActividad() {
        return strActividad;
    }

    public void setStrActividad(String strActividad) {
        this.strActividad = strActividad;
    }

    public String getStrMesActividad() {
        return strMesActividad;
    }

    public void setStrMesActividad(String strMesActividad) {
        this.strMesActividad = strMesActividad;
    }

    public Long getLngIdCtrlProg() {
        return LngIdCtrlProg;
    }

    public void setLngIdCtrlProg(Long LngIdCtrlProg) {
        this.LngIdCtrlProg = LngIdCtrlProg;
    }
    
    
    
}
