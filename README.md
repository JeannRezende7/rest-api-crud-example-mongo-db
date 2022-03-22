# rest-api-crud-example-mongo-db

# Dependencias
```
Spring Boot DevTools
Spring Data JPA
Spring Web
Spring Data MongoDB
```

# Aplication Properties 

``` 
spring.data.mongodb.uri=mongodb+srv://postgre:96wK7W6d89WAXl3N@altertech.bqnft.mongodb.net/altertech
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
server.port=8080
spring.application.name=altertech-produto
``` 


# Estrutura Crud simplificada.

# 1 - Model > Modelo do Produto ou classe base
Colocar a anotação @document na classe.

```
@id
@GeneratedValue(strategy = GenerationType.IDENTITY
```
# 2 -  Repository > repositorio.
Crio uma interface e extendo do mongoRepository ex:
```
public interface CartasRepository extends MongoRepository <Cartas, String>{
        
}
```

# View > Controller e coloco as anotações:

```
@RestController
@RequestMapping("/api/cartas")
```
Nao esquecer do ``@Autowired`` instanciando o repositorio. 
```
@Autowired
CartasRepository repo;
```
Então posso trabalhar nos métodos ex: 
```
 @GetMapping
    public List <Cartas> getAllCartas(){
        return repo.findAll();
    }

    @PostMapping
    public Cartas SaveCarta(@RequestBody Cartas carta) {
        return repo.save(carta);
        
    }
 ```
	


