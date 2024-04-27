package lectures.concurrency

import java.net.{ServerSocket, Socket}
import java.util.concurrent.Executors

object Intro extends App {

  val aThread = new Thread(new Runnable {
    override def run(): Unit = println("Running in parallel")
  })

  aThread.start()
  aThread.join() //blocks until thread finishes running

  val threadHello = new Thread(() => (1 to 5).foreach(_ => println("hello")))
  val threadGoodBye = new Thread(() => (1 to 5).foreach(_ => println("goodbye")))

  threadHello.start()
  threadGoodBye.start()

  //executors
  val pool = Executors.newFixedThreadPool(10)
  pool.execute(() => println("In the thread pool"))

  pool.shutdown()

  private val socket = new ServerSocket()
  private val socket1: Socket = socket.accept()
  socket1.getInputStream.read()
}
