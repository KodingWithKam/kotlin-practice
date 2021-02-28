fun main(args: Array<String>) {
    val user = User(id = 1, name = "Kam")

    // Fetch property
    val name = user.name
    println(name)

    // Assign new value
    user.name = "Test"

    val user2 = User(id = 1, name = "John")

    // compare
    println(user == user2)
}

/*
* You often create classes whose main purpose is to hold data. In such classes,
* some standard functionality and utility functions are often mechanically derivable from the data.
* In Kotlin, these are called data classes and are marked with data:
*
* To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:
* The primary constructor needs to have at least one parameter.
* All primary constructor parameters need to be marked as val or var.
* Data classes cannot be abstract, open, sealed or inner.
* */
data class User(val id: Long, var name: String)