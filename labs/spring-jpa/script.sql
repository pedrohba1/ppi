create database db_example;

USE db_example;

create user 'springuser'@'%' identified by 'ThePassword2021!';

grant all on db_example.* to 'springuser'@'%';

CREATE TABLE `user` (

`id` int NOT NULL AUTO_INCREMENT,

`name` varchar(45) DEFAULT NULL,

`email` varchar (45) DEFAULT NULL,

PRIMARY KEY (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
