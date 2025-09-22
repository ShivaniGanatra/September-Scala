package Part3FunctionalProgramming

object AnonymousFunctions extends App{
//anonymous function(LAMBDA)
//  val doubler: Int => Int = (x: Int) => x * 2 -can do this
//  val doubler: Int => Int = x => x * 2 -can do this
  val doubler = (x:Int) => x*2 //USE THIS FROM NOW ON
println(doubler(2))

  //multiple params lambda
//  val adder :(Int, Int) => Int = (a: Int, b: Int) => a + b
  val adder = (a:Int,b:Int) => a + b
  println(adder(2,4))
  
  //no params 
//  val justDoSomething:() => Int = () => 3
  val justDoSomething = () => 3
  println(justDoSomething)//function itself
  println(justDoSomething()) //call
  
  //curly braces with LAMBDAs
  val stringToInt = { (str:String) =>
    str.toInt
  }
  
  //More syntatic sugar
  val niceIncrementer: Int => Int = (x:Int) => x + 1
  val niceIncrementerWithSyntacticSugar: Int => Int = _ + 1  //shortened version of above
  
  val niceAdder: (Int,Int) => Int = (a,b) => a + b
  val niceAdderWithSyntacticSugar: (Int, Int) => Int = _ + _

  
  /*
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
   */
  
}
