import scala.collection.mutable

/**
 * Created by ash on 7/9/16.
 * To show the types of the elements added to the Set are all objects.
 */
object ShowUnifiedTypes extends App{
  // When you do extend App from an Object ( not a class ), the body is treated as a method and gets executed.
 val set = new mutable.LinkedHashSet[Any]
  set += 100
  set += 100.99
  set += "TEST"
  set += 'c'
  set += true
  set += main _

  val iter:Iterator[Any]=set.iterator
  while( iter.hasNext){
    println(iter.next.toString())
  }


}
