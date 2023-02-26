fun main() {

    val mySet: Set<Any> = setOf(1000,8000, "Tesla", "Toyota")

    for (element in mySet){
        println(element)
    }
    println("")

    print("Is my set empty?? ")
    print(mySet.isEmpty())

    println("")

    print("Is my set occupied?? ")
    print( mySet.isNotEmpty())

    println("")
}