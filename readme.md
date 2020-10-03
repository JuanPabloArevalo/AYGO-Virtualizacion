No logre el objetivo completo. 
Me fallo el balanceador de carga. Intente lo siguiente:
  1. Crear mi propio balanceador de carga, el cuál recibia la petición del front-end y como era balanceado por round-robin iba realizando petición una a una. Manejando
	una variable que me iba diciendo en que servicio estaba. Este balanceador me generaba una petición HTTP, el cuál cumplia la misión de solicitar y devolver el
	resultado al front. La falla acá es la comunición entre los docker por http, como cada uno maneja capa de red diferente, no pude configurar para que se comunicaran.
  2. Utilizar un balanceador de carga Nginx. Y a su vez también era el encargado de tener el front end almacenado. El problema es que no supe comunicar el front  con el
	balanceador de carga. Si el front estaba en el puerto 80, el balanceador de carga no funcionaba. No sabia como comunicar estos dos.
  3. Un balanceador de carga nginx y un servicio web nginx. Al igual que el anterior, estaba utilizando para el front Jquery para comunicarme entre el front y el 
	balanceador de carga, al realizar la petición post con http, me fallaba porque no encontraba la IP del balanceador de carga.

La conexión entre los backend y la base de datos si logre conectarlo. Esto me sirvio bien.
Al probar mi balanceador de carga del punto 1 en local me funcionaba perfecto. Al ponerlo en docker me dejaba de funcionar	