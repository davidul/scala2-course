package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  //1. class parameters are fields
  val jim = Person("Jim", 34)
  val jim2 = Person("Jim", 34)
  println(jim.name)
  val john = Person("John", 45)

  //2. sensible toString
  println(jim.toString)

  //3. equals and hashCode implemented OOTB
  println(jim == john) //false
  println(jim == jim2) //true

  //4. CCs have handy copy method
  val jim3 = jim.copy(age = 45)

}
