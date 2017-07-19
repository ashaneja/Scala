package com.ashish.initial

/**
  * Created by ash on 3/7/17.
  */
class TestPartialFunction {
  def myPartial: PartialFunction[Any, String] = {
    case input: String => input.toUpperCase
    case input: Integer => input.doubleValue.toString
    case input: java.util.Date => input.toString
    case unexpected => "Unexpected"
  }


  def main(args: Array[String]): Unit = {
    val circle = new TestPartialFunction
    circle.myPartial("ashish")
    circle myPartial "aneja"  // This is the in-fix notation in which the dot and bracket can be dropped
    // makes tha argument passing easier
    //    circle.myPartial100
    //    circle.myPartial new java.util.Date()
    //    circle.myPartial 10.00
  }

}

