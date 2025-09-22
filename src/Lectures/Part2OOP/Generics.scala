package Part2OOP

object Generics extends App{
  class myList[A] //A means a genric type
  //mylist is a generic class, a is a type parameter
  //use type a inside class dfinition
  val listOfIntegers = new myList[Int]
  val listOfStrings =new myList[String]

  class myMap[key,value]// as many type parameters as you want //traits can also be type paremerised

  //generic methods
  object myList {

  }
}
