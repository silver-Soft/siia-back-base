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
public class SePaControlPrograma implements Serializable {
    
    @Id
    @Column(name = "ID_CTRL_PROG")
    private Long longIdControlPrograma;
    
    @Column(name = "JUSTIFICACION")
    private String strJustificacion;
    
    @Column(name = "OBJ_GENERALES")
    private String strObjGeneral;
    
    @Column(name = "OBJ_ESPECIFICOS")
    private String strObjEspecifico;
    
    @Column(name = "PER_INICIO")
    private Date fcPerInicio;
    
    @Column(name = "PER_FIN")
    private Date fcPerFin;
    
    @Column(name = "SOL_SS_ID_SEAXSOLSERSOC")
    private Long longIdSolSerSoc;

    public Long getLongIdControlPrograma() {
        return longIdControlPrograma;
    }

    public void setLongIdControlPrograma(Long longIdControlPrograma) {
        this.longIdControlPrograma = longIdControlPrograma;
    }

    public String getStrJustificacion() {
        return strJustificacion;
    }

    public void setStrJustificacion(String strJustificacion) {
        this.strJustificacion = strJustificacion;
    }

    public String getStrObjGeneral() {
        return strObjGeneral;
    }

    public void setStrObjGeneral(String strObjGeneral) {
        this.strObjGeneral = strObjGeneral;
    }

    public String getStrObjEspecifico() {
        return strObjEspecifico;
    }

    public void setStrObjEspecifico(String strObjEspecifico) {
        this.strObjEspecifico = strObjEspecifico;
    }

    public Date getFcPerInicio() {
        return fcPerInicio;
    }

    public void setFcPerInicio(Date fcPerInicio) {
        this.fcPerInicio = fcPerInicio;
    }

    public Date getFcPerFin() {
        return fcPerFin;
    }

    public void setFcPerFin(Date fcPerFin) {
        this.fcPerFin = fcPerFin;
    }

    public Long getLongIdSolSerSoc() {
        return longIdSolSerSoc;
    }

    public void setLongIdSolSerSoc(Long longIdSolSerSoc) {
        this.longIdSolSerSoc = longIdSolSerSoc;
    }
    
    
    
}
