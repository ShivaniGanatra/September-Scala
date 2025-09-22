object ListTest2 extends App{
  val listOfIntegers = List(1,2,3)
  println(listOfIntegers.map(elem => elem * 2).toString) //same as below
  println(listOfIntegers.map(_ * 2).toString)

  println(listOfIntegers.filter(elem => elem % 2 == 0))
  
  val superAdd = (x:Int) => (y: Int) => x + y //lambda version
  println(superAdd(3)(4)) //7
  
  
}
