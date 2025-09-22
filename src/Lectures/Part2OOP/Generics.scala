package Part2OOP

object Generics extends App{
  class MyList[+A] {
  //def add[B >: A](element : B):MyList[B] = ???
  } //A means a genric type
  //mylist is a generic class, a is a type parameter
  //use type a inside class dfinition
  val listOfIntegers = new MyList[Int]
  val listOfStrings =new MyList[String]

  class myMap[key,value]// as many type parameters as you want //traits can also be type paremerised

  //generic methods
//  object MyList {
//    def empty[A]:MyList[A] = ???
//  }
//  val emptyListOfIntegers = MyList.empty[Int]

  //Variance
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //list[cats] extends List[Animals] = covariance

  class CovariantList[+A]
  val animal:Animal = new Cat
  val animalList : CovariantList[Animal] =new CovariantList[Cat]
  //Firstly its a list of cats if we do animalList.add(new Dog) then you return a list of animals
  
  class InvariantList[A]
  //val invariantList :InvariantList[Animal] = new InvariantList[Cat] wont work
  val invariantList :InvariantList[Animal] = new InvariantList[Animal] //will work

  class ContravariantList[-A]
  //replacing a list of cats with a list of animals
  val contravariantList : ContravariantList[Cat] = new ContravariantList[Animal]

  //contravariant list example
  class Trainer[-A]

  //replacing a list of cats with a list of animals
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types - upper bounded type
  //   class Cage[A <: Animal] means class cage only accepts type parametrs A which are subtypes of Animal
  class Cage[A <: Animal](animal:A) //can hold subclasses
  val cage = new Cage (new Cat)


//  class Car
//  val newCage = new Cage(new Car) //this wont work as Car isnt a subclass of animal

  //bounded types - lower bounded type
  class CatCage[C >: Cat](Cat: C) //can hold subclasses

  val CatCage = new Cage(new Animal)

}
