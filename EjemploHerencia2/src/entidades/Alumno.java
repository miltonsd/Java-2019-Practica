package entidades;

public class Alumno extends Persona{ 
	// extends es para las clases que heredan
	private int legajo;

	/*
	public Alumno() {
		this.legajo=0;
	}
*/	

	public Alumno(String dni, String apellido, String nombre, int legajo) {
		super(dni, nombre, apellido);
//		this.legajo=legajo;
		this.setLegajo(legajo);
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	// @Override // Anotation, es para avisar que esta sobreescribiendo
	public String getDetalle() {
		return "Legajo: "+this.getLegajo()+" - "+super.getDetalle();
	}
	
	public String getDetalleAlumno() {
		return "Alumno : "+this.getDetalle();
	}
}