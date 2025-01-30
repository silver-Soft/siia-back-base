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
public class SiPaMes implements Serializable{
        
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8363473923873960481L;

	@Id
    @Column(name = "IDMES")
    private Integer intIdMes;
    
    @Column(name = "MES")
    private String strMes;

    public Integer getIntIdMes() {
        return intIdMes;
    }

    public void setIntIdMes(Integer intIdMes) {
        this.intIdMes = intIdMes;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }
    
    
    
}
