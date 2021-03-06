import java.util



// Showing the usage of return statements from  if conditions.
val test="shish"
val testReult=if(test startsWith("a")){
  "FOUND IT"
}else{
  "DID NOT FIND IT"
}
println(testReult)
println(test)



def staticImport(input:String)={
  import java.math.BigInteger.{
  ONE=>_, // This is effectively masking the value of ONE
  TEN,
  ZERO=>JAVAZERO // This is renaming the value
  }
  //println("ONE "+ONE)
  println(input.toUpperCase)
  println("TEN::"+TEN)
  println("JAVAZERO::"+JAVAZERO)
  //println("TWO"+TWO)
}
staticImport("hello")




// Partial Functions
// Defined for only a subset of input values.
// Also the PF can have only 2 arguments, the input and the output.

val pF1:PartialFunction[Any, String]={case s:String=>"YES"}
val pF2:PartialFunction[Any, String]={case s:Double=>"YES"}
val pf3= pF1 orElse pF2
def tryPF(x:Any, f:PartialFunction[Any, String]):String={
  try{ f(x).toString }  catch { case _: MatchError =>"ERROR"}
}

def d(x:Any, f:PartialFunction[Any, String])=
  f.isDefinedAt(x).toString
List("str", 3.14, 10).foreach{x=>
  printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
    d(x,pF1), tryPF(x,pF1), d(x,pF2),
    tryPF(x,pF2), d(x,pf3), tryPF(x,pf3))}


// Function Literals
val f1:(Int,String) =>String= (i, s)=>i+s
val f2:Function2[Int, String, String] = (i, s)=>i+s



// Tuple
val t1:(Int, String)=(100, "ONE");
val t12:Tuple2[Int, String]=(100, "ONE");
// Using the arrow notation for this.
val t3 =(1->"ONE");
println(t1)
println(t1._1)
println(t1._2)



// Option, Some and None
val capitals = Map(
  ("California" ->"Sacramento"),
  ("Alaska" ->"Juneau")
)
println("ALSKA CAPITAL IS "+capitals.get("Alaska"))
println("CA CAPITAL IS "+capitals.get("California").getOrElse("NOT FOUND"))
println("ABC CAPITAL IS "+capitals.get("ABC").getOrElse("NOT FOUND"))
println("UNKNOWN CAPITAL IS "+capitals.get("UNKNOWN").getOrElse("NOT FOUND"))


object UsageOfMain{
  def main(args:Array[String]){
    println("HELLO WORLD")
  }


}
// Parameterized types
val listOfStrings:List[String] = List("one", "two", "three")
// See the Style of importing
val someMap = new util.HashMap[Integer, String]
someMap


// Iterating over List
val dogs=List("ABC", "BCD", "DEF")
for (breed <- dogs)
  println(breed)


// For loop for List.
for{
  breedYield <- dogs
  if breedYield startsWith "A"
}yield breedYield


// Lazy params
// Lazy Vals

// Pattern matching.
  // For Case.


// Sequences
def even(from:Int, to:Int):List[Int]={
  // The yield has to come after the For Loop.
  for(i<-List(from, to) if i%2==0) yield i
}

def findNumbersToMatchSum(end:Int, requiredSum:Int)={
  for(i <-0 until end;
      j<-i until end
      if i+j==requiredSum)yield Pair(i,j)
}
findNumbersToMatchSum(20, 35) foreach {
  case(i, j)=> println("Number pair is "+i +" "+j)
}

val someList= List(1,2,3)
println(someList)
4::someList  // The :: operator assosiates to the right and not to the lest as is the case with other operators

println(someList)

