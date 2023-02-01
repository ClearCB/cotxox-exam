# Logical methods

## Clase Carrera

### ATRIBUTOS

* crea las variables de instancia que estimes oportunas.
* tiempoEsperado del trayecto
* tiempoCarrera tiempo real empleado en el trayecto
* costeTotal real del trayecto
* conductor asignado a la carrera

### MÉTODOS

* getTarjetaCredito() devuelve el número de la tarjeta de crédito del usuario/a.
* getOrigen() devuelve el lugar de origen del trayecto.
* getDestino() devuelve el lugar de destino del trayecto.
* getDistancia() devuelve la distancia entre el origen y el destino.
getCosteEsperado() devuelve el coste esperado del trayecto, cuyo cálculo es
responsabilidad de la clase Tarifa .
* asignarConductor(PoolConductores conductores) recibe la flota de conductores
y asigna un conductor a la carrera. Le pide a la clase PoolConductores que le asigne
un conductor
* getCosteEsperado() le pregunta a la clase Tarifa cuál es el coste total esperado.
* realizarPago(pago) recibe el pago y lo almacena en el atributo costeTotal
* recibirPropina(propina) recibe la propina que paga el usuario
liberarConductor() establece que el conductor asignado a la carrera queda libre
tras el servicio.

## Clase Tarifa

### ATRIBUTOS

* costeMilla Cotxox fija en 1.35€ el coste de la milla.
* costeMinuto Cotxox fija en 0.35€ el coste del minuto.
* costeMinimo El coste mínimo que cobra Cotxox por un viaje es de 5€.
porcentajeComision la comisión que cobra cotxox sobre el coste del viaje es
del 20%.

### MÉTODOS

* getCosteDistancia(distancia) devuelve la parte del coste del trayecto debido al a
distancia.
* getCosteTiempo(minutos) devuelve la parte del coste del trayecto debido a su
duración en minutos.
* getCosteTotalEsperado(carrera) devuelve el coste total esperado de la carrera
que recibe en función de la distancia esperada y el tiempo esperado. El coste total esperado no puede ser inferior al mínimo.

## Clase Conductor

### ATRIBUTOS

* nombre del conductor
* modelo modelo del coche
* matricula
* valoracionMedia valoración media del conductor
valoraciones array de longitud variable que almacena todas las valoraciones del
conductor ocupado indica si el conductor está prestando un servicio o está libre.

### MÉTODOS

* setValoracion(valoracion) añade la nueva valoración y actualiza la valoración
media del conductor.

## Clase PoolConductores

### ATRIBUTOS

* poolConductores es un array de longitud variable de conductor es

### MÉTODOS

* El constructor PoolConductores(conductores) recibe un array de longitud variable
de conductores.
* asignarConductor() selecciona un conductor libre entre la flota y lo devuelve,
estableciendo que ese conductor está ahora ocupado.

