# Virtualización

## OBJETIVOS
	1. Creación de una base de datos no relacional en MongoDB.
	2. Creación API REST, el cuál recibe una cadena, lo almacena en la 
		base de datos no relacional (MongoDB) y retorna los 10 últimos 
		registros que se han insertado.
	3. Creación de un balanceador de carga(API REST), el cuál recibe una 
		cadena y lo envia a uno de los 3 servicios creados (Servicio API REST 
		del punto 2) utilizando Round Robin
	4. Front-End Boostrap
	5. Despliegue de la arquitectura en AWS en una máquina virtual EC3
	
### Diagrama Arquitectura Propuesta

![Alt text](ImagenesReadme/ArquitecturaPropuesta.png)
	
## SOLUCIÓN DESARROLLADA

### Requerimientos previos
	1. [Docker](https://www.docker.com/)
	2. [Docker Compose](https://docs.docker.com/compose/).
	
### Balanceo de carga (loadBalancer)
	Se ha desarrollado bajo el framework Spring Boot. 
	En esta parte del proyecto se encuentra almacenado el front-end 
	y el balanceador de carga. El front-end esta desarrollado en 
	boostrap y utiliza JQuery para comunicarse con el balanceador de carga.
	Utiliza el puerto 80.
	
### API REST
	Se ha desarrollado con el framework Spring Boot.
	Utiliza Dependence Injection
	Utiliza la libreria MongoRepository para la conexión con la base de datos Mongo.
	Utiliza el puerto 8080

### Base de datos No relacional	
	Se ha utilizado la imagen docker mongo:3.6.1

## INSTALACIÓN
	
	1. Clonar el repositorio:
	

git clone https://github.com/JuanPabloArevalo/AYGOVirtualizacion

	
	2. Generar el ejecutable de los APIRest

cd loadBalancer
mvn clean install
cd ..
cd laboratorioVirtualizacionAYGO
mvn clean install
cd ..

	
	3. Ejecutar el docker-compose

sh
docker-compose up -d 

	
	Al abrir docker debe quedar así:
![Alt text](ImagenesReadme/DockerActivo.PNG)
	

## PRUEBAS
	1. Abrir navegador con la URL localhost:
![Alt text](ImagenesReadme/PruebaLocal.PNG)
	2. Insertar una nueva cadena
	3. Validar datos ingresados
![Alt text](ImagenesReadme/PruebaLocalResultado.PNG)
	

