package futbol;

import java.util.Scanner;

/**
 * Ejercicio: Calendario de Fútbol.
 * El programa calcula si un partido se juega en sábado o domingo basándose en la semana del año.
 * Suposiciones del modelo:
 * - Todos los meses tienen exactamente 30 días.
 * - El año comienza el 1 de enero (lunes).
 * - Las semanas pares tienen partido el domingo.
 * - Las semanas impares tienen partido el sábado.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--- Gestor de Partidos de Fútbol ---");
		System.out.println("Introduce el día (1-30): ");
		int dia = teclado.nextInt();
		
		System.out.println("Introduce el mes (1-12): ");
		int mes = teclado.nextInt();

		// Validación de entrada
		if (dia < 1 || dia > 30 || mes < 1 || mes > 12) {
			System.out.println("Error: El día debe estar entre 1-30 y el mes entre 1-12.");
		} else {
			// Cálculo del día total transcurrido en el año (base 30 días/mes)
			int diaTotalAnio = ((mes - 1) * 30 + dia);
			
			// Determinamos la semana del año (semanas de 7 días, base 1)
			// (diaTotalAnio - 1) / 7 da el índice de la semana (0-51 aprox)
			int semana = ((diaTotalAnio - 1) / 7) + 1;
			
			System.out.println("\nResultado para el día " + dia + " del mes " + mes + " (Día total: " + diaTotalAnio + "):");

			if (semana % 2 == 0) {
				// Semana par: El partido es el domingo de esa semana
				// El domingo de la semana N es el día N * 7
				int diaDomingoAnio = semana * 7; 
				int mesDomingo = ((diaDomingoAnio - 1) / 30) + 1;
				int diaDomingo = diaDomingoAnio % 30;
				if (diaDomingo == 0) {
					diaDomingo = 30;
				}
				System.out.println("Semana PAR (" + semana + "): El partido es el Domingo " + diaDomingo + " del mes " + mesDomingo);
							
			} else {
				// Semana impar: El partido es el sábado de esa semana
				// El sábado de la semana N es el día (N * 7) - 1
				int diaSabadoAnio = (semana * 7) - 1;
				int mesSabado = ((diaSabadoAnio - 1) / 30) + 1;
				int diaSabado = diaSabadoAnio % 30;
				if (diaSabado == 0) {
					diaSabado = 30;
				}
				System.out.println("Semana IMPAR (" + semana + "): El partido es el Sábado " + diaSabado + " del mes " + mesSabado);
			}
		}
		
		teclado.close();
	}
}
