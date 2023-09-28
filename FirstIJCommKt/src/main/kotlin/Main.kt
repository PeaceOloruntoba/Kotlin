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

//Single function parameter
//fun sayHello(itemToGreet:String){
////    val msg = "Hello " + itemToGreet
////    val msg = "Hello $itemToGreet"
////    println(msg)
//    println("Hello $itemToGreet")
//}
//single expression function
//fun sayHello(itemToGreet:String) = println("Hello $itemToGreet")
//
//fun main() {
//    sayHello(itemToGreet="Kotlin")
//    sayHello(itemToGreet="Peace")
//}
//Multiple Function Parameter
//fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")
//
//fun main() {
//    sayHello(greeting = "Hey", itemToGreet="Kotlin")
//    sayHello(greeting = "Hello", itemToGreet="Peace")
//}
////N.B.: if you have too many parameters in your function just like in C, C++, and Java, then your function is doing too much

// COLLECTION AND ITERATION


//fun sayHello(greeting: String, itemsToGreet:List<String>) {
//    itemsToGreet.forEach{itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}
//fun main() {
////    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
////    println(interestingThings.size) //prints the size of the array
////    println(interestingThings[0]) //prints the first item in the array
////    println(interestingThings.get(0)) //also another method to get the first item in the array
////    //iterating through the array
////    //for loops
//////    for (interestingThing in interestingThings){
//////        println(interestingThing)
//////    }
////    //using a functional approach
//////    interestingThings.forEach {
//////        println(it)
//////    }
//////    interestingThings.forEach {interestingThing ->
//////        println(interestingThing)
//////    }
////    interestingThings.forEachIndexed { index, interestingThing ->
////        println("$interestingThing is at index $index")
////    }
////    ///LISTS
////    //all the method applied above for arrays is also applicable for lists
////    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
////    println(interestingThings.size) //prints the size of the list
////    println(interestingThings[0]) //prints the first item in the list
////    println(interestingThings.get(0)) //also another method to get the first item in the list
////    //iterating through the list
////    //for loops
//////    for (interestingThing in interestingThings){
//////        println(interestingThing)
//////    }
////    //using a functional approach
//////    interestingThings.forEach {
//////        println(it)
//////    }
//////    interestingThings.forEach {interestingThing ->
//////        println(interestingThing)
//////    }
////    interestingThings.forEachIndexed { index, interestingThing ->
////        println("$interestingThing is at index $index")
////    }
////    ////MAP (key to value)
////    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
////    map.forEach { key, value -> println("$key -> $value") }
//    //in Kotlin, collections are immutable by default, but to make them mutable, to add more values to the collection, we can specify that in the collection declaration
////    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Book")
////    interestingThings.add("Food")
//    //same thing applicable to arrays and map but in map you use put() instead of add
//
//    //taking each parameter of a collection to use
//    val interestingThings = listOf("Kotlin", "Programming", "Comic Book")
//    sayHello(greeting = "Hi", interestingThings)
//}

// VARARG, NAMED ARGUMENTS & DEFAULT PARAMETER VALUES

//fun sayHello(greeting: String, vararg itemsToGreet:String) {
//    itemsToGreet.forEach{itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}
//
//fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")
//
//fun main() {
////var arg
////    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Book")
//////    sayHello(greeting = "Hi", "Kotlin", "Programming", "Comic Book")
////    sayHello(greeting = "Hi", *interestingThings)
//// names arg
////I've used named arguments throughout the code, the benefit is that it allows you to rearrange the order of the arguments definition
////    greetPerson(name = "Peace", greeting = "Hi")
////default parameter
//    //the benefit of the default parameter is that you don't need to always define the argument value when you call the function, coz it has been assigned by default in the function and can be modified as required
////    greetPerson(name = "Peace")
////    greetPerson()
//
//}

//CLASSES

fun main() {
//    val person = Person(_firstName = "Peace", _lastName = "Oloruntoba")
    val person = Person()
    person.lastName
    person.firstName
    person.nickName = "PeaceCodes"
}