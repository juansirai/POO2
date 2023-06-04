###1) Cuando hablamos de reuso en el marco del desarrollo de software, ¿a qué nos referimos?
Consiste en utilizar software existente (a nivel aplicacion, component u objeto), a fin de poder desarrollar software de calidad en menor tiempo y costo.
Algunos de los beneficios de reutilizar software:
* Mayor confianza
* Disminuye riesgos del proceso
* Uso efectivo de especialistas de software
* Uso de standares
* Rapidez en desarrollo

###2)¿Cuáles son las dificultades que encontramos cuando intentamos reusar código?
Algunas de las dificultades que pueden ocurrir son:
* Puede incrementar el costo de mantenimiento, en caso que el codigo fuente no este a disposicion.
* Falta de soporte
* Algunos desarrolladores prefieren desarrollar su propio código: para tener mayor control sobre él y/o porque lo consideran mas desafiante.
* Falta de madurez en las tecnicas para clasificar, catalogar software.

###3) Cuando aplicamos patrones de diseño, ¿qué estamos reusando? ¿De qué manera los patrones de diseño atacan las dificultades del reúso?
Al utilizar patrones, reutilizamos muchas veces el diseño de la estructura de clases y comportamientos, para atacar un problema común.
Es una forma de reutilizar conocimiento abstracto acerca de un problema y su solución.

Cuando utilizamos librerías de clases, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan las librerías de clases las dificultades de reúso? 
Cuando utilizamos frameworks orientados a objetos, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan los frameworks las dificultades de reúso? 
Por lo general, ¿es posible y lógico reusar, de forma aislada, solo algunas clases de un framework? ¿es posible y lógico utilizar solo algunas clases de una librería de clases? Justifique. 
De acuerdo a el tipo de problema que atacan, ¿como se clasifican los frameworks? 
¿A que nos referimos con los términos hot spot y frozen spot?
¿A qué nos referimos con "instanciar un framework"? ¿Qué sería "instanciar un hostpot"?
¿En qué se diferencia la visión que tienen de un framework: a) los desarrolladores del framework, b) quienes usan/instancian el framework? 
¿En qué se diferencia un framework blackbox de uno whitebox? Un framework, ¿cae exclusivamente en una de esas categorías?
Desde la perspectiva de quien "hace" el framework, ¿qué implica optar por whitebox, o blackbox? Piense por ejemplo en las facilidades y las dificultades que encuentra en cada caso.
Desde la perspectiva de quien "usa" el framework, ¿qué implica que el mismo sea whitebox, o blackbox? Piense por ejemplo en las facilidades y las dificultades que encuentra en cada caso.
La cantidad de "puntos de variabilidad" de un framework (es decir, sus hotspots) depende de cuan complejo es el dominio que ataca (es decir, de cuantas cosas podrían cambiar de aplicacion a aplicación). Por lo general, un framework tiene más hotspots que los que el usuario promedio requiere (piense que quien hizo el framework tuvo en cuenta las expectativas de muchos de ellos). ¿Siempre es necesario instanciar (configurar, subclasificar) todos los hotspots o hay algo que el diseñador del framework puede hacer para reducir el trabajo de instanciación del mismo en los casos más simples?
¿Que patrones de diseño, de los que hemos visto en clase, se encuentran comúnmente en los hotspots de un framework? ó ¿Qué patrones de diseño, de los vistos en clase, son generadores de hotspots?
Los conceptos de template y hook (plantilla y ganchos) los encontramos en el template method, en el marco de una relación entre una clase y sus subclases. También se lo puede encontrar en una relación de composición. Ambas situaciones son comunes en los hotspots de un framework. ¿De que manera afecta una y la otra alternativa al comportamiento runtime de las aplicaciones que instancia el framework/hostpot?
(esto no es un pregunta, es una confirmación) Comprender que un hotspots es en principio un concepto abstracto que describe un acuerdo entre el desarrollador del framework y sus usuarios (esto es claro cuando uno piensa el cosas como los hotspot cards). Puede variar en granularidad. En el código pueden terminar siendo: a) sólo un método; b) clases a subclasificar, implementando un conjunto de métodos en cada una; c) objetos a configurar/componer 
Le proponen hacer hacer una aplicación en un dominio que es nuevo para usted. Le aclaran que a esa le seguirán muchas parecidas. Usted piensa automáticamente en reúso y en cuanto tiempo y dinero ganará a futuro si puede reusar. Enfoca toda su fuerza en, como primer paso, construir un framework. ¿Tiene sentido? Si cree que si, ¿cómo lo haría? Si cree que no, cuáles cree que son los pasos para eventualmente poder reusar. 
¿Cómo cree usted que se relacionan los temas: patrones de diseño, refactoring (y refactoring to patterns), frameworks, y unit testing?
