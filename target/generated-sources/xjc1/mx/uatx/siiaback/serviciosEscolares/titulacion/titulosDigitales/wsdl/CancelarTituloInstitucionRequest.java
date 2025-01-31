
package mx.uatx.siiaback.serviciosEscolares.titulacion.titulosDigitales.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="folioControl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cveInstitucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="motCancelacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autenticacion" type="{http://ws.web.mec.sep.mx/schemas}autenticacionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "folioControl",
    "cveInstitucion",
    "motCancelacion",
    "autenticacion"
})
@XmlRootElement(name = "cancelarTituloInstitucionRequest")
public class CancelarTituloInstitucionRequest {

    @XmlElement(required = true)
    protected String folioControl;
    @XmlElement(required = true)
    protected String cveInstitucion;
    @XmlElement(required = true)
    protected String motCancelacion;
    @XmlElement(required = true)
    protected AutenticacionType autenticacion;

    /**
     * Obtiene el valor de la propiedad folioControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioControl() {
        return folioControl;
    }

    /**
     * Define el valor de la propiedad folioControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioControl(String value) {
        this.folioControl = value;
    }

    /**
     * Obtiene el valor de la propiedad cveInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveInstitucion() {
        return cveInstitucion;
    }

    /**
     * Define el valor de la propiedad cveInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveInstitucion(String value) {
        this.cveInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad motCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotCancelacion() {
        return motCancelacion;
    }

    /**
     * Define el valor de la propiedad motCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotCancelacion(String value) {
        this.motCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link AutenticacionType }
     *     
     */
    public AutenticacionType getAutenticacion() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link AutenticacionType }
     *     
     */
    public void setAutenticacion(AutenticacionType value) {
        this.autenticacion = value;
    }

}
