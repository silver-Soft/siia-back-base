package mx.uatx.siiaback.serviciosUniversitarios.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TitulacionHelper {
	
	
	
	File zip;
    ZipOutputStream output;

    public TitulacionHelper(){
    }
    
    public TitulacionHelper(File zip) throws FileNotFoundException{
        this.output = new ZipOutputStream(new FileOutputStream(zip));
    }

    private boolean zipFile(File file){
        try {
            byte[] buf = new byte[1024];
            output.putNextEntry(new ZipEntry(file.getPath()));
            FileInputStream fis = new FileInputStream(file);
              int len;
              while ((len = fis.read(buf)) > 0) {
                output.write(buf, 0, len);
              }
              fis.close();
              output.closeEntry();
              return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    private boolean zipDir(File file) {
        try {
            output.putNextEntry(new ZipEntry(file.getPath()+File.pathSeparator));
            output.closeEntry();
            return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    private boolean add(File... files){
        for (File file : files){
            if (file.isDirectory()){
                zipDir(file);
                add(file.listFiles());
            } else {
                zipFile(file);
            }
        }
        return true;
    }

    public void zip(File... files) throws IOException{
        add(files);
        output.finish();
        output.close();
    }
    
    
    public void generaZip(List<String> srcFiles, String strNombreZip){
    	try {
			

    		FileOutputStream fos = new FileOutputStream(strNombreZip);
    	
    		ZipOutputStream zipOut = new ZipOutputStream(fos);
        
    		for (String srcFile : srcFiles) {
    			
    			File fileToZip = new File(srcFile);
    			FileInputStream fis = new FileInputStream(fileToZip);
    			
    			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
    			zipOut.putNextEntry(zipEntry);
 
    			byte[] bytes = new byte[1024];
    			int length;
    			
    			while((length = fis.read(bytes)) >= 0) {
    				zipOut.write(bytes, 0, length);
    			}
    			
    			fis.close();
    		}
        	
    		zipOut.close();
    		
    		fos.close();
    		
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    
    public void crearArchivoXml(byte[] streamArray){
    	try {
    		
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			
			// elemento raiz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("soapenv:Envelope");
			
			
			
			Attr attr = doc.createAttribute("xmlns:soapenv");
			attr.setValue("http://schemas.xmlsoap.org/soap/envelope/");
			
			rootElement.setAttributeNode(attr);
			
			attr = doc.createAttribute("xmlns:sch");
			attr.setValue("http://ws.web.mec.sep.mx/schemas");
			
			rootElement.setAttributeNode(attr);
			
			
			doc.appendChild(rootElement);
			
			
			Element soapenvHeader = doc.createElement("soapenv:Header");

			rootElement.appendChild(soapenvHeader);
			
			
			Element soapenvBody = doc.createElement("soapenv:Body");

			
			Element schCargaTituloElectronicoRequest = doc.createElement("sch:cargaTituloElectronicoRequest");

			soapenvBody.appendChild(schCargaTituloElectronicoRequest);
			

			
			Element schNombreArchivo = doc.createElement("sch:nombreArchivo");
			
			schNombreArchivo.appendChild(doc.createTextNode("titulosUATx"));
			
			schCargaTituloElectronicoRequest.appendChild(schNombreArchivo);
			
			
			
			Element schArchivoBase64 = doc.createElement("sch:archivoBase64");

			schArchivoBase64.appendChild(doc.createTextNode(codificarBase64(streamArray)));
			
			schCargaTituloElectronicoRequest.appendChild(schArchivoBase64);
			
			
			
			Element schUsuario = doc.createElement("sch:usuario");
			
			schUsuario.appendChild(doc.createTextNode("Usuario"));

			schCargaTituloElectronicoRequest.appendChild(schUsuario);
			
			
			
			Element schPassword = doc.createElement("sch:password");
			
			schPassword.appendChild(doc.createTextNode("Password"));

			schCargaTituloElectronicoRequest.appendChild(schPassword);
			
			
			rootElement.appendChild(soapenvBody);
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("titulosUatx.xml"));
	 
			// Si se quiere mostrar por la consola...
			StreamResult result2 = new StreamResult(System.out);
			
			transformer.transform(source, result);
			
			
			
		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
    private String codificarBase64(byte[] bytesArchivoXml){
    	
    	
		
		try {
			String s = new sun.misc.BASE64Encoder().encode(bytesArchivoXml);
			
			return s;
			
		} catch (Exception e) {
			return null;
		}
		
    }
    
    
    public XMLGregorianCalendar convertirFechasAXMLCalendar(Date date) {
    	
    	
    		  DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    		  String strDate=dateFormat.format(date);
    		  
    		  try {
    		    XMLGregorianCalendar xmlDate=DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);
    		    return xmlDate;
    		  }
    		 catch (  DatatypeConfigurationException e) {
    		    throw new RuntimeException(e);
    		  }
    	
    }
    
    public byte[] ZipEntryToByteArray(ZipInputStream zis, ZipEntry zipEntry) throws IOException{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = zis.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }

        return out.toByteArray();
    }
    
    public byte[] unzipArchivoaByteArray (byte[] datos){
    
            try {
            	
            	ByteArrayInputStream byteStream = new ByteArrayInputStream(datos);
            	
            	
            
				byte[] buffer = new byte[1024];
				ZipInputStream zipStream = new ZipInputStream(byteStream);
		        ZipEntry zipEntry = zipStream.getNextEntry();
		        byte[] array = new byte[1024];
		        String fileName = "";
		        while(zipEntry != null){
		            fileName = zipEntry.getName();
		            File newFile = new File(fileName);
		            FileOutputStream fos = new FileOutputStream(newFile);
		            int len;
		            while ((len = zipStream.read(buffer)) > 0) {
		                fos.write(buffer, 0, len);
		            }		     
		            
		            fos.close();
		            zipEntry = zipStream.getNextEntry();
		            
		            
		        }
		        File archivoXLS = new File(fileName);
		        
		        zipStream.closeEntry();
		        zipStream.close();
		        
		        
		        array = Files.readAllBytes(archivoXLS.toPath());
				
				return array;
				
            
            } catch (IOException e) {
				e.printStackTrace();
				return null;
			}
        
           
    }

}
