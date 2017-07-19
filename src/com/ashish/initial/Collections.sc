
// See the corresponding return types for all the lists that are defined in this exercise.
val list= Seq("Ashish",  "Aneja")

val lis1="1" :: "2" :: "3"::Nil

val list2= "1" +:"2" +: Seq.empty

val list3= "1" +:"2" +: Nil

val list4 = list ++ lis1

val list5 = list3 ++ list2

val list6 = list2 ++ list3


val someMap =Map("One" ->"1", "Two"->"2")
// Two ways of achieving the same outcome are shown below here.
someMap map {case (k, v)=>(k,k+v)}

// Treating the result as a Tuple and treating as a Map in the previous example
someMap.map (kv=> (kv._1, kv._2 + "ABC"))

