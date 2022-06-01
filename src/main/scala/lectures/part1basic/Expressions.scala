package lectures.part1basic

object Expressions extends App{
  val x = 1 + 2
  println(x)
  println(1 + 2 * 3)

  println(x == 1)

  println(1 < 2)

  println(!(x == 1))

  var a = 2
  a += 2
  println(a)

  //Instructions vs expressions
  //Instructions - doing something
  //Expression - has a value
  // IF expression
  val aCondition:Boolean = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while(i < 10){
    println(i)
    i += 1
  }

  //Everything in Scala is an Expression

  var aVariable = 2
  val aWeirdValue = (aVariable = 3) //Unit -> void -> side effect
  println(aWeirdValue)

  //Code blocks
  val aCodeBlock = {
    val y = 1
    val z = y + 1
    if(z > 2 ) "hello" else "bye"
  }
}
