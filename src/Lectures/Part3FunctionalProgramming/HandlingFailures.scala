package Part3FunctionalProgramming
import scala.util.{Failure, Random, Success, Try}

object HandlingFailures extends App{
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Super failure"))

  println(aSuccess)
  println(aFailure)

  //Success(3)
  //Failure(java.lang.RuntimeException: Super failure)
  //usually dont need to do above cus you can use try instead
  def unsafeMethod(): String = throw new RuntimeException("No String")

  //this is how you construct try objects via the apply method
  val potentialFailiure = Try(unsafeMethod())
  println(potentialFailiure)

  // syntax sugar
  val anotherPotentialFailiure = Try {
    //code that might throw
  }

  //utilities
  //test whether a try is a failure or success
  println(potentialFailiure.isSuccess) //false

  //orElse
  def backupMethod(): String = "A valid result"
  val fallbackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))
  println(fallbackTry)

  //if you design the api
  def betterUnsafeMethod(): Try[String]= Failure(new RuntimeException)
  def betterBackupMethod(): Try[String]= Success("A valid result")
  val betterFallback = betterUnsafeMethod() orElse betterBackupMethod()
//if code might return null use options
  //if code might throw exceptions use try

  //try also has map, flatmap and filter
  println(aSuccess.map(_*2)) //Success(6)
  println(aSuccess.flatMap(x => Success(x*10))) //Success(30)
  println(aSuccess.filter(_>10)) //Failure(java.util.NoSuchElementException: Predicate does not hold for 3)

  val hostName = "localhost"
  val Port = "8080"
  def renderHTML(page:String) = println(page)
  
  class Connection {
    def get(url:String):String = {
      val random = new Random(System.nanoTime())
      if(random.nextBoolean()) "<html>...</html>"
      else throw new RuntimeException("Connection interrupted")
    }
  }
  
  object HttpService {
    val random = new Random(System.nanoTime())
    
    def getConnection(host:String, port:String):Connection = {
      if(random.nextBoolean()) new Connection
      else throw new RuntimeException("Someone else took the port")
    }
  }



























}
