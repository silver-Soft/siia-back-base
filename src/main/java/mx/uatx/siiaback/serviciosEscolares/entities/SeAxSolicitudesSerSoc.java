/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXSOLICITUDESSERSOC")
public class SeAxSolicitudesSerSoc implements Serializable {

    private static final String GENID_SEAXSOLICITUDESSERSOC = "GENID_SEAXSOLICITUDESSERSOC";

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = GENID_SEAXSOLICITUDESSERSOC, sequenceName = "SERESC.ID_SEAXSOLICITUDESSERSOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEAXSOLICITUDESSERSOC)
    @Column(name = "ID_SEAXSOLICITUDESSERSOC")
    private Long lngIdSeAxSolicitudesSerSoc;
    
    @Column(name = "IDHISTORIALACADEMICO")
    private Long lngIdHistorialAcademico;
    
    @Column(name = "FC_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcSolicitud;
    
    @Column(name = "NB_JEFE", length = 50)
    private String strNbJefe;
    
    @Column(name = "CARGO_JEFE", length = 100)
    private String strCargoJefe;
    
    @Column(name = "IDPERIODO", length = 45)
    private String strIdPeriodo;
    
    @Column(name = "HORARIO", length = 45)
    private String strHorario;
    
    @Column(name = "TURNO", length = 10)
    private String strTurno;
    
    @Column(name = "ESTATUS", length = 15)
    private String strEstatus;
    
    @Column(name = "TURNO_ALUMNO", length = 10)
    private String strTurnoAlumno;
    
    @Column(name = "GRUPO_ALUMNO", length = 1)
    private String strGrupoAlumno;
    
    @Column(name = "FC_SOLGENERADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcSolGenerada;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;
    
    @Column(name = "NBPERSONACARTA")
    private String strNbPersonaCarta;
    
    @Column(name = "CARGOPERSONACARTA")
    private String strCargoPersonaCarta;
    
    @Column(name = "FCSOLCARTATERMINACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcSolCartaTerminacion;
    
    @Column(name = "FCGENERACIONCONSTERM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcGeneracionConsTerm;
    
    @Column(name = "FIRMAJEFESERSOC")
    private String firmaJefeSerSoc;
    
    @Column(name = "FCFIRMAJEFESERSOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcFirmaJefeSerSoc;
    
    @Column(name = "IDPERSONAJEFESERSOC")
    private Long idPersonaJefeSerSoc;
    
    @Column(name = "CERTIFICADOJEFESERSOC")
    private String certificadoJefeSerSoc;
    
    @Column(name = "NOCERTIFICADOJEFESERSOC")
    private String noCertificadoJefeSerSoc;
    
    @Column(name = "CADENAORIGINALJEFESERSOC")
    private String cadenaOriginalJefeSerSoc;
    
    @Column(name = "FIRMASECEXTENSION")
    private String firmaSecExtension;
    
    @Column(name = "FCFIRMASECEXTENSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcFirmaSecExtension;
    
    @Column(name = "IDPERSONASECEXTENSION")
    private Long idPersonaSecExtension;
    
    @Column(name = "CERTIFICADOSECEXTENSION")
    private String certificadoSecExtension;
    
    @Column(name = "NOCERTIFICADOSECEXTENSION")
    private String noCertificadoSecExtension;
    
    @Column(name = "CADENAORIGINALSECEXTENSION")
    private String cadenaOriginalSecExtension;
    
    @Column(name = "CERTIFICADORESPUAT")
    private String certificadoRespUat;
    
    @Column(name = "NOCERTIFICADORESPUAT")
    private String noCertificadoRespUat;
    
    @Column(name = "FCSELLADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcSellado;
    
    @Column(name = "CADENAORIGINALSELLADO")
    private String cadenaOriginalSellado;
    
    @Column(name = "SELLO")
    private String sello;
    
    @Column(name = "CORREOJEFE")
	private String strCorreoJefe;
    
    @JoinColumn(name = "PER_ID_SEAXPERIODOSSERVICIO", referencedColumnName = "ID_SEAXPERIODOSSERVICIO")
    @ManyToOne(cascade = CascadeType.ALL)
    private SeAxPeriodosServicio perIdSeAxPeriodosServicio;
    
    @JoinColumn(name = "PROG_ID_SEAXPROGRAMASSERSOC", referencedColumnName = "ID_SEAXPROGRAMASSERSOC")
    @ManyToOne(cascade = CascadeType.ALL)
    private SeAxProgramasSerSoc progIdSeAxProgramasSerSoc;
    

    public SeAxSolicitudesSerSoc() {
    }

    public Long getLngIdHistorialAcademico() {
        return lngIdHistorialAcademico;
    }

    public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
        this.lngIdHistorialAcademico = lngIdHistorialAcademico;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

    public String getStrUsuarioAudit() {
        return strUsuarioAudit;
    }

    public void setStrUsuarioAudit(String strUsuarioAudit) {
        this.strUsuarioAudit = strUsuarioAudit;
    }

    /**
     * @return the perIdSeAxPeriodosServicio
     */
    public SeAxPeriodosServicio getPerIdSeAxPeriodosServicio() {
        return perIdSeAxPeriodosServicio;
    }

    /**
     * @param perIdSeAxPeriodosServicio the perIdSeAxPeriodosServicio to set
     */
    public void setPerIdSeAxPeriodosServicio(SeAxPeriodosServicio perIdSeAxPeriodosServicio) {
        this.perIdSeAxPeriodosServicio = perIdSeAxPeriodosServicio;
    }

    /**
     * @return the progIdSeAxProgramasSerSoc
     */
    public SeAxProgramasSerSoc getProgIdSeAxProgramasSerSoc() {
        return progIdSeAxProgramasSerSoc;
    }

    /**
     * @param progIdSeAxProgramasSerSoc the progIdSeAxProgramasSerSoc to set
     */
    public void setProgIdSeAxProgramasSerSoc(SeAxProgramasSerSoc progIdSeAxProgramasSerSoc) {
        this.progIdSeAxProgramasSerSoc = progIdSeAxProgramasSerSoc;
    }

    /**
     * @return the lngIdSeAxSolicitudesSerSoc
     */
    public Long getLngIdSeAxSolicitudesSerSoc() {
        return lngIdSeAxSolicitudesSerSoc;
    }

    /**
     * @param lngIdSeAxSolicitudesSerSoc the lngIdSeAxSolicitudesSerSoc to set
     */
    public void setLngIdSeAxSolicitudesSerSoc(Long lngIdSeAxSolicitudesSerSoc) {
        this.lngIdSeAxSolicitudesSerSoc = lngIdSeAxSolicitudesSerSoc;
    }

    /**
     * @return the strNbJefe
     */
    public String getStrNbJefe() {
        return strNbJefe;
    }

    /**
     * @param strNbJefe the strNbJefe to set
     */
    public void setStrNbJefe(String strNbJefe) {
        this.strNbJefe = strNbJefe;
    }

    /**
     * @return the strCargoJefe
     */
    public String getStrCargoJefe() {
        return strCargoJefe;
    }

    /**
     * @param strCargoJefe the strCargoJefe to set
     */
    public void setStrCargoJefe(String strCargoJefe) {
        this.strCargoJefe = strCargoJefe;
    }

    public String getStrIdPeriodo() {
        return strIdPeriodo;
    }

    public void setStrIdPeriodo(String strIdPeriodo) {
        this.strIdPeriodo = strIdPeriodo;
    }

    

    /**
     * @return the strHorario
     */
    public String getStrHorario() {
        return strHorario;
    }

    /**
     * @param strHorario the strHorario to set
     */
    public void setStrHorario(String strHorario) {
        this.strHorario = strHorario;
    }

    /**
     * @return the strTurno
     */
    public String getStrTurno() {
        return strTurno;
    }

    /**
     * @param strTurno the strTurno to set
     */
    public void setStrTurno(String strTurno) {
        this.strTurno = strTurno;
    }

    /**
     * @return the strEstatus
     */
    public String getStrEstatus() {
        return strEstatus;
    }

    /**
     * @param strEstatus the strEstatus to set
     */
    public void setStrEstatus(String strEstatus) {
        this.strEstatus = strEstatus;
    }

    /**
     * @return the strTurnoAlumno
     */
    public String getStrTurnoAlumno() {
        return strTurnoAlumno;
    }

    /**
     * @param strTurnoAlumno the strTurnoAlumno to set
     */
    public void setStrTurnoAlumno(String strTurnoAlumno) {
        this.strTurnoAlumno = strTurnoAlumno;
    }

    /**
     * @return the strGrupoAlumno
     */
    public String getStrGrupoAlumno() {
        return strGrupoAlumno;
    }

    /**
     * @param strGrupoAlumno the strGrupoAlumno to set
     */
    public void setStrGrupoAlumno(String strGrupoAlumno) {
        this.strGrupoAlumno = strGrupoAlumno;
    }

    /**
     * @return the fcSolicitud
     */
    public Date getFcSolicitud() {
        return fcSolicitud;
    }

    /**
     * @param fcSolicitud the fcSolicitud to set
     */
    public void setFcSolicitud(Date fcSolicitud) {
        this.fcSolicitud = fcSolicitud;
    }

    /**
     * @return the fcSolGenerada
     */
    public Date getFcSolGenerada() {
        return fcSolGenerada;
    }

    /**
     * @param fcSolGenerada the fcSolGenerada to set
     */
    public void setFcSolGenerada(Date fcSolGenerada) {
        this.fcSolGenerada = fcSolGenerada;
    }

    public String getStrNbPersonaCarta() {
        return strNbPersonaCarta;
    }

    public void setStrNbPersonaCarta(String strNbPersonaCarta) {
        this.strNbPersonaCarta = strNbPersonaCarta;
    }

    public String getStrCargoPersonaCarta() {
        return strCargoPersonaCarta;
    }

    public void setStrCargoPersonaCarta(String strCargoPersonaCarta) {
        this.strCargoPersonaCarta = strCargoPersonaCarta;
    }

	public Date getFcSolCartaTerminacion() {
		return fcSolCartaTerminacion;
	}

	public void setFcSolCartaTerminacion(Date fcSolCartaTerminacion) {
		this.fcSolCartaTerminacion = fcSolCartaTerminacion;
	}

	public Date getFcGeneracionConsTerm() {
		return fcGeneracionConsTerm;
	}

	public void setFcGeneracionConsTerm(Date fcGeneracionConsTerm) {
		this.fcGeneracionConsTerm = fcGeneracionConsTerm;
	}

	public String getFirmaJefeSerSoc() {
		return firmaJefeSerSoc;
	}

	public void setFirmaJefeSerSoc(String firmaJefeSerSoc) {
		this.firmaJefeSerSoc = firmaJefeSerSoc;
	}

	public Date getFcFirmaJefeSerSoc() {
		return fcFirmaJefeSerSoc;
	}

	public void setFcFirmaJefeSerSoc(Date fcFirmaJefeSerSoc) {
		this.fcFirmaJefeSerSoc = fcFirmaJefeSerSoc;
	}

	public Long getIdPersonaJefeSerSoc() {
		return idPersonaJefeSerSoc;
	}

	public void setIdPersonaJefeSerSoc(Long idPersonaJefeSerSoc) {
		this.idPersonaJefeSerSoc = idPersonaJefeSerSoc;
	}

	public String getCertificadoJefeSerSoc() {
		return certificadoJefeSerSoc;
	}

	public void setCertificadoJefeSerSoc(String certificadoJefeSerSoc) {
		this.certificadoJefeSerSoc = certificadoJefeSerSoc;
	}

	public String getNoCertificadoJefeSerSoc() {
		return noCertificadoJefeSerSoc;
	}

	public void setNoCertificadoJefeSerSoc(String noCertificadoJefeSerSoc) {
		this.noCertificadoJefeSerSoc = noCertificadoJefeSerSoc;
	}

	public String getCadenaOriginalJefeSerSoc() {
		return cadenaOriginalJefeSerSoc;
	}

	public void setCadenaOriginalJefeSerSoc(String cadenaOriginalJefeSerSoc) {
		this.cadenaOriginalJefeSerSoc = cadenaOriginalJefeSerSoc;
	}

	public String getFirmaSecExtension() {
		return firmaSecExtension;
	}

	public void setFirmaSecExtension(String firmaSecExtension) {
		this.firmaSecExtension = firmaSecExtension;
	}

	public Date getFcFirmaSecExtension() {
		return fcFirmaSecExtension;
	}

	public void setFcFirmaSecExtension(Date fcFirmaSecExtension) {
		this.fcFirmaSecExtension = fcFirmaSecExtension;
	}

	public Long getIdPersonaSecExtension() {
		return idPersonaSecExtension;
	}

	public void setIdPersonaSecExtension(Long idPersonaSecExtension) {
		this.idPersonaSecExtension = idPersonaSecExtension;
	}

	public String getCertificadoSecExtension() {
		return certificadoSecExtension;
	}

	public void setCertificadoSecExtension(String certificadoSecExtension) {
		this.certificadoSecExtension = certificadoSecExtension;
	}

	public String getNoCertificadoSecExtension() {
		return noCertificadoSecExtension;
	}

	public void setNoCertificadoSecExtension(String noCertificadoSecExtension) {
		this.noCertificadoSecExtension = noCertificadoSecExtension;
	}

	public String getCadenaOriginalSecExtension() {
		return cadenaOriginalSecExtension;
	}

	public void setCadenaOriginalSecExtension(String cadenaOriginalSecExtension) {
		this.cadenaOriginalSecExtension = cadenaOriginalSecExtension;
	}

	public String getCertificadoRespUat() {
		return certificadoRespUat;
	}

	public void setCertificadoRespUat(String certificadoRespUat) {
		this.certificadoRespUat = certificadoRespUat;
	}

	public String getNoCertificadoRespUat() {
		return noCertificadoRespUat;
	}

	public void setNoCertificadoRespUat(String noCertificadoRespUat) {
		this.noCertificadoRespUat = noCertificadoRespUat;
	}

	public Date getFcSellado() {
		return fcSellado;
	}

	public void setFcSellado(Date fcSellado) {
		this.fcSellado = fcSellado;
	}

	public String getCadenaOriginalSellado() {
		return cadenaOriginalSellado;
	}

	public void setCadenaOriginalSellado(String cadenaOriginalSellado) {
		this.cadenaOriginalSellado = cadenaOriginalSellado;
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public static String getGenidSeaxsolicitudessersoc() {
		return GENID_SEAXSOLICITUDESSERSOC;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStrCorreoJefe() {
		return strCorreoJefe;
	}

	public void setStrCorreoJefe(String strCorreoJefe) {
		this.strCorreoJefe = strCorreoJefe;
	}

    
    
}
