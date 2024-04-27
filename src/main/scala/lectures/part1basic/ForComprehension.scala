package lectures.part1basic

object ForComprehension extends App{

  val a = Array(1,2,3,4)
  val b = Array(5,6,7,8)

  for {
    x <- a
    y <- b
  } println(x + " " + y)

  val result = for {
    x <- a
    y <- b
  } yield x + " " + y

  for(i <- a){
    for(j <- b){
      println(i + " " + j)
    }
  }

  for(i <- a.indices){
    println(i)
  }
}
