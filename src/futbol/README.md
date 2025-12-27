# Ejercicio: Gestor de Calendario de Fútbol

## ? Contexto
El objetivo es crear un simulador de calendario para determinar el día exacto de un partido de Liga basándose en la semana del año.

## ? Reglas del Modelo
Para simplificar los cálculos, el programa sigue estas reglas:
1. **Meses Estándar**: Todos los meses tienen exactamente **30 días**.
2. **Inicio del Año**: El año comienza un **Lunes** (1 de Enero).
3. **Distribución de Partidos**:
    - **Semanas Impares**: El partido se juega el **Sábado**.
    - **Semanas Pares**: El partido se juega el **Domingo**.

## ? Funcionamiento del Programa
1. El usuario introduce un día (1-30) y un mes (1-12).
2. El programa calcula el día total transcurrido en el año.
3. Determina el número de semana (base 1).
4. Informa si la semana es par o impar y calcula la fecha exacta del partido correspondiente (Sábado o Domingo).

## ? Ejemplo de Salida
```text
--- Gestor de Partidos de Fútbol ---
Introduce el día (1-30): 10
Introduce el mes (1-12): 1

Resultado para el día 10 del mes 1 (Día total: 10):
Semana PAR (2): El partido es el Domingo 14 del mes 1
```
