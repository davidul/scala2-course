package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("nom")
    private def p= println("not inherited")
  }

  //single class inheritance
  class Cat extends Animal

  val cat = new Cat
  cat.eat

  //constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //overriding
  class Dog extends Animal{
    override val creatureType: String = "domestic"
    override def eat = println("nafnaf")
  }
}
