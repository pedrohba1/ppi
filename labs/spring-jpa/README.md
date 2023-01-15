# Laboratório de Spring Boot com JPA

Criei uma instância no docker do mySQL com o `docker-compose.yml` deixado
Na raíz dessa pasta. 

Dentro dela, executei o comando passado para 
criar o Schema do banco de dados:

```roomsql
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
`docker exec -i  spring-jpa_db_1 mysql -uroot -prootpassword < ./script.sql`


## Respostas

### 12)

Chamando a aplicação em `http://localhost:8080/lab5/add?name="student"&email="student@ufu.br"`
Obtemos como resposta um `User Saved` do servidor.

### 13) 
Não utilizei o MySQL Workbench, porém, ao chamar a rota `lab05/all` vemos que
O usuário da questão anterior foi salvo.

```json
[
  {
    "id": 1,
    "name": "\"student\"",
    "email": "\"student@ufu.br"
  }
]
```

### 14)

Não será possível criar o usuário, porque o Controller está na rota `/lab05/add` 
Para que isso funcionasse, teríamos que remover o `lab5` do 
`@RequestMapping(path="/lab5")` 


### 15)

Criei a classe `Teacher` em `java/com/labspringjpa/demo/Teacher.java`

E seu repository `java/com/labspringjpa/demo/TeacherRepository.java`

### 16)

Adicionei ao Controller:

```java
    @Autowired
    TeacherRepository teacherRepository;
```


### 17)

Feito, porém eu mudei o nome das funções. Mas elas fazem
o requisitado:

```java

    @GetMapping(path="/addTeacher") //
    public @ResponseBody String addTeacher (@RequestParam  String name,
        @RequestParam String email,
        @RequestParam String subject
    ) {
        Teacher t = new Teacher();
        t.setName(name);
        t.setEmail(email);
        t.setSubject(subject);
        teacherRepository.save(t);
        return "Teacher saved";
    }

    @GetMapping (path="/all/teacher")
    public @ResponseBody Iterable<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }


```



### 18)

Feito: `com/labspringjpa/demo/TeacherRepository.java`

### 19)

Feito. Criei uma página html `teacher.html` que pode ser acessada
em `http://localhost:8080/teacher.html` 

Mudei ligeiramente o action para se adequar ao nome da minha classe.


### 20)

Adicionei os objetos: 

```json

[
  {
    "id": 1,
    "name": "prof",
    "subject": "PPI",
    "email": "prof@ufu.br"
  },
  {
    "id": 2,
    "name": "prof 2",
    "subject": "CCO",
    "email": "prof2@ufu.br"
  }
]


```


### 21)

No caso do meu projeto, renomeei a rota para `http://localhost:8080/lab5/all/teacher`


Ao Acessá-la, o servidor me devolve isto em texto plano.

```
[{"id":1,"name":"prof","subject":"PPI","email":"prof@ufu.br"},{"id":2,"name":"prof 2","subject":"CCO","email":"prof2@ufu.br"}]
```
