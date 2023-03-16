
# Challenge ONE Back End - Java



Este mini sistema fue creado como parte del proceso de aprendizaje en los cursos de aluraLatan 

![idea64_wiIWS5Z9Bn](https://user-images.githubusercontent.com/94420600/225733094-997b8e78-fc97-4195-9215-cbaf71b160f0.jpg)


<hr>
<hr>

## **Funcionamiento**

El funcionamiento es simple en la ventana principal tan solo elegimos ya sea el dibujo del dinero para el convertidor de moneda o el de la balanza para el convertidor de peso como se muestra acontinuacion 

![idea64_QOqcZlIh1o](https://user-images.githubusercontent.com/94420600/225733346-a4077167-4d71-48a0-9879-93b2436093c8.gif)



- Para Regresar o Ver informacion sobre el autor tan solo damos click en el dibujo de la persona ubicado en la parte inferior izquierda de todas las ventanas 

<hr>
<hr>

## Descripción

El conversor es un sistema basico, en el cual al inicio se nos muestra una ventana en la cual por medio de dibujos debemos elegir cual conversor deberiamos elegir.

<hr>
<hr>

## Proceso de Validacion

Para el proceso de validacion simplemente 

```python
if ((textmoneda2.getText().length() == 10) | Character.isLetter(validar)
						| (validar == '.' && textmoneda2.getText().contains(".")) | (validar == ',')
						| (validar == '.' && textmoneda2.getText().length() == 0)) {
					e.consume();
				}
```


* Limitamos el tamaño de caracteres que se ingresan.
* Solo se puede usar numeros.
* Solo se puede usar un punto en cada campo.
```python
 - [✔] 123.456
 - [X] 12.34.56
```
* Ningun campo puede iniciar con un punto
```python
 - [✔] 123.456
 - [X] .123456
```

<hr>
<hr>

❌ `Fallas que aun no logro solucionar` 
---

🕷 **Validacion:** ~~Al momento de introducir valores me permite tanto comas y puntos, el problema viene cuando introducimos ambas en el mismo campo salta una exepcion.~~


![yoZDO77eY0](https://user-images.githubusercontent.com/94420600/224590974-896b598e-3322-4913-a3a7-cb763d1c4cea.gif)

<br>

🕷 **Ventana sin memoria de retorno:** ~~Al  no querer crear varias clases iguales (La que tiene mis link y nombre) en el momento que de una ventana de conversion se presiona el boton de datos me vuelve al inicio y no regreso a la ventana que estaba anteriormente.~~


![idea64_rFMCCCtVpV](https://user-images.githubusercontent.com/94420600/224591238-cfb529b5-e0db-4d7b-a12d-bd95cb491161.gif)
 

 <code><strong>Solucion mas sencilla gano, no cerrar la ventana que invoca y cerrar solo la ventana, tambien se cierra si pierde el focus.</strong></code>
 
 
 <hr>

🕷 **Codigo muy sucio:** ~~Falta mucha optimizacion que se ira implementando de a poco hasta obtener algo mas limpio.~~


<br>

🕷 **Mala eleccion de colores:** ~~Tanto la interfaz grafica como el resto de ventanas no me convense del todo, cuando tenga inspiracion mejorara.~~

## `Corregido `


- [x] Validacion.
- [x] Ventana sin memoria de retorno.
- [x] Codigo Muy sucio.
- [x] Mala Eleccion de colores.

<br>
<hr>
<hr>

## Autor

[<img src="https://avatars.githubusercontent.com/u/94420600?v=4" width=115><br><sub>Robinson Rezabala</sub>](https://github.com/rRashu) 

<code><strong>Si tiene en mente alguna mejora del programa o que considere que falta algo no dude a escribir.</strong></code>
 
