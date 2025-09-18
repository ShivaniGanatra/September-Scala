package Part1Basics

object Strings extends App{
//                    01234567
  val str : String = "Hey im learning Scala"
  println(str.charAt(2)) //y
  println(str.substring(7,11)) //lear
  println(str.split(" ").toList)// List(Hey, im, learning, Scala)
  println(str.startsWith("Hey")) //true
  println(str.replace(" ","-")) //this wont mutate the string
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)
  println(str.reverse) //this is scala specific
  println(str.take(2)) //He

  val aNumberString = "145";
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z') //a145z //prepending and appending operators are scala specific

  //SCALA Specific :String Interpolators
  //S- Interpolators

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and i am $age years old" //only works is s is in front
  println(greeting) //Hello, my name is David and i am 12 years old

  val anotherGreeting = s"Hello, my name is $name and i will be turning ${age + 1} years old" //only works is s is in front
  println(anotherGreeting) //Hello, my name is David and i will be turning 13 years old

  //F - INTERPOLATORS
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.5f burgers per minute"
  println(myth) //David can eat 1.20 burgers per minute
  //%s means it will be a string, 2.5f means it will be 2 characters total with maximum 5 characters precision

  //can check for type correctness
  val x = 1.1f //float
  val y = f"$x%3f" //1.100000
  //val z = f"$x%3d" //throws compilation error as d is wrong type
  println(y)
  //println(z)

  //RAW INTERPOLATOR
  println(raw"This is a \n newline") //This is a \n newline

  val escaped = "this is a \n new line"
  println(raw"$escaped")

//  this is a
//  new line










}
