
object TestLazyVal {

  lazy val resource:Int = init()
  def init(): Int ={
    println("INITIALIZING THE LAZY VAL")
    100
  }

}
