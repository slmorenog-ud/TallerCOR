
# Taller Practico – Chain of Responsibility

## Descripcion

Este taller tiene como proposito aplicar el patron de diseño Chain of Responsibility
en un sistema de soporte tecnico multinivel desarrollado en Java.

El problema parte de un diseño inicial basado en multiples condicionales
centralizados, lo que genera rigidez, alto acoplamiento y baja escalabilidad.

El objetivo es rediseñar el sistema utilizando una cadena de responsabilidad
en la que cada nivel de soporte pueda procesar la solicitud correspondiente
o delegarla al siguiente nivel.

---

## Objetivos de aprendizaje

- Comprender el funcionamiento del patron Chain of Responsibility.
- Aplicar el principio de responsabilidad unica (SRP).
- Reducir el acoplamiento mediante composicion.
- Diseñar una solucion extensible sin modificar clases existentes.

---

## Contexto del problema

El sistema gestiona solicitudes (Request) clasificadas por nivel de prioridad:

- BASIC
- INTERMEDIATE
- CRITICAL

Cada nivel de soporte debe atender unicamente la prioridad correspondiente:

| Prioridad     | Clase responsable            |
|--------------|------------------------------|
| BASIC        | Level1SupportHandler         |
| INTERMEDIATE | Level2SupportHandler         |
| CRITICAL     | Level3SupportHandler         |

Si un nivel no puede atender la solicitud, debe delegarla al siguiente en la cadena.

---

## Requisitos principales
- Completar la clase Main de manera que se evidencie el uso de Chain of Responsability
- Implementar las clases:
  - Level1SupportHandler
  - Level2SupportHandler
  - Level3SupportHandler
- Construir correctamente la cadena de responsabilidad.
- No utilizar condicionales externos en la clase principal para decidir que nivel procesa la solicitud.
- Usar composicion para encadenar los handlers.
- Permitir la extension del sistema agregando nuevos niveles sin modificar clases existentes.

---

## Entregables

- Diagrama UML del diseño.
- Codigo fuente organizado.
---

## Criterios de evaluacion

Se evaluara:

- Aplicacion correcta del patron.
- Coherencia entre el diseño UML y la implementacion.
- Codigo funcional y extensible (Que se pueda aumentar con mas niveles y clases, sin modificar existentes).
- Uso adecuado de composicion y desacoplamiento.
