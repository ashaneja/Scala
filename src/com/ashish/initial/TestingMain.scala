package com.ashish.initial

/**
  * Created by ash on 3/8/17.
  */
object TestingMain {
  def main(args: Array[String]): Unit = {
    val tester = new com.ashish.initial.Tester
    println("The tester object is " + tester)
    println(tester.myPartial("ashish"))
    println(tester.myPartial(100.00))
    println(tester.myPartial(200))
  }
}
