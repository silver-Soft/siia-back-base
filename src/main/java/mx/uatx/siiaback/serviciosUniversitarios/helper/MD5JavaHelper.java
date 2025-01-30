package mx.uatx.siiaback.serviciosUniversitarios.helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5JavaHelper {
	/**
	*
	*/
	private static final long serialVersionUID = -1959140454426388802L;

	/**
	* Metodo que encripta una cadena
	*
	* @param cadena
	* @return
	*/
	public String md5(final String cadena) {
	String md5val = "";
	MessageDigest algorithm = null;

	try {
	algorithm = MessageDigest.getInstance("MD5");
	} catch (NoSuchAlgorithmException nsae) {

	}

	byte[] defaultBytes = cadena.getBytes();
	algorithm.reset();
	algorithm.update(defaultBytes);
	byte messageDigest[] = algorithm.digest();
	StringBuffer hexString = new StringBuffer();

	for (int i = 0; i < messageDigest.length; i++) {
	String hex = Integer.toHexString(0xFF & messageDigest[i]);
	if (hex.length() == 1) {
	hexString.append('0');
	}
	hexString.append(hex);
	}
	md5val = hexString.toString();
	return md5val;
	}

}
