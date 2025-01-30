package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SePaDatosSolicitudDocumento implements Serializable {

    @Id
    @Column(name = "NBDOCUMENTO")
    private String strNbDocumento;
    
    @Column(name = "NBALUMNO")
    private String strNbAlumno;
    
    @Column(name = "FACULTAD")
    private String strFacultad;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCSOLICITUD")
    private Date fcSolicitud;
    
    @Column(name = "SEMESTRE")
    private String strSemestre;
    
    @Column(name = "MATRICULA")
    private String strMatricula;
    
    @Column(name = "TELEFONO")
    private String strTelefono;
    
    @Column(name = "PROGRAMAEDUCATIVO")
    private String strProgramaEducativo;
    
    @Column(name = "CAMPUS")
    private String strCampus;
    
    @Column(name = "IDCONCEPTOPAGO")
    private Long lngConceptoPago;
    
    @Column(name = "MONTOPAGO")
    private Double dblConceptoPago;
    
    @Column(name = "PERIODOACTUAL")
    private String strPeriodoActual;

    public String getStrNbDocumento() {
        return strNbDocumento;
    }

    public void setStrNbDocumento(String strNbDocumento) {
        this.strNbDocumento = strNbDocumento;
    }

    public String getStrNbAlumno() {
        return strNbAlumno;
    }

    public void setStrNbAlumno(String strNbAlumno) {
        this.strNbAlumno = strNbAlumno;
    }

    public String getStrFacultad() {
        return strFacultad;
    }

    public void setStrFacultad(String strFacultad) {
        this.strFacultad = strFacultad;
    }

    public Date getFcSolicitud() {
        return fcSolicitud;
    }

    public void setFcSolicitud(Date fcSolicitud) {
        this.fcSolicitud = fcSolicitud;
    }

    public String getStrSemestre() {
        return strSemestre;
    }

    public void setStrSemestre(String strSemestre) {
        this.strSemestre = strSemestre;
    }

    public String getStrMatricula() {
        return strMatricula;
    }

    public void setStrMatricula(String strMatricula) {
        this.strMatricula = strMatricula;
    }

    public String getStrTelefono() {
        return strTelefono;
    }

    public void setStrTelefono(String strTelefono) {
        this.strTelefono = strTelefono;
    }

    public String getStrProgramaEducativo() {
        return strProgramaEducativo;
    }

    public void setStrProgramaEducativo(String strProgramaEducativo) {
        this.strProgramaEducativo = strProgramaEducativo;
    }

    public String getStrCampus() {
        return strCampus;
    }

    public void setStrCampus(String strCampus) {
        this.strCampus = strCampus;
    }

    public Long getLngConceptoPago() {
        return lngConceptoPago;
    }

    public void setLngConceptoPago(Long lngConceptoPago) {
        this.lngConceptoPago = lngConceptoPago;
    }

    public Double getDblConceptoPago() {
        return dblConceptoPago;
    }

    public void setDblConceptoPago(Double dblConceptoPago) {
        this.dblConceptoPago = dblConceptoPago;
    }

    public String getStrPeriodoActual() {
        return strPeriodoActual;
    }

    public void setStrPeriodoActual(String strPeriodoActual) {
        this.strPeriodoActual = strPeriodoActual;
    }
    
    
    
}
