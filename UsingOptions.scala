case class Employee(firstName:String, middleName:Option[String], lastName:String)

object UsingOptions extends App {
  val sunil = new Employee("Sunil", None, "Agarwal")
  val viddu = new Employee("Viddu", Some("M"), "Devigere")

  println(sunil.middleName.getOrElse("No middle name"))

  def getInsideMiddleName(x:Option[String]) = {
    x match {
       case Some(a) => a
       case None => "No middle name found"
    }
  }

  println(getInsideMiddleName(sunil.middleName))
  println(getInsideMiddleName(viddu.middleName))

  def getInsideList(x:List[Int]) = {
     x match {
       case List(a) => s"1 item and it is an $a"
       case List(a,b) => s"2 items, and the second item is $b"
       case _ => s"Don't know"
     }
  }

  println(getInsideList(List(1,2)))
}
