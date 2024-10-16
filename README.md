# cruddy

Showing the fast CRUD+REST+PostgreSQL functionality that Spring Boot provides

Run:

Prereq: start up a postgresql db. See application.properties for details

```shell
# Start the app
./gradlew bootRun

# GET first pet
curl -X GET --location "http://localhost:8080/pets/1"

# POST a new pet
curl -X POST --location "http://localhost:8080/pets" \
    -H "Content-Type: application/json" \
    -d "{
          \"name\": \"Charlie\",
          \"age\": 14
        }"
        
# GET that new pet
curl -X GET --location "http://localhost:8080/pets/3"
```

Recommend reading the files in this order:
- Pet.kt - the model/Entity
- PetRepository.kt - defines a storage/Repository for the Pets
- CruddyApplication.kt - the "main()" starts Spring and creates some Pets
- application.properties - defines the properties that Spring uses
- crud-pets.http - Use with IntelliJ (where the curl requests above came from)
- build.gradle.kts - defines all the libraries that Spring Boot magic comes from! 
