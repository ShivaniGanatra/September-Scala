package Part1Basics

object CallByNameOrCallByValue extends App {
  def calledByValue(x:Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
//  by value: 97695527487400
//  by value: 97695527487400 //these are the same, it is evaluated beforehand
  calledByName(System.nanoTime())
//  by name: 97695576309900 //these numbers are different
//  by name: 97695576930100 //the expression is carried by name and evaluated everytime
  //used literally everytime its used in the function
  //this is useful in laszy strings

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)
  // printFirst(infinite(),34) this will cause stack overflow
  printFirst(34, infinite()) //34 //y is not used so its never evaluated

  // callByValue
  /*
  Value is computed before call
  same value is used everywhere

  Call by name =>
  Param is not a value
  expression is passed literally
  expression is evaluated at every use within

   */

}
