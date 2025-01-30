package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoBecaSubes implements Serializable {

    @Id
    @Column(name = "CLTIPOBECAPRONABES")
    private Integer intClTipoBecaPronabes;
    
    @Column(name = "DSTIPOBECAPRONABES")
    private String strDsTipoBecaPronabes;
    
    @Column(name = "CLESTATUS")
    private Integer intClEstatus;
    
    @Column(name = "TIPOPERSONA")
    private String strTipoPersona;

    public Integer getIntClTipoBecaPronabes() {
        return intClTipoBecaPronabes;
    }

    public void setIntClTipoBecaPronabes(Integer intClTipoBecaPronabes) {
        this.intClTipoBecaPronabes = intClTipoBecaPronabes;
    }

    public String getStrDsTipoBecaPronabes() {
        return strDsTipoBecaPronabes;
    }

    public void setStrDsTipoBecaPronabes(String strDsTipoBecaPronabes) {
        this.strDsTipoBecaPronabes = strDsTipoBecaPronabes;
    }

    public Integer getIntClEstatus() {
        return intClEstatus;
    }

    public void setIntClEstatus(Integer intClEstatus) {
        this.intClEstatus = intClEstatus;
    }

    public String getStrTipoPersona() {
        return strTipoPersona;
    }

    public void setStrTipoPersona(String strTipoPersona) {
        this.strTipoPersona = strTipoPersona;
    }
    
    
    
}
