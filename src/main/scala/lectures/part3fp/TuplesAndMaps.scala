package lectures.part3fp

object TuplesAndMaps extends App {

  val aTuple = new Tuple2(2, "Hello Scala")
  println(aTuple._1)

  //Maps
  val aMap: Map[String, Int] = Map()

  val phoneBook = Map(("Jim", 555), "Daniel" -> 123)
  println(phoneBook)

  println(phoneBook.contains("Jim"))
}
