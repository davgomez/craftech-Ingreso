# craftech-Ingreso
Pruebas de ingreso

El proyecto esta dividido en dos partes: Frontend y Backend
 - El Frontend esta desarrollado en ReactJS
 - El Backend esta desarrollado en Spring Boot. Esto se debe a que no tengo mucha práctica con Django y se me complico un poco el desarrollo del mismo y opté por Spring Boot ya que considero que eso no influye en la prueba.
   
La forma de levantar la aplicacioón ir a la carpeta craftech-ing
 - Desde la consola ejecutar docker-compose build
 - Estando en ese mismo directorio ejecutar docker-compose up
 - Luego desde un navegador dirigirse a la url:localhost:3030/{userName}/hour. Esto te dirige a una página donde aparece el nombre del usuario que toma del parametro de la url y la hora 
