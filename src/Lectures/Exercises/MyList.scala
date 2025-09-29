package Exercises



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
case object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException()
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element,Empty)
  def printElements: String = ""
}

case class Cons(h:Int,t:MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element,this)
  def plusOne: Int => Int = (x:Int) => x + 1
  def printElements: String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }
  def forEachMethod(f: Int => Int, list: List[Int]): Unit = {
    println(list.foreach(member => f(member)))
  }
}

object ListTest extends App {
  //val list = new Cons(1,Empty)
  val list = new Cons(1,new Cons(2, new Cons(3,Empty)))
  println(list.head)//1
  println(list.tail.head)//2
  println(list.add(4).head)//4
  println(list.isEmpty)//false
  println(list.toString) //[1 2 3]
 // println(list.forEachMethod(list.plusOne,list))


}
