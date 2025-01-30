

package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SeAxPeriodosTutorias;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtPeriodosTutoriasTutor;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaPeriodoTutoria;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;

public class PeriodoTutoriaTO implements Serializable{

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5052252182695312235L;
	
	private String strIdPeriodo;
    private Long lngIdPeriodoTutoria;
    private String strPeriodo;
    private String strFcInicio;
    private String strFcFin;
    private Date fcInicio;
    private Date fcFin;
    private Integer intNmTutoria;
    private String strUsuarioAudit;
    private Date fcAudit;
    private Integer intIdAreaCampus;
    private Integer intIdProgramaCampus;
    private String strNbAreaCampus;     
    private String strNbProgramaCampus;
    private String strPermiso;

    public PeriodoTutoriaTO(SePaPeriodoTutoria perTuto, FechaHelper fcHelper) {
        
        this.strIdPeriodo = perTuto.getStrIdPeriodo();
        this.lngIdPeriodoTutoria = perTuto.getLngIdPeriodoTutoria();
        this.strPeriodo = perTuto.getStrPeriodo();
        this.intNmTutoria = perTuto.getIntNmTutoria();
        this.fcInicio = perTuto.getFcInicio();
        this.fcFin = perTuto.getFcFin();
        this.strFcInicio = fcHelper.formatearFecha(perTuto.getFcInicio());
        this.strFcFin = fcHelper.formatearFecha(perTuto.getFcFin());
        this.intIdAreaCampus = perTuto.getIntIdAreaCampus();
        this.intIdProgramaCampus =  perTuto.getIntIdProgramaCampus();
        this.strNbAreaCampus = perTuto.getStrNbAreaCampus();
        this.strNbProgramaCampus = perTuto.getStrNbProgramaCampus();
        this.strPermiso = perTuto.getStrPermiso();
        
    }
    
    public PeriodoTutoriaTO(final SePaObtPeriodosTutoriasTutor entidad) {
    	BeanUtils.copyProperties(entidad, this);
    }
    
    public PeriodoTutoriaTO(){		
	}
    
    public SeAxPeriodosTutorias obtenerEntidad(PeriodoTutoriaTO perTuto){
        
        SeAxPeriodosTutorias entidad = new SeAxPeriodosTutorias();
        
        entidad.setFcAudit(perTuto.getFcAudit());
        entidad.setFcFin(perTuto.getFcFin());
        entidad.setFcInicio(perTuto.getFcInicio());
        entidad.setIntNmTutoria(perTuto.getIntNmTutoria());
        entidad.setLngIdPeriodoTutoria(perTuto.getLngIdPeriodoTutoria());
        entidad.setStrIdPeriodo(perTuto.getStrIdPeriodo());
        entidad.setStrUsuarioAudit(perTuto.getStrUsuarioAudit());
        entidad.setIntIdAreaCampus(perTuto.getIntIdAreaCampus());
        entidad.setIntIdProgramaCampus(perTuto.getIntIdProgramaCampus());
        entidad.setStrPermiso(perTuto.getStrPermiso());
        return entidad;
        
    }
    
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

    public Integer getIntNmTutoria() {
        return intNmTutoria;
    }

    public void setIntNmTutoria(Integer intNmTutoria) {
        this.intNmTutoria = intNmTutoria;
    }

    public String getStrUsuarioAudit() {
        return strUsuarioAudit;
    }

    public void setStrUsuarioAudit(String strUsuarioAudit) {
        this.strUsuarioAudit = strUsuarioAudit;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

    public String getStrPeriodo() {
        return strPeriodo;
    }

    public void setStrPeriodo(String strPeriodo) {
        this.strPeriodo = strPeriodo;
    }

    public String getStrFcInicio() {
        return strFcInicio;
    }

    public void setStrFcInicio(String strFcInicio) {
        this.strFcInicio = strFcInicio;
    }

    public String getStrFcFin() {
        return strFcFin;
    }

    public void setStrFcFin(String strFcFin) {
        this.strFcFin = strFcFin;
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
