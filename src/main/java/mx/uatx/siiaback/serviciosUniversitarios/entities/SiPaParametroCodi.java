package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaParametroCodi {
	
	@Id
    @Column(name="URL")
	private String strUrl;
	
	@Column(name="NAM")
	private String strNam;
	
	@Column(name="KEYSOURCE")
	private String strKeySource;
	
	@Column(name="ALIAS")
	private String strAlias;
	
	@Column(name="ACC")
	private String strAcc;
	
	@Column(name="DV")
	private String strDv;
	
	@Column(name="CLIENT")
	private String codiClient;
	
	@Column(name="REF")
	private String refCodi;

	public String getStrUrl() {
		return strUrl;
	}

	public void setStrUrl(String strUrl) {
		this.strUrl = strUrl;
	}

	public String getStrNam() {
		return strNam;
	}

	public void setStrNam(String strNam) {
		this.strNam = strNam;
	}

	public String getStrKeySource() {
		return strKeySource;
	}

	public void setStrKeySource(String strKeySource) {
		this.strKeySource = strKeySource;
	}

	public String getStrAlias() {
		return strAlias;
	}

	public void setStrAlias(String strAlias) {
		this.strAlias = strAlias;
	}

	public String getStrAcc() {
		return strAcc;
	}

	public void setStrAcc(String strAcc) {
		this.strAcc = strAcc;
	}

	public String getStrDv() {
		return strDv;
	}

	public void setStrDv(String strDv) {
		this.strDv = strDv;
	}

	public String getCodiClient() {
		return codiClient;
	}

	public void setCodiClient(String codiClient) {
		this.codiClient = codiClient;
	}

	public String getRefCodi() {
		return refCodi;
	}

	public void setRefCodi(String refCodi) {
		this.refCodi = refCodi;
	}

}
