package lectures.part2oop


object Implicits extends App {

    // 1. implicit parameters
    def increment(x: Int)(implicit amount: Int) = x + amount
    implicit val defaultAmount = 10
    println(increment(2))

    // 2. implicit conversions
    implicit class RichInt(x: Int) {
      def isEven() = x % 2 == 0
    }
    println(23.isEven()) // new RichInt(23).isEven()
    // use this carefully

    // implicit conversions with implicit parameters
    implicit class RichString(string: String) {
      def asInt() = Integer.valueOf(string) // java.lang.Integer -> Int
      def encrypt(cypherDistance: Int) = string.map(c => (c + cypherDistance).asInstanceOf[Char])
    }
    println("3".asInt() + 4)
    println("John".encrypt(2))

    // implicit imports
    import scala.concurrent.duration._
    val duration = 3.seconds

    // not recommended
    // local scope
    implicit val inverseOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)
    println(List(1,4,5,3,2).sorted) // List(5,4,3,2,1)
    // implicit val normalOrdering: Ordering[Int] = Ordering.fromLessThan(_ < _)
}
