/**
 * Ejercicio: Números Narcisistas.
 * Un número narcisista es aquel que es igual a la suma de sus propios dígitos 
 * elevados a la potencia del número de dígitos.
 * Este programa comprueba si un número de 3 cifras es narcisista usando aritmética básica.
 */
public class Narcisistas {

  public static void main(String[] args) {
    int numeroOriginal = 370;
    int numeroUsuario = numeroOriginal;

    if (numeroUsuario < 100 || numeroUsuario > 999) {
      System.out.println("Error: El número debe tener 3 cifras.");
    } else {
      int unidades = numeroUsuario % 10;
      int aux = numeroUsuario / 10;
      int decenas = aux % 10;
      int centenas = aux / 10;

      // Calculamos la potencia de 3 mediante multiplicaciones sucesivas (Java puro, sin Math.pow)
      int suma = (unidades * unidades * unidades) + 
                 (decenas * decenas * decenas) + 
                 (centenas * centenas * centenas);

      if (suma == numeroOriginal) {
        System.out.println(numeroOriginal + " es un número narcisista.");
      } else {
        System.out.println(numeroOriginal + " no es un número narcisista.");
      }
    }
  }
}
