package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCarga implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "FOLIO")
    private Long lngFolio;
    
    @Column(name = "MATERIA")
    private String strMateria;
    
    @Column(name = "DOCENTE")
    private String strDocente;
    
    @Column(name = "OBSERVACIONES")
    private String strObservaciones;

    public Long getLngFolio() {
        return lngFolio;
    }

    public void setLngFolio(Long lngFolio) {
        this.lngFolio = lngFolio;
    }

    public String getStrMateria() {
        return strMateria;
    }

    public void setStrMateria(String strMateria) {
        this.strMateria = strMateria;
    }

    public String getStrDocente() {
        return strDocente;
    }

    public void setStrDocente(String strDocente) {
        this.strDocente = strDocente;
    }

    public String getStrObservaciones() {
        return strObservaciones;
    }

    public void setStrObservaciones(String strObservaciones) {
        this.strObservaciones = strObservaciones;
    }
    
    
    
}
