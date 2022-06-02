package lectures.part2oop

import scala.language.postfixOps

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    //def hangoutWith(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"not $name "
    def isAlive : Boolean = true
    //special method
    def apply(): String = s"Hi my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //infix notation

  //operators in scala
  val tom = new Person("Tom", "Fight Club")
  //println(mary hangoutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  val x = -1
  val y = 1.unary_-

  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //apply()

}
