package Part1Basics

object TypeInference {
  val message = "Hello World"

  val x = 3
  val y = x + "items"
  println(y) //can figure out value of value

  //can figure out return types of functions
  def function(x:Int) = x+1
  println(function(4))

  //sometimes compiler cant figure out return type

  def factorialFunction(n:Int):Int = //this NEEDS an Int return type
    if(n<=0)1
    else n * factorialFunction(n-1)




}
