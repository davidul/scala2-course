package lectures.part3fp

object Options extends App {

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  def unsafeMethod(): String = null
  val result = Option(unsafeMethod())
  println(result)

  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))
}
