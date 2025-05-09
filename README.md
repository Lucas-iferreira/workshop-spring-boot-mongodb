# Posts
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Lucas-iferreira/workshop-spring-boot-mongodb/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma API RESTful desenvolvida como parte de um workshop prático com Spring Boot e MongoDB, voltado para o gerenciamento de postagens de usuários. O objetivo é demonstrar conceitos fundamentais da criação de APIs modernas utilizando banco de dados NoSQL.

# Funcionalidade
- CRUD completo de usuários e posts
- Relacionamento entre entidades(usuário e post)
- Comentários embutidos em documentos do MongoDB
- Manipulação de dados com DTOs
- Consulta por nome e data com uso de @Query

## Modelo conceitual
![Modelo Conceitual](assets/modelo-conceitual.jpeg)

# Tecnologias utilizadas
- Java 17
- Spring Boot
- Spring Data MongoDB
- Maven
- Postman
- MongoDB (banco de dados NoSQL)


# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Lucas-iferreira/workshop-spring-boot-mongodb.git

# configure o MongoDB local ou em uma nuvem

# execute a aplicação com Spring Boot
./mvnw spring-boot:run

# teste os endpoints com Postman ou outra ferramenta HTTP
```

# Agradecimentos
Agradeço ao professor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/) pelo projeto realizado junto ao seu curso da Udemy, que me proporcionou ganhos de conhecimentos notáveis em JAVA.

# Autor

Lucas Ferreira

https://www.linkedin.com/in/lucas-iferreira/
