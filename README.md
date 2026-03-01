# 🚀 Implementación de Endpoint GET con Spring Boot

¡Bienvenido! Este repositorio detalla el proceso paso a paso para la creación de un microservicio capaz de responder con un mensaje de "Hola Mundo", explorando desde la configuración inicial hasta la resolución de dependencias en el ecosistema de **Java**.

<p>
  <img src="https://img.shields.io/badge/-Spring%20Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white" alt="Spring Boot Badge">
  <img src="https://img.shields.io/badge/-Java-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java Badge">
  <img src="https://img.shields.io/badge/-Maven-C71A36?style=flat&logo=apache-maven&logoColor=white" alt="Maven Badge">
  <img src="https://img.shields.io/badge/-VSCode-007ACC?style=flat&logo=visual-studio-code&logoColor=white" alt="VS Code Badge">
</p>

---

## 🧐 ¿Qué es un Endpoint GET?
En el desarrollo de APIs, un **Endpoint** es una URL específica que permite a un cliente comunicarse con el servidor. El método **GET** se utiliza exclusivamente para solicitar o recuperar información del servidor sin alterar su estado.

---

## 🛠️ Guía de Implementación Paso a Paso

### 1. Configuración en Spring Initializr
Se utilizó [start.spring.io](https://start.spring.io) para generar el esqueleto del proyecto. A continuación, el significado de las especificaciones utilizadas:

* **Project (Maven):** Herramienta encargada de gestionar el ciclo de vida del proyecto y descargar automáticamente las librerías necesarias.
* **Language (Java):** Lenguaje de programación base del backend.
* **Spring Boot (3.4.x):** Versión estable del framework que simplifica la configuración del servidor.
* **Group (`vallegrande.edu.pe`):** Identificador único basado en el dominio de la institución.
* **Artifact (`demo`):** Nombre técnico del proyecto.
* **Packaging (Jar):** Formato de empaquetado que genera un archivo ejecutable único.
* **Dependencies (Spring Web):** Dependencia vital que incluye el servidor **Apache Tomcat** y las librerías necesarias para crear servicios RESTful.

### 2. Corrección del Archivo `pom.xml`
Durante la actividad, se detectó que el proyecto no reconocía las anotaciones web. La solución consistió en integrar manualmente la dependencia **Web** dentro del bloque `<dependencies>`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

### 3. Desarrollo del Controlador

Se creó la clase `HolaMundoController.java` para gestionar las peticiones entrantes. En este paso se aplicaron los siguientes conceptos:

* **`@RestController`**: Indica que la clase manejará datos web y los devolverá directamente al cuerpo de la respuesta.
* **`@GetMapping("/hola")`**: Establece la ruta URL relativa que activará el método.

```java
package vallegrande.edu.pe.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String decirHola() {
        return "¡Hola Mundo desde Spring Boot, Sebastian!";
    }
}
```

### 4. Compilación y Despliegue

Para levantar el servidor local, se utilizó el siguiente comando en la terminal (CMD):

```cmd
mvnw spring-boot:run
```

Este proceso compila el código Java, descarga las dependencias del `pom.xml` y arranca el servidor en el puerto por defecto.

### 5. Verificación del Resultado

Finalmente, se comprobó el funcionamiento accediendo a la siguiente dirección en el navegador:
👉 `http://localhost:8080/hola`

---

## 💻 Especificaciones del Entorno

| Herramienta | Versión |
|-------------|---------|
| **Java (JDK)** | `17` |
| **Spring Boot** | `3.2.0` |
| **Maven** | `3.x` |

<p>
<a href="mailto:sebastian.alvarez@vallegrande.edu.pe">
<img src="https://img.shields.io/badge/-Correo-D14836?style=flat&logo=gmail&logoColor=white" alt="Correo Badge">
</a>
</p>
