# Modelo-N-Capas
Ejercicio de ejemplo de la Arquitectura N capas desarrollado en JAVA
<h1>Integrantes</h1>
<p> Diego Fernando Güiza Galeano</p>
<p>Juan Camilo Guaba </p>
<p>Wilmer Ricardo Pachon</p>
<h2>Implementación</h2>
<p>Para la implementación del ejemplo se recurrió entonces a la autenticación de un usuario con algunas características propias de una persona dentro de una base de datos, para este caso entonces se cuenta con el id del usuario, el nombre del mismo y su correspondiente constraseña o password, esta capa corresponde a la declaración de la entidad, se enlaza con la capa de acceso de datos, que envía una serie de instancias a la capa Entidad que contiene la definicion de usuarios, posterior a ello la capa de negocio se encarga de acceder a la capa de datos obteniendo un array de usuarios que a su vez vienen de la capa entidad, como se evidencia una capa se relaciona únicamente con otra capa, a diferencia de un posible modelo vista controlador que tiene una estructura de comunicacion triangular </p>
