object Basics extends App {
  // defining a value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42

  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional

  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expressions = structures that can be reduced to a value
  // In other programming languages like JavaScript, Java, and C++ we think in terms of instructions, in Scala we think in terms of values, and composing these values to obtain new values
  // In Scala everything is an expression that can be reduced to a value
  val anExpression = 2 + 3

  // if-expression
  // this is-expression reduces to a single value - either 56 or 999 depending on the value of the meaningOfLife
  val ifExpression = if (meaningOfLife > 43) 56 else 999 // in other languages: meaningOfLife > 43 ? 56 : 999
  
  // this chained if-expression is still a single expression because it reduces to a single value
  // we're assigning values to these names based on whether the conditions are true or false
  val chainedIfExpression = 
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0
  
  // code blocks
  val aCodeBlock = {
    // definitions
    // can define variables, functions, inner code blocks, etc.
    // can make multiple definitions within a code block
    val aLocalValue = 67

    // value of block is the value of the last expression
    aLocalValue + 3 // in other languages: return aLocalValue + 3
  }

  // define a function
  // keyword nameOfFunction(arguments name call: type): return type = single expression
  // the single expression is the returned value of the function
  def myFunction(x: Int, y: String): String = y + " " + x

  // can use a code block for larger functions
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  // recursive functions
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n-1)

    /* 
    factorial(5) = 5 * factorial(4) = 5 * 4 = 120
    factorial(4) = 4 * factorial(3) = 4 * 6
    factorial(3) = 3 * factorial(2) = 3 * 2
    factorial(2) = 2 * factorial(1) = 2 * 1
    factorial(1) = 1
    */

    // In Scala we don't use loops or iteration, we use RECURSION!

    // the Unit type = no meaningful value === "void" in other languages
    // type of SIDE EFFECTS
    // side effects do not compute meaningful information; instead they print something, display something, send something to a server, etc.
    println("I love Scala") // System.out.println, printf, print, console.log

    // define a function returning Unit
    def myUnitReturningFunction(): Unit = {
        println("I don't love returning Unit")
    }

    // open and close parentheses is what is returned by println and other functions returning unit
    val theUnit = ()
}
