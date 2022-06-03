package lectures.part3fp

object MapFlatmapFilterFor extends App {

  val list = List(1,2,3)
  println(list)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_.toString))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatMap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  //print all combinations of two lists
  val numbers = List(1,2,3,4)
  val chars = List('a', 'b', 'c', 'd')

  val value = numbers
    .flatMap(n =>
      chars.map(c => "" + c + n))
  println(value)

  //for comprehensions
  val foCombinations = for {
    n <- numbers
    c <- chars
  }yield ("" + c + n)

  println(foCombinations)

  val foCombinations_1 = for {
    n <- numbers if n % 2 == 0
    c <- chars
  }yield ("" + c + n)

  println(foCombinations_1)

  for {
    n <- numbers
  }println(n)

  //syntax overload
  list.map {
    x => x * 2
  }
}
