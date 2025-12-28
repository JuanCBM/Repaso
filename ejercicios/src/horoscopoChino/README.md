# Ejercicio: Calculadora de Horóscopo Chino y Elementos

## Contexto
El horóscopo chino es un sistema milenario que asigna un animal a cada año en un ciclo de 12 años. Además, cada año está asociado a uno de los cinco elementos esenciales (Metal, Agua, Madera, Fuego y Tierra), los cuales rotan cada dos años basándose en el último dígito del año de nacimiento.

## Reglas del Modelo

### 1. El Animal (Ciclo de 12 años)
El animal se determina calculando el resto de la división del año entre 12 (`año % 12`):

- **0**: Mono
- **1**: Gallo
- **2**: Perro
- **3**: Cerdo
- **4**: Rata
- **5**: Buey
- **6**: Tigre
- **7**: Conejo
- **8**: Dragón
- **9**: Serpiente
- **10**: Caballo
- **11**: Cabra

### 2. El Elemento (Ciclo de 10 años)
El elemento se determina según el **último dígito** del año de nacimiento:

- **0 o 1**: Metal
- **2 o 3**: Agua
- **4 o 5**: Madera
- **6 o 7**: Fuego
- **8 o 9**: Tierra

## Ejemplo de Salida
```text
--- Calculadora de Horóscopo Chino ---
Introduce tu año de nacimiento (ej. 1995): 1995

Para el año 1995:
Tu animal es el Cerdo
Tu elemento es el Madera
```