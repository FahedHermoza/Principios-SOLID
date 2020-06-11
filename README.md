# Principios SOLID
[![forthebadge](https://forthebadge.com/images/badges/built-by-developers.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/for-sharks.svg)](https://forthebadge.com)

Los principios SOLID son una **lista de principios para construir software siguiendo buenas practicas**, presentados por Robert C. Martin en su documento Principio de diseño y Patrones de diseño.

Las siglas representan lo siguiente:
- S: Responsabilidad única.
- O: abierto/cerrado.
- L: Sustitución de Liskov.
- I: Segregación de la interfaz.
- D: Inversión de dependencias.

# Responsabilidad única
Una clase solo debe tener una y solo una razón para cambiar.

De un software complejo cada clase solo debería ser responsable de una tarea, en consecuencia al cambiar una funcionalidad solo debería tocar una clase.

**Ventaja:**
- [x] Alta cohesión y bajo acoplamiento.

### Acoplamiento & Cohesión
Acoplamiento: Grado de interdependencia entre módulos de software 
Cohesión: Grado en que los elementos de un modulo permanecen juntos. 

**Ventajas:**
- [x] Mayor mantenibilidad.
- [x] Mayor reutilización.
- [x] Menor riesgo de cambio.

# Principio Abierto/Cerrado
Las entidades de software (clases, módulos, funciones) deberían ser abiertas para la extensión pero cerradas a la modificación.

Entonces “Abierta a la extensión pero cerrado a la modificación”, en otras palabras significa añadir nueva funcionalidad sin cambiar el código existente.

Usa clases abstractas e interfaces.

**Ventaja:**
- [x] Gestionamos nuevas extensiones(funcionalidades) de una manera mas robusta.

# Principio de Sustitución de Liskov
Cualquier clase que sea hija de una clase padre, debería poder usarse en lugar de su padre sin ningún comportamiento inesperado.

Cuando extendemos una clase no alteramos el comportamiento del padre.

Usa herencia.

**Ventaja:**
- [x] Jerarquía de clases estables.

# Principio de Segregación de Interfaz
Ninguna clase debe implementar métodos que no utilice.

Muchas interfaces especificas de cliente son mucho mejor que una interface de propósito general.

Resuelve el anti-patrón “fat interface”.

**Ventaja:**
- [x] Sistemas desacoplados.
- [x] Código sencillo de refactorizar.

# Principio de Inversión de Dependencias

1. Las clases de alto nivel no deben depender de las clases de bajo nivel.
2. Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.

El núcleo no depende de los detalles de implementación. En otras palabras que no dependa de que Base de Datos elegimos o si los datos vienen de manera local, web services o diferentes Frameworks.

Puedes usar inyección de dependencias para resolver este problema. 

**Ventaja:**
- [x] Mayor testeabilidad.
- [x] Mayor mantenibilidad.
- [x] Menor acoplamiento fuerte.

# Implementación
El código de ejemplo se basa en el lenguaje kotlin, utilice el framework IntelliJ IDEA.
- [x] [Código - Responsabilidad única]()
- [x] [Código - Principio Abierto/Cerrado]() 
- [x] [Código - Principio de Sustitución de Liskov]()
- [x] [Código - Principio de Segregación de Interfaz]()  
- [x] [Código - Principio de Inversión de Dependencias]()

# Desarrollador
**Si te sirvió** puedes darme manito arriba en mi [blog](https://www.facebook.com/fahedhermoza/).
