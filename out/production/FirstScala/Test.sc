println("Starting")

def someMethod(input:String):String={
  input+"Hello World"
}
someMethod("Ashish   : ")

// Vals and vars should be initialized when declared.

// Initializing a class with params
class Person(val name:String, var age:Int)
val ash = new Person("Ashish", 100)
ash.age=300

// concept of ranges
var range = 0 to 10 by 2
println(range contains(2))

println(range foreach(x=>println(x)))
// X is the implicitly passed parameter.
// and we take action on it by using that in the next
// funtion.

// Partial FUnctions - defined only for a
// subset of inputs. Throw exception for the rest.

//val pf1= PartialFunction(x:Any,y:String)
// The above syntax is wrong. When using in-built functions
// and classes, the parameterization should be used.

val pf1:PartialFunction[Any, String]={ case s:String=>"STRING"}
val pf2:PartialFunction[Any, String]={ case s:Double=>"DOUBLE"}
// defining a function, use def -- this is the keyword for functions

// while defining the invoke function, you have to pass the Partial being invoked along with the correct signatures
def invokePF(x:Any, f:PartialFunction[Any, String]):String={
try{
  f(x)
}catch{
  // catch is by case. _ is the var being passed
  // and the type of the Match is after the colon.
  case _:MatchError =>"ERROR"

}
}
invokePF("100", pf1)
invokePF(true, pf2)

def checkFunction(x:Any, f:PartialFunction[Any, String])={
  f isDefinedAt(x).toString
}
checkFunction("100", pf1)
checkFunction(true, pf2)

