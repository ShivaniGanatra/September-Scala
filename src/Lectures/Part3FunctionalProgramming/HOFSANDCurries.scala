package Part3FunctionalProgramming

object HOFSANDCurries extends App {
  //val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = ???
  //function that takes function as a parameter is a HOF higher ordr function
  //hop includes map flatmap and filter

  //function that applies a function(f) n times over a given value x
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x //if doesn't occur any number of times (n is less than or equal to 0) it will stay as the given value
    else nTimes(f, n - 1, f(x))
  val plusOne = (x:Int) => x + 1
  println(nTimes(plusOne,10,1)) //11 it will increment 1 ten times

  def nTimeBetter(f:Int =>Int, n:Int): (Int =>Int) =
    if(n<= 0) (x:Int) => x
    else (x:Int) => nTimeBetter(f,n-1)(f(x))

  val plus10 = nTimeBetter(plusOne,10)
  println(plus10(1))

  //curried functions
  val superAdder = (x:Int) => (y:Int) => x + y
  val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(3)(10))

  //functionWithMultipleParameterLists
  def curriedFormatter(c:String)(x:Double):String = c.format(x)

  val standardFormat : (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI)) //3.14
  println(preciseFormat(Math.PI)) //3.14159265

  }