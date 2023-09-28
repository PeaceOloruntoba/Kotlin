//class Person(_firstName: String, _lastName: String){
//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }
//}
//
//class Person(val firstName: String, val lastName: String){
//
//    init {
//        println("Init 1")
//    }
//    constructor(): this("Peter", "Parker"){
//        println("Secondary Constructor")
//    }
//    init{
//        println("Init 2")
//    }
//}

//VISIBILITY OF CLASSES
// classes are public by default but you can also specify it by using the public keywords, if a class is public then it can be accessed from anywhere in the project
// class also can be defined as internal, that it it will only be visible in the dir and in the module we where it is located, you also define this by using the internal keyword
class Person(val firstName: String = "Peace", val lastName: String = "Oloruntoba"){
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }

    fun printInfo(){
//        val nickNameToPrint = if(nickName != null) nickName else "No Nickname"
        val nickNameToPrint = nickName ?: "No Nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}