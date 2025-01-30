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
public class SePaDomicilioPersona implements Serializable {
    
    @Id
    @Column(name = "IDDOMICILIO")
    private Long lngIdDomicilio;
    
    @Column(name = "NBCALLE")
    private String strNbCalle;
    
    @Column(name = "NMEXTERIOR")
    private String strNmExterior;
    
    @Column(name = "NMINTERIOR")
    private String strNmInterior;
    
    @Column(name = "CODIGOPOSTAL")
    private Integer intCodigoPostal;
    
    @Column(name = "CLASENTAMIENTO")
    private Long lngClAsentamiento;
    
    @Column(name = "NBASENTAMIENTO")
    private String strNbAsentamiento;
    
    @Column(name = "IDMUNICIPIO")
    private Long lngIdMunicipio;
    
    @Column(name = "NBMUNICIPIO")
    private String strNbMunicipio;
    
    @Column(name = "IDENTIDAD")
    private Integer intIdEntidad;
    
    @Column(name = "NBENTIDAD")
    private String strNbEntidad;

    public Long getLngIdDomicilio() {
        return lngIdDomicilio;
    }

    public void setLngIdDomicilio(Long lngIdDomicilio) {
        this.lngIdDomicilio = lngIdDomicilio;
    }

    public String getStrNbCalle() {
        return strNbCalle;
    }

    public void setStrNbCalle(String strNbCalle) {
        this.strNbCalle = strNbCalle;
    }

    public String getStrNmExterior() {
        return strNmExterior;
    }

    public void setStrNmExterior(String strNmExterior) {
        this.strNmExterior = strNmExterior;
    }

    public String getStrNmInterior() {
        return strNmInterior;
    }

    public void setStrNmInterior(String strNmInterior) {
        this.strNmInterior = strNmInterior;
    }

    public Integer getIntCodigoPostal() {
        return intCodigoPostal;
    }

    public void setIntCodigoPostal(Integer intCodigoPostal) {
        this.intCodigoPostal = intCodigoPostal;
    }

    public Long getLngClAsentamiento() {
        return lngClAsentamiento;
    }

    public void setLngClAsentamiento(Long lngClAsentamiento) {
        this.lngClAsentamiento = lngClAsentamiento;
    }

    public String getStrNbAsentamiento() {
        return strNbAsentamiento;
    }

    public void setStrNbAsentamiento(String strNbAsentamiento) {
        this.strNbAsentamiento = strNbAsentamiento;
    }

    public Long getLngIdMunicipio() {
        return lngIdMunicipio;
    }

    public void setLngIdMunicipio(Long lngIdMunicipio) {
        this.lngIdMunicipio = lngIdMunicipio;
    }

    public String getStrNbMunicipio() {
        return strNbMunicipio;
    }

    public void setStrNbMunicipio(String strNbMunicipio) {
        this.strNbMunicipio = strNbMunicipio;
    }

    public Integer getIntIdEntidad() {
        return intIdEntidad;
    }

    public void setIntIdEntidad(Integer intIdEntidad) {
        this.intIdEntidad = intIdEntidad;
    }

    public String getStrNbEntidad() {
        return strNbEntidad;
    }

    public void setStrNbEntidad(String strNbEntidad) {
        this.strNbEntidad = strNbEntidad;
    }
    
    
    
}
