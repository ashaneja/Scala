// for loop and expressions


val x=1
var y=2
// IN this case, z is getting assigned a value of Unit because the return type of expression y=1 is Unit
var z=y=1

// this should have been defined as

val name ="Ashish"
val age = 400000000
print(f"Hello ${name} . Age is ${age}%14.2f" )
// f is interpolator. Others are s and raw


val ifValue = if(name equals("Ashish")) "YES"
else "No"

var n=5
var r=1
val result=while(n > 0){
  r=r*n
  n -= 1 // This is the format of the decrement operator since the -- operator is missing
  100
}
print(n)
print(r)
print(s"result ${result}")

val x1 = 1.to(10)
print(x1)

// 2 ways op looping over a String.
// The second way is the preferred way
val s="Hello"
var sum=0
for(i <-0 to s.length-1){
  sum +=s(i)
  print(s"sum ${sum}")
}
print(s"sum ${sum}")
var sum1=0
for(char <-s) sum1+=char
print(s"sum ${sum1}")

def multiArgumentFunctions(inputs:Int *) = {
  var res = 0
  for(input <-inputs) res+=input
  print(s"res is ${res}")
  res
}
 val output = (multiArgumentFunctions(1,2,3,4,5,6,7))
// To convert a Seq to something that can be accepted by a multi-argument function, use something like the statement below
val output2 = (multiArgumentFunctions(1 to 7 :_*))


1 to 7
// _* is an annotation used to convert a Sequence to a list of arguments
//(1 to 7: _*)

// A function defined without an equal to sign is a procedure and cannot return a value. This is important and that was the problem in the code for the function that was written earlier

// val, lazy and def
// val is initialized when it is defined
// lazy is not initialized till the time it would be used.
// def is initialized every time it is being referred to. def is actually a call to a function


//The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero. Write a function that computes this value.

def calculateSignum(input:Int)={
  if(input > 0) 1
  else if (input <0 ) -1
  else 0
}
calculateSignum(2)

{}

// Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x.)

val x3:Unit=y=1



