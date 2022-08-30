package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    println("Hello, Kotlin");
    val a = readln()!!.toInt();
    val b = readln()!!.toInt();
    println ( a xor b)
}
