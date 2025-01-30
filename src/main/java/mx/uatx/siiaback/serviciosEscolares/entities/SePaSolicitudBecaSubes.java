package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSolicitudBecaSubes implements Serializable {

    @Id
    @Column(name = "IDREGISTROPRONABES")
    private Integer intIdRegistroPronabes;
    
    @Column(name = "TIENEFAMILIAROPORTUNIDADES")
    private Integer intTieneFamiliarOportunidades;
    
    @Column(name = "FOLIOFAMILIAROPORTUNIDADES")
    private String strFolioFamiliarOportunidades;
    
    @Column(name = "CLTIPOSOLICITUDBECA")
    private String strClTipoSolicitudBeca;
    
    @Column(name = "MNINGRESOFAMILIAR")
    private Long lngMnIngresoFamiliar;
    
    @Column(name = "NMINTEGRANTES")
    private Integer intNmIntegrantes;
    
    @Column(name = "FCSOLICITUD")
    private Date fcSolicitud;
    
    @Column(name = "CLSTSOLICITUD")
    private Integer intClStSolicitud;
    
    @Column(name = "IDPERIODO")
    private String strIdPeriodo;
    
    @Column(name = "CLTIPOBECAPRONABES")
    private Integer intClTipoBecaPronabes;
    
    @Column(name = "NBPROYECTOTITULACION")
    private String strNbProyectoTitulacion;
    
    @Column(name = "NBPOLIZASEGUROGASTOSMEDICOS")
    private String strNbPolizaSeguroGastosMedicos;
    
    @Column(name = "NMPOLIZASEGUROGASTOSMEDICOS")
    private String strNmPolizaSeguroGastosMedicos;
    
    @Column(name = "NBUNIVERSIDADDESTINO")
    private String strNbUniversidadDestino;
    
    @Column(name = "FCINICIO")
    private Date fcInicio;
    
    @Column(name = "FCTERMINO")
    private Date fcTermino;
    
    @Column(name = "NMPASAPORTE")
    private String strNmPasaporte;
    
    @Column(name = "NMMESEGRESO")
    private Integer intNmMesEgreso;
    
    @Column(name = "NMANIOEGRESO")
    private Integer intNmAnioEgreso;
    
    @Column(name = "NBDEPENDENCIASERVICIOSOCIAL")
    private String strNbDependenciaServicioSocial;
    
    @Column(name = "DSNIVELINGLES")
    private String strDsNivelIngles;
    
    @Column(name = "CLSTOTORGADA")
    private Integer intClStOtorgada;
    
    @Column(name = "NBPROGRAMASERVICIOSOCIAL")
    private String strNbProgramaServicioSocial;
    
    @Column(name = "NMHORASSERVICIOSOCIAL")
    private Integer intNmHorasServicioSocial;
    
    @Column(name = "NBASIGNATURATITULACION")
    private String strNbAsignaturaTitulacion;
    
    @Column(name = "METODOTITULACION")
    private Integer intMetodoTitulacion;
    
    @Column(name = "CLSTTITPOSPUESTAEMBARAZO")
    private Integer intClStTitposPuestaEmbarazo;
    
    @Column(name = "FCAUTORIZACIONTITULACION")
    private Date fcAutorizacionTitulacion;
    
    @Column(name = "FCOBTENCIONTITULACION")
    private Date fcObtencionTitulacion;
    
    @Column(name = "MONTOTRANSPORTE")
    private Integer intMontoTransporte;
    
    @Column(name = "TIPOTRANSPORTE")
    private String strTipoTransporte;
    
    @Column(name = "DSTIPOSOLICITUDBECA")
    private String strDsTipoSolicitudBeca;
    
    @Column(name = "DSPERIODOTEMPORADA")
    private String strDsPeriodoTemporada;
    
    @Column(name = "DSSTBECA")
    private String strDsStBeca;
    
    @Column(name = "DSTIPOBECAPRONABES")
    private String strDsTipoBecaPronabes;
    
    @Column(name = "IDTIPODISCAPACIDAD")
    private Long lngIdTipoDiscapacidad;
    
    @Column(name = "IDLENGUAINDIGENA")
    private Integer intIdGrupoIndigena;
    
    @Column(name = "CURP")
    private String strCurp;
    
    @Column(name = "MONTOTRANSPORTELETRA")
    private String strMontoTransporteLetra;

    @Column (name = "CICLO")
    private String strCiclo;
    
    @Column (name = "FOLIOSUBES")
    private String strFolioSubes;
    
    public String getStrNbPolizaSeguroGastosMedicos() {
        return strNbPolizaSeguroGastosMedicos;
    }

    public void setStrNbPolizaSeguroGastosMedicos(String strNbPolizaSeguroGastosMedicos) {
        this.strNbPolizaSeguroGastosMedicos = strNbPolizaSeguroGastosMedicos;
    }
    
    public Integer getIntIdRegistroPronabes() {
        return intIdRegistroPronabes;
    }

    public void setIntIdRegistroPronabes(Integer intIdRegistroPronabes) {
        this.intIdRegistroPronabes = intIdRegistroPronabes;
    }

    public Integer getIntTieneFamiliarOportunidades() {
        return intTieneFamiliarOportunidades;
    }

    public void setIntTieneFamiliarOportunidades(Integer intTieneFamiliarOportunidades) {
        this.intTieneFamiliarOportunidades = intTieneFamiliarOportunidades;
    }

    public String getStrFolioFamiliarOportunidades() {
        return strFolioFamiliarOportunidades;
    }

    public void setStrFolioFamiliarOportunidades(String strFolioFamiliarOportunidades) {
        this.strFolioFamiliarOportunidades = strFolioFamiliarOportunidades;
    }

    public String getStrClTipoSolicitudBeca() {
        return strClTipoSolicitudBeca;
    }

    public void setStrClTipoSolicitudBeca(String strClTipoSolicitudBeca) {
        this.strClTipoSolicitudBeca = strClTipoSolicitudBeca;
    }

    public Long getLngMnIngresoFamiliar() {
        return lngMnIngresoFamiliar;
    }

    public void setLngMnIngresoFamiliar(Long lngMnIngresoFamiliar) {
        this.lngMnIngresoFamiliar = lngMnIngresoFamiliar;
    }

    public Integer getIntNmIntegrantes() {
        return intNmIntegrantes;
    }

    public void setIntNmIntegrantes(Integer intNmIntegrantes) {
        this.intNmIntegrantes = intNmIntegrantes;
    }

    public Date getFcSolicitud() {
        return fcSolicitud;
    }

    public void setFcSolicitud(Date fcSolicitud) {
        this.fcSolicitud = fcSolicitud;
    }

    public Integer getIntClStSolicitud() {
        return intClStSolicitud;
    }

    public void setIntClStSolicitud(Integer intClStSolicitud) {
        this.intClStSolicitud = intClStSolicitud;
    }

    public String getStrIdPeriodo() {
        return strIdPeriodo;
    }

    public void setStrIdPeriodo(String strIdPeriodo) {
        this.strIdPeriodo = strIdPeriodo;
    }

    public Integer getIntClTipoBecaPronabes() {
        return intClTipoBecaPronabes;
    }

    public void setIntClTipoBecaPronabes(Integer intClTipoBecaPronabes) {
        this.intClTipoBecaPronabes = intClTipoBecaPronabes;
    }

    public String getStrNbProyectoTitulacion() {
        return strNbProyectoTitulacion;
    }

    public void setStrNbProyectoTitulacion(String strNbProyectoTitulacion) {
        this.strNbProyectoTitulacion = strNbProyectoTitulacion;
    }

    public String getStrNmPolizaSeguroGastosMedicos() {
        return strNmPolizaSeguroGastosMedicos;
    }

    public void setStrNmPolizaSeguroGastosMedicos(String strNmPolizaSeguroGastosMedicos) {
        this.strNmPolizaSeguroGastosMedicos = strNmPolizaSeguroGastosMedicos;
    }

    public String getStrNbUniversidadDestino() {
        return strNbUniversidadDestino;
    }

    public void setStrNbUniversidadDestino(String strNbUniversidadDestino) {
        this.strNbUniversidadDestino = strNbUniversidadDestino;
    }

    public Date getFcInicio() {
        return fcInicio;
    }

    public void setFcInicio(Date fcInicio) {
        this.fcInicio = fcInicio;
    }

    public Date getFcTermino() {
        return fcTermino;
    }

    public void setFcTermino(Date fcTermino) {
        this.fcTermino = fcTermino;
    }

    public String getStrNmPasaporte() {
        return strNmPasaporte;
    }

    public void setStrNmPasaporte(String strNmPasaporte) {
        this.strNmPasaporte = strNmPasaporte;
    }

    public Integer getIntNmMesEgreso() {
        return intNmMesEgreso;
    }

    public void setIntNmMesEgreso(Integer intNmMesEgreso) {
        this.intNmMesEgreso = intNmMesEgreso;
    }

    public Integer getIntNmAnioEgreso() {
        return intNmAnioEgreso;
    }

    public void setIntNmAnioEgreso(Integer intNmAnioEgreso) {
        this.intNmAnioEgreso = intNmAnioEgreso;
    }

    public String getStrNbDependenciaServicioSocial() {
        return strNbDependenciaServicioSocial;
    }

    public void setStrNbDependenciaServicioSocial(String strNbDependenciaServicioSocial) {
        this.strNbDependenciaServicioSocial = strNbDependenciaServicioSocial;
    }

    public String getStrDsNivelIngles() {
        return strDsNivelIngles;
    }

    public void setStrDsNivelIngles(String strDsNivelIngles) {
        this.strDsNivelIngles = strDsNivelIngles;
    }

    public Integer getIntClStOtorgada() {
        return intClStOtorgada;
    }

    public void setIntClStOtorgada(Integer intClStOtorgada) {
        this.intClStOtorgada = intClStOtorgada;
    }

    public String getStrNbProgramaServicioSocial() {
        return strNbProgramaServicioSocial;
    }

    public void setStrNbProgramaServicioSocial(String strNbProgramaServicioSocial) {
        this.strNbProgramaServicioSocial = strNbProgramaServicioSocial;
    }

    public Integer getIntNmHorasServicioSocial() {
        return intNmHorasServicioSocial;
    }

    public void setIntNmHorasServicioSocial(Integer intNmHorasServicioSocial) {
        this.intNmHorasServicioSocial = intNmHorasServicioSocial;
    }

    public String getStrNbAsignaturaTitulacion() {
        return strNbAsignaturaTitulacion;
    }

    public void setStrNbAsignaturaTitulacion(String strNbAsignaturaTitulacion) {
        this.strNbAsignaturaTitulacion = strNbAsignaturaTitulacion;
    }

    public Integer getIntMetodoTitulacion() {
        return intMetodoTitulacion;
    }

    public void setIntMetodoTitulacion(Integer intMetodoTitulacion) {
        this.intMetodoTitulacion = intMetodoTitulacion;
    }

    public Integer getIntClStTitposPuestaEmbarazo() {
        return intClStTitposPuestaEmbarazo;
    }

    public void setIntClStTitposPuestaEmbarazo(Integer intClStTitposPuestaEmbarazo) {
        this.intClStTitposPuestaEmbarazo = intClStTitposPuestaEmbarazo;
    }

    public Date getFcAutorizacionTitulacion() {
        return fcAutorizacionTitulacion;
    }

    public void setFcAutorizacionTitulacion(Date fcAutorizacionTitulacion) {
        this.fcAutorizacionTitulacion = fcAutorizacionTitulacion;
    }

    public Date getFcObtencionTitulacion() {
        return fcObtencionTitulacion;
    }

    public void setFcObtencionTitulacion(Date fcObtencionTitulacion) {
        this.fcObtencionTitulacion = fcObtencionTitulacion;
    }

    public Integer getIntMontoTransporte() {
        return intMontoTransporte;
    }

    public void setIntMontoTransporte(Integer intMontoTransporte) {
        this.intMontoTransporte = intMontoTransporte;
    }

    public String getStrTipoTransporte() {
        return strTipoTransporte;
    }

    public void setStrTipoTransporte(String strTipoTransporte) {
        this.strTipoTransporte = strTipoTransporte;
    }

    

    public String getStrDsTipoSolicitudBeca() {
        return strDsTipoSolicitudBeca;
    }

    public void setStrDsTipoSolicitudBeca(String strDsTipoSolicitudBeca) {
        this.strDsTipoSolicitudBeca = strDsTipoSolicitudBeca;
    }

    public String getStrDsPeriodoTemporada() {
        return strDsPeriodoTemporada;
    }

    public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
        this.strDsPeriodoTemporada = strDsPeriodoTemporada;
    }

    public String getStrDsStBeca() {
        return strDsStBeca;
    }

    public void setStrDsStBeca(String strDsStBeca) {
        this.strDsStBeca = strDsStBeca;
    }

    public String getStrDsTipoBecaPronabes() {
        return strDsTipoBecaPronabes;
    }

    public void setStrDsTipoBecaPronabes(String strDsTipoBecaPronabes) {
        this.strDsTipoBecaPronabes = strDsTipoBecaPronabes;
    }

    public Long getLngIdTipoDiscapacidad() {
        return lngIdTipoDiscapacidad;
    }

    public void setLngIdTipoDiscapacidad(Long lngIdTipoDiscapacidad) {
        this.lngIdTipoDiscapacidad = lngIdTipoDiscapacidad;
    }

    public Integer getIntIdGrupoIndigena() {
        return intIdGrupoIndigena;
    }

    public void setIntIdGrupoIndigena(Integer intIdGrupoIndigena) {
        this.intIdGrupoIndigena = intIdGrupoIndigena;
    }

    public String getStrCurp() {
        return strCurp;
    }

    public void setStrCurp(String strCurp) {
        this.strCurp = strCurp;
    }

    public String getStrMontoTransporteLetra() {
        return strMontoTransporteLetra;
    }

    public void setStrMontoTransporteLetra(String strMontoTransporteLetra) {
        this.strMontoTransporteLetra = strMontoTransporteLetra;
    }

    public String getStrCiclo() {
        return strCiclo;
    }

    public void setStrCiclo(String strCiclo) {
        this.strCiclo = strCiclo;
    }

	public String getStrFolioSubes() {
		return strFolioSubes;
	}

	public void setStrFolioSubes(String strFolioSubes) {
		this.strFolioSubes = strFolioSubes;
	}
    
    
}
