package Part4PatterMatching

object PatternsEvrywhere extends App{
  try{

  }catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "something else"
  }
  //catches are actually matches


  val list = List(1,2,3,4)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield 10 * x
  //generators are also based on pattern matching

  val tuples = List((1,2),3,4)
  val filterTuples = for {
    (first,second) <- tuples
  } yield first * second
  println(filterTuples)

  //idea 3
  val tuple = (1,2,3)
  val (a,b,c) = tuple
  println(b) //2
  //multiple val definitions based on pattern matching

  val head :: tail = list
  println(head) //1
  println(tail) //List(2, 3, 4)

  //idea 4
  //partial function
  val mappedList = list.map {
    case v if v%2 == 0 => "v is even"
    case 1 => "the one"
    case _ => "something else"
  }
  println(mappedList)
// List(the one, v is even, something else, v is even)

  //thi is a partial function literal {
  //    case v if v%2 == 0 => "v is even"
  //    case 1 => "the one"
  //    case _ => "something else"
  //  }

  //is same as
//  val mappedListCopy = { x => x match {
//      case v if v % 2 == 0 => "v is even"
//      case 1 => "the one"
//      case _ => "something else"
//    }
//  }


}
