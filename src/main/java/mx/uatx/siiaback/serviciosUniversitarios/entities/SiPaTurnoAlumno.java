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
public class SiPaTurnoAlumno implements Serializable{

    /**
	 * serialVersionUID
	 */
    
    @Id
    @Column(name = "CLTURNOS")
    private String strClTurno;
    
    @Column(name = "DSTURNOS")
    private String strTurno;

    public String getStrClTurno() {
        return strClTurno;
    }

    public void setStrClTurno(String strClTurno) {
        this.strClTurno = strClTurno;
    }
    /**
     * @return the strTurno
     */
    public String getStrTurno() {
        return strTurno;
    }

    /**
     * @param strTurno the strTurno to set
     */
    public void setStrTurno(String strTurno) {
        this.strTurno = strTurno;
    }
}