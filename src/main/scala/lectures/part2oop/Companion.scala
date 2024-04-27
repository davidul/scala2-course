package lectures.part2oop

object Companion extends App{

  //class level functionality
  object Person {
    val N_EYES = 2
  }

  class Person(val name: String) {
    //instance level functionality
    def greet = s"Hi, my name is $name"
  }

  // static level functionality
  println(Person.N_EYES)

  //Scala object = singleton instance
  val mary = Person
  val john = Person
  println(mary == john)

  val mary2 = new Person("Mary")
  val john2 = new Person("John")
  println(mary2 == john2)
  println(mary2.greet)
  println(john2.greet)

}
