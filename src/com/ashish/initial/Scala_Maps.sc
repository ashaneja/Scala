var myMap = Map("1" -> "One", "2"->"Two", "3"->"Three")
myMap += ( ("4", "Four") )
myMap keySet

// This is the pattern for iterating over any collection. Use a for loop with a variable designating what exactly you are looking for and process it at a later point in the code.
for(v <- myMap values) print(v)
// Below expression would return a Tuple
for(v <-myMap) print(v)

// Switching keys and values
for( (k, v) <-myMap) yield (v, k)

val tuple=(0,"Ashish", 100.00)
print(tuple._1)

