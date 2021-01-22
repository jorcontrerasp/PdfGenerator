package es.sidelab.PdfGenerator.model;

public class Prueba {
	
	private String coPrueba;
	private String dsPrueba;
	
	public Prueba() {
		super();
	}

	public Prueba(String coPrueba, String dsPrueba) {
		super();
		this.coPrueba = coPrueba;
		this.dsPrueba = dsPrueba;
	}

	public String getCoPrueba() {
		return coPrueba;
	}

	public void setCoPrueba(String coPrueba) {
		this.coPrueba = coPrueba;
	}

	public String getDsPrueba() {
		return dsPrueba;
	}

	public void setDsPrueba(String dsPrueba) {
		this.dsPrueba = dsPrueba;
	}

	@Override
	public String toString() {
		return "Prueba [coPrueba=" + coPrueba + ", dsPrueba=" + dsPrueba + "]";
	}

}
