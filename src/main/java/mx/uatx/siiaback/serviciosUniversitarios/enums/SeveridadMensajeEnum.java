/**
 * Universidad Autonoma de Tlaxcala
 * 
 * Nombre de la Clase: SeveridadMensajes.java
 * author: Edgar Portillo Gonzalez
 * Fecha de creacion: 19/05/2017
 * Descripcion de la funcionalidad: Contiene los tipos de 
 * severidad que se manejaran en el sistema
 */
package mx.uatx.siiaback.serviciosUniversitarios.enums;

import java.io.Serializable;

public enum SeveridadMensajeEnum implements Serializable {
    ERROR(3), 
    ALERTA(2), 
    INFO(1);

    private int valor;

    private SeveridadMensajeEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public SeveridadMensajeEnum[] getValues() {

        return SeveridadMensajeEnum.values();

    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

}
