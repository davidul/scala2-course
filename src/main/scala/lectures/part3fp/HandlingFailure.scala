package lectures.part3fp

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Super exception"))

  println(aSuccess)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("No String for you")
  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure)

  println(potentialFailure.isSuccess)
}
