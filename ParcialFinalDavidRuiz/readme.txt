Este programa en Java gestiona información sobre aeropuertos, compañías y vuelos. A continuación, se describe paso a paso lo que se ha realizado para que el programa funcione correctamente:
1.	Definir de Clases y Atributos:
	-Clase CodigoAeropuerto:
	-Atributo: codigo (String).
	-Métodos: getCodigo(), setCodigo(String codigo), imprimirCodigo().
	-Clase Aeropuerto que extiende CodigoAeropuerto:
	-Atributos: nombre, poblacion, pais, GMT (todos Strings, excepto GMT que es int).
	-Métodos: getters y setters para cada atributo, y imprimirInformacion().
	-Clase Vuelos que extiende CodigoAeropuerto:
	-Atributos: tipoVuelo, destino, duracion, plazas (todos Strings).
	-Métodos: getters y setters para cada atributo, y imprimirInformacionVuelos().
	-Clase Compania que extiende Vuelos:
	-Atributo: nombreCompania (String).
	-Métodos: getter y setter para nombreCompania, y imprimirInformacionV().
2.	AGREGAR INFORMACION A LAS CLASES:
	-Atributos:
	-aeropuertos (List<Aeropuerto>) para almacenar los aeropuertos.
	-companias (List<Compania>) para almacenar las compañías.
	-Métodos:
	-getAeropuertos() y getCompanias(): devuelven las listas de aeropuertos y compañías respectivamente.
	-agregarAeropuerto(Aeropuerto aeropuerto): añade un aeropuerto a la lista.
	-imprimirInformacionAeropuertos(): imprime la información de todos los aeropuertos en la lista.
	-agregarVuelo(Compania compania): añade una compañía a la lista.
	-imprimirInformacionVuelos(): imprime la información de todas las compañías en la lista.
	-buscarAeropuertoPorCodigo(String codigo): busca un aeropuerto por su código y lo devuelve.
	-mostrarVuelosSalidaPorAeropuerto(String codigoAeropuerto): muestra los vuelos de salida desde un aeropuerto específico.
	-mostrarVuelosLlegadaPorAeropuerto(String codigoAeropuerto): muestra los vuelos de llegada a un aeropuerto específico.

3.	Clase Main:
	-En el método main, se crean instancias de AgregarInformacion, Aeropuerto y Compania.
	-Se agregan aeropuertos a la lista de aeropuertos.
	-Se imprimen los detalles de todos los aeropuertos.
	-Se agregan vuelos a la lista de compañías.
	-Se imprimen los detalles de todos los vuelos.
	-Se muestran los vuelos de salida y llegada para cada aeropuerto en la lista.
4.	Proceso de Ejecución:
	-Inicialización:
	-Se crean instancias de aeropuertos y compañías con datos específicos.
	-Se agregan estos objetos a las listas correspondientes en la instancia de AgregarInformacion.
	-Impresión de Información:
	-Se llama a los métodos de impresión para mostrar la información de los aeropuertos y vuelos.
	-Muestreo de Vuelos:
	-Se muestran los vuelos de salida y llegada desde y hacia cada aeropuerto utilizando los códigos de aeropuerto.
5.	Convenciones de Nombres y Buenas Prácticas:
	-Se siguieron las convenciones de nombres para clases (PascalCase) y métodos (camelCase) para mejorar la legibilidad y mantener las buenas prácticas en el código.
	-Se usaron listas genéricas para especificar el tipo de objetos que contienen, mejorando así la seguridad y la claridad del código.
Conclusión
Este programa proporciona una estructura organizada para gestionar y mostrar información sobre aeropuertos y vuelos. Siguiendo buenas prácticas de codificación y utilizando las características de Java como herencia y listas genéricas, se ha logrado un código limpio y mantenible.
