package Part2OOP

object OOPExcercises extends App{
  val writer = new Writer("Shivani","Ganatra",2025)
  writer.fullName()

  val firstNovel = new Novel("Pride and Prejudice",1813,"Jane Austen")
  firstNovel.whatsTheAuthorsAge(27)
  firstNovel.isWrittenBy()
  firstNovel.copy(1999).isWrittenBy()
}

class Writer( firstName:String, surname:String, val year:Int) {
  def fullName(): Unit = println(s"Full name: $firstName $surname")
}

class Novel(val name:String,val yearOfRelease:Int,val author:String) {

  def whatsTheAuthorsAge(authorsAge:Int): Unit = println(s"The Authors age is: ${authorsAge}")
  def isWrittenBy(): Unit = println(s"The novel $name is written by $author in $yearOfRelease")

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)

}
