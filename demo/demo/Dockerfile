# Usa imagem base do Java 21
FROM eclipse-temurin:21-jdk-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o .jar gerado pela aplicação
COPY build/libs/demo-*.jar app.jar

# Expõe a porta usada pela aplicação
EXPOSE 8080

# Comando para rodar o .jar
ENTRYPOINT ["java", "-jar", "app.jar"]
