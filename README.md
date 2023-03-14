
# Challenge ONE Back End - Java



Este mini sistema fue creado como parte del proceso de aprendizaje en los cursos de aluraLatan 

![msedge_VcvufDeSaE](https://user-images.githubusercontent.com/94420600/224590485-c5490363-ff3d-4e08-837a-422742d0bd49.jpg)

<hr>
<hr>

## **Funcionamiento**

El funcionamiento es simple en la ventana principal tan solo elegimos ya sea el dibujo del dinero para el convertidor de moneda o el de la balanza para el convertidor de peso como se muestra acontinuacion 

![tFW903D3bB](https://user-images.githubusercontent.com/94420600/224590022-9fb501ec-cdae-4246-af7b-a53a60dd0350.gif)


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

🕷 **Codigo muy sucio:** Falta mucha optimizacion que se ira implementando de a poco hasta obtener algo mas limpio.


<br>

🕷 **Mala eleccion de colores:** Tanto la interfaz grafica como el resto de ventanas no me convense del todo, cuando tenga inspiracion mejorara.

## `Corregido `


- [x] Validacion.
- [x] Ventana sin memoria de retorno.
- [ ] Codigo Muy sucio.
- [ ] Mala Eleccion de colores.
