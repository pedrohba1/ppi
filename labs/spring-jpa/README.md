# Laboratório de Spring Boot com JPA

Criei uma instância no docker do mySQL com o `docker-compose.yml` deixado
Na raíz dessa pasta. 

Dentro dela, executei o comando passado para 
criar o Schema do banco de dados:

```
create database db_example;

create user 'springuser'@'%' identified by 'ThePassword2021!';

grant all on db_example.* to 'springuser'@'%';

CREATE TABLE `user` (

`id` int NOT NULL AUTO_INCREMENT,

`name` varchar(45) DEFAULT NULL,

`email` varchar (45) DEFAULT NULL,

PRIMARY KEY (`id`) 

) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


```

Inicializei meu projeto com o Spring Initializr. 

Rodei o script de sql acima com o comando: 
`docker exec -i  spring-jpa_db_1 mysql -uroot -prootpassword < /script.sql`

ou esse?

docker exec -i  spring-jpa_db_1 mysql -uroot -prootpassword < ./script.sql
