package Part2OOP

object OOPBasics extends App{

  val person = new Person("Shivani",27)
  println(person.age) //27
  println(person.x) // 2 as this is a field
  println(person.greet("Shiv")) //Shivani says : Hi, Shiv
  println(person.greet()) //Hi I am Shivani //no param so uses the constructor field
  //scala can do overloading
  // means having methods with the same names but different signatures
  //different params can have different return types but no different return types alone


}

//class Person(name:String,age:Int) //this is a constructor
//class parameters are NOT FIELDS
//to convert param to field add val/var in front
class Person(val name:String, val age:Int) { //can say val age: Int = 0 and give a default parameter here
  //body
  val x = 2
  println(1+3) //4
  //this is a method
  def greet(name:String): Unit = println(s"${this.name} says : Hi, $name")
  // Shivani says : Hi, Shiv

  def greet(): Unit = println(s"Hi I am $name")
  //def greet() : Int = 34 //the compiler won't like the different returns and will get confused

  // multiple constructors
  def this(name:String) = this(name,0)
  def this() =this("Joe Doe")

}

//class body can have
//val and var definitions
//function definitons
//expressions
//can have packages and other complex stuff
