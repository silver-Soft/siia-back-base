/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SiPaDatosLocalizacion implements Serializable {
    
    @Id
    @Column(name = "NBCALLE")
    private String strNbCalle;
    
    @Column(name = "NMEXTERIOR")
    private String intNmExterior;
    
    @Column(name = "NBASENTAMIENTO")
    private String strNbAsentamiento;
    
    @Column(name = "NBMUNICIPIO")
    private String strNbMunicipio;
    
    @Column(name = "NBENTIDAD")
    private String strNbEntidad;
    
    @Column(name = "CORREO")
    private String strCorreo;
    
    @Column(name = "TELPARTICULAR")
    private String strTelParticular;
    
    @Column(name = "TELCEL")
    private String strTelCel;

    public String getStrNbCalle() {
        return strNbCalle;
    }

    public void setStrNbCalle(String strNbCalle) {
        this.strNbCalle = strNbCalle;
    }

    public String getIntNmExterior() {
        return intNmExterior;
    }

    public void setIntNmExterior(String intNmExterior) {
        this.intNmExterior = intNmExterior;
    }

    public String getStrNbAsentamiento() {
        return strNbAsentamiento;
    }

    public void setStrNbAsentamiento(String strNbAsentamiento) {
        this.strNbAsentamiento = strNbAsentamiento;
    }

    public String getStrNbMunicipio() {
        return strNbMunicipio;
    }

    public void setStrNbMunicipio(String strNbMunicipio) {
        this.strNbMunicipio = strNbMunicipio;
    }

    public String getStrNbEntidad() {
        return strNbEntidad;
    }

    public void setStrNbEntidad(String strNbEntidad) {
        this.strNbEntidad = strNbEntidad;
    }

    public String getStrCorreo() {
        return strCorreo;
    }

    public void setStrCorreo(String strCorreo) {
        this.strCorreo = strCorreo;
    }

    public String getStrTelParticular() {
        return strTelParticular;
    }

    public void setStrTelParticular(String strTelParticular) {
        this.strTelParticular = strTelParticular;
    }

    public String getStrTelCel() {
        return strTelCel;
    }

    public void setStrTelCel(String strTelCel) {
        this.strTelCel = strTelCel;
    }

    
    
    
    
    
}
