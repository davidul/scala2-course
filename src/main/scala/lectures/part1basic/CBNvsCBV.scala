package lectures.part1basic

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value " + x) // evaluates only once
    println("by value " + x)
  }

  def calledByName(x: => Long):Unit = {
    println("by name " + x) // evaluates every time it is called
    println("by name " + x) // two different values
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
