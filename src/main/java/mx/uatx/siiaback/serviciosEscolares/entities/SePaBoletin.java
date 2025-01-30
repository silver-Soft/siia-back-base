package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBoletin {

    @Id
    @Column(name = "IDBOLETIN")
    private Long lngIdBoletin;
    
    @Column(name = "DSTITULO")
    private String strDsTitulo;
    
    @Column(name = "DSSUBTITULO")
    private String strDsSubtitulo;
    
    @Column(name = "DSCLAVEBOLETIN")
    private String strDsClaveBoletin;
    
    @Column(name = "DSCONTENIDO")
    private String strDsContenido;
    
    @Column(name = "IMAGEN_MINIATURA")
    private byte[] imagenMiniatura;
    
    @Column(name = "IMAGEN_PRINCIPAL")
    private byte[] imagenPrincipal;

    public Long getLngIdBoletin() {
        return lngIdBoletin;
    }

    public void setLngIdBoletin(Long lngIdBoletin) {
        this.lngIdBoletin = lngIdBoletin;
    }

    public String getStrDsTitulo() {
        return strDsTitulo;
    }

    public void setStrDsTitulo(String strDsTitulo) {
        this.strDsTitulo = strDsTitulo;
    }

    public String getStrDsSubtitulo() {
        return strDsSubtitulo;
    }

    public void setStrDsSubtitulo(String strDsSubtitulo) {
        this.strDsSubtitulo = strDsSubtitulo;
    }

    public String getStrDsClaveBoletin() {
        return strDsClaveBoletin;
    }

    public void setStrDsClaveBoletin(String strDsClaveBoletin) {
        this.strDsClaveBoletin = strDsClaveBoletin;
    }

    public String getStrDsContenido() {
        return strDsContenido;
    }

    public void setStrDsContenido(String strDsContenido) {
        this.strDsContenido = strDsContenido;
    }

    public byte[] getImagenMiniatura() {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(byte[] imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    /**
     * @return the imagenPrincipal
     */
    public byte[] getImagenPrincipal() {
        return imagenPrincipal;
    }

    /**
     * @param imagenPrincipal the imagenPrincipal to set
     */
    public void setImagenPrincipal(byte[] imagenPrincipal) {
        this.imagenPrincipal = imagenPrincipal;
    }
    
    
}
