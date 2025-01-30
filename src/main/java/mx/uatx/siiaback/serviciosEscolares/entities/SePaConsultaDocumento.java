package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaConsultaDocumento implements Serializable {

    
    @Column(name = "NOMBRE")
    private String strNombre;
    
    @Column(name = "FOTOGRAFIA")
    private byte[] fotografia;
    
    @Column(name = "CURP")
    private String strCurp;

    @Id
    @Column(name = "NMFOLIODOCUMENTO")
    private Long lngNmFolioDocumento;
    
    @Column(name = "NBDOCUMENTO")
    private String strNbDocumento;
    
    @Column(name = "FCIMPRESIONDOCUMENTO")
    private Date fcImpresionDocumento;
    
    @Column(name = "DSNIVELEDUCATIVO")
    private String strDsNivelEducativo;
    
    @Column(name = "DSPROGRAMAEDUCATIVO")
    private String strProgramaEducativo;
    
    @Column(name = "AREA")
    private String strArea;
    
    @Column(name = "OBSERVACIONES")
    private String strObservaciones;
    
    @Column(name = "COLOR")
    private String strColor;    

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public byte[] getFotografia() {
        return fotografia;
    }

    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }

    public Long getLngNmFolioDocumento() {
        return lngNmFolioDocumento;
    }

    public void setLngNmFolioDocumento(Long lngNmFolioDocumento) {
        this.lngNmFolioDocumento = lngNmFolioDocumento;
    }

    public String getStrNbDocumento() {
        return strNbDocumento;
    }

    public void setStrNbDocumento(String strNbDocumento) {
        this.strNbDocumento = strNbDocumento;
    }

    public Date getFcImpresionDocumento() {
        return fcImpresionDocumento;
    }

    public void setFcImpresionDocumento(Date fcImpresionDocumento) {
        this.fcImpresionDocumento = fcImpresionDocumento;
    }

    public String getStrDsNivelEducativo() {
        return strDsNivelEducativo;
    }

    public void setStrDsNivelEducativo(String strDsNivelEducativo) {
        this.strDsNivelEducativo = strDsNivelEducativo;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrCurp() {
        return strCurp;
    }

    public void setStrCurp(String strCurp) {
        this.strCurp = strCurp;
    }

    public String getStrProgramaEducativo() {
        return strProgramaEducativo;
    }

    public void setStrProgramaEducativo(String strProgramaEducativo) {
        this.strProgramaEducativo = strProgramaEducativo;
    }

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
    
    
    
}
