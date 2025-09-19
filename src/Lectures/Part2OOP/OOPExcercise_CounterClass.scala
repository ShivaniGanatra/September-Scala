package Part2OOP

object OOPExcercise_CounterClass extends App{
  val counter = new Counter(0)
  counter.theCurrentCountIs()
  counter.incrementNumber().theCurrentCountIs()
  counter.incrementNumber(-2).theCurrentCountIs()
  counter.decrementNumber(3).theCurrentCountIs()
  counter.incrementNumber(3).theCurrentCountIs()
  counter.theCurrentCountIs()
  counter.incrementNumber(8).incrementNumber(1).incrementNumber(1)
  counter.theCurrentCountIs()
  counter.incrementNumber(4).theCurrentCountIs()


}

class Counter (val count:Int) {
  def theCurrentCountIs(): Unit = println(s"The current count is $count")

  def incrementNumber(): Counter = {
    println("incrementing")
    new Counter(count + 1)
  } //immutability - instances are fixed cant be modified inside

  def decrementNumber(): Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

    def incrementNumber(n:Int):Counter = {
      if(n<=0) this
      else incrementNumber().incrementNumber(n-1)
    }
    def decrementNumber(n:Int):Counter = {
      if(n<=0) this
      else decrementNumber().decrementNumber(n-1)
    }

  //  def incrementNumber(n:Int): Counter = new Counter(count + n)
  //  def decrementNumber(n:Int): Counter = new Counter(count-n)

}
