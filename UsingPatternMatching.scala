import java.awt.Color

val regexColor = """Color\((\d+),(\d+),(\d+)\)""".r

def patternMatch1(x:Any) = {
   x match {
     case x:Int if (x >= 0 && x < 256) => new Color(x, x, x)
     case x:Int => Color.BLACK
     case (r:Int, g:Int, b:Int) => new Color(r, g, b)
     case regexColor(r, g, b) => new Color(r.toInt, g.toInt, b.toInt)
     case "Red" => Color.RED
     case "Green" => Color.GREEN
     case _ => Color.BLACK
   }
}

println(patternMatch1("Red"))
println(patternMatch1("Yellow"))
println(patternMatch1(10))
println(patternMatch1((10, 20, 30)))
println(patternMatch1("Color(10,16,45)"))
println(patternMatch1(-1))

val (a, b) = (10, 400.0)
println(a)
println(b)

class Employee(val firstName:String, val lastName:String, val awards:List[String]) {
    def this(firstName:String, lastName:String) = this(firstName, lastName, Nil)
}

val Employee(fn, ln) = new Employee("Jim", "Lobster")
println(fn)
println(ln)

//object ChopShop {
//  def unapply(x:Employee) = Some((x.firstName, x.lastName))
//}

object Employee {
   def unapply(e:Employee) = Some(e.firstName, e.lastName)
}

def findEmployee(e:Employee) = {
   e match {
      case Employee("Dan", ln) => s"Welcome Dan! You have the last name of $ln"
      case Employee("Sunil", _) => s"Sunil! How's it hanging."
      case _ => "Who are you?"
   }
}

println(findEmployee(new Employee("Dan", "Hinojosa")))
println(findEmployee(new Employee("Sunil", "Agarwal")))

object Awards { 
    def unapplySeq(x:Employee):Option[List[_]] = Some(x.awards)
}

def listAwards(e:Employee) = {
    e match {
       case Awards() => s"Sorry :("
       case Awards(x) => s"You only have one award and it is $x"
       case Awards(x,y) => s"You have two awards, $x and $y"
       case Awards(x,y,z@_*) => s"You have two main awards $x, $y with the honorable mentions of $z"
       case _ => "Unknown"
    }
}

val keith = new Employee("Keith", "Wong", List("Presidential Medal of Honor", "SST Rock Star", "International Man of Mystery"))

println(listAwards(keith))

val kalyan = new Employee("Kalyan", "Govindasamy")

println(listAwards(kalyan))

def secondAndThird(xs:List[_]) = {
    xs match {
      case List(_,x,y,_*) => (x,y)
      case _ => ()
    }
}

println(secondAndThird(List(4,2,1,4,5,10,11,23)))
println(secondAndThird(List(10,11,23)))
println(secondAndThird(List(10,11)))
println(secondAndThird(List()))


