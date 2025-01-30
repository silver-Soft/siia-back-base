package mx.uatx.siiaback.serviciosUniversitarios.helper;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FechaHelper implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1460320904719573722L;
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public Date sumarRestarAnios(Date fecha, int anios) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.YEAR, anios);

		return cal.getTime();
	}

	public Date sumarRestarAniosHoras(Date fecha, int anios) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.add(Calendar.YEAR, anios);

		return cal.getTime();
	}

	public Date sumarRestarDias(Date fecha, int dias) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DAY_OF_YEAR, dias);

		return cal.getTime();
	}

	public Date sumarRestarDiasHoras(Date fecha, int dias) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.add(Calendar.DAY_OF_YEAR, dias);

		return cal.getTime();
	}

	public Date sumarRestarHorasFecha(Date fecha, int horas) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.add(Calendar.HOUR, horas);

		return cal.getTime();
	}

	public String formatearFechaHoraMinutoDocumento(final Date fecha) {
		
        if (fecha == null) {
            return "";
        }

        try {
        	DateFormat formatterHora = new SimpleDateFormat("HH");            
            final String fcHora = formatterHora.format(fecha);
            final String strFcHora = NumeroALetraConvertidor.convertNumberToLetter(fcHora);
            
            DateFormat formatterMinutos = new SimpleDateFormat("mm");            
            final String fcMinuto = formatterMinutos.format(fecha);
            final String strFcMinuto = NumeroALetraConvertidor.convertNumberToLetter(fcMinuto);
            
            String strPosFijo = "";
            if (!strFcMinuto.trim().equalsIgnoreCase("UN")) {
            	strPosFijo = "s";
            }
            
            final String output = strFcHora + "horas con " + strFcMinuto + "minuto"+ strPosFijo;
        	
            return output.toLowerCase();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "";
        }
    }
	
	public String formatearFechaHoraMinutoDocumentoNumero(final Date fecha) {
		
        if (fecha == null) {
            return "";
        }

        try {
        	DateFormat formatterHora = new SimpleDateFormat("HH:mm");            
            return formatterHora.format(fecha);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "";
        }
    }
	
	public String formatearFecha(final Date fecha) {
		
            if (fecha == null) {
                return "";
            }

            try {
                final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                //formato.setTimeZone(TimeZone.getTimeZone("CST"));
                final String strFcResultado = formato.format(fecha); 
                return strFcResultado.toUpperCase();
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                return "";
            }
        }
	
	public String formatearFechaMesCompleto(final Date fecha) {
		
        if (fecha == null) {
            return "";
        }

        try {
            DateFormat formatter = new SimpleDateFormat("dd 'de' ");            
            final String fc1 = formatter.format(fecha);
            
            formatter = new SimpleDateFormat("MMMM 'de' yyyy");
            final String fc2 = formatter.format(fecha);
            
            final String output = fc1 + fc2.substring(0,1).toUpperCase() + fc2.substring(1,fc2.length());
            
            return output;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "";
        }
    }
        
        
	public String obtenerFechaFormatoDocumento(final Date fecha) {
		
		if (fecha == null) {
            return "";
        }
		Format formato = new SimpleDateFormat("MMMM");
		final String strMes = formato.format(fecha);
		
		formato = new SimpleDateFormat("dd");
		final String strDia = formato.format(fecha);
		
		formato = new SimpleDateFormat("yyyy");
		final String strAnio = formato.format(fecha);
		
		
		StringBuilder strFc = new StringBuilder();
		
		String prefijo = " a los ";
		String posfijo = "d\u00EDas";
		if (Integer.parseInt(strDia) == 1) {
			prefijo = " a ";
			posfijo = "d\u00EDa";
    	} 
		
        try {
        	strFc.append(prefijo).append(NumeroALetraConvertidor.convertNumberToLetter(strDia)).append(posfijo);        	
        	strFc.append(" del mes de ");
        	strFc.append(strMes).append(" del a\u00F1o ");
        	strFc.append(NumeroALetraConvertidorMiles.convertNumberToLetter(strAnio));
        	
        	logger.info(strFc.toString());
        	
        	return strFc.toString().trim().toLowerCase();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "";
        }
    }
	
	public String obtenerFechaFormatoDocumento1(final Date fecha) {
		
		if (fecha == null) {
            return "";
        }
		Format formato = new SimpleDateFormat("MMMM");
		final String strMes = formato.format(fecha);
		
		formato = new SimpleDateFormat("dd");
		final String strDia = formato.format(fecha);
		
		formato = new SimpleDateFormat("yyyy");
		final String strAnio = formato.format(fecha);
		
		
		StringBuilder strFc = new StringBuilder();
				
        try {
        	strFc.append(strDia);        	
        	strFc.append(" del mes de ");
        	strFc.append(strMes).append(" del a\u00F1o ");
        	strFc.append(strAnio);
        	
        	logger.info(strFc.toString());
        	
        	return strFc.toString().trim().toLowerCase();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return "";
        }
    }
        
        public Date formatearStringAFecha(String strFecha) throws ParseException{
             
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strFecha);
            
            
            return date;
        }
	
	public Date sumarDiasSinFinesDeSemana(final Date fcInicio, final Integer intDias) {
		
		if (intDias == null || intDias == 0) {
			return fcInicio;
		}
		
		final Calendar calendarFcInicio = Calendar.getInstance();
		calendarFcInicio.setTime(fcInicio);
		
		final Calendar calendarFcFinal = Calendar.getInstance();
		calendarFcFinal.setTime(fcInicio);
		calendarFcFinal.add(Calendar.DAY_OF_YEAR, intDias);
		
		int vueltas = 0;
		while (calendarFcInicio.before(calendarFcFinal)) {
			if ( vueltas > 0 &&
				(calendarFcInicio.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
				|| calendarFcInicio.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
				calendarFcFinal.add(Calendar.DATE, 1);
			}
			
			calendarFcInicio.add(Calendar.DATE, 1);
			vueltas++;
		}
		return calendarFcFinal.getTime();
	}
	
	public Integer formatearFechaSoloAnio(final Date fecha) {
		
        if (fecha == null) {
            return null;
        }
        
        try {
            final SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            //formato.setTimeZone(TimeZone.getTimeZone("CST"));
            final String strFcResultado = formato.format(fecha); 
            return Integer.parseInt(strFcResultado);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
	
}
