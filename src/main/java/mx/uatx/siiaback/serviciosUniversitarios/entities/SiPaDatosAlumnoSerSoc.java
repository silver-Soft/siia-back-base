/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
public class SiPaDatosAlumnoSerSoc implements Serializable {
    
    @Id
    @Column(name = "IDHISTORIALACADEMICO")
    private Long longHistorialAcademico;
    
    @Column(name = "NBPERSONA")
    private String strNbPersona;
    
    @Column(name = "APPATERNO")
    private String strApePaterno;
    
    @Column(name = "APMATERNO")
    private String strApeMaterno;
    
    @Column(name = "DSPROGRAMAEDUCATIVO")
    private String strDsProgEdu;
    
    @Column(name = "FCNACIMIENTO")
    private Date fcNacimiento;
    
    @Column(name = "MATRICULA")
    private String strMatricula;
    
    @Column(name = "NBAREA")
    private String strAreaCampus;
    
    @Column(name = "DSCAMPUS")
    private String strDsCampus;
    
    @Column(name = "IDAREACAMPUS")
    private Long longAreaCampus;
    
    @Column(name = "CLPERIODOCURSADO")
    private Long longPerCursado;
    
    @Column(name = "IDPERSONA")
    private Long longIdPersona;
    
    @Column(name = "IDPROGRAMACAMPUS")
    private Long longIdProgCampus;
    
    @Column(name = "IDPROGRAMAEDUCATIVO")
    private Integer intIdProgEdu;
    
    @Column(name = "CLAREA")
    private Integer intIdFacultad;
    
    @Column(name = "CREDITOSALUMNO")
    private Long longCreditosAlum;
    
    @Column(name = "CREDITOSPLAN")
    private Long longCreditosPlan;
    
    @Column(name = "DSESTADOCIVIL")
    private String strEstadoCivil;
    
    @Column(name = "DSTIPOAREA")
    private String strTipoArea;
    
    @Column(name = "REGULAR")
    private Integer intRegular;

    @Column(name = "PREFIJOGENERO")
    private String strPrefijoGenero;
    
    
    public Integer getIntIdFacultad() {
		return intIdFacultad;
	}

	public void setIntIdFacultad(Integer intIdFacultad) {
		this.intIdFacultad = intIdFacultad;
	}

	/**
     * @return the longHistorialAcademico
     */
    public Long getLongHistorialAcademico() {
        return longHistorialAcademico;
    }

    /**
     * @param longHistorialAcademico the longHistorialAcademico to set
     */
    public void setLongHistorialAcademico(Long longHistorialAcademico) {
        this.longHistorialAcademico = longHistorialAcademico;
    }

    /**
     * @return the strNbPersona
     */
    public String getStrNbPersona() {
        return strNbPersona;
    }

    /**
     * @param strNbPersona the strNbPersona to set
     */
    public void setStrNbPersona(String strNbPersona) {
        this.strNbPersona = strNbPersona;
    }

    /**
     * @return the strApePaterno
     */
    public String getStrApePaterno() {
        return strApePaterno;
    }

    public Integer getIntIdProgEdu() {
		return intIdProgEdu;
	}

	public void setIntIdProgEdu(Integer intIdProgEdu) {
		this.intIdProgEdu = intIdProgEdu;
	}

	/**
     * @param strApePaterno the strApePaterno to set
     */
    public void setStrApePaterno(String strApePaterno) {
        this.strApePaterno = strApePaterno;
    }

    /**
     * @return the strApeMaterno
     */
    public String getStrApeMaterno() {
        return strApeMaterno;
    }

    /**
     * @param strApeMaterno the strApeMaterno to set
     */
    public void setStrApeMaterno(String strApeMaterno) {
        this.strApeMaterno = strApeMaterno;
    }

    /**
     * @return the strDsProgEdu
     */
    public String getStrDsProgEdu() {
        return strDsProgEdu;
    }

    /**
     * @param strDsProgEdu the strDsProgEdu to set
     */
    public void setStrDsProgEdu(String strDsProgEdu) {
        this.strDsProgEdu = strDsProgEdu;
    }

