fun main(args: Array<String>) {
    /*
    * Lambda is a function with no name
    * lambdas and anonymous functions are function literals (functions not declared but passed as expression)
    * Lambda is defined with curly braces {} which takes variables as a parameter and a body of a function
    * Body of a function is written after the variable followed by '->' operator
    * */
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(10,5))

    val sum2 = { a: Int, b: Int -> println(a + b)}
    println(sum2(10,5))
}