package Part1Basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  println(factorial(4))

    def anotherFactorial(n: Int): Int = {
      @tailrec
      def factHelper(x: Int, accumulator: Int): Int =
        if (x <= 1) accumulator
        else factHelper(x - 1, x * accumulator) //tail -recurision - use recursive call as last expression to prevent computer crashing

      factHelper(n, 1)
    }

    println(anotherFactorial(4))

  @tailrec
  def printNumbers(n: Int): Unit = {
    if (n <= 10) {
      println(n)
      printNumbers(n + 1) // Recursive call
    }
  }

  printNumbers(1)
  
  //WHEN YOU NEED LOOPS USE TAIL RECURSION
  
}









//StackOverflow occurs when recursive error is too big

