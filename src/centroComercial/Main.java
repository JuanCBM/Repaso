package centroComercial;

/**
 * Clase principal para probar el funcionamiento del Centro Comercial.
 */
public class Main {

	public static void main(String[] args) {
		
		CentroComercial centro = new CentroComercial("Inditex Park");
		System.out.println(centro);
		
		// Guardamos el estado inicial de las tiendas
		centro.guardarEstado();
		centro.mostrarEstadoTiendas();
		
		System.out.println("\n--- Realizando operaciones ---");
		
		// Configuramos rebajas para la Tienda 1 (Zara)
		centro.setPorcentajeRebajaTienda1(30);
		
		// Activamos rebajas para la Tienda 2 (aunque no tiene % configurado, usará 0 por defecto)
		centro.activarRebajas(2);
		
		// Registro de venta en Tienda 1 sin rebajas activas aún
		centro.registrarVenta(1, 1250);
		centro.mostrarEstadoTiendas();
		
		// Activamos rebajas en Tienda 1 y registramos otra venta
		centro.activarRebajas(1);
		centro.registrarVenta(1, 1250); // Se aplicará el 30% de descuento
		
		centro.mostrarEstadoTiendas();
		centro.mostrarVentasTotalesCentro();
		
		// Restauramos al estado inicial guardado
		System.out.println("\n--- Restaurando estado inicial ---");
		centro.restaurarEstado();
		centro.mostrarEstadoTiendas();
	}
}
