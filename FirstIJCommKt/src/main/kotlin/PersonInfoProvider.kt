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


class BasicInfoProvider : PersonInfoProvider{
//    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional Junks")
    }
}

fun main(){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())

}

