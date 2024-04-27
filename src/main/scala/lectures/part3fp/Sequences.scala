package lectures.part3fp

object Sequences extends App {

  //Sequences
  val aSequence = Seq(2,1,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(5,6,7))
  println(aSequence.sorted)

  //Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)
  (1 to 10).foreach(x => println("Do something"))

  //Lists

  val aList = List(1,2,3)
  val prepended = 42 :: aList
  println(prepended)

  println(45 +: aList) //prepend
  println(aList :+ 45) //append

  val apples5 = List.fill(5)("apple")
  println(apples5)

  println(aList.mkString("-|-"))

  //arrays
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](3)
  println(threeElements)

  numbers(2) = 0
  println(numbers.mkString(" "))

  //Vector
  val aVector: Vector[Int] = Vector(1,2,3)
  println(aVector)

}
