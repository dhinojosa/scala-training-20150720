
class Employee (firstName:String, lastName:String, private val salary:BigInt) {
  import Employee._
  instances = instances + 1  
  override def toString = s"$firstName $lastName"
}

object Employee {
   //Shared variable
   var instances = 0

   //Factory
   def createGentlemanEmployee(firstName:String, lastName:String) = 
     new Employee("Sir " + firstName, "of " + lastName, 3000000)

   //Helper & Access to private member information
   def tellMeTheirSecretSalary(e:Employee) = e.salary 
}

object UsingObjects extends App {
   val employee = Employee.createGentlemanEmployee("Viddu", "Devigere")
   println(employee)
   println(Employee.tellMeTheirSecretSalary(employee))
   println(Employee.instances)

   val employee2 = Employee.createGentlemanEmployee("Rajiv", "Lewis")
   println(Employee.instances)
}
