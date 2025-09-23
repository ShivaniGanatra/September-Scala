package Part2OOP

import Part2OOP.Exceptions.{MathematicalException, OverflowException, UnderflowException}

import scala.language.postfixOps

object Exceptions extends  App{
  val x:String = null
  //println(x.length)//this will throw excption
  //this will crash with a null pointer xcption
  //throwing and catching excptions
  //throwing excptions
 // val wierdvalue = throw new NullPointerException
  //throwable classes extnd the throwable class
  //Excption and error are th major throwable subtypes

  //2how to catch exceptions
  def getInt(withExceptions:Boolean):Int = {
    if(withExceptions) throw new RuntimeException("No Int for you")
    else 42
  }

  //if true throw a runtime exception becaus value below is true the runtime exception is caught

  try {
    getInt(true)
  } catch {
    case e : RuntimeException => println("Caught a runtime Exception")
  } finally {
    //code that will get accepted no matter what
    //optional and does not influence return type of expression
    //use finally only for side effects
    println("finally")
  }
  /*
  Caught a runtime Exception
finally
   */
//  try {
//    getInt(true)
//  } catch {
//    case e: NullPointerException => println("Caught a runtime Exception")
//  } finally {
//    //code that will get accepted no matter what
//    println("finally")
//  }

  //the above throws exception as runtime exception isnt caughtException in thread "main" java.lang.ExceptionInInitializerError
  //	at Part2OOP.Exceptions.main(Exceptions.scala)
  //Caused by: java.lang.RuntimeException: No Int for you
  //	at Part2OOP.Exceptions$.getInt(Exceptions.scala:17)
  //	at Part2OOP.Exceptions$.<clinit>(Exceptions.scala:36)
  //	... 1 more
  //finally was still printes
  //exceptions come from java language

  //how to define your own exceptions
  class MyException extends Exception
  val exception = new MyException
//  throw exception
  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathematicalException extends RuntimeException(("Division by 0"))
}
  object PocketCalculator {
    def add(x: Int, y: Int): Int = {
      val result = x + y

      if(x > 0 && y > 0 && result < 0) throw new OverflowException //if the params are greater than zero and the result is negative it means the nums are too big
      else if (x<0 && y < 0 && result > 0) throw new UnderflowException
      else result
      //big positive value plus another value will give a negative value
    }
    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException //if you subtract from a negatve you get an exception
      else if (x < 0 && y>0 && result > 0)throw new UnderflowException //-5 - 7 will give -12
      else result
    }
    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException //if the params are greater than zero and the result is negative it means the nums are too big
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException //-5 * -5 should give positive 25 if result is negative its too big
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException //5 * -5 should give -25 if result is positive its too small
      else if (x < 0 && y > 0 && result < 0) throw new UnderflowException //-5 * 5 should give -25 if result is positive its too small
      else result
    }
    def divide(x: Int, y: Int): Int = {
    if (y == 0) throw new MathematicalException
    else x/y
    }
    //oom
    //val array= Array.ofDim(Int.MaxValue) 
    
    //stack ovrflow
    def infinite : Int = 1 + infinite

  }

