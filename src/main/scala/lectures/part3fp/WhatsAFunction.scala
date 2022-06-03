package lectures.part3fp

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int]{
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  //function types
  val stringToIntConverter = new Function[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3"))
}

trait MyFunction[A, B] {
  def apply(element: A): B
}
