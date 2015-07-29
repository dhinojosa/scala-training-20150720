trait Loggable {
   var s = Nil:List[String]
   
   def log(x:String) = {
       s = s :+ x
   }

   def log = s.mkString("\n")
}

class Calculator extends Loggable {
   def add(x:Int, y:Int) = {
       log("Adding " + x)
       x + y
   }
}

val calc = new Calculator()
calc.add(4, 3)
println(calc.log)

class Employee(val firstName:String, val lastName:String)

class Manager(firstName:String, lastName:String, val employees:List[Employee]) 
     extends Employee(firstName, lastName) with Loggable {
    
     def hire(e:Employee) = {
        log(s"Hiring ${e.firstName} ${e.lastName}")
        new Manager(firstName, lastName, employees :+ e)
     }
}

val manager = new Manager("Tom", "Zazoom", Nil)
manager.hire(new Employee("Larry", "Boom"))
println(manager.log)

/*
trait A {
   def zoom = println("A!")
}

trait B {
   def zoom = println("B!")
}

trait C {
   def zoom = println("C!")
}

class Foo extends A with B with C {
   override def zoom = super[A].zoom
}


val foo = new Foo
foo.zoom
*/

trait A {
  println("Starting A")
  def flub = println("A!")
}

trait B extends A {
  println("Starting B")
  def zoom = println("B!")
}

trait C extends A{
  println("Starting C")
  def zoom = println("C!")
}

class Foo extends B with C {
   override def zoom = super[B].zoom
}

val foo = new Foo
foo.zoom

class Department(name:String)

val dept = new Department("Shoes") with Loggable
dept.log("I love you traits")
println(dept.log)

val toys = new Department("Toys")
//toys.log("Uhm, Hello") WRONG

