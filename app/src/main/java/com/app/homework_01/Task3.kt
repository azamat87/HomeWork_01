package com.app.homework_01


fun main() {

}

inline fun functionSpeed(block: () -> Unit) : Long {
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - startTime
}