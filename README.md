    Lenguaje de marcado de hipertexto o también conocido como HTML, es un lenguaje estándar para crear páginas web. Utiliza etiquetas para organizar y presentar texto, imágenes, videos y otro tipo de elementos cuya estructura y contenido se define en un sitio web.
    La función principal de HTML es definir la estructura, incorporar contenido crear enlaces, proporcionar semántica permitiendo que los navegadores interpreten y muestren el contenido de forma coherente. 

<Etiqueta HTML> Es un elemento clave que define la estructura y el contenido de una página web, estas se utilizan para indicar al navegador como mostar elementos como texto, imágenes, videos entre otros elementos y funcionan como marcadores que delimitan el inicio y fin de un elemento. Unas de las etiquetas más comunes o utilizadas que definen la estructura básica del documento, el contenido y la presentación visual son:

<a href="http://direccion">TEXTO</a>   →  Un vínculo a una dirección web
<b>TEXTO</b>   → El texto encerrado se mostrará en negrita
<br>   → Un salto de línea
<div></div>   → Contenedor o bloque, puede contener texto o cualquier otro elemento
<em>TEXTO</em>  →  El texto encerrado se mostrará en cursiva
<h1>TEXTO</h1>   → Encierra un encabezado de una sección, desde h1 hasta el h6
<hr>  →  Inserta una línea o división
<i>TEXTO</i>  →  El texto encerrado se mostrará en cursiva
<img src="imagen.jpg" alt="">   → Inserta una imagen
<input>   → Inserta una forma o control
<input type="text">  →  Entrada de texto
<input type="button">   → Boton
<input type="checkbox">  → Casilla
<ol></ol> Lista ordenada, <ul></ul>  → Una lista desordenada
<p>TEXTO</p>  → Inserta un párrafo
<pre>TEXTO O CODIGO</pre>  → Muestra el texto pre-formateado
<script></script>  → Inserta un código que ejecuta una función
<span></span>   → Permite dar estructura al contenido
<table></table>  →  Inserta una tabla con las líneas y columnas que se especifiquen
<textarea>TEXTO</textarea>   → Inserta un cuadro de texto

    Atributo de una etiqueta HTML:  es una nombre y valor adicional que se añade a la etiqueta de apertura de un elemento para proporcionar información extra, modificar su comportamiento o apariencia, y darle funcionalidad específica estos pueden almacenar información que no es directamente visible pero que se necesitan para entender o procesar el elemento.

 id → Identificador único para un elemento.
class → Define una o varias clases para aplicar estilos con CSS o manipular con JavaScript.
  style → Permite aplicar estilos CSS en línea directamente al elemento.
  title → Muestra un texto cuando el usuario pasa el mouse sobre el elemento (tooltip).
  alt → Texto alternativo de una imagen (muy importante para accesibilidad y SEO).
  src → Especifica la ruta de un recurso (usado en imágenes, scripts, videos, etc.).
  href → Indica la dirección de un enlace (en <a> o <link>).
  target → Define dónde se abre un enlace (_blank, _self, etc.).
  type → Especifica el tipo de elemento (común en <input> o <script>).
  value → Valor inicial de un campo de formulario o botón.
  name → Identifica un elemento de formulario para enviarlo al servidor.
  placeholder → Texto guía dentro de un campo de entrada.
  disabled → Deshabilita un elemento de formulario para que no se pueda usar.
  checked → Marca por defecto un checkbox o radio button.
  readonly → Hace que un campo sea de solo lectura.
  maxlength → Límite de caracteres en un campo de texto.
  width / height → Tamaño de imágenes, videos o iframes.
  lang → Define el idioma del contenido.
  data-* → Atributos personalizados para almacenar datos adicionales en un elemento.

    CSS es un lenguaje de estilos utilizado para proporcionar cualidades visuales y estéticas a una página web hecha en HTML.
Las tres formas principales de aplicar CSS en HTML son:

1.	INLINE CSS → Dentro del mismo elemento usando el atributo style ejemplo:
<p style="color: blue; font-size: 18px;">Texto en azul con tamaño 18px</p>
2.	INTERNAL CSS → Dentro de la etiqueta <style>  en el <head> ejemplo:
<head>
  <style>
    p {
      color: green;
      font-size: 20px;
    }
  </style>
</head>
<body>
  <p>Este texto es verde y de 20px</p>
</body>

3.	EXTERNAL CSS→ En un archivo separado (styles.css) que se enlaza con <link> ejemplo:
<!-- En el head -->
<link rel="stylesheet" href="styles.css">
/* styles.css */
body {
  background-color: #f4f4f4;
  font-family: Arial, sans-serif;
}

h1 {
  color: darkblue;
  text-align: center;
}

    Una Propiedad en CSS es un atributo que se aplica a un elemento HTML  para definir su estilo visual, las propiedades tienen un valor específico que determina como se mostrará dicho elemento, por ejemplo.  
Color define el color de texto, Font-size define el tamaño de la fuente y la propiedad background-color define color de fondo.

Las propiedades se declaran dentro de un bloque de reglas con la siguiente estructura:

selector {
  propiedad: valor;
}

 Otras propiedades más comunes son: 
  font-family → tipo de letra

  text-align → alineación del texto

  margin → márgenes externos

  padding → espacio interno

  border → bordes

  width / height → ancho y alto

                 display → tipo de visualización (block, inline, flex, etc.)

Un SELECTOR es una parte de la regla CSS la cual indica a qué elementos HTML se aplicarán los estilos definidos en esa regla o a quien aplicar los estilos.

