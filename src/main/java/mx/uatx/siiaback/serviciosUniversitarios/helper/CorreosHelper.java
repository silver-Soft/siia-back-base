package mx.uatx.siiaback.serviciosUniversitarios.helper;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.uatx.siiaback.serviciosUniversitarios.dto.CorreosTO;
import mx.uatx.siiaback.serviciosUniversitarios.dto.ParametrosCorreoTO;

public class CorreosHelper implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4741393543479391608L;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private Properties properties;
	private Session session;

	private void init(final ParametrosCorreoTO parametros) {

		properties = new Properties();
		properties.put("mail.smtp.host", parametros.getStrHost());
		properties.put("mail.smtp.starttls.enable", parametros.getStrTls());
		properties.put("mail.smtp.port", parametros.getStrPuerto());
		properties.put("mail.smtp.mail.sender", parametros.getStrUsuario());
		properties.put("mail.smtp.user", parametros.getStrUsuario());
		properties.put("mail.smtp.auth", parametros.getStrAut());
		properties.put("mail.debug", parametros.getStrDebug());

		session = Session.getDefaultInstance(properties);
	}
	
	public void enviarCorreosEmail(final ParametrosCorreoTO parametros) throws UnsupportedEncodingException {

		init(parametros);
		
		for (CorreosTO it : parametros.getLstCorreos()) {
			enviarCorreoEmail(parametros, it);
		}

	}
	
	public void enviarCorreosEmailAdjunto(final ParametrosCorreoTO parametros) throws UnsupportedEncodingException {

		init(parametros);
		
		for (CorreosTO it : parametros.getLstCorreos()) {
			enviarCorreoEmailAdjunto(parametros, it);
		}

	}
	
	
	public void enviarCorreoEmail(final ParametrosCorreoTO parametros, final CorreosTO correo) throws UnsupportedEncodingException {

		init(parametros);
		
		try {
			final MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String) properties.get("mail.smtp.mail.sender"), parametros.getStrRemitente(), "UTF-8"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo.getStrCorreo()));
			if (correo.getStrCorreoOculto()!=null) {
				message.addRecipient(Message.RecipientType.BCC, new InternetAddress(correo.getStrCorreoOculto()));
			}
			message.setSubject(parametros.getStrAsunto(),"UTF-8");
			
			BodyPart text = new MimeBodyPart();
	        text.setContent(correo.getStrMensaje(), "text/html; charset=UTF-8");
	        
	        Multipart multipart = new MimeMultipart("alternative");
	        multipart.addBodyPart(text);
	        
	        message.setContent(multipart);
			
			final Transport t = session.getTransport("smtp");
			t.connect((String) properties.get("mail.smtp.user"), parametros.getStrContrasenia());
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		} catch (MessagingException e) {
			logger.error(e.getMessage(), e);
			return;
		}

	}
	
	public void enviarCorreoEmailAdjunto(final ParametrosCorreoTO parametros, final CorreosTO correo) throws UnsupportedEncodingException {

		init(parametros);
		
		try {
			final MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String) properties.get("mail.smtp.mail.sender"), parametros.getStrRemitente(), "UTF-8"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo.getStrCorreo()));
			message.setSubject(parametros.getStrAsunto(),"UTF-8");
			
			BodyPart text = new MimeBodyPart();
			BodyPart adjunto = new MimeBodyPart();
			
			 if(!correo.getStrRutaArchivo().equals("")) {
			adjunto.setDataHandler(new DataHandler(new FileDataSource(correo.getStrRutaArchivo())));
			adjunto.setFileName("tituloElectronicoCorreo.pdf");
			 }
	        text.setContent(correo.getStrMensaje(), "text/html; charset=UTF-8");
	        
	        Multipart multipart = new MimeMultipart("alternative");
	        multipart.addBodyPart(text);
	        
	        if(!correo.getStrRutaArchivo().equals("")) {
	        multipart.addBodyPart(adjunto);
	        }
	        
	        message.setContent(multipart);
			
			final Transport t = session.getTransport("smtp");
			t.connect((String) properties.get("mail.smtp.user"), parametros.getStrContrasenia());
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		} catch (MessagingException e) {
			logger.error(e.getMessage(), e);
			return;
		}

	}
	
	public void enviarCorreoEmailAdjuntoQR(final ParametrosCorreoTO parametros, final CorreosTO correo) throws UnsupportedEncodingException {

		init(parametros);
		
		try {
			final MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String) properties.get("mail.smtp.mail.sender"), parametros.getStrRemitente(), "UTF-8"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo.getStrCorreo()));
			message.setSubject(parametros.getStrAsunto(),"UTF-8");
			
			BodyPart text = new MimeBodyPart();
			BodyPart adjunto = new MimeBodyPart();
			
			 if(!correo.getStrRutaArchivo().equals("")) {
			adjunto.setDataHandler(new DataHandler(new FileDataSource(correo.getStrRutaArchivo())));
			adjunto.setFileName("RegistroVisitante.png");
			 }
	        text.setContent(correo.getStrMensaje(), "text/html; charset=UTF-8");
	        
	        Multipart multipart = new MimeMultipart("alternative");
	        multipart.addBodyPart(text);
	        
	        if(!correo.getStrRutaArchivo().equals("")) {
	        multipart.addBodyPart(adjunto);
	        }
	        
	        message.setContent(multipart);
			
			final Transport t = session.getTransport("smtp");
			t.connect((String) properties.get("mail.smtp.user"), parametros.getStrContrasenia());
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		} catch (MessagingException e) {
			logger.error(e.getMessage(), e);
			return;
		}

	}
	
	
	

}
