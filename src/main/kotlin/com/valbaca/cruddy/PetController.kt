package com.valbaca.cruddy

import com.valbaca.cruddy.model.Pet
import com.valbaca.cruddy.repo.PetRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

// This is all done automatically by "org.springframework.boot:spring-boot-starter-data-rest"
// But if you wanted to do it semi-manually, you could uncomment

//@RestController
class PetController(
//    val petRepository: PetRepository
) {
//    @GetMapping("/pets") fun findAllPets(): Iterable<Pet> = petRepository.findAll()
//    @PostMapping("/pets") fun addPet(@RequestBody pet: Pet): Pet = petRepository.save(pet)
}