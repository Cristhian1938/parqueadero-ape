# Cambios realizados en el diagrama de clases

Los cambios realizados fueron los siguientes en el diagrama UML.

## 1. Modificaciones en la clase `Persona`
- **Nuevo atributo:**
  - `edad` (`int`): Se añadió este atributo para representar la edad de las personas.

## 2. Cambios en las herencias de la clase `Vehículo`
Se realizaron las siguientes adiciones a las subclases de `Vehículo`:

- **`Bicicleta`:**
  - Nuevos atributos:
    - `numeroMarchas` (`int`): Representa la cantidad de marchas disponibles.
    - `esElectrica` (`boolean`): Indica si la bicicleta es eléctrica.
  - Nuevas operaciones:
    - `verificarTipo() : void`: Método para validar el tipo de bicicleta.
    - `cambiarMarcha(marcha : int) : void`: Método para cambiar la marcha.

- **`Motocicleta`:**
  - Nuevos atributos:
    - `numeroRuedas` (`int`): Número de ruedas de la motocicleta.
    - `año` (`int`): Año de fabricación.
    - `tipoLlantas` (`string`): Tipo de llantas usadas.
  - Nuevas operaciones:
    - `calcularEdad() : void`: Calcula la antigüedad de la motocicleta.
    - `verificarRuedas() : void`: Verifica las condiciones de las ruedas.

- **`Automóvil`:**
  - Nuevos atributos:
    - `numeroPuertas` (`int`): Número de puertas del automóvil.
    - `tipoCombustible` (`string`): Tipo de combustible utilizado.
  - Nuevas operaciones:
    - `verificarCombustible() : void`: Valida el tipo de combustible.
    - `abrirPuertas() : void`: Abre las puertas del automóvil.

## 3. Cambios en la orientación de flechas
Se ajustaron las direcciones de las flechas en las siguientes relaciones para una mejor comprensión:
- De `PlazaParqueo` hacia `tipoEstado`.
- De `Reserva` hacia `EstadoReserva`.
- De `Usuario` hacia `tipoPago`.

## 4. Modificación de la multiplicidad en `Vehículo`
- Se cambió la multiplicidad de la relación entre `Usuario` y `Vehículo` de `0..1` a `1..*`, indicando que cada `Usuario` debe tener al menos un vehículo.
