package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.util.ArrayList;
import java.util.List;

public class DatosGeneralesReporteTutoriasTO {

	private Long lngId;

	private String strPeriodo;

	private String strProgramaCampus;

	private String strResponsable;
	
	private Integer intMatriculaTotal;

	private List<ReporteResponsablesTutoriasTO> lstResponsables = new ArrayList<>();
	
	private List<DatosReporteMatriculaTutorias> lstMatricula = new ArrayList<>();

	private List<ReportePlanTrabajoTutoriasTO> lstPlan = new ArrayList<>();

	private List<ReporteProyectoVidaTutoriasTO> lstReporte = new ArrayList<>();

	List<PeriodoReporteTutoresJornadaTO> lstPeriodo = new ArrayList<>();

	List<ResumenReporteTutoresJornadaTO> lstResumen = new ArrayList<>();
	
	List<ResumenMatriculaRepTutoriasTO> lstResumenMatricula = new ArrayList<>();

	List<DatosReporteTutoresJornadaTO> lstDatosJornada = new ArrayList<>();
	
	List<ReporteProyectoVidaTutoriasTO> lstProyecto = new ArrayList<ReporteProyectoVidaTutoriasTO>();
	
	List<ReporteBitacoraTutoriasTO> lstBitacora = new ArrayList<>();
	
	List<ReporteTutoresTutoriasTO> lstTutores = new ArrayList<ReporteTutoresTutoriasTO>();
	
	List<ReporteMovilidadTutoriasTO> lstMovilidad = new ArrayList<ReporteMovilidadTutoriasTO>();
	

	public List<ReporteProyectoVidaTutoriasTO> getLstProyecto() {
		return lstProyecto;
	}

	public void setLstProyecto(List<ReporteProyectoVidaTutoriasTO> lstProyecto) {
		this.lstProyecto = lstProyecto;
	}

	public DatosGeneralesReporteTutoriasTO() {
		super();
	}

	public Long getLngId() {
		return lngId;
	}

	public void setLngId(Long lngId) {
		this.lngId = lngId;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrResponsable() {
		return strResponsable;
	}

	public void setStrResponsable(String strResponsable) {
		this.strResponsable = strResponsable;
	}

	public List<ReporteResponsablesTutoriasTO> getLstResponsables() {
		return lstResponsables;
	}

	public void setLstResponsables(List<ReporteResponsablesTutoriasTO> lstResponsables) {
		this.lstResponsables = lstResponsables;
	}

	public List<ReportePlanTrabajoTutoriasTO> getLstPlan() {
		return lstPlan;
	}

	public void setLstPlan(List<ReportePlanTrabajoTutoriasTO> lstPlan) {
		this.lstPlan = lstPlan;
	}

	public List<ReporteProyectoVidaTutoriasTO> getLstReporte() {
		return lstReporte;
	}

	public void setLstReporte(List<ReporteProyectoVidaTutoriasTO> lstReporte) {
		this.lstReporte = lstReporte;
	}

	public List<PeriodoReporteTutoresJornadaTO> getLstPeriodo() {
		return lstPeriodo;
	}

	public void setLstPeriodo(List<PeriodoReporteTutoresJornadaTO> lstPeriodo) {
		this.lstPeriodo = lstPeriodo;
	}

	public List<ResumenReporteTutoresJornadaTO> getLstResumen() {
		return lstResumen;
	}

	public void setLstResumen(List<ResumenReporteTutoresJornadaTO> lstResumen) {
		this.lstResumen = lstResumen;
	}

	public List<DatosReporteTutoresJornadaTO> getLstDatosJornada() {
		return lstDatosJornada;
	}

	public void setLstDatosJornada(List<DatosReporteTutoresJornadaTO> lstDatosJornada) {
		this.lstDatosJornada = lstDatosJornada;
	}

	public List<DatosReporteMatriculaTutorias> getLstMatricula() {
		return lstMatricula;
	}

	public void setLstMatricula(List<DatosReporteMatriculaTutorias> lstMatricula) {
		this.lstMatricula = lstMatricula;
	}

	public List<ReporteBitacoraTutoriasTO> getLstBitacora() {
		return lstBitacora;
	}

	public void setLstBitacora(List<ReporteBitacoraTutoriasTO> lstBitacora) {
		this.lstBitacora = lstBitacora;
	}

	public List<ResumenMatriculaRepTutoriasTO> getLstResumenMatricula() {
		return lstResumenMatricula;
	}

	public void setLstResumenMatricula(List<ResumenMatriculaRepTutoriasTO> lstResumenMatricula) {
		this.lstResumenMatricula = lstResumenMatricula;
	}

	public Integer getIntMatriculaTotal() {
		return intMatriculaTotal;
	}

	public void setIntMatriculaTotal(Integer intMatriculaTotal) {
		this.intMatriculaTotal = intMatriculaTotal;
	}

	public List<ReporteTutoresTutoriasTO> getLstTutores() {
		return lstTutores;
	}

	public void setLstTutores(List<ReporteTutoresTutoriasTO> lstTutores) {
		this.lstTutores = lstTutores;
	}

	public List<ReporteMovilidadTutoriasTO> getLstMovilidad() {
		return lstMovilidad;
	}

	public void setLstMovilidad(List<ReporteMovilidadTutoriasTO> lstMovilidad) {
		this.lstMovilidad = lstMovilidad;
	}
	
	
	
	

}
