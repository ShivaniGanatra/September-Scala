package Part3FunctionalProgramming

object WhatsAFunction extends App{
  val doubler = new Function[Int,Int] { //takes an element of type int returns an element of type int
    override def apply(element: Int): Int = element * 2 //this is an instance of the function like class above
  }
  println(doubler(2))

  val stringIntConverter = new Function[String, Int] {
    override def apply(string:String):Int = string.toInt
  }
  println("3" + 4) //34
  println(stringIntConverter("3") + 4) //7 //it definitely turns into a number if it were a string it would be 34
  // like above

  //function that takes two ints and returns an int
  val adder = new Function2[Int,Int,Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  println(adder(3,4)) //7

  //ALL SCALA FUNCTIONS ARE OBJECTS
  val stringJoiner = new Function2[String,String,String]  {
    override def apply(a: String, b: String): String = a + b
  }
  println(stringJoiner("hi","shiv"))

  //Can have a function which returns a function
  val superAdder: Function1[Int, Function[Int,Int]] = new Function[Int, Function[Int,Int]] {
    override def apply(x: Int): Function[Int, Int] = new Function[Int,Int] {
      override def apply (y:Int):Int = x + y
    }
  }

  val adder3 = superAdder(3) //adder 3 is a new function
  println(adder3(4)) //7 //y is 4 which is parameter
  println(superAdder(3)(4)) //curried function
  //can pass functions as params
  //can use functions as values


}
