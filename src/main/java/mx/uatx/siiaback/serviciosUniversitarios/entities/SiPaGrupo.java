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
public class SiPaGrupo implements Serializable{
    
    @Id
    @Column(name = "DSGRUPOPROGRAMA")
    private String strDsGrupoPrograma;

    /**
     * @return the strDsGrupoPrograma
     */
    public String getStrDsGrupoPrograma() {
        return strDsGrupoPrograma;
    }

    /**
     * @param strDsGrupoPrograma the strDsGrupoPrograma to set
     */
    public void setStrDsGrupoPrograma(String strDsGrupoPrograma) {
        this.strDsGrupoPrograma = strDsGrupoPrograma;
    }
    
    
    
}
