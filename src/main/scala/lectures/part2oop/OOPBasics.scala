package lectures.part2oop

object OOPBasics extends App {

  val person = new Person("David", 46)
  println(person.age)
  person.greet("John")
}
//ctor
class Person(name: String, val age: Int) {
  //body
  val x = 2
  def greet(name: String): Unit = println(s"${this.name} says Hi to $name")
  //overloading
  def greet(): Unit = println(s"$name says Hi")

  //multiple constructors, can be replaced by default argument values
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
//class parameters are not fields, add val