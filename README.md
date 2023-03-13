
# Challenge ONE Back End - Java

Este mini sistema fue creado como parte del proceso de aprendizaje en los cursos de aluraLatan 

![msedge_VcvufDeSaE](https://user-images.githubusercontent.com/94420600/224590485-c5490363-ff3d-4e08-837a-422742d0bd49.jpg)

## **Funcionamiento**

El funcionamiento es simple en la ventana principal tan solo elegimos ya sea el dibujo del dinero para el convertidor de moneda o el de la balanza para el convertidor de peso como se muestra acontinuacion 

![tFW903D3bB](https://user-images.githubusercontent.com/94420600/224590022-9fb501ec-cdae-4246-af7b-a53a60dd0350.gif)


- Para Regresar o Ver informacion sobre el autor tan solo damos click en el dibujo de la persona ubicado en la parte inferior izquierda de todas las ventanas 
## Descripción

El conversor es un sistema basico, en el cual al inicio se nos muestra una ventana en la cual por medio de dibujos debemos elegir cual conversor deberiamos elegir.

## Proceso de Validacion

Para el proceso de validacion simplemente 

```java
char validar = e.getKeyChar();
	if ((textmoneda2.getText().length() == 10) | Character.isLetter(validar)) {
			e.consume();
	}
```
En donde tan solo limitados la cantidad de caracteres que podemos ingresar calculando eso mediante las exepciones que se realizan por medio de la libreria Swing de java para evitar que se sigan introduciendo valores o cuando el valor ingresado sea una letra, realizando el proceso de validacion 

❌ `Fallas que aun no logro solucionar` 

🕷 **Validacion:** Al momento de introducir valores me permite tanto comas y puntos, el problema viene cuando introducimos ambas en el mismo campo salta una exepcion.

![yoZDO77eY0](https://user-images.githubusercontent.com/94420600/224590974-896b598e-3322-4913-a3a7-cb763d1c4cea.gif)



🕷 **Ventana sin memoria de retorno:** Al  no querer crear varias clases iguales (La que tiene mis link y nombre) en el momento que de una ventana de conversion se presiona el boton de datos me vuelve al inicio y no regreso a la ventana que estaba anteriormente.    
* tengo una pequeña idea de como resolver este problema ya sea numerando cada clase con un identidicador y enviando ese parametro para saber a donde regresar.

![idea64_rFMCCCtVpV](https://user-images.githubusercontent.com/94420600/224591238-cfb529b5-e0db-4d7b-a12d-bd95cb491161.gif)


🕷 **Codigo muy sucio:** Falta mucha optimizacion que se ira implementando de a poco hasta obtener algo mas limpio.

🕷 **Mala eleccion de colores:** Tanto la interfaz grafica como el resto de ventanas no me convense del todo, cuando tenga inspiracion mejorara.
