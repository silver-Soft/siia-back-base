package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;

import mx.uatx.siiaback.serviciosUniversitarios.enums.SeveridadMensajeEnum;


/**
 * Universidad Autonoma de Tlaxcala
 * 
 * Nombre de la Clase: Mensaje.java
 * 
 * @author: Edgar Portillo Gonzalez Fecha de creacion: 19/05/2017 Descripcion de la funcionalidad:
 *          Permite encapsular la informacion de un mensaje para ser mostrado segun su severidad
 */

public class MensajeTO implements Serializable {

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7237029630209501911L;
	
	private String mensaje;
	private String strTitulo;
    private int severidad;

    /**
     * Constructor de la clase
     */
    public MensajeTO() {
    }

    /**
     * Constructor de la clase
     * 
     * @param mensaje
     * @param severidad
     */
    public MensajeTO(String strTitulo, String mensaje, SeveridadMensajeEnum severidad) {
    	this.strTitulo = strTitulo;
        this.mensaje = mensaje;
        this.severidad = severidad.getValor();
    }
    
    public MensajeTO(String mensaje, SeveridadMensajeEnum severidad) {
        this.mensaje = mensaje;
        this.severidad = severidad.getValor();
    }

    /**
     * Metodo que devuelve el valor de la variable mensaje
     * 
     * @return String - mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo que establece el valor de la variable mensaje
     * 
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Metodo que devuelve el valor de la variable severidad
     * 
     * @return int - severidad
     */
    public int getSeveridad() {
        return severidad;
    }

    /**
     * Metodo que establece el valor de la variable severidad
     * 
     * @param severidad
     */
    public void setSeveridad(SeveridadMensajeEnum severidad) {
        this.severidad = severidad.getValor();
    }

	public String getStrTitulo() {
		return strTitulo;
	}

	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}
    
    

}
