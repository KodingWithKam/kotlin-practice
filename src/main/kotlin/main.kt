fun main(args: Array<String>) {

    /*
    * Arraylists are used to create a dynamic array
    * ArrayList class provides both read/write functions
    * ArrayList follows the sequence of insertion order
    * ArrayList is non synchronized and it may contain dup elements
    * */
    val arrayList = ArrayList<String>() // Create empty array list
    arrayList.add("One") // Add object to list
    arrayList.add("Two")

    for (i in arrayList) {
        println(i)
    }

    println(arrayList[0])
    println(arrayList[1])

    val numList = ArrayList<Double>()
    numList.add(2.0)
    numList.add(4.0)
    numList.add(6.0)
    numList.add(8.0)
    numList.add(10.0)

    println(getAverage(numList))
}

fun getAverage(data: ArrayList<Double>): Double {
    var total = 0.0
    for (i in data) {
        total += i
    }
    println("average....")
    return total/data.size
}