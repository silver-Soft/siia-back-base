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
public class SiPaPeriodosAlumno implements Serializable {
    
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2989516707631747327L;

	@Id
    @Column(name = "IDALUMNOPERIODO")
    private Long lngIdAlumnoPeriodo;
    
    @Column(name = "CLPERIODOCURSADO")
    private Integer intClPeriodoCursado;
    
    @Column(name = "IDPERIODO")
    private String strIdPeriodo;
    
    @Column(name = "DSPERIODOTEMPORADA")
    private String strDsPeriodo;
    
    @Column(name = "DSPERIODOCURSADO")
    private String strDsGrado;

    /**
     * @return the lngIdAlumnoPeriodo
     */
    public Long getLngIdAlumnoPeriodo() {
        return lngIdAlumnoPeriodo;
    }

    /**
     * @param lngIdAlumnoPeriodo the lngIdAlumnoPeriodo to set
     */
    public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
        this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
    }

    /**
     * @return the intClPeriodoCursado
     */
    public Integer getIntClPeriodoCursado() {
        return intClPeriodoCursado;
    }

    /**
     * @param intClPeriodoCursado the intClPeriodoCursado to set
     */
    public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
        this.intClPeriodoCursado = intClPeriodoCursado;
    }

    /**
     * @return the strIdPeriodo
     */
    public String getStrIdPeriodo() {
        return strIdPeriodo;
    }

    /**
     * @param strIdPeriodo the strIdPeriodo to set
     */
    public void setStrIdPeriodo(String strIdPeriodo) {
        this.strIdPeriodo = strIdPeriodo;
    }

    /**
     * @return the strDsPeriodo
     */
    public String getStrDsPeriodo() {
        return strDsPeriodo;
    }

    /**
     * @param strDsPeriodo the strDsPeriodo to set
     */
    public void setStrDsPeriodo(String strDsPeriodo) {
        this.strDsPeriodo = strDsPeriodo;
    }

	public String getStrDsGrado() {
		return strDsGrado;
	}

	public void setStrDsGrado(String strDsGrado) {
		this.strDsGrado = strDsGrado;
	}
    
}
