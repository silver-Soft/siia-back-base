package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoSolicitudBecaSubes implements Serializable {

    @Id
    @Column(name = "CLTIPOSOLICITUDBECA")
    private Integer intClTipoSolicitudBeca;
    
    @Column(name = "DSTIPOSOLICITUDBECA")
    private String strDsTipoSolicitudBeca;

    public Integer getIntClTipoSolicitudBeca() {
        return intClTipoSolicitudBeca;
    }

    public void setIntClTipoSolicitudBeca(Integer intClTipoSolicitudBeca) {
        this.intClTipoSolicitudBeca = intClTipoSolicitudBeca;
    }

    public String getStrDsTipoSolicitudBeca() {
        return strDsTipoSolicitudBeca;
    }

    public void setStrDsTipoSolicitudBeca(String strDsTipoSolicitudBeca) {
        this.strDsTipoSolicitudBeca = strDsTipoSolicitudBeca;
    }
    
}
