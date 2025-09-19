package Part2OOP

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name:String, favouriteMovie:String) {
    def likes(movie:String):Boolean = movie == favouriteMovie
    def hangOutWith(person:Person):String =s"${this.name} is handing out with ${person.name}"
    def +(person: Person):String=s"${this.name} plus ${person.name}"
    def unary_! : String = s"$name, what the heck!" //need space between ! and :
    def isAlive:Boolean = true //this function deosnt recieve any parameters
    def apply(): String = s"Hi may name is $name and i like $favouriteMovie"

  }
  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception")) //true
  println(mary likes "Deception") //false
  println(mary likes "Inception") //true //infix = Operator notation -natural way of writing - syntactic sugar
  //works with methods with ONE parameter

  //"operators" in scala
  val tom = new Person("Tom","Fight Club")
  println(mary hangOutWith tom) //hangOutWith acts like an operator between two things
  println(mary + tom) //Mary plus Tom //acts like an operator here
  println(mary.+(tom))
  //a method can be called +
  //can make inside object
  //val name:String this is a field
  //favorite movie is a param
  println(1+2) //is the same as
  println(1.+(2)) //as ALL OPERATORS ARE METHODS

  //prefix notation also a form of syntatic sugar
  //synattic sugars are nicer ways of writing code- more resemblant of natural writing
  val x = -1 // - is a unary operator //equivalent with unary _-
  val y = 1.unary_-
  //inary prefix only works with a few operators such as - + ~ !

  println(!mary) //is same as below // Mary, what the heck!
  println(mary.unary_!) // Mary, what the heck!

  //POSTFIX NOTATION
  println(mary.isAlive) //true
  println(mary isAlive) //true
  //Only functions without params can be used in a postfix notation
  //not used that often tbh

  //APPLY
  println(mary.apply()) //Hi may name is Mary and i like Inception
  println(mary()) //can call mary as if it were a function //Hi may name is Mary and i like Inception
}
