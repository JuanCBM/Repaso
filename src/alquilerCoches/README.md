# Ejercicio: Sistema de Gestión de Flota de Alquiler (Rent-a-Car)

## Contexto
Se desea gestionar una pequeña empresa de alquiler que dispone de tres tipos de vehículos. El programa debe calcular el precio del alquiler basándose en el tipo de coche, los días de uso y si se aplica algún seguro o penalización por edad. Además, debe permitir guardar el estado de la "Caja" (ingresos totales) para poder revertir operaciones fallidas.

## Reglas de Negocio (Lógica de Complejidad)

### 1. Tipos de Vehículo
- **1 (Económico)**: 30?/día - Seat Ibiza
- **2 (Sedán)**: 50?/día - Toyota Corolla
- **3 (SUV)**: 80?/día - Audi Q5

### 2. Lógica de Descuentos y Recargos (If-Else)
- **Descuento por duración**: Si el alquiler es de **más de 7 días**, se aplica un **15% de descuento** sobre el total base.
- **Seguro de Joven**: Si el conductor tiene **menos de 25 años**, se añade un recargo fijo de **20%**.
- **Alta demanda (SUV)**: Si el vehículo es tipo 3 (SUV) y se alquila en fin de semana (simulado con un booleano), se suma un **10% extra** al total.

### 3. Encadenamiento de Objetos
Desde la clase `Empresa`, se debe acceder al objeto `Vehiculo` mediante getters para modificar su disponibilidad o precio base (ej: `empresa.getV1().setDisponible(false)`).

## Operaciones del Sistema
- `guardarCaja()`: Guarda el estado actual de los ingresos.
- `restaurarCaja()`: Recupera el último estado guardado de la caja.
- `calcularYRegistrarAlquiler()`: Procesa la lógica de precios y actualiza la caja.

## Ejemplo de Uso (alquilerCoches.Main)
```java
EmpresaAlquiler rent = new EmpresaAlquiler("FlexiCar");

// 1. Guardamos estado inicial de la caja
rent.guardarCaja();
rent.mostrarEstadoFlota();

// 2. Encadenamiento: Cambiar precio del Seat Ibiza (v1) desde la empresa
rent.getV1().setPrecioBaseDia(35.0); 
rent.setPrecioBaseV1(35.0);

// 3. Joven (<25), SUV (tipo 3), Fin de semana, 10 días (>7)
rent.calcularYRegistrarAlquiler(3, 10, 22, true);

// 4. Adulto, Económico (tipo 1), 3 días
rent.calcularYRegistrarAlquiler(1, 3, 35, false);

rent.mostrarEstadoFlota();
System.out.println("Caja actual: " + rent.getIngresosTotales() + "?");

// 5. Simular error y restaurar caja
System.out.println("\n--- Restaurando Caja por error en sistema ---");
rent.restaurarCaja();
System.out.println("Caja restaurada: " + rent.getIngresosTotales() + "?");
```
