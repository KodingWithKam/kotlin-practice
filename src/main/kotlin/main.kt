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


    /*
    * The type Boolean represents boolean objects that can have two values: true and false.
    * Boolean has a nullable counterpart Boolean? that also has the null value.
    * Built-in operations on booleans include:
    * ||– disjunction (logical OR)
    * &&– conjunction (logical AND)
    * !- negation (logical NOT)
    * || and && work lazily.
    * */
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)


    /*
    * Characters are represented by the type Char. Character literals go in single quotes: '1'.
    * Special characters start from an escaping backslash \. The following escape sequences
    * are supported: \t, \b, \n, \r, \', \", \\ and \$.
    * To encode any other character, use the Unicode escape sequence syntax: '\uFF00'.
    * */
    val aChar: Char = 'a'

    println(aChar)
    println('\n') //prints an extra newline character
    println('\uFF00')

    /*
    * STRINGS
    * Strings in Kotlin are represented by the type String.
    * Generally, a string value is a sequence of characters in double quotes (" ).
    *
    * Elements of a string are characters that you can access via the indexing operation: s[i].
    * You can iterate over these characters with a for loop:
    *
    * Strings are immutable. Once you initialize a string, you can't change its value or
    * assign a new value to it. All operations that transform strings return their results in
    * a new String object, leaving the original string unchanged.
    *
    * STRING LITERALS
    * Kotlin has two types of string literals:
    * escaped strings that may contain escaped characters
    * raw strings that can contain newlines and arbitrary text
    * Escaping is done in the conventional way, with a backslash (\ ).
    * A raw string is delimited by a triple quote (""" ), contains no escaping and can
    * contain newlines and any other characters:
    *
    * STRING TEMPLATES
    * String literals may contain template expressions - pieces of code that are evaluated and whose
    * results are concatenated into the string. A template expression starts with a dollar sign ($)
    * and consists of either a name:
     */
    val str = "abcd 123"
    val escapedString = "Hello, world!\n"
    val rawString = """
    for (c in "foo")
        print(c)
    """

    val i = 10
    println("i = $i") // prints "i = 10"

    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"
    println("Hello World!")
}