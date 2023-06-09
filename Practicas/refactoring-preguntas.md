### 1) Cuando hablamos de reuso en el marco del desarrollo de software, ¿a qué nos referimos?
Consiste en utilizar software existente (a nivel aplicacion, component u objeto), a fin de poder desarrollar software de calidad en menor tiempo y costo.
Algunos de los beneficios de reutilizar software:
* Mayor confianza
* Disminuye riesgos del proceso
* Uso efectivo de especialistas de software
* Uso de standares
* Rapidez en desarrollo

### 2)¿Cuáles son las dificultades que encontramos cuando intentamos reusar código?
Algunas de las dificultades que pueden ocurrir son:
* Puede incrementar el costo de mantenimiento, en caso que el codigo fuente no este a disposicion.
* Falta de soporte
* Algunos desarrolladores prefieren desarrollar su propio código: para tener mayor control sobre él y/o porque lo consideran mas desafiante.
* Falta de madurez en las tecnicas para clasificar, catalogar software.

### 3) Cuando aplicamos patrones de diseño, ¿qué estamos reusando? ¿De qué manera los patrones de diseño atacan las dificultades del reúso?
Al utilizar patrones, reutilizamos muchas veces el diseño de la estructura de clases y comportamientos, para atacar un problema común.
Es una forma de reutilizar conocimiento abstracto acerca de un problema y su solución.

Dificultades de reúso: 

* Dificultades de mantenimiento: Los patrones de diseño están pensados justamente para lograr soluciones de software escalables y perdurables.
* Programadores prefieren hacer todo ellos: los patrones de diseño están validados y avalados por la comunidad de programadores como soluciones eficientes ante problemas habituales.
* Hacer software reusable es dificil y costoso: los patrones de diseño ayudan a abstraer la solución a problemas comunes, de forma tal que sea fácil de replicar en distintos escenarios.
* Esfuerzo adicional para utilizarlos y aprenderlos: existe mucha bibliografía al respecto en el caso de patrones de diseño.

### Cuando utilizamos librerías de clases, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan las librerías de clases las dificultades de reúso? 

Las librerías de clase, resuelven también problemas comunes a la mayoría de las aplicaciones (como por ejemplo manejo de archivos, fechas, etc)
Cada clase en la librería resuelve un problema concreto, independientemente del contexto de uso. Luego nuestro codigo controla los objetos de la librería.

### Cuando utilizamos frameworks orientados a objetos, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan los frameworks las dificultades de reúso? 

Un framework es una aplicación "semi-completa", reusable, que puede ser especializada para producir aplicaciones a medida.
Es un conjunto de clases concretas y abstractas relacionadas, que provee una arquitectura reusable.

El framework define el esqueleto, y el desarrollador define sus propias características.
A diferencia de una librería, el framwork produce una estructura coherente, en lugar de un conjunto de "clases utiles"

### Por lo general, ¿es posible y lógico reusar, de forma aislada, solo algunas clases de un framework? ¿es posible y lógico utilizar solo algunas clases de una librería de clases? Justifique. 

### De acuerdo a el tipo de problema que atacan, ¿como se clasifican los frameworks? 

### ¿A que nos referimos con los términos hot spot y frozen spot?
HotSpot: partes del artefacto a construir con el framework que puedo cambiar. Refiere de manera abstracta, a un aspecto que puedo cambiar
FrozenSpot: son las partes que serán igual para todos los artefactos construidos con el framework

### ¿A qué nos referimos con "instanciar un framework"? ¿Qué sería "instanciar un hostpot"?

Instanciar un hostpot, significa hacer uso del mismo. Algunos los tengo que instanciar si o si, otros "puedo" instanciarlos. Instanciar un hostpot puede requirir una composición de acciones, de herencia y composición.


### ¿En qué se diferencia la visión que tienen de un framework: a) los desarrolladores del framework, b) quienes usan/instancian el framework? 

<b> Herencia </b>
Como usuarios:
* Implemento, extiendo, y redefino métodos
* Uso variables y métodos heredados
* Podría cambiar cosas que el desarrollador no tuvo en cuenta
* Puedo extender el framework
* Debo aprender qué heredo y qué puedo hacer con ello
* No puedo heredar comportamiento de otro lado

