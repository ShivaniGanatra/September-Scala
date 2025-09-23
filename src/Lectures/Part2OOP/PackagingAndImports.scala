package Part2OOP

import Playground.{Cinderella => Princess, PrinceCharming} //can do playground._

object PackagingAndImports extends App{
  //can access packag members by their simple name
  val writer = new Writer("Shivani","Ganatra",2025)
  //if youre not in th write packag you ned to import th package
  val princess = new Princess
  //can remove import playgrounf.Cinderella and do new Playground.Cinderella //fully qualified name

  //packages are in a hierachy
  //matching folding structure

  //package object
  //package objectscan only be 1 per package
  sayHello //from package object
  println(speedOfLight)

  val prince = new PrinceCharming

  //default imports
  //scala - Int,nothings,Functiom









}
