package Part2OOP

object ObjectsInScala extends App{
  //Scala doesn't have class level functionality 
  //it has something else instead
  /* Objects can be defined similar to classes but don't receive parameters like classes can
  Scala doesn't have static it has object
   */
  object Person { //defining its type and only instance
    val N_Eyes = 2
    def canFly:Boolean = false //objects can be defined in a similar way
    
    //factory method - builds 'persons' from parameters
    def apply(mother:Person, father:Person):Person = new Person("Bobby") //method can also be from
    //def from(mother: Person, father: Person): Person = new Person("Bobby")
  }
  
  class Person(val name:String) {
    /*this is to separate instance level functionality from static/class level 
    functionality between classes and objects is split
    Instance of writing objects with same name and same scope is called COMPANIONS
    class Person and Object Person are companions as they have same name and reside in same scope
    accessed from regular instance or singular instance
    Its VERY Object orientated
     */
  }
  println(Person.N_Eyes) //2
  println(Person.canFly) //false
  
  //SCALA OBJECT IS A SINGLETON INSTANCE 
  val mary = Person //this is the instance of th person type 
  val john = Person 
  println(mary == john) //true as they point to the same instance

  val annie = new Person("Annie") //this is the instance of th person type 
  val jonny = new Person("Jonny")
  println(annie == jonny) //false as they point to different instance
  
  val bobby = Person.apply(annie,jonny) //or
//  val bobby = Person(annie, jonny) //apply method in singleton object
  
  //Scala applications = Scala Object with
  //def main(args: array[String}): Unit {} if extends app isnt thre the code will run still
  //or scala object extends app

  
  
  
}
