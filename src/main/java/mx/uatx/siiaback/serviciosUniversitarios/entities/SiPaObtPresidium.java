package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtPresidium implements Serializable {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 8138941748984304278L;
		@Id
		@Column(name = "IDPRESIDIUM")
		private Integer intIdPresidium;

		@Column(name = "IDEVENTORECTOR")
		private Integer intIdEventoRector;
		
		@Column(name = "NBPERSONA")
		private String strNbPersona;
		
		@Column(name = "CARGO")
		private String strCargo;
		
		@Column(name = "ORDEN")
		private Integer intOrden;
		
		@Column(name = "STATUS")
		private Integer intEstatus;
		
		public SiPaObtPresidium() {
			super();
		}

		public Integer getIntIdPresidium() {
			return intIdPresidium;
		}

		public void setIntIdPresidium(Integer intIdPresidium) {
			this.intIdPresidium = intIdPresidium;
		}

		public Integer getIntIdEventoRector() {
			return intIdEventoRector;
		}

		public void setIntIdEventoRector(Integer intIdEventoRector) {
			this.intIdEventoRector = intIdEventoRector;
		}

		public String getStrNbPersona() {
			return strNbPersona;
		}

		public void setStrNbPersona(String strNbPersona) {
			this.strNbPersona = strNbPersona;
		}

		public String getStrCargo() {
			return strCargo;
		}

		public void setStrCargo(String strCargo) {
			this.strCargo = strCargo;
		}

		public Integer getIntOrden() {
			return intOrden;
		}

		public void setIntOrden(Integer intOrden) {
			this.intOrden = intOrden;
		}

		public Integer getIntEstatus() {
			return intEstatus;
		}

		public void setIntEstatus(Integer intEstatus) {
			this.intEstatus = intEstatus;
		}
		
		
		
}
