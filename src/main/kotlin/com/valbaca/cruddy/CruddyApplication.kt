package com.valbaca.cruddy

import com.valbaca.cruddy.model.Pet
import com.valbaca.cruddy.repo.PetRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CruddyApplication {

    @Bean
    fun demo(repository: PetRepository) = CommandLineRunner {
        // Inserting data to have something
         repository.save(
             Pet("Annie", 10)
         )
        repository.save(Pet("Rogue", 11))

        println("Find all...")
        repository.findAll().forEach {
            println(it)
        }

        println("Find by id(1)")
        println(repository.findById(1))

        println("Find by name: Rogue")
        println(repository.findByName("Rogue"))

        println("http://localhost:8080")
    }
}

fun main(args: Array<String>) {
    runApplication<CruddyApplication>(*args)
}
