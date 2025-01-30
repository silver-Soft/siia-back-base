package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAlumnoActaOferta {

    @Id
    @Column(name = "IDACTA")
    private Long lngIdActa;
    
    @Column(name = "IDALUMNOACTA")
    private Long lngIdAlumnoActa;

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}

	public Long getLngIdAlumnoActa() {
		return lngIdAlumnoActa;
	}

	public void setLngIdAlumnoActa(Long lngIdAlumnoActa) {
		this.lngIdAlumnoActa = lngIdAlumnoActa;
	}
    
    
    
    
    
}
