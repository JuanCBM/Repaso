/**
 * Ejercicio: Sucesión de Fibonacci.
 * Este programa genera los primeros N números de la sucesión de Fibonacci.
 * La sucesión comienza con 0 y 1, y cada número subsiguiente es la suma de los dos anteriores.
 */
public class Fibonacci {

  public static void main(String[] args) {
    int numeroIteraciones = 50;
    int numeroIteracionActual = 0;
    long a = 0;
    long b = 1;
    long resultado;

    System.out.println("Primeros " + numeroIteraciones + " números de la sucesión de Fibonacci:");

    while (numeroIteracionActual < numeroIteraciones) {
      System.out.println((numeroIteracionActual + 1) + ": " + a);

      resultado = a + b;
      a = b;
      b = resultado;

      numeroIteracionActual++;
    }
  }
}
