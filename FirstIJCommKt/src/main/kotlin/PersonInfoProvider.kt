interface PersonInfoProvider{
    val providerInfo : String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}


class BasicInfoProvider : PersonInfoProvider{
//    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"
}

fun main(){
    val provider = BasicInfoProvider()

    provider.printInfo(Person())

}

