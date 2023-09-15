# Sistema de Gestión de Ventas de Mercaderías

Este proyecto en Kotlin implementa un sistema de gestión de ventas de mercaderías. Permite realizar ventas de alimentos y bebidas, llevar un control de las mercaderías disponibles, calcular importes a pagar, realizar pagos y gestionar el stock de mercaderías.

## Clases y Constructores

El proyecto consta de las siguientes clases y constructores:

### Clase `Mercaderia`

- Constructor: Toma el nombre, precio, stock y stock mínimo de una mercadería.

### Clase `ItemVenta`

- Constructor: Toma una mercadería y la cantidad vendida.

### Clase `Venta`

- Constructor: Puede tomar la fecha de venta y la razón social del cliente (opcional).

### Clase `Gestor`

- Esta clase se encarga de gestionar las mercaderías y ventas.

## Acciones Realizadas

El proyecto realiza las siguientes acciones:

- Creación de mercaderías (alimentos y bebidas) con sus características.
- Realización de ventas, donde se agregan mercaderías a la lista de ítems vendidos y se calcula el importe a pagar.
- Mostrado del importe a pagar en cada venta.
- Realización de pagos con importe mayor al importe a pagar en cada venta, calculando los vueltos.
- Listado de mercaderías disponibles.
- Cálculo de la recaudación total.
- Listado de mercaderías con poco stock.

![image](https://github.com/facupepi/PROPUESTO3/assets/109759897/37daf399-9605-4c9e-9fce-e32d32810875)
