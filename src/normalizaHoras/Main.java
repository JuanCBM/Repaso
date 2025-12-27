/**
 * Ejercicio: Normalizador de Tiempo.
 * Este programa toma una cantidad de horas, minutos y segundos y los normaliza
 * (por ejemplo, 61 segundos se convierten en 1 minuto y 1 segundo).
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Valores de ejemplo (podrían pedirse por Scanner)
    int horas = 325;
    int mins = 327;
    int segs = 329;

    System.out.println("Valores iniciales: " + horas + "h " + mins + "m " + segs + "s");

    // Normalización de segundos a minutos
    if (segs >= 60) {
      int auxMin = segs / 60;
      segs = segs % 60;
      mins += auxMin;
    }

    // Normalización de minutos a horas
    if (mins >= 60) {
      int auxHora = mins / 60;
      mins = mins % 60;
      horas += auxHora;
    }

    System.out.println("El valor normalizado es: " + horas + "h " + mins + "m " + segs + "s");
  }
}
