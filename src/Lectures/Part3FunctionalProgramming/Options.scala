package Part3FunctionalProgramming
import scala.util.Random

//to avoid null pointer
object Options extends App{
  //An option is a wrapper for a type that might be present or not
  val map = Map("key" -> "value")
  println(map.get("key"))
  println(map.get("other"))

  //map uses options

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None
  println(myFirstOption) // Some(4)

  //unsafe APIS
  def unsafeMethod(): String = null //dont use some with this
  //SOME Should always have valid value inside

  val result = Option(unsafeMethod())
  println(result) //None

  //chained methods
  def backupMethod(): String = "A valid result"
  val chainResult = Option(unsafeMethod()).orElse(Option(backupMethod()))
  println("chainResult " + chainResult)

  //DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] =None
  def betterBackupMethod(): Option[String]=Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  //functions on options
  println(myFirstOption.isEmpty)//false
  println(myFirstOption.get) //unsafe - dont use

    //map,flatMap,filter
  println(myFirstOption.map(_*2)) //Some(8)
  println(myFirstOption.filter(x => x > 10)) //None - doesn't exist so none is given instead
  //us this for morse code validating string
  //if value is string is fine else none will be thrown if none is thrown ask them to re submit
  //if value is morse ask thm to re enter word
  println(myFirstOption.flatMap(x => Option(x * 10))) //Some(40)

  //for comprhensions
  val config :Map[String,String] = Map(
    "host" -> "176.45.36.1",
    "port" -> "80"
  )

  class Connection {
    def connect = "Connected" //connects to a asrver
  }

  object Connection {
    val random = new Random(System.nanoTime())
    def apply(host:String, port: String):Option[Connection] =
      if (random.nextBoolean()) Some(new Connection) //this outputs true or false
      else None
  }

  val host = config.get("host")
  val port = config.get("port")
  val connection = host.flatMap(h=> port.flatMap(p => Connection.apply(h,p)))
  /*
  if h is not null
    if p is not null
      Connection.apply(h,p)
  otherwise return null
   */
  val connectionStatus = connection.map(c => c.connect)
  /*
    if c is not null
      return c.connect
  else return null
   */

  println(connectionStatus) //Some(Connected)
  connectionStatus.foreach(println) //Connected
  //if connection status is null print none else print some

  println("Chained Solution")
  //chained solution
  config.get("host")
    .flatMap(host => config.get("port")
      .flatMap(port => Connection(host,port))
        .map(connection => connection.connect))
    .foreach(println)

  //for-connections
  val forConnectionStatus = for {
    host <- config.get("host") //if host
    port <- config.get("port") //if port
    connection <- Connection(host,port) //if connection isnt null
  } yield connection.connect //give me connect
  forConnectionStatus.foreach(println)


  object trueOrFalse {
    val random = new Random(System.nanoTime())

    def apply(): Option[Unit] =
      if (random.nextBoolean()) Some(println("This is true")) //this outputs true or false
      else None
  }

  println("true or false " + trueOrFalse.apply())
  if(trueOrFalse.apply()== None) println("this is none")
  else println("Some")

  //if you use funtions that might return nulls use options instead



}
