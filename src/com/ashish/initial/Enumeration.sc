object TestEnum extends Enumeration {
  type Breed= Value
  val doberman=Value("Doberman")

  type Breed2= Value
  val doberman2=Value("Doberman2")

}
import TestEnum._
for(breed <-TestEnum.values) println(breed.id)
