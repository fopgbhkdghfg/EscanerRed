Primero para iniciar el escaneo, hay que ingresar 2 ip a escanear
ip de inicio: Escribi la direccion ip donde queres que empiece el escaneo
ip de fin: Escribi la direccion IP donde queres que termine el escaneo.

Configurar los parametros
Tiempo de espera: es la cantidad de latencia que tiene la aplicacion para declarar un equipo como inactivo. Se recomiendan 1000
Numero de reintentos: Establece cuantos pings se enviaran a una ip si no responde al primer intento (siempre es 1)

Iniciar el Proceso
Presiona el boton "Iniciar escaneo"
La barra de progreso mostrara el porcentaje del recorrido
La tabla ira completandose fila por fila con cada direccion ip analizada

Resultados en la tabla
IP: La direccion ip escaneada
Nombre equipo: Muestra el nombre de red resuelto mediante dns (o desconocido si no se puede resolver)
Activo: Muestra una casilla tildada si se respondio al ping. Si no respondio, la casilla estara desmarcada
Tiempo: Indica la latencia que demoro la ip en contestar

Funciones y botones del control
Iniciar escaneo: Comienza el proceso de averiguar cuanta latencia hay entre los rangos de ips
Detener escaneo: Cancela el proceso de escaneo en cualquier momento sin cerrar la aplicacion ni perder nada anterior
Limpiar: Vacia la tabla de resultados, la barra de progreso y reinicia los contadores
Mostrar solo activos: Muestra solamente unicamente los equipos que respondieron. Al presionar nuevamente, vuelve a mostrar la lista completa. y los inactivos no se muestran
