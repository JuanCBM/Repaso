# Ejercicio POO: Centro Comercial Inditex

## ? Contexto
Se desea modelar un centro comercial que gestiona tres tiendas de marcas específicas (**Zara**, **Pull&Bear** y **Bershka**). El sistema debe permitir registrar ventas, aplicar descuentos por rebajas y ser capaz de guardar/restaurar el estado de las ventas.

## ?? Funcionalidades
1. **Gestión de Tiendas**: Cada tienda tiene un nombre, ventas acumuladas y configuración de rebajas.
2. **Rebajas Dinámicas**: Se puede activar el estado de rebajas y configurar porcentajes de descuento específicos (por ejemplo, 30% en Zara).
3. **Persistencia Temporal**:
   - `guardarEstado()`: Captura las ventas actuales como un punto de restauración.
   - `restaurarEstado()`: Vuelve a las cifras de ventas capturadas en el último guardado.
4. **Cálculos Automáticos**: Al registrar una venta, el sistema aplica automáticamente el descuento si las rebajas están activas para esa tienda.

## ? Reglas de Negocio
- Al crear el centro comercial, las tiendas comienzan con ventas iniciales:
  - Zara: 500?
  - Pull&Bear: 300?
  - Bershka: 200?
- El sistema utiliza estructuras `if-else` para la selección de tiendas y lógica de descuentos.

## ? Ejemplo de Uso (centroComercial.Main)
```java

CentroComercial centro = new CentroComercial("Inditex Park");
System.out.println(centro);

// Guardamos el estado inicial (Zara: 500, Pull: 300, Ber: 200)
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
```


