package lectures.part1basic

object Recursion extends App {

  def factorial(n : Int) : Int = {
    if( n <= 1) 1
    else {
      println("Computing factorial of " + n + " I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      return result
    }
  }

 // println(factorial(10000)) //fails stackoverflow

  def factorial1(n : Int) : BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factHelper(x-1, accumulator*x)
    }
    factHelper(n, 1)
  }

  println(factorial1(10000))
}
