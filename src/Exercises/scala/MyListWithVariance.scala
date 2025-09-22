

abstract class MyNewList[+A] {
  def head : A
  def tail : MyNewList[A]
  def isEmpty: Boolean
  def add[B >: A ](element:B) :MyNewList[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

//extend by empty list and non-empty list
//objects can extend classes
object newEmpty extends MyNewList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyNewList[Nothing] = throw new NoSuchElementException()
  def isEmpty: Boolean = true
  def add[B>:Nothing](element: B): MyNewList[B] = new newCons(element,newEmpty)
  def printElements: String = ""
}

class newCons[+A](h:A, t:MyNewList[A]) extends MyNewList[A] {
  def head: A = h
  def tail: MyNewList[A] = t
  def isEmpty: Boolean = false
  def add[B>:A](element: B): MyNewList[B] = new newCons(element,this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else "" +  h + " " + t.printElements
}

object newListTest extends App {
  //val list = new Cons(1,Empty)
  val listOfIntegers: MyNewList[Int] = newEmpty
  //val listOfStrings: MyNewList[String] = newEmpty
  val listOfStrings: MyNewList[String] = new newCons("Hello", new newCons("Scala", newEmpty))

  println(listOfStrings)
  println(listOfIntegers)

}