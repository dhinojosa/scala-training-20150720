class Employee(val firstName:String, val lastName:String, val title:String) {
  
  //All this comes scala.Predef
  //This is the body of the primary constructor
  //require(firstName != null, "First Name cannot be null") //Scala Devs very rarely use null
  require(firstName != "", "First Name cannot be empty")
  require(lastName != "", "Last Name cannot be empty")

  if (firstName == "Dan") throw new Throwable("That is a wonderful, can't use it")

  def this(firstName:String, lastName:String) = this(firstName, lastName, "Mailroom Exec")
  def this(firstName:String) = this(firstName, "Unknown")
}

val emp = new Employee("Mayur", "Anand")
println(emp.title)

val emp2 = new Employee("Steve")
println(emp2.title)
println(emp2.lastName)

val result = try {
  new Employee("", "The Man")
} catch {
  case e:IllegalArgumentException ⇒ {
     new Employee("Rajiv", "Lewis")
  }
  case e:Exception => s"Regular Exception ${e.getMessage}"
  case _:Throwable => "Whoa, what happened?"
} finally {
  println("I did my best")
}

if (result.isInstanceOf[Employee]) {

   val resultEmp = result.asInstanceOf[Employee]
   println(resultEmp.lastName)
}



case class Department(name:String) 

/* class Department(val name:String) {
  override def equals(x:Any):Boolean = {
    if (!x.isInstanceOf[Department]) false
    else {
       val other = x.asInstanceOf[Department]
       this.name == other.name
    }
  }

  override def toString:String = s"Department(${this.name})"
 
  override def hashCode:Int = this.name.hashCode % 35
}*/

val dept = new Department("Toys")
val dept2 = new Department("Toys")
println(dept == dept2) //simpler
println(dept.equals(dept2))
println(dept)
println(dept.hashCode == dept2.hashCode)

class Manager(override val firstName:String, 
              override val lastName:String, 
              override val title:String, 
              val department:Department) 
                 extends Employee(firstName, lastName, title)

 val manager = new Manager("Srinivasa", "Annamreddy", 
                           "The Hostest with Mostest", 
                           Department("Perfumes"))

println(manager.department)

//Polymorphism is guaranteed
val employee:Employee = manager
val anyRef:AnyRef = manager
val any:Any = manager

class Box[A](val x:A) {  //declaration site parameterized type, invariant
   def changeTo(x:A):Box[A] = new Box(x)
}

val boxOfEmployees = new Box(manager)
val newBoxOfEmployees = boxOfEmployees.changeTo(new Employee("Sunil", "Agarwal"))

val boxOfInts = new Box(10)



