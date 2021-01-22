package es.sidelab.PdfGenerator.model;

public class EjercicioPDF {


	private long idEj;
	
	private String nombreEj;
	private String movimiento;
	private String explicacion;
	
	public EjercicioPDF() {}
	
	public EjercicioPDF(String nombreEj, String movimiento, String explicacion) {
		super();
		this.nombreEj = nombreEj;
		this.movimiento = movimiento;
		this.explicacion = explicacion;
	}
	
	public long getIdEj() {
		return idEj;
	}
	
	public void setIdEj(long idEj) {
		this.idEj = idEj;
	}
	
	public String getNombreEj() {
		return nombreEj;
	}
	
	public void setNombreEj(String nombreEj) {
		this.nombreEj = nombreEj;
	}
	
	public String getMovimiento() {
		return movimiento;
	}
	
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
	
	public String getExplicacion() {
		return explicacion;
	}
	
	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	@Override
	public String toString() {
		return "Ejercicio [idEj=" + idEj + ", nombreEj=" + nombreEj + ", movimiento=" + movimiento + ", explicacion="
				+ explicacion + "]";
	}
}
