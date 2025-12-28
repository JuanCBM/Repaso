package centroComercial;

/**
 * Clase que gestiona un Centro Comercial compuesto por varias tiendas.
 * Permite registrar ventas, activar rebajas y gestionar el estado financiero.
 */
public class CentroComercial {

	private Tienda tienda1;
	private Tienda tienda2;
	private Tienda tienda3;
	private String nombre;

	public CentroComercial(String nombre) {
		this.nombre = nombre;
		this.tienda1 = new Tienda("Zara", 500);
		this.tienda2 = new Tienda("Pull&Bear", 300);
		this.tienda3 = new Tienda("Bershka", 200);
	}

	/**
	 * Guarda el estado actual de las ventas de todas las tiendas.
	 */
	public void guardarEstado() {
		tienda1.setVentaTotalInicial(tienda1.getVentaTotal());
		tienda2.setVentaTotalInicial(tienda2.getVentaTotal());
		tienda3.setVentaTotalInicial(tienda3.getVentaTotal());
	}

	@Override
	public String toString() {
		return "Centro Comercial: " + nombre;
	}

	/**
	 * Muestra el estado actual de todas las tiendas del centro.
	 */
	public void mostrarEstadoTiendas() {
		System.out.println("--- Estado de las Tiendas ---");
		System.out.println(tienda1);
		System.out.println(tienda2);
		System.out.println(tienda3);
	}

	public void setPorcentajeRebajaTienda1(int porcentajeRebaja) {
		tienda1.setPorcentajeRebaja(porcentajeRebaja);
	}

	/**
	 * Activa las rebajas para una tienda específica.
	 * @param numeroTienda ID de la tienda (1-3).
	 */
	public void activarRebajas(int numeroTienda) {
		Tienda t = null;
		if (numeroTienda == 1) {
			t = tienda1;
		} else if (numeroTienda == 2) {
			t = tienda2;
		} else if (numeroTienda == 3) {
			t = tienda3;
		}

		if (t != null) {
			t.setRebajasActivas(true);
		} else {
			System.out.println("Error: Tienda no válida.");
		}
	}

	/**
	 * Registra una venta en una tienda, aplicando rebajas si están activas.
	 * @param numeroTienda ID de la tienda (1-3).
	 * @param importeVenta Monto de la venta antes de rebajas.
	 */
	public void registrarVenta(int numeroTienda, int importeVenta) {
		Tienda t = null;
		if (numeroTienda == 1) {
			t = tienda1;
		} else if (numeroTienda == 2) {
			t = tienda2;
		} else if (numeroTienda == 3) {
			t = tienda3;
		}

		if (t != null) {
			int ventaFinal = importeVenta;
			if (t.isRebajasActivas()) {
				ventaFinal = importeVenta - (importeVenta * t.getPorcentajeRebaja() / 100);
			}
			t.setVentaTotal(t.getVentaTotal() + ventaFinal);
		} else {
			System.out.println("Error: Tienda no válida.");
		}
	}

	/**
	 * Muestra la suma de ventas de todas las tiendas del centro.
	 */
	public void mostrarVentasTotalesCentro() {
		int sumaTotal = tienda1.getVentaTotal() + tienda2.getVentaTotal() + tienda3.getVentaTotal();
		System.out.println("Ventas Totales del Centro: " + sumaTotal + "?");
	}

	/**
	 * Restaura el estado de ventas al último guardado.
	 */
	public void restaurarEstado() {
		tienda1.setVentaTotal(tienda1.getVentaTotalInicial());
		tienda2.setVentaTotal(tienda2.getVentaTotalInicial());
		tienda3.setVentaTotal(tienda3.getVentaTotalInicial());
	}
}
