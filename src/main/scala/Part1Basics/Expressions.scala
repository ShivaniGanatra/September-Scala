package Part1Basics

object Expressions extends App {
  val x = 1 + 2 //expression
  println(x)
  println(2 + 3 * 4)
  println(1==x)
  print(x != 1)
  println(!(1 == x))
// ! && ||
  var aVariable = 3
  aVariable += 2
  println(aVariable)
  //changing a variable is called a side effect
  //Instructions(Something that you Do) vs Expressions(Something that has a value and or a type
  // IF expression - IF IN SCALA IS AN EXPRESSION
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF EXPRESSION gives a value
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  //loops arent typically used in scala
  var i = 0
  while (i<10) {
    println(i)
    i += 1
  }

  //NEVER USE WHILE LOOPS IN SCALA
  //(almost) Everything in scala is an expression
  //side effects in scala are actually expressions
  val aWeirdValue = (aVariable =3)
  println(aWeirdValue)

  //sdie effect : printlm,whiles reassigning
  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z < 2) "hello" else "goodbye"
  }
  println(aCodeBlock)
  //value of code block is value of its last expression

  //val antherValue = z+1 - cant do this cus z is inside

  // if is an expression
  //code blocks in scala are expressions
  //DO NOT USE WHILE LOOPS IN SCALA

  //What's the difference between the string hello world and println hello world
  //println is an expression which is a side effect string is a value of type string
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    43 //43 this is the value of someOtherValue
  }
  println(someValue)
  println(someOtherValue)









}
