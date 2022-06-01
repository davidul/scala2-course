package lectures.part1basic

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10) //defaults to 1
  val fact11 = trFact(10,2) //override default

  def savePicture(format: String = "jpg", width : Int = 1920, height: Int = 1080 ): Unit = println("Saving picture")
  savePicture(width = 800)
  savePicture(height = 120, width = 90, format = "bmp")
}
