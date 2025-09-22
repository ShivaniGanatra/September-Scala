

abstract class MyList {
  def head : Int
  def tail : MyList
  def isEmpty: Boolean
  def add(element:Int) :MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"

}

//extend by empty list and non-empty list
//objects can extend classes
object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException()
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element,Empty)
  def printElements: String = ""
}

class Cons(h:Int,t:MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element,this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTest extends App {
  //val list = new Cons(1,Empty)
  val list = new newCons(1,new newCons(2, new newCons(3,newEmpty)))
  println(list.head)//1
  println(list.tail.head)//2
  println(list.add(4).head)//4
  println(list.isEmpty)//false
  println(list.toString) //[1 2 3]
}
