Proyecto 1 - Entrega 2
Santiago Delgado - 202212284
Pablo Ramirez - 202321722
Andres Felipe Santana - 202311502

Descripción: Este proyecto es una aplicación de consola en Java diseñada para gestionar Learning Paths (rutas de aprendizaje) y actividades asociadas a ellos. Los usuarios pueden registrarse, iniciar sesión, crear Learning Paths y añadir actividades en una misma ejecución, ya que actualmente el programa no cuenta con persistencia de datos.

Instrucciones de Ejecución
  - Clase Principal: Para ejecutar el programa, inicia desde la clase Principal ubicada en el paquete Consola.
  
  - Flujo del Programa:
  
  - Registro de Usuario: La primera vez que se ejecuta el programa, puedes registrar un nuevo usuario ingresando un nombre de usuario, contraseña y rol.
  - Inicio de Sesión: Una vez registrado, puedes iniciar sesión ingresando tus credenciales de usuario.
  - Creación de Learning Paths: Después de iniciar sesión, podrás acceder a la opción de crear un nuevo Learning Path.
  - Añadir Actividades: Una vez creado el Learning Path, se pueden añadir actividades a este, ingresando detalles como el título, descripción, duración, y otros parámetros.
  Nota: Dado que la aplicación no guarda datos entre ejecuciones, es importante completar el flujo de registro, inicio de sesión, y creación de Learning Paths y actividades en la misma sesión.

Características
  - Registro de Usuarios: Permite la creación de usuarios con roles específicos (Profesor o Estudiante).
  - Inicio de Sesión: Verifica las credenciales de los usuarios para permitir el acceso a las funciones del programa.
  - Gestión de Learning Paths: Los usuarios pueden crear, editar y visualizar Learning Paths.
  - Feedback: Los usuarios pueden dejar comentarios y un rating.
  - Añadir Actividades: Cada Learning Path puede contener múltiples actividades para cumplir objetivos de aprendizaje específicos.

Tecnologías
  - Lenguaje: Java
  - Ejecución: Consola

Ejecución y Limitaciones
  - Persistencia: No existe almacenamiento persistente, por lo cual todos los datos se pierden al cerrar el programa.
  - Uso Continuo: Para crear y manipular Learning Paths y actividades, se recomienda seguir el flujo completo (registro, inicio de sesión, creación de Learning Paths y actividades) en una misma ejecución de la aplicación.