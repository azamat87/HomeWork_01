package com.app.homework_01



fun main() {
//    until

    val result = (0 .. 99).toList()
        .filter { it % 2 == 0 }
        .slice(10 until  20)
        .map { it + 1 }
        .sum()


    println(result)

}