package com.app.homework_01

data class Person(val name: String, val surname: String, val age: Int)

fun List<Person>.sortedByDescending(): List<Person> = sortedByDescending { it.age }

fun List<Person>.compareByDescending(): List<Person> = sortedWith(compareByDescending { it.age })

fun List<Person>.sortedByNameAndSurname(): List<Person> = sortedBy { it.surname }.sortedBy { it.name }

fun List<Person>.sortByComparator(): List<Person> = sortedWith(compareBy({ it.name }, { it.surname }))


fun main() {
    val list = listOf(
        Person(name = "Larry", surname = "White", age = 22),
        Person(name = "Mildred", surname = "Rand", age = 18),
        Person(name = "Darius", surname = "Petrucci", age = 73),
        Person(name = "Larry", surname = "Palmer", age = 62),
        Person(name = "Alex", surname = "Morrison", age = 25),
        Person(name = "Debbie", surname = "Martinez", age = 30),
        Person(name = "Sarah", surname = "White", age = 41),
    )
    println(functionSpeed { list.ageDescendingSort() })
}

private fun buildList() = listOf(
    Person(name = "Larry", surname = "White", age = 22),
    Person(name = "Mildred", surname = "Rand", age = 18),
    Person(name = "Darius", surname = "Petrucci", age = 73),
    Person(name = "Larry", surname = "Palmer", age = 62),
    Person(name = "Alex", surname = "Morrison", age = 25),
    Person(name = "Debbie", surname = "Martinez", age = 30),
    Person(name = "Sarah", surname = "White", age = 41),
)

