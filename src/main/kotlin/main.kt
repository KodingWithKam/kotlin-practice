fun main(args: Array<String>) {

    /*
    * Var is mutable
    * Use Var when you want to change value later on
    * Val is not mutable
    * Use val when value will be const
    */

    var testVar = "Test"
    testVar = "New Test"

    val testVal = "Cant Change Value"

    /*
    * INTEGER TYPES
    * Byte	8	-128	127
    * Short	16	-32768	32767
    * Int	32	-2,147,483,648 (-2 31)	2,147,483,647 (2 31- 1)
    * Long	64	-9,223,372,036,854,775,808 (-2 63)	9,223,372,036,854,775,807 (2 63- 1)
    * */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_109_487_1204

    /*
    * FLOATING POINT TYPES
    * For real numbers, Kotlin provides floating-point types Float and Double.
    * According to the IEEE 754 standard, floating point types differ by their decimal place,
    * that is, how many decimal digits they can store. Float reflects the IEEE 754 single precision,
    * while Double provides double precision.
    *
    * Type	Size (bits)	Significant bits	Exponent bits	Decimal digits
    * Float	32	        24	                 8	            6-7
    * Double 64	        53	                11	            15-16
    * */
    val e: Double = 2.7182818284 // Double
    val eFloat: Float = 2.7182818284f // Float, actual value is 2.7182817

    println("Hello World!")
}