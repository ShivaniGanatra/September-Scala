package Part1Basics

object Functions extends App{
  def aFunction(a:String, b:Int):String = { //dont have to use :String at end compiler will figure out return type
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction():Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction()) // this usually should work without the ()

  def aRepeatedFunction(aString:String,n:Int):String = { //recursive function needs :String which is the return type
    if(n==1)aString //aString becomes "hello" because if is an expression
    else aString + aRepeatedFunction(aString,n-1)
  }
  // if(3==1)
  //then "hello +
  //if 2 == 1 hello
  //then if 1 ==1 hello

  println(aRepeatedFunction("hello",3)) //this is a recursive function //hellohellohello
  println(aRepeatedFunction("hello",1)) //hello

  def aFunctionWithValue(aString:String): Unit = println(aString) //printLn returns a Unit

  def aBigFunction(n:Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }
  /*
  1. A greeting funtion for kids that takes two params (name, age) =>
  Hi my name is $name and i am $age years old

  2. Factorial function 1* 2* 3 *3 * n
  recursive function

  3. A fibonacci function
  f(1)
  f(2)
  f(n) = f(n-1) +f(n-2)

  4.Tests if a number is a prime
   */

  def aGreeting (name:String,age:Int):String = {
    "hello my name is " + name + " and i am " + age + " years old"
  }
  println(aGreeting("Shivani",27))

  def aFactorial (n:Int):Int = {
    if (n>1) n * aFactorial(n-1) //
    else n
  }

  println(aFactorial(4))

  def aFactorial2(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorial2(n - 1) //

  }

  println(aFactorial2(4))

  def aFibonacci(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)

  }

  println(aFibonacci(8)) // 1(1) 2(1) 3(2) 4(3) 5(5) 6(8) 7(13) 8(21)





  def decreasingNumbers(n: Int): String = {
    if(n>=1) (n)+ " "+ (decreasingNumbers(n-1))
    else  " "
  }

  println("Decreasing numbers " + decreasingNumbers(5))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    if (n <= 1) false  
    else isPrimeUntil(n / 2)
  }

  println(isPrime(3))
  println(isPrime(2))
  println(isPrime(4))


}
