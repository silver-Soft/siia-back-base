package mx.uatx.siiaback.serviciosUniversitarios.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mx.uatx.siiaback.serviciosUniversitarios.enums.SeveridadMensajeEnum;
import mx.uatx.siiaback.serviciosUniversitarios.entities.SiPaMensajesValidacion;

/**
 * Universidad Autonoma de Tlaxcala. Nombre de la Clase: ResultadoTO.java Autor: Edgar Portillo
 * Gonzalez Fecha de creacion: 19/05/2017 Descripcion de la funcionalidad: Permite concentrar la
 * informacion obtenida a partir de una operacion.
 * */


public class ResultadoTO implements Serializable {


    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7871908068844991827L;

    private boolean blnValido = false;
    private boolean blnValidoExtra = false;
    
    
    private transient Object objeto;
    private transient List<MensajeTO> lstMensajes;
    private transient List<MensajeTO> lstMensajesValidacion;
    
    private transient Object objetoExtra;
    
    
    public ResultadoTO() {
        lstMensajes = new ArrayList<MensajeTO>();
        lstMensajesValidacion = new ArrayList<MensajeTO>();
        objeto = new Object();
    }

    public ResultadoTO(boolean blnValido) {
        lstMensajes = new ArrayList<MensajeTO>();
        lstMensajesValidacion = new ArrayList<MensajeTO>();
        objeto = new Object();
        this.blnValido = blnValido;
    }

    public void adjuntarResultado(final ResultadoTO resultadoExtra) {
        lstMensajes.addAll(resultadoExtra.getLstMensajes());
        lstMensajesValidacion.addAll(resultadoExtra.getLstMensajesValidacion());
        blnValido = resultadoExtra.blnValido;
    }

    public void agregarMensaje(final SeveridadMensajeEnum severidad, final String strMensaje) {
    	final MensajeTO mensaje = new MensajeTO(strMensaje, severidad);
        this.lstMensajes.add(mensaje);
    }
    
    public void agregarMensajeValidacion(final SeveridadMensajeEnum severidad, final String strMensaje) {
    	final MensajeTO mensaje = new MensajeTO(strMensaje, severidad);
        this.lstMensajesValidacion.add(mensaje);
    }

    public void cleaner() {
        this.getLstMensajes().clear();
        this.getLstMensajesValidacion().clear();
        this.setObjeto(null);
        this.setBlnValido(false);
    }
    
    public void setearListadoMensajesValidacion(final List<SiPaMensajesValidacion> lstMensajesEntidad) {
    	if (null != lstMensajesEntidad) {
    		lstMensajesValidacion.clear();
	    	for (SiPaMensajesValidacion msj : lstMensajesEntidad) {
	    		this.lstMensajesValidacion.add(new MensajeTO(msj.getStrValidacion(), msj.getStrMensaje(), SeveridadMensajeEnum.ERROR));
	    	}
    	}
	}

	public boolean isBlnValido() {
		return blnValido;
	}

	public void setBlnValido(boolean blnValido) {
		this.blnValido = blnValido;
	}

	public boolean isBlnValidoExtra() {
		return blnValidoExtra;
	}

	public void setBlnValidoExtra(boolean blnValidoExtra) {
		this.blnValidoExtra = blnValidoExtra;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public List<MensajeTO> getLstMensajes() {
		return lstMensajes;
	}

	public void setLstMensajes(List<MensajeTO> lstMensajes) {
		this.lstMensajes = lstMensajes;
	}

	public List<MensajeTO> getLstMensajesValidacion() {
		return lstMensajesValidacion;
	}

	public void setLstMensajesValidacion(List<MensajeTO> lstMensajesValidacion) {
		this.lstMensajesValidacion = lstMensajesValidacion;
	}

	public Object getObjetoExtra() {
		return objetoExtra;
	}

	public void setObjetoExtra(Object objetoExtra) {
		this.objetoExtra = objetoExtra;
	}
	
	
	
	
	
	
}
