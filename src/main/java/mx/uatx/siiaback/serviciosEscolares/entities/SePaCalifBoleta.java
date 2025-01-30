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
public class SePaCalifBoleta implements Serializable {
    
    @Column(name = "IDOFERTA")
    private Long lngIdOferta;
    
    @Id
    @Column(name = "IDACTA")
    private Long lngIdActa;
    
    @Column(name = "MATERIA_REAL")
    private String strMateriaReal;
    
    @Column(name = "DOCENTE")
    private String strDocente;
    
    @Column(name = "CLCALIFICACIONFINAL")
    private String intClCalificacionFinal;
    
    @Column(name = "DSCALIFICACION")
    private String strDsCalificacion;
    
    @Column(name = "DSTIPOACREDITACION")
    private String strDsTipoAcreditacion;
    
    @Column(name = "CLESTATUSACTA")
    private String strClEstatusActa;
    
    @Column(name = "FCREGISTROACTA")
    private Date fcRegistroActa;

    public Long getLngIdOferta() {
        return lngIdOferta;
    }

    public void setLngIdOferta(Long lngIdOferta) {
        this.lngIdOferta = lngIdOferta;
    }

    public Long getLngIdActa() {
        return lngIdActa;
    }

    public void setLngIdActa(Long lngIdActa) {
        this.lngIdActa = lngIdActa;
    }

    public String getStrMateriaReal() {
        return strMateriaReal;
    }

    public void setStrMateriaReal(String strMateriaReal) {
        this.strMateriaReal = strMateriaReal;
    }

    public String getStrDocente() {
        return strDocente;
    }

    public void setStrDocente(String strDocente) {
        this.strDocente = strDocente;
    }

 

    public String getIntClCalificacionFinal() {
		return intClCalificacionFinal;
	}

	public void setIntClCalificacionFinal(String intClCalificacionFinal) {
		this.intClCalificacionFinal = intClCalificacionFinal;
	}

	public String getStrDsCalificacion() {
        return strDsCalificacion;
    }

    public void setStrDsCalificacion(String strDsCalificacion) {
        this.strDsCalificacion = strDsCalificacion;
    }

    public String getStrDsTipoAcreditacion() {
        return strDsTipoAcreditacion;
    }

    public void setStrDsTipoAcreditacion(String strDsTipoAcreditacion) {
        this.strDsTipoAcreditacion = strDsTipoAcreditacion;
    }

    public String getStrClEstatusActa() {
        return strClEstatusActa;
    }

    public void setStrClEstatusActa(String strClEstatusActa) {
        this.strClEstatusActa = strClEstatusActa;
    }

    public Date getFcRegistroActa() {
        return fcRegistroActa;
    }

    public void setFcRegistroActa(Date fcRegistroActa) {
        this.fcRegistroActa = fcRegistroActa;
    }
    
    
    
}
