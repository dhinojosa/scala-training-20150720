
//new Location("Beach Office", "San Diego") //Compiler does not like
import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String, 
               @BeanProperty val lastName:String) {
   def printToScreen:Unit = println(fullName)
   def fullName:String = firstName + " " + lastName
}

//println("Hello there Scala") //Compiler does not like

class Location(name:String, city:String)
