package Part1Basics

object ValuesVariablesTypes extends App{
  private val x: Int = 42
  println(x)
  // VALS aka values ARE IMMUTABLE
  //X=5 WONT WORK
  val y = 5
  //compiler can infer types
  val  aString : String = "hello"
  val aBoolean = true
  val aChar : Char = 't'
  val anInt : Int = x
  val aShort : Short = 556
  val aLong : Long = 485443
  val afloat :Float = 253621.8458
  val aDouble : Double = 36538.489334

  //varibales in scala
  // Variables can VARy so they can change
  //Variables ARE MUTABLE
  var aVariable : Int = 4
  aVariable = 9 //used for side effects





}
