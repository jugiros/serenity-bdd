<div align="left">
<h1>serenity-bdd</h1>
</div>

## Información General 🔬

| N°  | Item              |           Detalle |
|:---:|:------------------|------------------:|
|  1  | Java              |           11.0.20 |
|  2  | Gradle            |             7.0.2 |
|  3  | Navegador         |     Google Chrome |
|  4  | Sistema Operativo |    Windows 10 Pro |
|  5  | IDE               | Intellij 2021.3.2 |
|  6  | Rama principal    |              main |
|  7  | Kotlin            |            1.4.31 |
|  8  | Grovy             |             3.0.7 |
|  9  | Ant               |            1.10.9 |
| 10  | JVM               |             1.8.0 |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare
ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

``` shell 
gradle clean test aggregate -i
```

## Ver los informes 👀

El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html**
en el directorio **target/site/serenity**. Adicionalmente, puede encontrar evidencias generadas por Cucumber en la ruta **target/serenity-reports**, 
los archivos generados son:

- **rerun.txt**: Archivo de texto con la información de la línea donde falló el caso para su revisión.
- **serenity-html-report.html**: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las
  pruebas.
- **serenity-summary.html**: Este reporte es un resumen gerencial sobre los resultados de la ejecución, si desea
  obtenerlo ejecute el siguiente comando después de la ejecución de las pruebas:
  ``` gradle reports```

## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo de pruebas
- Screenplay - Patrón de diseño de pruebas
- Gradle - Administrador de dependencias del proyecto
- Selenium Web Driver - Herramienta para interaccionar con navegadores web
- Cucumber - Software que apoya el BDD
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 📌

Se usa Git para el control de versiones. 🔀
###Link del Proyecto

https://github.com/jugiros/challenge-QA

## Autor 👨 Juan Molina
https://github.com/jugiros