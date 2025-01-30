/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXREQPROGRAMASSERSOC")
public class SeAxReqProgramasSerSoc implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "IDREQPROGRAMASERSOC")
    @SequenceGenerator(name = "GENIDREQPROGRAMASERSOC", sequenceName = "SERESC.IDREQPROGRAMASERSOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDREQPROGRAMASERSOC")
    private Long lngIdReqProgramaSerSoc;
    
    @Basic(optional = false)
    @Column(name = "IDPROGRAMACAMPUS")
    private Integer intIdProgramaCampus;
    
    @Basic(optional = false)
    @Column(name = "NMCREDITOSMINIMO")
    private Integer intNmCreditosMinimo;
    
    @Basic(optional = false)
    @Column(name = "ALUMNOREGULAR")
    private Integer intAlumnoRegular;
    
    @Basic(optional = false)
    @Column(name = "SEMESTREMINIMO")
    private Integer intSemestreMinimo;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

    public Long getLngIdReqProgramaSerSoc() {
        return lngIdReqProgramaSerSoc;
    }

    public void setLngIdReqProgramaSerSoc(Long lngIdReqProgramaSerSoc) {
        this.lngIdReqProgramaSerSoc = lngIdReqProgramaSerSoc;
    }

    public Integer getIntIdProgramaCampus() {
        return intIdProgramaCampus;
    }

    public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
        this.intIdProgramaCampus = intIdProgramaCampus;
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
