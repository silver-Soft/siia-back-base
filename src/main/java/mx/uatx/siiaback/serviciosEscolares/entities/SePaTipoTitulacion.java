package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SePaTipoTitulacion implements Serializable {

    @Id
    @Column(name = "IDTIPOTITULACION")
    private Integer intIdTipoTitulacion;
    
    @Column(name = "DESCRIPCION")
    private String strDescripcion;

    public Integer getIntIdTipoTitulacion() {
        return intIdTipoTitulacion;
    }

    public void setIntIdTipoTitulacion(Integer intIdTipoTitulacion) {
        this.intIdTipoTitulacion = intIdTipoTitulacion;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }
    
}
