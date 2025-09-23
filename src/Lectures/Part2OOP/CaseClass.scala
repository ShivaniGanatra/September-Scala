package Part2OOP

object CaseClass extends App{
  case class Person(name:String,age:Int)
  //class params are fileds
  val jim = new Person("jim",34)
  println(jim.name)

  //snibl to String
  println(jim.toString)
  println(jim)

  //equals and hashcod implemented out of the box
  val Jim2 = new Person("Jim",34)
  println(jim == Jim2)

  //cas classs have handy copy methods

  val jim3 = jim.copy(age=45) //will print out the sam properties as jum but this nw jim will b 45
  println(jim3)
  
 // case classs have companion objects
  val thePerson = Person
  val Mary = Person("mary",23)
  
  //case classes are serialisable
  //Akka
  
  //case classes hav extractor patters = cas classs can b usd in pattrn matching
  
  case object UnitedKindgdom {
    def name:String = "The uk is nice" 
  }
}
