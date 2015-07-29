trait Smellable {
   def smellsLike:String
}

trait Loggable {
   var s = Nil:List[String]
   
   def log(x:String) = {
       s = s :+ (getClass.getSimpleName + ":" + x)
   }

   def log = s.mkString("\n")
}

class Calculator extends Loggable with Smellable {
   def add(x:Int, y:Int) = {
       log("Adding " + x)
       x + y
   }

   def smellsLike = "Chicken"
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

trait IntQueue {
    def get(): Int
    def put(x: Int):Unit
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) { buf += x }
}

trait Doubling extends IntQueue {
   abstract override def put(x: Int) { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
    abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
    abstract override def put(x: Int) {
      if (x >= 0) super.put(x)
    }
}

val queue = new BasicIntQueue with Doubling with Incrementing with Filtering

queue.put(4)
queue.put(3)
println(queue.get) //10


//
//trait Abs extends IntQueue {
//   abstract override def put(x:Int) = {
//     super.put(2 * x)
//     x * 100
//   }
//}
//
//val a = new Abs(){
//   abstract override def put(x:Int) = println(x)
//   abstract override def get() = {println("get"); 10}
//}
//
//println(a.put(10))

object MySingleton extends Loggable
MySingleton.log("Hello There")
println(MySingleton.log)

val b = new Object with Loggable
b.log("Testing with a plain object")