    /**
     * @return the strFcNacimiento
     */
    public Date getFcNacimiento() {
        return fcNacimiento;
    }

    /**
     * @param strFcNacimiento the strFcNacimiento to set
     */
    public void setFcNacimiento(Date fcNacimiento) {
        this.fcNacimiento = fcNacimiento;
    }

    /**
     * @return the longMatricula
     */
    public String getStrMatricula() {
        return strMatricula;
    }

    /**
     * @param longMatricula the longMatricula to set
     */
    public void setLongMatricula(String strMatricula) {
        this.setStrMatricula(strMatricula);
    }

    /**
     * @return the strAreaCampus
     */
    public String getStrAreaCampus() {
        return strAreaCampus;
    }

    /**
     * @param strAreaCampus the strAreaCampus to set
     */
    public void setStrAreaCampus(String strAreaCampus) {
        this.strAreaCampus = strAreaCampus;
    }

    /**
     * @return the strDsCampus
     */
    public String getStrDsCampus() {
        return strDsCampus;
    }

    /**
     * @param strDsCampus the strDsCampus to set
     */
    public void setStrDsCampus(String strDsCampus) {
        this.strDsCampus = strDsCampus;
    }

    /**
     * @return the longAreaCampus
     */
    public Long getLongAreaCampus() {
        return longAreaCampus;
    }

    /**
     * @param longAreaCampus the longAreaCampus to set
     */
    public void setLongAreaCampus(Long longAreaCampus) {
        this.longAreaCampus = longAreaCampus;
    }

    /**
     * @return the longPerCursado
     */
    public Long getLongPerCursado() {
        return longPerCursado;
    }

    /**
     * @param longPerCursado the longPerCursado to set
     */
    public void setLongPerCursado(Long longPerCursado) {
        this.longPerCursado = longPerCursado;
    }

    /**
     * @return the longIdPersona
     */
    public Long getLongIdPersona() {
        return longIdPersona;
    }

    /**
     * @param longIdPersona the longIdPersona to set
     */
    public void setLongIdPersona(Long longIdPersona) {
        this.longIdPersona = longIdPersona;
    }

    /**
     * @return the longIdProgCampus
     */
    public Long getLongIdProgCampus() {
        return longIdProgCampus;
    }

    /**
     * @param longIdProgCampus the longIdProgCampus to set
     */
    public void setLongIdProgCampus(Long longIdProgCampus) {
        this.longIdProgCampus = longIdProgCampus;
    }


    /**
     * @param strMatricula the strMatricula to set
     */
    public void setStrMatricula(String strMatricula) {
        this.strMatricula = strMatricula;
    }

    /**
     * @return the longCreditosAlum
     */
    public Long getLongCreditosAlum() {
        return longCreditosAlum;
    }

    /**
     * @param longCreditosAlum the longCreditosAlum to set
     */
    public void setLongCreditosAlum(Long longCreditosAlum) {
        this.longCreditosAlum = longCreditosAlum;
    }

    /**
     * @return the longCreditosPlan
     */
    public Long getLongCreditosPlan() {
        return longCreditosPlan;
    }

    /**
     * @param longCreditosPlan the longCreditosPlan to set
     */
    public void setLongCreditosPlan(Long longCreditosPlan) {
        this.longCreditosPlan = longCreditosPlan;
    }
    
    public String getStrEstadoCivil() {
        return strEstadoCivil;
    }

    public void setStrEstadoCivil(String strEstadoCivil) {
        this.strEstadoCivil = strEstadoCivil;
    }

    public String getStrTipoArea() {
        return strTipoArea;
    }

    public void setStrTipoArea(String strTipoArea) {
        this.strTipoArea = strTipoArea;
    }

    public Integer getIntRegular() {
        return intRegular;
    }

    public void setIntRegular(Integer intRegular) {
        this.intRegular = intRegular;
    }

	public String getStrPrefijoGenero() {
		return strPrefijoGenero;
	}

	public void setStrPrefijoGenero(String strPrefijoGenero) {
		this.strPrefijoGenero = strPrefijoGenero;
	}
    
    
    
    
}
