Microservice-2: Endpoint de búsqueda de productos

Este microservicio forma parte del proyecto multi-module "spring-boot-microservices" desarrollado con Spring Boot y Gradle. Proporciona un endpoint GET (/productos/buscar/{filtro}) para buscar productos en la base de datos según un criterio de filtro especificado.

Características principales:
- Permite buscar productos en la base de datos utilizando el endpoint GET (/productos/buscar/{filtro}).
- El parámetro {filtro} se utiliza para especificar el término de búsqueda.
- Devuelve una lista de productos que coinciden con el filtro de búsqueda.
- Utiliza Spring Boot para la configuración y el desarrollo del microservicio.
- Se integra con una base de datos MySQL para la recuperación de los datos de productos.
- Implementa pruebas unitarias utilizando JUnit y Mockito para garantizar la calidad del código.
