package mx.uatx.siiaback.microsoft.graph.api;

import com.microsoft.aad.msal4j.ITokenCacheAccessAspect;
import com.microsoft.aad.msal4j.ITokenCacheAccessContext;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TokenCacheAspect implements ITokenCacheAccessAspect {

    private String data;

    public TokenCacheAspect(String fileName) {
        this.data = readDataFromFile(fileName);
    }

    @Override
    public void beforeCacheAccess(ITokenCacheAccessContext iTokenCacheAccessContext) {
        iTokenCacheAccessContext.tokenCache().deserialize(data);
    }

    @Override
    public void afterCacheAccess(ITokenCacheAccessContext iTokenCacheAccessContext) {
        data = iTokenCacheAccessContext.tokenCache().serialize();
        // you could implement logic here to write changes to file
    }

    private static String readDataFromFile(String resource) {
        try {
        	
        	/*ServletContext ctx = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    		final String realPath = ctx.getRealPath("/");
    		
    		StringBuilder strB = new StringBuilder();
    		
    		strB.append(realPath);
    		strB.append("/resources/");
    		strB.append(resource);*/
    		
    		Resource resourcee = new ClassPathResource(resource);
    		File file = resourcee.getFile();
        	
            //URL path = TokenCacheAspect.class.getResource(strB.toString());
            return new String(
                    Files.readAllBytes(
                            Paths.get(file.toString())));
        } catch (Exception ex){
            System.out.println("Error reading data from file: " + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }
}
