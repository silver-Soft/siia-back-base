
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
 *         &lt;element name="nombreArchivo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="archivoBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "nombreArchivo",
    "archivoBase64",
    "autenticacion"
})
@XmlRootElement(name = "cargaTituloElectronicoRequest")
public class CargaTituloElectronicoRequest {

    @XmlElement(required = true)
    protected String nombreArchivo;
    @XmlElement(required = true)
    protected byte[] archivoBase64;
    @XmlElement(required = true)
    protected AutenticacionType autenticacion;

    /**
     * Obtiene el valor de la propiedad nombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Define el valor de la propiedad nombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoBase64.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoBase64() {
        return archivoBase64;
    }

    /**
     * Define el valor de la propiedad archivoBase64.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoBase64(byte[] value) {
        this.archivoBase64 = value;
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
