//class Person(_firstName: String, _lastName: String){
//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }
//}

class Person(val firstName: String, val lastName: String){

    init {
        println("Init 1")
    }
    constructor(): this("Peter", "Parker"){
        println("Secondary Constructor")
    }
    init {
        println("Init 2")
    }
}