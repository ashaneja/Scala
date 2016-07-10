/**
 * Created by apple on 7/10/16.
 */

trait Clonable{
  def isClonable(x:Int):Boolean
}
class TestTraits extends Clonable{

  def isClonable(x:Int):Boolean={
    x<100
  }

}


