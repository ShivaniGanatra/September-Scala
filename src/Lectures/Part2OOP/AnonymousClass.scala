package Part2OOP

object AnonymousClass extends App{
  abstract class Animal {
    def eat:Unit
  }

  //annoymous class we gave it an on the spot implementation as we needed to use it
  val funnyAnimal: Animal = new Animal { //we instantiate a real class
    override def eat: Unit = println("hahaha")
  }

  println(funnyAnimal.getClass) //class Part2OOP.AnonymousClass$$anon$1 this is the name of the class that has been made
}
