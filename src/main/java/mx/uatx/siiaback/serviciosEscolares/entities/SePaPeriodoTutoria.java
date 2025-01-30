package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodoTutoria implements Serializable {

    @Id
    @Column(name = "IDPERIODOTUTORIA")
    private Long lngIdPeriodoTutoria;
    
    @Column(name = "IDPERIODO")
    private String strIdPeriodo;
    
    @Column(name = "PERIODO")
    private String strPeriodo;
    
    @Column(name = "NMTUTORIA")
    private Integer intNmTutoria;
    
    @Column(name = "FCINICIO")
    private Date fcInicio;
    
    @Column(name = "FCFIN")
    private Date fcFin;
    
    @Column(name = "IDAREACAMPUS")
    private Integer intIdAreaCampus;
    
    @Column(name = "IDPROGRAMACAMPUS")
    private Integer intIdProgramaCampus;
    
    @Column(name = "NBAREACAMPUS")
    private String strNbAreaCampus;  
    
    @Column(name = "NBPROGRAMACAMPUS")
    private String strNbProgramaCampus;
    
    @Column(name = "PERMISO")
    private String strPermiso;

    public String getStrIdPeriodo() {
        return strIdPeriodo;
    }

    public void setStrIdPeriodo(String strIdPeriodo) {
        this.strIdPeriodo = strIdPeriodo;
    }

    public Long getLngIdPeriodoTutoria() {
        return lngIdPeriodoTutoria;
    }

    public void setLngIdPeriodoTutoria(Long lngIdPeriodoTutoria) {
        this.lngIdPeriodoTutoria = lngIdPeriodoTutoria;
    }    

    public String getStrPeriodo() {
        return strPeriodo;
    }

    public void setStrPeriodo(String strPeriodo) {
        this.strPeriodo = strPeriodo;
    }

    public Integer getIntNmTutoria() {
        return intNmTutoria;
    }

    public void setIntNmTutoria(Integer intNmTutoria) {
        this.intNmTutoria = intNmTutoria;
    }

    public Date getFcInicio() {
        return fcInicio;
    }

    public void setFcInicio(Date fcInicio) {
        this.fcInicio = fcInicio;
    }

    public Date getFcFin() {
        return fcFin;
    }

    public void setFcFin(Date fcFin) {
        this.fcFin = fcFin;
    }

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrNbAreaCampus() {
		return strNbAreaCampus;
	}

	public void setStrNbAreaCampus(String strNbAreaCampus) {
		this.strNbAreaCampus = strNbAreaCampus;
	}

	public String getStrNbProgramaCampus() {
		return strNbProgramaCampus;
	}

	public void setStrNbProgramaCampus(String strNbProgramaCampus) {
		this.strNbProgramaCampus = strNbProgramaCampus;
	}

	public String getStrPermiso() {
		return strPermiso;
	}

	public void setStrPermiso(String strPermiso) {
		this.strPermiso = strPermiso;
	}
    
}
