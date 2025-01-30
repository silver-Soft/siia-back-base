package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaHorario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "HORA")
    private String strHora;
    
    @Column(name = "DIA")
    private String strDia;
    
    @Column(name = "DOCENTE")
    private String strDocente;

    public String getStrHora() {
        return strHora;
    }

    public void setStrHora(String strHora) {
        this.strHora = strHora;
    }

    public String getStrDia() {
        return strDia;
    }

    public void setStrDia(String strDia) {
        this.strDia = strDia;
    }

    public String getStrDocente() {
        return strDocente;
    }

    public void setStrDocente(String strDocente) {
        this.strDocente = strDocente;
    }
    
    
}
