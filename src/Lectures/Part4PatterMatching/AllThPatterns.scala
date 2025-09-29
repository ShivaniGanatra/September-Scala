package Part4PatterMatching

import Exercises.MyList
import Exercises.Cons
import Exercises.Empty

object AllThPatterns extends App{
  val x :Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "The Scala"
    case true => "The Truth"
    case AllThPatterns => "A singleton object"
  }

  //2 - match anything
  val matchAnyything = x match {
    case something => s"Iv found $something"
  }

  //3 - tuples
  val aTuple = (1,2)
  val matchATuple = aTuple match {
    case (1,1) =>
    case (something,2) =>

  }
  //can have nested pattern matching
  //pms can be nested

  val nestedTuple = (1,(2,3))
  val matchANestedTuple =nestedTuple match {
    case(_,(2,v)) =>
  }

//4 - case classes - constructor patterns
  //val aList: MyList[Int] = Cons(1,Cons(2,Empty))

  val aStandardList = List(1,2,3,42)
  val standardListMatching = aStandardList match {
    case List(1,_,_,_) => //Extractor -advanced
    case List(1,_*) => //list of arbitary length -advanced
    case 1 :: List(_) => //infix pattern
    case List(1,2,3) :+ 42 => //this is also an infix pattern
  }

  //6 -type specifiers
  val unknown:Any =2
  val unkownMatch = unknown match {
    case list:List[Int] => //explicit type specifier
    case _ =>
  }

//  //name-binding
//  val nameBindingMatch = aList match {
//    case nonCons(_,_)
//  }

val numbers = List(1,2,3)
val numbersMatch = numbers match {
  case listOfStrings: List[String] =>"a list of strings"
  case listOfNumbers: List[Int] => "a list of numbers"
  case _ => " "
}

println(numbersMatch) //a list of strings...
//JVM trick question



















}
