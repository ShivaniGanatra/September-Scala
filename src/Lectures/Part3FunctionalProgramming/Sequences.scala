package Part3FunctionalProgramming

object Sequences extends App{
  //List,Array,Vector

  //SEQUENCES Seq - a very general interface, and it has a well-defined order and can be indexed
  //can use apply, iterator,length,reverse for indexing and iterating
  //can use concatenating, appending and prepending
  //can us grouping sorting slicing searching etc

  val aSequence = Seq(1,2,3,4)
  println(aSequence) //this sequesnce  is actually a list
  println(aSequence.reverse)
  println(aSequence(2)) //3
  println(aSequence ++ Seq(5,6,7)) //List(1, 2, 3, 4, 5, 6, 7)
  println(Seq(3,4,1,2).sorted) //List(1, 2, 3, 4)

  //Ranges are also sequences
  val aRange: Seq[Int] = 1 to 10 // can do - 1 until 10 - as well
  aRange.foreach(println)
  (1 to 4).foreach(x => println("Hello"))

  /*
  lIST ARE IMMUTABLE AND EXTEND LINEAR SEQUENCE
  HEAD TAIL AND IS EMPTY
  LISTS ARE SEALED two subtypes
   */
  val aList = List(1,2,3)
  val prepended = 42 :: aList
  println(prepended) //List(42, 1, 2, 3)
  val appendIThink = 11 +: aList :+ 12
  println(appendIThink) //List(11, 1, 2, 3, 12)

  val apple5 = List.fill(5)("apple")
  println(apple5) // List(apple, apple, apple, apple, apple)
  println(aList.mkString("-|-")) // 1-|-2-|-3

  //Arrays
  /*
  can be manually constructd with predifned lengths
  can b mutated (updatd in place)
  are introprabl with Java's T[] arrays
  indxing is fast
   */
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[String](3) //this allocates space for three elements without needing to supply the elements
  threeElements.foreach(println)
  /*
  null
  null
  null
   */
  numbers(2) = 0 //syntax sugar for numbers .update(2,0)
  println(numbers.mkString(" ")) //1 2 0 4

  //arrays and sequencs
  val numberSq: Seq[Int] = numbers
  println(numberSq) //WrappedArray(1, 2, 0, 4) //implicit conversion
  //special type of sequence with wrapped over array

  //vector good performac for larg sizes
  val vector: Vector [Int] = Vector(1,2,3)
  println(vector)

  //vectors vs lists
  //list is good as it keeps reference to tail
  //but list updating something in middl taks long
  //vector is good as depth of tree is small
  //but needs to replace a 32 elemnt trunk
  //vector is fastr





}
