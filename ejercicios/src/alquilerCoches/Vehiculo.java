package alquilerCoches;

public class Vehiculo {

	private int precioDia;
	private String nombre;
	private String tipo;

	public Vehiculo(int precioDia, String nombre, String tipo) {

		this.precioDia = precioDia;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public int getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(int precioDia) {
		this.precioDia = precioDia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [precioDia=" + precioDia + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

}
