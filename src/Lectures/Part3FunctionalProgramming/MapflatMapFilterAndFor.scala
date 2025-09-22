package Part3FunctionalProgramming

object MapflatMapFilterAndFor extends App{
  val list = List(1,2,3)

  println(list)
  println(list.head) //1 - this already exists in list
  println(list.tail) // List(2, 3)

  //map
  println(list.map(_ + 1)) // List(2, 3, 4)
  println(list.map(_ + " is a number")) // List(1 is a number, 2 is a number, 3 is a number)
  println(list.filter(_ % 2 == 0)) //List(2)

  //flatMap
  //  val list = List(1,2,3)
  val toPair = (x:Int) => List(x,x*5)
  //this makes a list which the original number ie 1, (1 * 5), 2, (2*5), 3, (3*5)
  println(list.flatMap(toPair)) // List(1, 5, 2, 10, 3, 15)

  //print all possible cobinations of list
  val numbers = List(1,2,3,4)
  val characters = List('a','b','c','d')

  println(characters.map("1"+ _)) // List(1 is a number, 2 is a number, 3 is a number)
  //to find every possible combo for numbers and characters
  val combinations = numbers.flatMap(n =>characters.map(c => " " + c + n))
  println(combinations) // List( a1,  b1,  c1,  d1,  a2,  b2,  c2,  d2,  a3,  b3,  c3,  d3,  a4,  b4,  c4,  d4)

  //to find every possible combo for numbers and characters and colours
  val colours = List("Black","White")
  //iteration
  val colourCombinations = numbers.flatMap(n => characters.flatMap(c =>colours.map(colour => " " + c + n + colour)))
  println(colourCombinations)

  //forEach
  list.foreach(println)

  //for-compreheshions
  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- characters
    colour <- colours
    } yield "" + c + n + colour
  println(forCombinations)
  //List(a2Black, a2White, b2Black, b2White, c2Black, c2White, d2Black, d2White, a4Black, a4White, b4Black,
  // b4White, c4Black, c4White, d4Black, d4White)
  //same as this   val colourCombinations = numbers.filter(_%2 == 0).flatMap(n => characters.flatMap(c =>colours.map(colour => " " + c + n + colour)))
  //  println(colourCombinations)

  for {
    n <- numbers
  } println(n)


  //syntax overload
  val v = list.map { x =>
    x * 2
  }
  println(v)

}


//foreach causes side effects

