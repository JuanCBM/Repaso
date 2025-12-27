package calculadoraJornadaLaboral;

import java.util.Scanner;

/**
 * Ejercicio: Calculadora de Jornada Laboral.
 * Este programa calcula las horas trabajadas en un día específico según el mes.
 * - En julio, agosto y la primera quincena de septiembre, el horario es de 8:00 a 15:00.
 * - El resto del año, el horario es de 8:00 a 17:00.
 */
public class CalcularJornadaLaboral {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Calculadora de Jornada Laboral ---");
			System.out.println("Introduce el mes (1-12): ");
			int mes = teclado.nextInt();
			System.out.println("Introduce el día (1-31): ");
			int dia = teclado.nextInt();
			System.out.println("Introduce la hora actual (0-23): ");
			int hora = teclado.nextInt();

			boolean esHorarioVerano = false;
			if (mes == 7 || mes == 8) {
				esHorarioVerano = true;
			} else if (mes == 9 && dia >= 1 && dia <= 15) {
				esHorarioVerano = true;
			}

			int horaSalida;
			if (esHorarioVerano) {
				horaSalida = 15;
			} else {
				horaSalida = 17;
			}
			int horaEntrada = 8;

			System.out.println("Tu horario hoy es de " + horaEntrada + ":00 a " + horaSalida + ":00");

			if (hora < horaEntrada) {
				System.out.println("Aún no ha empezado tu jornada. ¡Ánimo!");
			} else if (hora >= horaSalida) {
				int totalHoras = horaSalida - horaEntrada;
				System.out.println("Tu jornada ha terminado. Has trabajado " + totalHoras + " horas.");
			} else {
				int horasTrabajadas = hora - horaEntrada;
				int horasRestantes = horaSalida - hora;
				System.out.println("Llevas trabajando " + horasTrabajadas + " horas.");
				System.out.println("Te quedan " + horasRestantes + " horas para terminar.");
			}
            
            System.out.println("¿Deseas realizar otro cálculo? (s/n)");
            String continuar = teclado.next();
            if (continuar.equalsIgnoreCase("n")) break;
		}
        teclado.close();
	}
}
