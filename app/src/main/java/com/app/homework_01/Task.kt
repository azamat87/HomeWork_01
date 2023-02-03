package com.app.homework_01

import java.lang.Thread.sleep
import java.util.*
import kotlin.system.measureTimeMillis


fun List<Person>.ageDescendingSort() = sortedByDescending {  it.age }

fun List<Person>.ageDescendingSort2() = sortedWith(compareByDescending { it.age })

fun List<Person>.alphabeticSortSecond() = sortedWith(compareBy({ it.name }, { it.surname }))

fun List<Person>.sortedByNameAndSurname2(): List<Person> = sortedBy { it.surname }.sortedBy { it.name }


fun List<Person>.alphabeticSort(): List<Person> {
    val comparator = Comparator<Person> { o1, o2 ->
        if (o1.name == o2.name) {
            compareValues(o1.surname, o2.surname)
        } else {
            compareValues(o1.name, o2.name)
        }
    }
    return this.sortedWith(comparator)
}

fun main() {

    val personList = listOf(
        Person("Ivan", "Pertov", 35),
        Person("Petr", "Ivanov", 30),
        Person("Pavel", "Sidorov", 27),
        Person("Sergei", "Pavlov", 47),
        Person("Artem", "Sergeev", 52),
        Person("Ivan", "Andreev", 21),
        Person("Anton", "Sidorov", 41),
        Person("Anton", "Barinov", 32),
        Person("Andrei", "Barinov", 28),
    )

//    personList.ageDescendingSort2().forEach { println(it) }
//    println("-")
//    personList.alphabeticSortSecond().forEach { println(it) }


    println(getFunExecutionTime { personList.ageDescendingSort() })
    println(getFunExecutionTime { personList.alphabeticSort() })
}

fun getFunExecutionTime(action: () -> Unit): Long {
    return measureTimeMillis {
        action()
    }
}

