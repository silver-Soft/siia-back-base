package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosTituloFotografia {
	
	 	@Id
	    @Column(name = "IDTITULO")
	    private Long lngIdTitulo;
	 	
	 	@Column(name = "FOTO")
	    private byte[] fotografia;
	    
	    @Column(name = "IDDOCUMENTO")
	    private Integer intIdDocumento;
	    
	    @Column(name = "IDFOTOESTUDIOPERSONA")
	    private Long lngIdFotoEstudioPersona;
	    
	    @Column(name = "MATRICULA")
	    private String strMatricula;
	    
	    @Column(name = "NOMBRE")
	    private String strNombre;
	    
	    @Column(name = "PROGRAMAEDUCATIVO")
	    private String strProgramaEducativo;
	    
	    @Column(name = "TELEFONO")
	    private String strTelefono;
	    
	    @Column(name = "CORREO")
	    private String strCorreo;
	    
	    @Column(name = "TIPO")
	    private String strTipo;
	    
	    @Column(name = "ESTATUS")
	    private String strEstatus;
	    
	    @Column(name = "LIBRO")
	    private String strLibro;
	    
	    @Column(name = "FOJA")
	    private String strFoja;
	    
	    @Column(name = "FCEXAMEN")
	    private String strFcExamen;
	    
	    @Column(name = "FCEXPEDICION")
	    private String strFcExpedicion;
	    
	    
	    @Column(name = "OBSERVACIONES")
	    private String strObservaciones;
	    
	    @Column(name = "RESULTADOEXAMEN")
	    private String strResultadoExamen;
	    
	    @Column(name = "NBTITULADO")
	    private String strNbTitulado;
	    
	    @Column(name = "FECHATERMINO")
	    private String strFcTermino;
	    
	    @Column(name = "APPATERNOTITULADO")
	    private String strApPaterno;
	    
	    @Column(name = "APMATERNOTITULADO")
	    private String strApMaterno;
	    
	    @Column(name = "INSTITUCIONPROCEDENCIA")
	    private String strInstitucionProcedencia;
	    
	    @Column(name = "FCINICIO")
	    private String strFcInicio;
	    
	    @Column(name = "FCTERMINACION")
	    private String strFcTerminacion;
	    
	    @Column(name = "PERMITEVALIDAR")
	    private Boolean blnPermiteValidar;

	    @Column(name = "VALIDADO")
	    private String strValidado;
	    
	    
		public Long getLngIdTitulo() {
			return lngIdTitulo;
		}

		public void setLngIdTitulo(Long lngIdTitulo) {
			this.lngIdTitulo = lngIdTitulo;
		}

		public byte[] getFotografia() {
			return fotografia;
		}

		public void setFotografia(byte[] fotografia) {
			this.fotografia = fotografia;
		}

		public Integer getIntIdDocumento() {
			return intIdDocumento;
		}

		public void setIntIdDocumento(Integer intIdDocumento) {
			this.intIdDocumento = intIdDocumento;
		}

		public Long getLngIdFotoEstudioPersona() {
			return lngIdFotoEstudioPersona;
		}

		public void setLngIdFotoEstudioPersona(Long lngIdFotoEstudioPersona) {
			this.lngIdFotoEstudioPersona = lngIdFotoEstudioPersona;
		}

		public String getStrMatricula() {
			return strMatricula;
		}

		public void setStrMatricula(String strMatricula) {
			this.strMatricula = strMatricula;
		}

		public String getStrNombre() {
			return strNombre;
		}

		public void setStrNombre(String strNombre) {
			this.strNombre = strNombre;
		}

		public String getStrProgramaEducativo() {
			return strProgramaEducativo;
		}

		public void setStrProgramaEducativo(String strProgramaEducativo) {
			this.strProgramaEducativo = strProgramaEducativo;
		}

		public String getStrTelefono() {
			return strTelefono;
		}

		public void setStrTelefono(String strTelefono) {
			this.strTelefono = strTelefono;
		}

		public String getStrCorreo() {
			return strCorreo;
		}

		public void setStrCorreo(String strCorreo) {
			this.strCorreo = strCorreo;
		}

		public String getStrTipo() {
			return strTipo;
		}

		public void setStrTipo(String strTipo) {
			this.strTipo = strTipo;
		}

		public String getStrEstatus() {
			return strEstatus;
		}

		public void setStrEstatus(String strEstatus) {
			this.strEstatus = strEstatus;
		}

		public String getStrLibro() {
			return strLibro;
		}

		public void setStrLibro(String strLibro) {
			this.strLibro = strLibro;
		}

		public String getStrFoja() {
			return strFoja;
		}

		public void setStrFoja(String strFoja) {
			this.strFoja = strFoja;
		}

		public String getStrFcExamen() {
			return strFcExamen;
		}

		public void setStrFcExamen(String strFcExamen) {
			this.strFcExamen = strFcExamen;
		}

		public String getStrFcExpedicion() {
			return strFcExpedicion;
		}

		public void setStrFcExpedicion(String strFcExpedicion) {
			this.strFcExpedicion = strFcExpedicion;
		}

		public String getStrObservaciones() {
			return strObservaciones;
		}

		public void setStrObservaciones(String strObservaciones) {
			this.strObservaciones = strObservaciones;
		}

		public String getStrResultadoExamen() {
			return strResultadoExamen;
		}

		public void setStrResultadoExamen(String strResultadoExamen) {
			this.strResultadoExamen = strResultadoExamen;
		}

		public String getStrNbTitulado() {
			return strNbTitulado;
		}

		public void setStrNbTitulado(String strNbTitulado) {
			this.strNbTitulado = strNbTitulado;
		}

		public String getStrFcTermino() {
			return strFcTermino;
		}

		public void setStrFcTermino(String strFcTermino) {
			this.strFcTermino = strFcTermino;
		}

		public String getStrApPaterno() {
			return strApPaterno;
		}

		public void setStrApPaterno(String strApPaterno) {
			this.strApPaterno = strApPaterno;
		}

		public String getStrApMaterno() {
			return strApMaterno;
		}

		public void setStrApMaterno(String strApMaterno) {
			this.strApMaterno = strApMaterno;
		}

		public String getStrInstitucionProcedencia() {
			return strInstitucionProcedencia;
		}

		public void setStrInstitucionProcedencia(String strInstitucionProcedencia) {
			this.strInstitucionProcedencia = strInstitucionProcedencia;
		}

		public String getStrFcInicio() {
			return strFcInicio;
		}

		public void setStrFcInicio(String strFcInicio) {
			this.strFcInicio = strFcInicio;
		}

		public String getStrFcTerminacion() {
			return strFcTerminacion;
		}

		public void setStrFcTerminacion(String strFcTerminacion) {
			this.strFcTerminacion = strFcTerminacion;
		}

		public Boolean getBlnPermiteValidar() {
			return blnPermiteValidar;
		}

		public void setBlnPermiteValidar(Boolean blnPermiteValidar) {
			this.blnPermiteValidar = blnPermiteValidar;
		}

		public String getStrValidado() {
			return strValidado;
		}

		public void setStrValidado(String strValidado) {
			this.strValidado = strValidado;
		}
	    
		
	    
	    

}
