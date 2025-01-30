package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCartelera {
	
	 @Id
	    @Column(name = "IDEVENTO")
	    private Long lngIdEvento;
	    
	    @Column(name = "FCINICIO")
		 private Date fcInicio;
	    
	    @Column(name = "DSURL")
		 private String dsUrl;
	    
	    @Column(name = "CLESTATUS")
		 private Integer clEstatus;
	    
	    @Column(name = "FCTERMINO")
		 private Date fcTermino;
	    
	    @Column(name = "DSMODO")
		 private String dsModo;
	    
	    @Column(name = "CLTIPO")
		 private String clTipo;
	    
	    @Column(name = "DSBANNER")
		 private String dsBanner;
	    
	    @Column(name = "DSTITULO")
		 private String dsTitulo;
	    
	    @Column(name = "DSCOMENTARIO")
		 private String dsComentario;
	    
	    @Column(name = "IMAGENPRINCIPAL")
		 private byte[] imagenPrincipal;
	    
	    @Column(name = "LONGITUD")
		 private String longitud;
	    
	    @Column(name = "LATITUD")
		 private String latitud;
	    
	    @Column(name = "LUGAREVENTO")
		 private String lugarEvento;
	    
	    @Column(name = "IDAREACAMPUS")
		 private Long idAreaCampus;
	    
	    @Column(name = "IMAGENMOVIL")
		 private byte[] imagenMovil;

		public Long getLngIdEvento() {
			return lngIdEvento;
		}

		public void setLngIdEvento(Long lngIdEvento) {
			this.lngIdEvento = lngIdEvento;
		}

		public Date getFcInicio() {
			return fcInicio;
		}

		public void setFcInicio(Date fcInicio) {
			this.fcInicio = fcInicio;
		}

		public String getDsUrl() {
			return dsUrl;
		}

		public void setDsUrl(String dsUrl) {
			this.dsUrl = dsUrl;
		}

		public Integer getClEstatus() {
			return clEstatus;
		}

		public void setClEstatus(Integer clEstatus) {
			this.clEstatus = clEstatus;
		}

		public Date getFcTermino() {
			return fcTermino;
		}

		public void setFcTermino(Date fcTermino) {
			this.fcTermino = fcTermino;
		}

		public String getDsModo() {
			return dsModo;
		}

		public void setDsModo(String dsModo) {
			this.dsModo = dsModo;
		}

		public String getClTipo() {
			return clTipo;
		}

		public void setClTipo(String clTipo) {
			this.clTipo = clTipo;
		}

		public String getDsBanner() {
			return dsBanner;
		}

		public void setDsBanner(String dsBanner) {
			this.dsBanner = dsBanner;
		}

		public String getDsTitulo() {
			return dsTitulo;
		}

		public void setDsTitulo(String dsTitulo) {
			this.dsTitulo = dsTitulo;
		}

		public String getDsComentario() {
			return dsComentario;
		}

		public void setDsComentario(String dsComentario) {
			this.dsComentario = dsComentario;
		}

		public byte[] getImagenPrincipal() {
			return imagenPrincipal;
		}

		public void setImagenPrincipal(byte[] imagenPrincipal) {
			this.imagenPrincipal = imagenPrincipal;
		}

		public String getLongitud() {
			return longitud;
		}

		public void setLongitud(String longitud) {
			this.longitud = longitud;
		}

		public String getLatitud() {
			return latitud;
		}

		public void setLatitud(String latitud) {
			this.latitud = latitud;
		}

		public String getLugarEvento() {
			return lugarEvento;
		}

		public void setLugarEvento(String lugarEvento) {
			this.lugarEvento = lugarEvento;
		}

		public Long getIdAreaCampus() {
			return idAreaCampus;
		}

		public void setIdAreaCampus(Long idAreaCampus) {
			this.idAreaCampus = idAreaCampus;
		}

		public byte[] getImagenMovil() {
			return imagenMovil;
		}

		public void setImagenMovil(byte[] imagenMovil) {
			this.imagenMovil = imagenMovil;
		}

}
