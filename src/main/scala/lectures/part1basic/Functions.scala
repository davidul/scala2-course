package lectures.part1basic

object Functions extends App{

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }

  println(aFunction("Hello",3))

  def parameterLessFunction(): Int = 42
  println(parameterLessFunction())
  println(parameterLessFunction)

}
