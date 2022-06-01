package lectures.part1basic

object Functions extends App{

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }

  println(aFunction("Hello",3))

  def parameterLessFunction(): Int = 42
  println(parameterLessFunction())
  println(parameterLessFunction)

  //recursive function
  def repeatedFunction(aString: String, n : Int) : String = {
    if (n == 1) aString
    else
      aString + repeatedFunction(aString, n - 1)
  }

  println(repeatedFunction("H",3))

  //Side effect, println is expression returns Unit
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n,n-1)
  }
}
