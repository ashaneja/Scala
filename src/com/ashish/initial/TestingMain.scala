package com.ashish.initial

/**
  * Created by ash on 3/8/17.
  */
object TestingMain {
  def main(args: Array[String]): Unit = {
    // Use new here to instantiate an instance of the class being used.
    val tester = new com.ashish.initial.TestPartialFunction
    println("The tester object is " + tester)
    println(tester.myPartial("ashish"))
    println(tester.myPartial(100.00))
    println(tester.myPartial(200))
  }
}
