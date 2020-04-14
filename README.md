# AREP-AppDistribuidaSegura

En este repositorio vamos a desarrollar una aplicación Web segura con los siguientes requerimientos:
- Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
- Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
- Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Desarrollo:

### Http + Ssl = Https

- Podemos comprobas que realizamos la configuracion de nuestro certificado exitosamente

![Imagenes] (https://github.com/checho1998/AREP-AppDistribuidaSegura/blob/master/Imagenes/certificado.PNG)

- El navegador desconoce este certificado ya que lo hemos hecho nosotros mismos y nos manda un aviso para prevenirnos de que puede tener algun riesgo.

![Imagenes] (https://github.com/checho1998/AREP-AppDistribuidaSegura /blob/master/Imagenes/valido.PNG)

- Debemos indicarle en las opciones avanzadas que si puede confiar en nuestro certificado para asi poder acceder a la pagina y no la mostrara

![Imagenes] (https://github.com/checho1998/AREP-AppDistribuidaSegura /blob/master/Imagenes/pagina.PNG)

## prerrequisitos

```
- Maven 
- Git
- Navegador web
- Java
```

## Como Instalar y Correr el Codigo

- Debe estar en el directorio donde quiere traer el repositorio
- Para traer el repositorio a el directorio que usted desee, debe abrir la consola del PC e ingresar este codigo:
```
$ git clone https://github.com/checho1998/Libreria-Numeros-Complejos.git
```
- luego debe ingresar el siguiente codigo para limpiar y compilar el programa desde el directorio donde este el programa
```
$ mvn clean install 
```
- Podria tambien usar el siguiente codigo para provar las pruebas y ver su completa funcionalidad
```
$ mvn test
```
- Para correr el programa desde windows puede correr desde su cmd este codigo
```
mvn exec:java -Dexec.mainClass="com.example.Main" [-Dexec.args="argument1"]
```



## Construido en lenguaje
  
  - Java (V8)
  
## Ejecutar Pruebas

Las pruebas estan desarrolladas con la dependencia de JUnit 5, por lo tanto es necesario tenerla
en el pc donde se corran.

## Autor

- Sergio Alejandro Nuñez Mendivelso
