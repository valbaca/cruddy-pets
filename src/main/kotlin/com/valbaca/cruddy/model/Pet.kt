package com.valbaca.cruddy.model

import jakarta.persistence.*

// application.properties causes the automatic creation of a table named "pet"
// You can specify a different table name with the annotation:
//@Table(name = "animals")
@Entity
data class Pet(val name: String, val age: Int) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L
}