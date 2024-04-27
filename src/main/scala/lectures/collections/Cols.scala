package lectures.collections

object Cols extends App {

  val lst: List[Int] = List(1,2,3)
  private val value: List[Int] = lst.map(a => a + 1)
  println(value)

  println(List("A", "B", "C").foldRight("Z")(_ + _))
  println(List("A", "B", "C").foldLeft("Z")(_ + _))
  println(List("A", "B", "C").fold("Z")(_ + _))


  val m = Map[Int, String](1-> "one", 2->"two")
  val m1 = m + (3-> "three")
  private val concat: Map[Int, String] = m.++(m1)
  m.foreach(tuple => println(s"Key ${tuple._1} Value ${tuple._2}"))
  m1.foreach(tuple => println(s"Key ${tuple._1} Value ${tuple._2}"))
}
