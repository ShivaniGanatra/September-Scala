package Part2OOP

object InheritanceAndTraits extends App{
  //single class inheritance
  class Animal {
    def eat = println("yummy")
    //  private  def eat = println("yummy") wont work for cat
  //  protected  def eat = println("yummy") //can use in this class and subclasses
    val creatureType = "wild"
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }
  //Cat subclass animal is superclass of cat
  val cat = new Cat
  cat.crunch
  // cat.eat wont work

  //CONSTRUCTORS
  class Person(name:String,age:Int) {
    def this(name: String) = this(name,0)
  }
  class Adult(name:String,age:Int,IDCard:String) extends Person(name, age) //constructor needs params name and age
  //extends peron nam will also work as there is a constructor with just a name

  //OVERRIDING
  class Dog extends Animal {
    override def eat: Unit = println("dog crunch crunch")
    override val creatureType: String = "domestic"
  }

  val dog = new Dog
  dog.eat //dog crunch crunch
  println(dog.creatureType) //domestic

  class Ape(override val creatureType:String) extends Animal {
    override def eat: Unit = {
      super.eat
      println("monkey crunch crunch")
    }
  }

  val Ape = new Ape("Monkey")

  //Type substitution (polymorphism
  val unkownAnimal: Animal = new Ape("Monkey")
  unkownAnimal.eat // yummy
 // monkey crunch crunch


  //overriding vs overloading

  //supr is used to inherit a
  //super is used when you wanna reference a method or field from a parent class

  //preventing overrides
  //1- use word final to prevent overriding methods
  //final can be used on class itself - extending a subclass from it becomes illegal
  //seal class - can extend calsses in THIS FILE  but prevents extension in other files
  //sealed class Animal {}


}
