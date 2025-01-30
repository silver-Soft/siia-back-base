
package mx.uatx.siiaback.serviciosEscolares.titulacion.titulosDigitales.wsdl;

import java.math.BigInteger;
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
 *         &lt;element name="numeroLote" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titulosBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    "numeroLote",
    "mensaje",
    "titulosBase64"
})
@XmlRootElement(name = "descargaTituloElectronicoResponse")
public class DescargaTituloElectronicoResponse {

    @XmlElement(required = true)
    protected BigInteger numeroLote;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected byte[] titulosBase64;

    /**
     * Obtiene el valor de la propiedad numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define el valor de la propiedad numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad titulosBase64.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTitulosBase64() {
        return titulosBase64;
    }

    /**
     * Define el valor de la propiedad titulosBase64.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTitulosBase64(byte[] value) {
        this.titulosBase64 = value;
    }

}
