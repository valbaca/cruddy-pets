package com.valbaca.cruddy.repo

import com.valbaca.cruddy.model.Pet
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import java.util.*


interface PetRepository: CrudRepository<Pet, Long>{
    // findById comes "for free" from CrudRepository
    // findByName and other `findBy*` for other fields
    fun findByName(name: String): List<Pet>
}