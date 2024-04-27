package lectures.part2oop

object Generics extends App{

  //generic class
  class MyList[A] {
    //use the type A
  }

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic traits
  trait MyTrait[A] {
    def action(a: A): Unit
  }

  //generic methods
  object MyTrait {
    def empty[A]: MyTrait[A] = ???
  }

  val myTraitOfIntegers = new MyTrait[Int] {
    override def action(a: Int): Unit = ???
  }
  val myTraitOfStrings = new MyTrait[String] {
    override def action(a: String): Unit = ???
  }

  //generic methods
  object MyTrait2 {
    def empty[A]: MyTrait2[A] = ???
  }

  //generic traits
  trait MyTrait2[A] {
    def action(a: A): Unit
  }

  val myTrait2OfIntegers = new MyTrait2[Int] {
    override def action(a: Int): Unit = ???
  }
  val myTrait2OfStrings = new MyTrait2[String] {
    override def action(a: String): Unit = ???
  }

  //generic methods
  object MyTrait3 {
    def empty[A]: MyTrait3[A] = ???
  }

  //generic traits
  trait MyTrait3[A] {
    def action(a: A): Unit
  }

  val myTrait3OfIntegers = new MyTrait3[Int] {
    override def action(a: Int): Unit = ???
  }
  val myTrait3OfStrings = new MyTrait3[String] {
    override def action(a: String): Unit = ???
  }

  //generic methods
  object MyTrait4 {
    def empty[A]: MyTrait4[A] = ???
  }

  //generic traits
  trait MyTrait4[A] {
    def action(a: A): Unit
  }

  val myTrait4OfIntegers = new MyTrait4[Int] {
    override def action(a: Int): Unit = ???
  }
  val myTrait4OfStrings = new MyTrait4[String] {
    override def action(a: String): Unit = ???
  }

  //generic methods
}
