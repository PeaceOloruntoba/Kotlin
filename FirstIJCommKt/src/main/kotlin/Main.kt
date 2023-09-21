
//top-level variables
var greeting: String? = null
//kotlin can automatically be detected by kotlin
val name = "Peace"
fun main() {
    println("Hello Kotlin")

//Variables in Kotlin
//mutable variables "var"
//read-only variables "val"
    var age: Int = 20
    val greetingToPrint = if(greeting != null) greeting else "Hi"
//    greeting = "Hello"
//if else statement, similar in python, java and C
//    if (greeting != null){
//        println(greeting)
//    } else {
//        println("Hi")
//    }
//    when statement, similar to switch statement in Java
//    when (greeting) {
//        null -> println("Hiii")
//        else -> println(greeting)
//    }
    println(greetingToPrint)
    println(name)

    println(greetingToPrint + name)
    println(greetingToPrint + " " + name)



}