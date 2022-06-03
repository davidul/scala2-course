package lectures.part3fp

object AnonymousFunction extends App {

  //val doubler = (x: Int) => x * 2
  val doubler: Int => Int = x => x * 2

  //multiple params
  val adder: (Int, Int) => Int = (a,b) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  //with curly braces
  val stringToInt = {
    (str: String) => str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1 //equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // (a,b) => a + b
}
