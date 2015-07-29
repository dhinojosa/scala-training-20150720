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
    
    def unapply(s:String) = {
        val array = s.split(",")
        Some(array(0), array(1))
    }

    def unapply(t:(Int, String, Int)) = {
        Some(t._1 + t._3, t._2)
    }
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

def optionMax(xs:List[Int]):Option[Int] = {
   xs match {
      case List() => None
      case List(x) => Some(x)
      case List(x,y@_*) => {
        val ys = optionMax(y.toList)
        if (x > ys.get) Some(x) else ys
      }
   }
}

println(optionMax(Nil))
println(optionMax(List(1003)))
println(optionMax(List(1003, 4003)))
println(optionMax(List(1003, 4003, 2003, 800, 20, 300)))

def optionMaxV2(xs:List[Int]):Option[Int] = {
   xs match {
      case Nil => None
      case x :: Nil => Some(x)
      case x :: y => {
        val ys = optionMaxV2(y.toList)
        if (x > ys.get) Some(x) else ys
      }
   }
}

println(optionMaxV2(Nil))
println(optionMaxV2(List(1003)))
println(optionMaxV2(List(1003, 4003)))
println(optionMaxV2(List(1003, 4003, 2003, 800, 20, 300)))

val roger = new Employee("Roger", "Rabbit")

def matchSomeString(x:String) = {
    x match {
      case roger(a, b) => s"I got a: $a and I got b: $b"
    }
}

println(matchSomeString("Mayur, Anand"))

val roger(fst,snd) = "Hello, Dolly"
println(fst)
println(snd)

val roger(p1, p2) = (13, "Whoa", 19)
println(p1)
println(p2)