Como desarrolladores:
* Dejo ganchos en clases del framework (abstractas y concretas)
* Paso el control con mensajes a self
* Se que esperar del código del usuario (si hace lo que digo)
* No necesito pensar todos los hotspots y todos sus casos
* No necesito pasar estado como parámetros (está en las v.i.)
* Debo documentar claramente que se puede tocar y que no
* No puedo cambiar el diseño sin preocuparme por los usuario

<b> Composicion </b>

Como usuarios:
* Instancio y configuro
* Conecto a mi código con callbacks• Solo conozco algunas clases del framework y sus mensajes
* Mis objetos son mis objetos, heredo de donde quiero• No puedo cambiar o extender el framework
* Solo tengo acceso a los objetos que recibo en los callbacks

Como desarrolladores:
* Dejo objetos configurables para ajustar el comportamiento• Paso el control con callbacks
* Debo pensar todos los hotspots y
sus casos
* Debo pasar/actualizar todo el estado necesario en los callbacks• No se nada del código del usuario• No necesito explicar (mucho) como funciona
* Puedo cambiar mi diseño sin preocuparme (mucho) por los usuarios

### ¿En qué se diferencia un framework blackbox de uno whitebox? Un framework, ¿cae exclusivamente en una de esas categorías?

Los frameworks whitebox, son los que aplican herencia en sus puntos de extensión. Los que aplican composición son de "caja negra". La mayoría de los frameworks están en un punto intermedio.

### Desde la perspectiva de quien "hace" el framework, ¿qué implica optar por whitebox, o blackbox? Piense por ejemplo en las facilidades y las dificultades que encuentra en cada caso.


### Desde la perspectiva de quien "usa" el framework, ¿qué implica que el mismo sea whitebox, o blackbox? Piense por ejemplo en las facilidades y las dificultades que encuentra en cada caso.


La cantidad de "puntos de variabilidad" de un framework (es decir, sus hotspots) depende de cuan complejo es el dominio que ataca (es decir, de cuantas cosas podrían cambiar de aplicacion a aplicación). Por lo general, un framework tiene más hotspots que los que el usuario promedio requiere (piense que quien hizo el framework tuvo en cuenta las expectativas de muchos de ellos). ¿Siempre es necesario instanciar (configurar, subclasificar) todos los hotspots o hay algo que el diseñador del framework puede hacer para reducir el trabajo de instanciación del mismo en los casos más simples?


¿Que patrones de diseño, de los que hemos visto en clase, se encuentran comúnmente en los hotspots de un framework? ó ¿Qué patrones de diseño, de los vistos en clase, son generadores de hotspots?


Los conceptos de template y hook (plantilla y ganchos) los encontramos en el template method, en el marco de una relación entre una clase y sus subclases. También se lo puede encontrar en una relación de composición. Ambas situaciones son comunes en los hotspots de un framework. ¿De que manera afecta una y la otra alternativa al comportamiento runtime de las aplicaciones que instancia el framework/hostpot?
(esto no es un pregunta, es una confirmación) Comprender que un hotspots es en principio un concepto abstracto que describe un acuerdo entre el desarrollador del framework y sus usuarios (esto es claro cuando uno piensa el cosas como los hotspot cards). Puede variar en granularidad. En el código pueden terminar siendo: a) sólo un método; b) clases a subclasificar, implementando un conjunto de métodos en cada una; c) objetos a configurar/componer 
Le proponen hacer hacer una aplicación en un dominio que es nuevo para usted. Le aclaran que a esa le seguirán muchas parecidas. Usted piensa automáticamente en reúso y en cuanto tiempo y dinero ganará a futuro si puede reusar. Enfoca toda su fuerza en, como primer paso, construir un framework. ¿Tiene sentido? Si cree que si, ¿cómo lo haría? Si cree que no, cuáles cree que son los pasos para eventualmente poder reusar. 
¿Cómo cree usted que se relacionan los temas: patrones de diseño, refactoring (y refactoring to patterns), frameworks, y unit testing?
