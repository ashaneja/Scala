
class myService(name:String){
  def work(i:Int):Int={
    println(s"Service doing work with i as $i")
    i+1
  }
}

val servObj= new myService("Here")
(1 to 3) foreach (i=>println(s"Result: ${servObj.work(i)}"))



trait Logging{
  def info(message:String):Unit
}

trait StdLogging extends Logging {
  def info(message:String) = println(s" Info message is $message")
}

val logServObj= new myService("Two") with StdLogging {
  override def work(i:Int):Int={
    info(s"Starting work $i")
    super.work(i)
  }
}
(1 to 3) foreach (i=>println(s"Result: ${logServObj.work(i)}"))