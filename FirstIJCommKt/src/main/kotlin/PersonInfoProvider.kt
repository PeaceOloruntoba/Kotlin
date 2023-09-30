//interface PersonInfoProvider{
//    val providerInfo : String
//
//    fun printInfo(person: Person){
//        println(providerInfo)
//        person.printInfo()
//    }
//}
//
//interface SessionInfoProvider{
//    fun getSessionId(): String
//}
//
//
//class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
////    override fun printInfo(person: Person) {
////        println("basicInfoProvider")
////        person.printInfo()
////    }
//    override val providerInfo: String
//        get() = "BasicInfoProvider"
//
//    override fun printInfo(person: Person) {
//        super.printInfo(person)
//        println("Additional Junks")
//    }
//
//    override fun getSessionId(): String {
//        return "Session"
//    }
//}
//
//fun main(){
//    val provider = BasicInfoProvider()
//
//    provider.printInfo(Person())
//    provider.getSessionId()
//
//}
//
//TYPE-CHECKING AND TYPE-CASTING IN KOTLIN

//interface PersonInfoProvider{
//    val providerInfo : String
//
//    fun printInfo(person: Person){
//        println(providerInfo)
//        person.printInfo()
//    }
//}
//
//interface SessionInfoProvider{
//    fun getSessionId(): String
//}
//
//
//class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
////    override fun printInfo(person: Person) {
////        println("basicInfoProvider")
////        person.printInfo()
////    }
//    override val providerInfo: String
//        get() = "BasicInfoProvider"
//
//    override fun printInfo(person: Person) {
//        super.printInfo(person)
//        println("Additional Junks")
//    }
//
//    override fun getSessionId(): String {
//        return "Session"
//    }
//}
//
//fun main() {
//    val provider = BasicInfoProvider()
//
//    provider.printInfo(Person())
//    provider.getSessionId()
//
//    checkTypes(provider)
//}
//
//fun checkTypes(infoProvider: PersonInfoProvider){
//    if (infoProvider is SessionInfoProvider) {
//        println("is a session info provider")
//    } else {
//        println("not a session info provider")
//        //typecasting
//        (infoProvider as SessionInfoProvider).getSessionId()
//    }
//}

//INHERITANCE IN KOTLIN

interface PersonInfoProvider{
    val providerInfo : String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): String
}


open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    //    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

    open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional Junks")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider is SessionInfoProvider) {
        println("is a session info provider")
    } else {
        println("not a session info provider")
        //typecasting
        (infoProvider as SessionInfoProvider).getSessionId()
    }
}