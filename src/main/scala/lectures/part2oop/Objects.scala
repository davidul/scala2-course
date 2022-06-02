package lectures.part2oop

object Objects extends App {
  //Scala does not have "static"

  //COMPANIONS (object-class)
  //static/class level functionality
  object Person { //type + only instance
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method, usually apply()
    //def from(mother: Person, father: Person): Person = new Person("Bobby")
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }

  class Person (val name: String){
    //instance level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  //scala object is a singleton
  val mary = new Person("Mary") //class
  val john = new Person("John")
  println(mary == john)

  val person1 = Person //object
  val person2 = Person
  println(person1 == person2)

  val bobby = Person(mary, john) //apply()

  //Scala applications = Scala object
  // def main(args: Array[String]): Unit
}
