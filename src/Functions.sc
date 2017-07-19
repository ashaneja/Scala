


import java.util
// Partial Functions
// Defined for only a subset of input values.

val pF1: PartialFunction[Any, String] = {
  case s: String => "YES"
}
val pF2: PartialFunction[Any, String] = {
  case s: Double => "YES"
}
val pf3 = pF1 orElse pF2
def tryPF(x: Any, f: PartialFunction[Any, String]): String = {
  try {
    f(x).toString
  } catch {
    case _: MatchError => "ERROR"
  }
}

def d(x: Any, f: PartialFunction[Any, String]) =
  f.isDefinedAt(x).toString
List("str", 3.14, 10).foreach { x =>
  printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
    d(x, pF1), tryPF(x, pF1), d(x, pF2),
    tryPF(x, pF2), d(x, pf3), tryPF(x, pf3))
}


// Function Literals
val f1: (Int, String) => String = (i, s) => i + s
val f2: Function2[Int, String, String] = (i, s) => i + s



// Tuple
val t1: (Int, String) = (100, "ONE");
val t12: Tuple2[Int, String] = (100, "ONE");
// Using the arrow notation for this.
val t3 = (1 -> "ONE");
println(t1)
println(t1._1)
println(t1._2)



// Option, Some and None
val capitals = Map(
  ("California" -> "Sacramento"),
  ("Alaska" -> "Juneau")
)
println("ALSKA CAPITAL IS " + capitals.get("Alaska"))
println("CA CAPITAL IS " + capitals.get("California").getOrElse("NOT FOUND"))
println("ABC CAPITAL IS " + capitals.get("ABC").getOrElse("NOT FOUND"))
println("UNKNOWN CAPITAL IS " + capitals.get("UNKNOWN").getOrElse("NOT FOUND"))


object UsageOfMain {
  def main(args: Array[String]) {
    println("HELLO WORLD")
  }


}

// Parameterized types
val listOfStrings: List[String] = List("one", "two", "three")

// Iterating over List
val dogs = List("ABC", "BCD", "DEF")
for (breed <- dogs)
  println(breed)


// Iterating over a list.
for {
  breedYield <- dogs
  if breedYield startsWith "A"
} yield breedYield


// Inferring Type information
// In this case, the Type info is completely inferred from the RHS
val map = new java.util.HashMap[String, Integer]

