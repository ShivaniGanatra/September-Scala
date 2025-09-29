package Part4PatterMatching

import scala.util.Random

object PatternMatching extends App {
  val random = new Random
  val x = random.nextInt(10)

  val description = x match { //description can be "any" type
    case 1 => "The one"
    case 2 => "double or nothing"
    case 3 => "third times the charm"
    case _ => "something else" //wild card
  }
  //is something doesnt match like case _ you get an exception matcherror

  println(x)
  println(description)

  //decompos values
  case class Person(name:String, age:Int)
  val bob = Person("Bob",20)

  val greeting = bob match {
    case Person(n,a) if a < 21 =>s"Hi my name is $n and I cant drink in the US"
    case Person(n,a) =>s"Hi my name is $n and I am $a years old"
    case _ => "I dont know who I am "
  }

  println(greeting)

//cases are matched in order//type of pm expression

  //pm on seald hierachies
  //pm works really well with case classes
  sealed class Animal
  case class Dog(breed:String) extends Animal()
  case class Cat(greeting: String) extends Animal()

  val animal : Animal = Dog("Terra Nova")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
  }

  val isEvenCondition = if (x%2 == 0) true else false //instead of this
  val isEvenNormal = x%2 == 0 //do this

  trait Expr
  case class Number(n:Int) extends Expr
  case class Sum(el: Expr,e2:Expr) extends Expr
  case class Prod(e1:Expr,e2:Expr) extends Expr

  def show(e:Expr):String = e match {
    case Number(n) => s"$n"
    case Sum(el,e2) => show(el) + " + " + show(e2)
    case Prod(el,e2) =>
      def maybeShowParentheses(exp:Expr) = exp match {
        case Prod(_, _) => show(exp)
        case Number(_) => show(exp)
        case _ => "(" + show(exp) + ")"
      }

      maybeShowParentheses(el) + " * " + maybeShowParentheses(e2)

  }

  println(show(Sum(Number(2),Number(3))))
  println(show(Sum(Sum(Number(2),Number(3)),Number(4))))

}
