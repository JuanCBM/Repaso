package alquilerCoches;

public class EmpresaAlquiler {

	private String nombre;
	private Vehiculo v1;
	private Vehiculo v2;
	private Vehiculo v3;
	private int ingresos;
	private int fotoIngresos;

	public EmpresaAlquiler(String nombre) {

		this.nombre = nombre;
		this.v1 = new Vehiculo(30, "Seat Ibiza", "Economico");
		this.v2 = new Vehiculo(50, "Toyota Corolla", "Sedan");
		this.v3 = new Vehiculo(80, "Audi Q5", "SUV");
		this.ingresos = 0;
		this.fotoIngresos = ingresos;

	}

	public void guardarCaja() {

		fotoIngresos = ingresos;

	}

	public void mostrarEstadoFlota() {

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(ingresos);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo getV1() {
		return v1;
	}

	public void setV1(Vehiculo v1) {
		this.v1 = v1;
	}

	public Vehiculo getV2() {
		return v2;
	}

	public void setV2(Vehiculo v2) {
		this.v2 = v2;
	}

	public Vehiculo getV3() {
		return v3;
	}

	public void setV3(Vehiculo v3) {
		this.v3 = v3;
	}

	public int getIngresos() {
		return ingresos;
	}

	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	public int getFotoIngresos() {
		return fotoIngresos;
	}

	public void setFotoIngresos(int fotoIngresos) {
		this.fotoIngresos = fotoIngresos;
	}

	public void setPrecioBaseV1(int precioVehiculo1) {
		this.v1.setPrecioDia(precioVehiculo1);

	}

	public void calcularYRegistrarAlquiler(int numeroVehiculo, int diasAlquilado, int edadConductor,
			boolean incluyeFinDeSemana) {

		int precioTotal;
		if (numeroVehiculo == 1) {
			precioTotal = v1.getPrecioDia() * diasAlquilado;
		} else if (numeroVehiculo == 2) {
			precioTotal = v2.getPrecioDia() * diasAlquilado;
		} else {
			precioTotal = v3.getPrecioDia() * diasAlquilado;

		}
		if (diasAlquilado >= 7) {
			precioTotal = precioTotal - ((precioTotal * 15) / 100);

		}

		if (edadConductor < 25) {
			precioTotal = precioTotal + (precioTotal * 20 / 100);

		}
		if (incluyeFinDeSemana && numeroVehiculo == 3) {
			precioTotal = precioTotal + (precioTotal * 10 / 100);

		}

		this.ingresos = ingresos + precioTotal;
	}

	public void restaurarCaja() {
		this.ingresos = fotoIngresos;

	}
}
