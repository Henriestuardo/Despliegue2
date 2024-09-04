# Usa una imagen base con OpenJDK
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR de la construcción a la imagen
COPY target/my-spring-app-0.0.1-SNAPSHOT.jar app.jar

# Ejecuta la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

# Expone el puerto en el que la aplicación escucha
EXPOSE 8080
