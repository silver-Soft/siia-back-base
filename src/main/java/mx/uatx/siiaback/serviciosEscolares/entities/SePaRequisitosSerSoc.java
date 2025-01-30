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
public class SePaRequisitosSerSoc implements Serializable{
    
    @Id
    @Column(name = "IDREQPROGRAMASERSOC")
    private Long lngIdReqProgramaSerSoc;
    
    @Column(name = "IDPROGRAMACAMPUS")
    private Integer intIdProgCampus;
    
    @Column(name = "NMCREDITOSMINIMO")
    private Integer intNmCreditosMinimo;
    
    @Column(name = "ALUMNOREGULAR")
    private Integer intAlumnoRegular;
    
    @Column(name = "SEMESTREMINIMO")
    private Integer intSemestreMinimo;
    
    @Column(name = "DESCRIPCIONREGULAR")
    private String strDescRegular;
    
    @Column(name = "IDAREACAMPUS")
    private Integer intIdAreaCampus;
    
    @Column(name = "NOMBREPROGRAMACAMPUS")
    private String strNbProgCampus;

    public String getStrDescRegular() {
        return strDescRegular;
    }

    public void setStrDescRegular(String strDescRegular) {
        this.strDescRegular = strDescRegular;
    }

    public Integer getIntIdAreaCampus() {
        return intIdAreaCampus;
    }

    public void setIntIdAreaCampus(Integer intIdAreaCampus) {
        this.intIdAreaCampus = intIdAreaCampus;
    }

    public String getStrNbProgCampus() {
        return strNbProgCampus;
    }

    public void setStrNbProgCampus(String strNbProgCampus) {
        this.strNbProgCampus = strNbProgCampus;
    }

    
    
    public Long getLngIdReqProgramaSerSoc() {
        return lngIdReqProgramaSerSoc;
    }

    public void setLngIdReqProgramaSerSoc(Long lngIdReqProgramaSerSoc) {
        this.lngIdReqProgramaSerSoc = lngIdReqProgramaSerSoc;
    }

    public Integer getIntIdProgCampus() {
        return intIdProgCampus;
    }

    public void setIntIdProgCampus(Integer intIdProgCampus) {
        this.intIdProgCampus = intIdProgCampus;
    }

    public Integer getIntNmCreditosMinimo() {
        return intNmCreditosMinimo;
    }

    public void setIntNmCreditosMinimo(Integer intNmCreditosMinimo) {
        this.intNmCreditosMinimo = intNmCreditosMinimo;
    }

    public Integer getIntAlumnoRegular() {
        return intAlumnoRegular;
    }

    public void setIntAlumnoRegular(Integer intAlumnoRegular) {
        this.intAlumnoRegular = intAlumnoRegular;
    }

    public Integer getIntSemestreMinimo() {
        return intSemestreMinimo;
    }

    public void setIntSemestreMinimo(Integer intSemestreMinimo) {
        this.intSemestreMinimo = intSemestreMinimo;
    }
    
    
    
}