Los tipos principales que existen son: 

  Universal (*) → selecciona todos los elementos.

  Por etiqueta (p, h1, div) → selecciona todos los de ese tipo.

  Por id (#id) → selecciona un único elemento con ese id.

  Por clase (.clase) → selecciona todos los elementos con esa clase.

  Descendiente (div p) → selecciona elementos dentro de otro.

  Agrupados (h1, h2, p) → aplica el mismo estilo a varios.

  Atributo (input[type="text"]) → selecciona según un atributo.

JavaScript (JS) Es un lenguaje de programación que aporta interactividad y dinamismo a paginas web, funciona junto con HTML y CSS para crear mejores experiencias de usuario.
añade la interactividad a las páginas web de la siguiente forma:

1.	Insertando código en HTML:  dentro de la etiqueta <script> en el documento o enlazando un archivo externo con <script src= “app.js”> </script>

2.	Usando eventos: se asocian aciiones a elementos (ej: onclick, onchange, onmouseover).

3.	Manipulando el DOM: Con métodos como getElementById, querySelector, innerText, style, etc.

Los Datos Primitivos en JS son valores atómicos que no son objetos ni tienen métodos, son inmutables (no se pueden modificar directamente, solo reemplazar). 
Los más básicos son:
  string → texto (ej: "Hola", 'Mundo')
  number → números enteros o decimales (ej: 42, 3.14)
  boolean → valores lógicos (true o false)
  null → valor intencionalmente vacío
  undefined → valor no asignado
  bigint → números enteros muy grandes (ej: 12345678901234567890n)
  symbol → valores únicos usados como identificadores
Las estructuras de control de flujo sirven para decidir que código ejecutar y cuántas veces.
1.	Condicionales: se usan para ejecutar bloques de código dependiendo de una condición. 
If/else: 
let edad = 20;

if (edad >= 18) {
  console.log("Mayor");
} else {
  console.log("Menor");
}

Switch: se usa cuando hay muchas condiciones posibles para un mismo valor.
let dia = 1;

switch (dia) {
  case 1: console.log("Lunes"); break;
  case 2: console.log("Martes"); break;
  default: console.log("Otro día");
}
2.	Bucles

For: ejecuta un bloque un número definido de veces.

for (let i = 1; i <= 3; i++) {
  console.log(i);
}

While: se repite mientras la condición sea verdadera.

let i = 1;
while (i <= 3) {
  console.log(i);
  i++;
}
do…while: ejecuta al menos una vez, aunque la condición sea falsa. 

let j = 1;
do {
  console.log(j);
  j++;
} while (j <= 3);

Importancia de usar nombres significativos para variables y métodos: Usar nombres significativos para variables y métodos en muy impórtate porque permite que el código sea más claro, fácil de comprender y mantener tanto para uno como para los demás desarrolladores. Un nombre describe la función o el dato que representa, lo que reduce errores y evita confusiones, facilitando así el trabajo y cumpliendo las buenas prácticas de programación. 
Variables de entorno: Son valores que se guardan en el sistema operativo y se usan para configurar el funcionamiento de programas. Sirven también para guardar información como rutas de archivos, claves, puertos o configuraciones sin tener que escribirlas directamente en el código, son de gran importancia en la programación ya que permite separar la configuración del código lo que logra que las aplicaciones sean seguras, portables y fáciles de mantener.
En JavaScript, en especial en el desarrollo con Node.js estas variables son de mucha importancia porque nos permite separar la configuración del código que ayuda a que las aplicaciones sean más seguras fáciles de mantener y flexibles. Gracias a estas se pueden almacenar claves de API (códigos únicos que sirven para identificar y autenticar a un usuario), contraseñas, puertos o direcciones de bases de datos sin escribirlos directamente en el programa, lo que evita exponer información sensible. Además, facilitan que una misma aplicación funcione en distintos entornos (desarrollo, pruebas o producción) simplemente cambiando las variables de entorno, sin necesidad de modificar el código fuente.
Herramientas de desarrollo de Chrome
Las herramientas de desarrollo de Chrome son un conjunto de utilidades de depuración y perfiles para web que se encuentran en el navegador Google Chrome y es para programadores y diseñadores web. Con ellas se pueden revisar errores, probar código, analizar el rendimiento modificar una página en tiempo real, la forma de acceder es sencilla.
•	Clic derecho en la página 
•	Seleccionar la opción “Inspeccionar”
Otra opción son los atajos de teclado como
•	F12 
•	Ctrl+Shift+I.
•	Cmd + Option + J

Panel Elements permite explorar la estructura HTML de una página y también los estilos CSS aplicados a cada elemento. Desde ahí se puede editar etiquetas, clases o estilos directamente y ver los cambios reflejados al instante, lo que resulta muy útil para probar ajuste de diseño sin tener que modificar el código fuente original. 
Panel Console funciona como una terminal dentro del navegador en el que se puede escribir y ejecutas comandos de JavaScript. Además, muestra mensajes de depuración, advertencias y errores del sitio web. Es una herramienta clave para los desarrolladores porque permite probar fragmentos de código rápidamente y encontrar fallas en el funcionamiento de una aplicación web.
Panel Network en este se listan todos los recursos que cargan una pagina web, tales como archivos CSS, JavaScript, imágenes, videos o solicitudes de APIs. También muestran detalles como el tamaño de los archivos, el tiempo de carga y si alguna petición falló. Esta información es importante ya que ayuda a detectar cuellos de botella, optimizar la velocidad de carga y resolver problemas de conexión o rendimiento en la aplicación 
