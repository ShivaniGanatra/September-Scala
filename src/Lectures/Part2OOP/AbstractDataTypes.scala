package Part2OOP

object AbstractDataTypes extends App{
  //abstract app - values aren't supplied as you want subclasses to do that for you
  //cant be instantiated
  abstract class Animal {
    val creatureType:String = "wild"
    def eat:Unit
  }
  //val animal = new Animal {} wont work
  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override def eat: Unit = println("Dog crunch crunch")
  }
  //traits = have abstract filds and methods AND can be inherited along classes
  trait Carnivore {
    def eat(animal:Animal):Unit
    val prefferedMeal: String = "meat"
  }
  trait ColdBlooded //have as many traits as you want

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"
    override def eat: Unit = println("NomNomNom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I am eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog) //I'm a croc and I am eating a Canine

  //traits vs abstract classes
  //both traits and abstract classes can have abstract and non abstract members
  //traits do not have constructor parameters - trait(name:String) wont work
  //can have multiple traits inherited but one class
  //traits = behaviour,abtract class is a type of thing
  //animals describe animals traits describe what they do

  //Scala.any <- scala.AnyRef(java.lang.object - scala.null extends everyhting
  // ^scala.anyVal
  //scala.Nothing can replace eveyhing substype of everything - most nothing thing




}
