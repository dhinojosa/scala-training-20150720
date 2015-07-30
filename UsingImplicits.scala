
case class SalaryPerHour(x:Int)

object RegularTime {
   implicit val a = SalaryPerHour(100)
}

object Overtime {
   implicit val a = SalaryPerHour(140)
}


import Overtime._

case class Employee(val firstName:String, val lastName:String) {
  def payUp(hours:Int)(implicit salary:SalaryPerHour) = hours * salary.x
}

val e = new Employee("Stan", "Bob")
println(e.payUp(20))


implicit class IntWrapper(val x:Int) {
   def isOdd  = x % 2 != 0
   def isEven = !isOdd
}

//implicit def int2IntWrapper(x:Int) = new IntWrapper(x)

println(3.isOdd)
println(3.isEven)
println(122.isEven)

import java.time._
import java.time.temporal._

implicit def tuple3ToLocalDate(x:(Int, Int, Int)) = LocalDate.of(x._3, x._1, x._2)

def daysUntilEndOfYear(x:LocalDate) = ChronoUnit.DAYS.between(x, LocalDate.of(2015,12,31))

println(daysUntilEndOfYear((11, 1, 2015)))

def addStuff(x:BigInt, y:BigInt) = x + y

println(addStuff(10, 12))


//case class Employee(firstName:String, lastName:String)
object EmployeeSorters {
  implicit val sortByFirstNameOrdering = new Ordering[Employee] {
     def compare(x:Employee, y:Employee) = x.firstName.compare(y.firstName)
  }
  
  implicit val sortByLastNameOrdering = new Ordering[Employee] {
     def compare(x:Employee, y:Employee) = x.lastName.compare(y.lastName)
  }
}

import EmployeeSorters.sortByLastNameOrdering

val list = List(Employee("Ann", "Berger"), Employee("Sunil", "Agarwal"), Employee("Kalyan", "Govindasamy"))

println(list.sorted)


