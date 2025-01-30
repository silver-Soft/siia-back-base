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
public class SePaHistorial implements Serializable{
    
    @Column(name = "PROGEDUCATIVO")
    private String strProgEducativo;
    
    @Id
    @Column(name = "IDHISTORIAL")
    private Long lngHistorialAcademico;
    
    @Column(name = "MATRICULA")
    private String matricula;

    public String getStrProgEducativo() {
        return strProgEducativo;
    }

    public void setStrProgEducativo(String strProgEducativo) {
        this.strProgEducativo = strProgEducativo;
    }

    public Long getLngHistorialAcademico() {
        return lngHistorialAcademico;
    }

    public void setLngHistorialAcademico(Long lngHistorialAcademico) {
        this.lngHistorialAcademico = lngHistorialAcademico;
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
    
    
    
}
