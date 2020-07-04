package com.learning.kotlin

var PI = 3.1415926
var x = 10

fun main() {

    println("value of pi is $PI")
    println("Hello world")
    println(sum(5, 10))
    printSum(15, 20)

    var a: Int = 1
    val b = 2
    val c: Int
    c = 3

    var x = 5
    x += 1

    println(a + b + c + x)

    a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)

    println(maxOf(5, 7))

}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun sum(a: Int, b: Int) = a + b


fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}