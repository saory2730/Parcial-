HTML, CSS y JavaScript
HTML

Lenguaje de marcado de hipertexto o también conocido como HTML, es un lenguaje estándar para crear páginas web.
Utiliza etiquetas para organizar y presentar texto, imágenes, videos y otros elementos cuya estructura y contenido se define en un sitio web.

La función principal de HTML es:

Definir la estructura

Incorporar contenido

Crear enlaces

Proporcionar semántica

Etiquetas comunes en HTML

<a> → Vínculo a una dirección web

<b> → Texto en negrita

<br> → Salto de línea

<div> → Contenedor o bloque

<i> → Texto en cursiva

<h1> … <h6> → Encabezados

<hr> → Línea de división

<img> → Imagen

<input> → Entrada de texto, botón, casilla

<ol> → Lista ordenada

<ul> → Lista desordenada

<p> → Párrafo

<pre> → Texto preformateado

<script> → Código que ejecuta una función

<table> → Tabla

<textarea> → Área de texto

Atributos importantes

id → Identificador único

class → Clases CSS o JS

style → Estilos en línea

title → Tooltip al pasar el mouse

alt → Texto alternativo en imágenes

src → Fuente de recurso (imagen, script, etc.)

href → Enlace

target → Dónde se abre un enlace (_blank, _self)

type, value, name, placeholder, disabled, etc.

CSS

CSS es un lenguaje de estilos que da apariencia a las páginas web.

Formas de aplicar CSS

Inline CSS → dentro del mismo elemento

<p style="color: blue; font-size: 18px;">Texto azul</p>


Internal CSS → dentro de <style> en el documento

<style>
   p { color: green; font-size: 20px; }
</style>


External CSS → en un archivo styles.css

body { background: #f4f4f4; font-family: Arial; }
h1 { color: darkblue; text-align: center; }

Propiedades comunes

color → color de texto

font-size → tamaño de letra

background-color → color de fondo

margin, padding, border

width, height, display

Selectores

* → universal

p, h1, div → por etiqueta

#id → por id

.clase → por clase

div p → descendiente

[type="text"] → por atributo

JavaScript

JavaScript (JS) es un lenguaje que da dinamismo e interactividad a las páginas web.

Formas de usar JS

Código en <script>

Archivos externos <script src="app.js"></script>

Eventos: onclick, onchange, onmouseover

Manipulación del DOM: getElementById, querySelector, innerText, etc.

Tipos de datos primitivos

string, number, boolean, null, undefined, bigint, symbol

Estructuras de control
let edad = 20;
if (edad >= 18) {
  console.log("Mayor");
} else {
  console.log("Menor");
}

for (let i = 1; i <= 3; i++) {
  console.log(i);
}

Variables de entorno

Son valores que se guardan en el sistema operativo y ayudan a configurar aplicaciones (claves, puertos, etc.).

Herramientas de desarrollo de Chrome

Panel Elements → estructura HTML + estilos

Panel Console → mensajes, errores, pruebas JS

Panel Network → recursos cargados, tiempos, errores

Atajos:

F12

Ctrl + Shift + I

Cmd + Option + J
