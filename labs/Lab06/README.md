# Laboratório 06 de Spring Boot com JPA


## Respostas

### 7)


Utilizando o comando `curl ‐v localhost:8080/api/user` obtive a resposta:

```shell
*   Trying 127.0.0.1:8080...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /api/user HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.68.0
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Sat, 21 Jan 2023 17:13:23 GMT
< 
* Connection #0 to host localhost left intact
[{"id":1,"name":"Steave Jobs","email":"steave@apple.com"},{"id":2,"name":"Bill Gates","email":"bill@ms.com"},{"id":3,"name":"Elon Musk","email":"elon@tesla.com"}]
```

### 8)

Teste de post com curl: 
```shell
curl -H 'Content-Type: application/json' -d '{"name":"LarryPage","email":"larry@oracle.com"}' -X POST 'http://localhost:8080/api/user'
```

Podemos ver que a requisição foi bem sucedida pela resposta do GET no `api/user`:

```shell
[
   {
      "id":1,
      "name":"Steave Jobs",
      "email":"steave@apple.com"
   },
   {
      "id":2,
      "name":"Bill Gates",
      "email":"bill@ms.com"
   },
   {
      "id":3,
      "name":"Elon Musk",
      "email":"elon@tesla.com"
   },
   {
      "id":4,
      "name":"LarryPage",
      "email":"larry@oracle.com"
   }
]

```

### 9)

Teste de DELETE:
```shell
curl -H 'Content-Type: application/json' -X DELETE 'http://localhost:8080/api/user/4'
```

O servidor me deu como resposta `DELETED` então eu vou assumir que foi deletado.



### 10)

Nas imagens abaixo, apaguei usando o postman. Mas tem um detalhe, se
eu apagar o mesmo do exercício do anterior, não vai dar certo. Por isso, fiz primeiro
apagando o user com id 4 e depois o user com id 3:

![imag1.png](assets%2Fimag1.png)

![imag2.png](assets%2Fimag2.png)

### 11)

Criei a classe `Teacher` em `src/main/java/com/example/demo/Teacher.java`


### 12)

Criei o Repository `TeacherRepository` em `src/main/java/com/example/demo/TeacherRepository.java`


### 13)

Criei o `TeacherLoadDatabse` em `src/main/java/com/example/demo/TeacherLoadBase.java`

### 14)

Criei a `TeacherRESTController` em `src/main/java/com/example/demo/TeacherRESTController.java`

### 15) 

O método adicionado abaixo. Fiz com que caso as variáveis não viessem, mantesse
as já existentes.

```java

    @PutMapping("/{id}")
    public Teacher putTeacher(@PathVariable(value = "id") long id, @RequestBody Teacher teacherData) {
        Optional<Teacher> teacher = teacherRepository.findById(id);


        if (teacherData.getName() != null) teacher.get().setName(teacherData.getName());
        if (teacherData.getSubject() != null) teacher.get().setSubject(teacherData.getSubject());
        if (teacherData.getEmail() != null)teacher.get().setEmail(teacherData.getEmail());
        return teacherRepository.save(teacher.get());

    }

```


### 16)

Eu adicionei as requisições em pastas em arquivo do `postman` como abaixo:

![img3.png](assets%2Fimg3.png)


Requsição do POST `http://localhost:8080/api/teacher`:

```json
{
    "name":"fulano de tal",
    "subject":"História",
    "email": "foaisf@teste.com"
}
```

resposta do POST : 

```json
{
    "id": 5,
    "name": "fulano de tal",
    "subject": "História",
    "email": "foaisf@teste.com"
}
```

Requisição do GET de um teacher `http://localhost:8080/api/teacher/2`


Resposta:
```json
{
    "id": 2,
    "name": "Fulano",
    "subject": "PPI",
    "email": "pedro2@gmail.com"
}
```

Requisição do GET de todos os teachers: `http://localhost:8080/api/teacher`

Respota:

```json

[
    {
        "id": 2,
        "name": "Fulano",
        "subject": "PPI",
        "email": "pedro2@gmail.com"
    },
    {
        "id": 3,
        "name": "Pedro 3",
        "subject": "MCC",
        "email": "pedro3@gmail.com"
    },
    {
        "id": 4,
        "name": "fulano de tal",
        "subject": "História",
        "email": "foaisf@teste.com"
    },
    {
        "id": 5,
        "name": "fulano de tal",
        "subject": "História",
        "email": "foaisf@teste.com"
    }
]
```

Requisição de PUT de um teacher `http://localhost:8080/api/teacher/2`

Body:
```json
{
    "name": "teste de edit"
}
```

Respota:

```json
{
    "id": 2,
    "name": "teste de edit",
    "subject": "PPI",
    "email": "pedro2@gmail.com"
}
```


Requisiçaõ de DELETE de teacher `http://localhost:8080/api/teacher/1`

Reposta:

```json
Deleted
```

Também adicionei a o arquivo do postman se quiser ver em `postman.json`