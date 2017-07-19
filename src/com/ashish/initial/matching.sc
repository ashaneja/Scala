val bools = Seq(true, false, "true")

for(bool<-bools){
  bool match {
    case true => println("matcing boolean true")
    case false => println("matcing boolean false")
    case "true" => println("matcing String true")
  }
}



// While matching with the method params,
// the matching variable has to be put in backticks in order for it to match.
// If you dont need the match expression to return a value, just perform an operation than that is fine. However if a var is needed to be returned from the expression, that has to be defined first.
def checkY(y:Int)={
  for{
    x<-Seq(99,100,101)
  } {
    val str = x match {
      case `y` => "matched with Y"
      case x:Int=>"Num matched is "+ x
    }
    println(str)
  }
}
checkY(100)


// So in the below example, the value of rate is picked implicitly from the definition in the context for the same. THis is implicit to the context in which the program is running.
def calculateTax(amount:Float)(implicit rate:Float):Float=amount*rate
implicit val localRate:Float=0.05F

println(calculateTax(1000F))

