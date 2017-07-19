val firstArray = new Array[Int](5)
firstArray(4)
 import scala.collection.mutable.ArrayBuffer


// See the 2 definitions below. The new keyword is really not needed here because the apply method of the ArrayBuffer would handle the object creation and initialization part.
val aBuffer = new ArrayBuffer[String]()
val bBuffer = ArrayBuffer[Int]()

bBuffer +=100
bBuffer +=100
bBuffer +=20
bBuffer -= 20

aBuffer+="Ashish"
bBuffer+=(10, 20, 30)
bBuffer ++= Array(50,60,70)

for(i <-0 until bBuffer.length)
  println(s"element at ${i} is ${bBuffer(i)}")

//Traversing in reverse
for(i <-bBuffer.length-1 to 0 by -1)
  println(s"Traverse again element at ${i} is ${bBuffer(i)}")

for(i <-bBuffer.indices)
  println(s"Traverse THIRD element at ${i} is ${bBuffer(i)}")


for(i <-bBuffer.indices.reverse)
  println(s"Traverse FOURTH element at ${i} is ${bBuffer(i)}")

for(elem <-bBuffer) {
  println(elem)
}
// way to filter and map the values to something else.
bBuffer filter {_ > 50 } map { _ + 3}


// USing mkString to format the Array and get a useful output from it
bBuffer mkString " followed by "

bBuffer mkString ("<", " followed by ", ">")
