package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAreas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5686587699045556570L;
	@Id
	@Column(name = "CLAREA")
	private Long lngClArea;

	@Column(name = "NBAREA")
	private String strNbArea;
	
	public SePaObtAreas() {
		super();
	}

	public Long getLngClArea() {
		return lngClArea;
	}

	public void setLngClArea(Long lngClArea) {
		this.lngClArea = lngClArea;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	
}
