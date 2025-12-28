# Ejercicio: Generador de Marco y Aspas (La "X" enmarcada)

## Contexto
El objetivo es crear un programa que solicite al usuario un **tamaño impar** (por ejemplo, 5, 7 o 9) y dibuje en la consola un cuadrado que contenga una "X" perfecta en su interior.

## Reglas del Dibujo
Para un tamaño `n`:
1.  **Bordes**: Se pintan asteriscos en la primera fila, última fila, primera columna y última columna.
2.  **Diagonal Principal**: Se pintan asteriscos cuando el índice de fila y columna son iguales (`i == j`).
3.  **Diagonal Secundaria**: Se pintan asteriscos cuando la suma de los índices es igual al tamaño menos uno (`i + j == n - 1`).
4.  **Espacios**: El resto de posiciones deben estar vacías.

## Ejemplo de Salida (Para n = 7)
```text
* * * * * * * 
* *       * * 
*   *   *   * 
*     *     * 
*   *   *   * 
* *       * * 
* * * * * * * 
```