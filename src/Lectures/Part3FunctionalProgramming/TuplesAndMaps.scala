package Part3FunctionalProgramming

object TuplesAndMaps extends App {
  //tuples -finite ordrd "lists
  val aTuple = Tuple2(2, "hello Scala")

  println(aTuple._1) //access first element
  println(aTuple._2) //access seconf elem
  println(aTuple.copy(_2 = "goodbye java")) // (2,goodbye java)
  println(aTuple.swap) //(hello Scala,2)


  //Maps associate keys to values
  val aMap: Map[String, Int] = Map()
  val phonebook = Map(("Jim", 55), ("Daniel", 789))

  val phonebookWithArrow = Map("Jim" -> 55, "Daniel" -> 789) //this is th syntactic sugar version of above
  println(phonebookWithArrow)
  println(phonebookWithArrow.contains("Jim")) //true
  println(phonebookWithArrow("Jim")) //returns a key - 555

 // println(phonebookWithArrow("mary")) //throws exception key not found
  val anotherMap = Map("Jim" -> 55, "Daniel" -> 789).withDefaultValue(-1) //default val
//this will ensure an exception won't be thrown if key wasn't found
  println(anotherMap("Shivani")) //-1 it doesn't exist

  //how to add a a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook) //Map(Jim -> 55, Daniel -> 789, Mary -> 678)

  //functionals on maps
  //map, flatMap, filter

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2)) //this will lowercase keys
  // Map(jim -> 55, daniel -> 789)

//  //filter keys
//  println(phonebook.view.filterKeys(_.startsWith("J"))) //same as
  println(phonebook.view.filterKeys(x => x == "Jim"))

  //mapValues
  println(phonebook.map(pair => pair._1 -> pair._2 * 10)) //Map(Jim -> 550, Daniel -> 7890)

  //conversions to othr colltcions
  println(phonebook.toList)
  println(List(("Jim",55), ("Daniel",789)).toMap)

  val names = List("Bob","James","Angela","Mary","Daniel","Jim")
  println(names.groupBy(name => name.charAt(0)))
  //HashMap(J -> List(James, Jim), A -> List(Angela), M -> List(Mary), B -> List(Bob), D -> List(Daniel))






}