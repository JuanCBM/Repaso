package alquilerCoches;

public class Main {

	public static void main(String[] args) {
		
		/*EmpresaAlquiler rent = new EmpresaAlquiler("FlexiCar");

		// 1. Guardamos estado inicial de la caja
		rent.guardarCaja();
		rent.mostrarEstadoFlota();

		// 2. Encadenamiento: Cambiar precio del Seat Ibiza (v1) desde la empresa
		rent.getV1().setPrecioBaseDia(35.0); 
		rent.setPrecioBaseV1(35.0);

		// 3. Joven (<25), SUV (tipo 3), Fin de semana, 10 d�as (>7)
		rent.calcularYRegistrarAlquiler(3, 10, 22, true);

		// 4. Adulto, Econ�mico (tipo 1), 3 d�as
		rent.calcularYRegistrarAlquiler(1, 3, 35, false);

		rent.mostrarEstadoFlota();
		System.out.println("Caja actual: " + rent.getIngresosTotales() + "?");

		// 5. Simular error y restaurar caja
		System.out.println("\n--- Restaurando Caja por error en sistema ---");
		rent.restaurarCaja();
		System.out.println("Caja restaurada: " + rent.getIngresosTotales() + "?");*/

	
		EmpresaAlquiler rent = new EmpresaAlquiler("FlexiCar");
		rent.guardarCaja();
		rent.mostrarEstadoFlota();
		rent.setPrecioBaseV1(35);
		rent.calcularYRegistrarAlquiler(3, 10, 22, true);
		rent.mostrarEstadoFlota();
		rent.guardarCaja();

		rent.calcularYRegistrarAlquiler(3, 10, 22, true);
		rent.mostrarEstadoFlota();

		rent.restaurarCaja();
		rent.mostrarEstadoFlota();

		
		
	}

}
