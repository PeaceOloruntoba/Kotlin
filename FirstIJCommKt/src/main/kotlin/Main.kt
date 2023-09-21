//
////top-level variables
//var greeting: String? = null
////kotlin can automatically be detected by kotlin
//val name = "Peace"
//fun main() {
//    println("Hello Kotlin")
//
////Variables in Kotlin
////mutable variables "var"
////read-only variables "val"
//    var age: Int = 20
////    greeting = "Hello"
//    val greetingToPrint = if(greeting != null) greeting else "Hi"
////if else statement, similar in python, java and C
////    if (greeting != null){
////        println(greeting)
////    } else {
////        println("Hi")
////    }
////    when statement, similar to switch statement in Java
////    when (greeting) {
////        null -> println("Hi")
////        else -> println(greeting)
////    }
//    println(greetingToPrint)
//    println(name)
//
////    println(greetingToPrint + name)
////    println(greetingToPrint + " " + name)
//
//
//}

//BASIC FUNCTIONS

//fun getGreeting(): String{
//    return "Hello Kotlin"
//}
//single expression function
//fun getGreeting() = "Hello Kotlin"
//
//fun sayHello() {
//    println(getGreeting())
//}
//fun main() {
//    println("Hello World")
//    println(getGreeting())
//    sayHello()
//}

//FUNCTION PARAMETERS

//fun sayHello(itemToGreet:String){
////    val msg = "Hello " + itemToGreet
////    val msg = "Hello $itemToGreet"
////    println(msg)
//    println("Hello $itemToGreet")
//}
//single expression function
fun sayHello(itemToGreet:String) = println("Hello $itemToGreet")

fun main() {
    sayHello(itemToGreet="Kotlin")
    sayHello(itemToGreet="Peace")
}
