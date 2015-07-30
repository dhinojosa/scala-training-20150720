class Employee(private[this] firstName:String, lastName:String) {
class Employee(private[this] val firstName:String, lastName:String) {
}
def foo(x:Int, y:Int) = x + y
val g = foo _
class Employee(var firstName:String,var lastName:String) 
new Employee("Paul", "Stanley")
val a = new Employee("Paul", "Stanley")
a.lastName
a.lastName = "Simon"
class Employee(firstName:String, middleName:Option[String], lastName:String)
new Employee("Paula", None, "Rodriguez")
new Employee("Harry", Some("S"), "Truman")
val x:Option[String] = None
val x:Option[String] = Some("S")
None.get
val x:Option[String] = Some("S")
x.get
val y:Option[String] = None
y.get
x.getOrElse("Not There")
y.getOrElse("Not There")
x
y
x match {
  case Some(n) => s"Got an answer and it is $n"
  case None => "Nope, found nothing"
}
def findOut[T](x:Option[T]) = {
   x match {
     case Some(n) => s"Got an answer and it is $n"
     case None => "Nope found nothing"
   }
}
findOut(Some(13))
findOut(Some("BBQ Brisket"))
class Foo(x:Int) {
   def bar (y:Int) = x + y
}
new Foo(10)
val a = new Foo(10)
a.bar(20)
class Foo(x:Int) {
   def apply (y:Int) = x + y
}
val a = new Foo(10)
a.apply(20)
a(20)
val f = (x:Int) => x + 1
val a:String = "Foo"
def foo(s:String) = s + "."
foo("WoW")
val f:Int=>Int = (x:Int) => x + 1
val f:Function1[Int, Int] = (x:Int) => x + 1
val f = (x:Int, y:Int) => x + 1
val f:(Int, Int) => Int = (x:Int, y:Int) => x + 1
val f:Function2[Int, Int, Int] => Int = (x:Int, y:Int) => x + 1
val f:Function2[Int, Int, Int] = (x:Int, y:Int) => x + 1
val f = new Function1[Int, Int] {
   def apply(x:Int) => x + 1
val f = new Function1[Int, Int] {
   def apply(x:Int) = x + 1
}
f.apply(10)
f(10)
val f_2 = (x:Int) => x + 1
f_2.apply(10)
f_2(10)
val g = (x:Int) => "Foo " + x
g(10)
List(1,2,3,4)
List(1,2,3,4,5)
val xs = List(1,2,3,4,5)
val f = (x:Int) => x % 2 != 0
xs.filter(f)
xs.filter((x:Int) => x % 2 != 0))
xs.filter((x:Int) => x % 2 != 0)
xs
xs.filter(x => x % 2 != 0)
xs.filter(_ % 2 != 0)
val f = (x:Int) => "Foo" + x
xs
xs.map(f)
xs.map((x:Int) => "Foo" + x)
xs.map(x => "Foo" + x)
xs.map("Foo" + _)
xs.map("Foo"+)
import scala.language.postfixOps
xs.map("Foo"+)
xs map ("Foo"+)
xs
xs.map(x=> List(-x, x, x+1))
xs.map(x=> List(-x, x, x+1)).flatten
xs.flatMap(x=> List(-x, x, x+1))
xs
xs.map(_ + 1)
for (x <- xs) yield (x + 1)
xs
val ys = List(11, 12, 13, 14, 15)
for (x <- xs;
     y <- ys) yield (x + y)
xs.map(x -> ys.map(y -> x + y))
xs.map(j -> ys.map(k -> j + k))
xs.map(j => ys.map(k => j + k))
xs.flatMap(j => ys.map(k => j + k))
val t = ("One", 53.00)
val t = ("One", 53.00, xs)
t._1
t._2
t._3
xs
ys
xs.zip(ys)
xs
ys
xs.zip(ys).map(t => t._1 + t._2)
zs = List(1,2,3,4,5,6,7,8,9,10)
val zs = List(1,2,3,4,5,6,7,8,9,10)
xs
ys
zs
zs.zip(ys)
zs.zipAll(ys, -1, 2)
List("Hello", "How", "Are", "You").map(s = s + "!")
List("Hello", "How", "Are", "You").map(s => s + "!")
List("Hello", "How", "Are", "You").map("!" + _)
List("Hello", "How", "Are", "You").map("!" + )
List("Hello", "How", "Are", "You").map("!" +)
List("Hello", "How", "Are", "You").map(_ + "!")
List("Hello", "How", "Are", "You").map(_ + "!").flatten
List("Hello", "How", "Are", "You").flatMap(_ + "!")
List("Hello", "How", "Are", "You").map(x => if (x.size > 4) None else Some(x))
List("Hello", "How", "Are", "You").map(x => if (x.size > 4) None else Some(x)).flatten
List("Hello", "How", "Are", "You").flatMap(x => if (x.size > 4) None else Some(x))
Some(10).map(x=> x + 10)
for (x <- Some(10)) yield x
for (x <- Some(10)) yield x + 10
val g = Map((1, "One"), (2, "Two"), (3, "Three"))
val g = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
g.get(1)
g.get(4)
implicit val x = 10
def foo(x:Int)(implicit y:Int) = x + y
foo(10)
implicitly[Int]
class IntWrapper(x:Int) {
   def isOdd = x % 2 != 0
}
implicit def doesntMatter(x:Int) = new IntWrapper(x)
import scala.language.implicitConversions
implicit def doesntMatter(x:Int) = new IntWrapper(x)
import scala.language.implicitConversions
implicit def doesntMatter(x:Int) = new IntWrapper(x)
class IntWrapper(x:Int) {
   def isOdd = x % 2 != 0
}
import scala.language.implicitConversions
implicit def doesntMatter(x:Int) = new IntWrapper(x)
33.isOdd
val s = <employee><name>Danno</name>
                  <email>dhinojosa@evolutionnext.com</email>
        </employee>
s // "employee"
s // "employee" // "name"
s \ "employee" \ "name"
s // "employee" // "name"
s // employee // "name"
s // employee // name
s / employee / name
s // employee // name
s \ "employee" \ "name
s \ "employee" \ "name"
s \ "employee" 
s
s \ "name"
s \ "name".text 
(s \ "name").text
s
:exit
exit
val url=s"http://ichart.finance.yahoo.com/table.csv?s="+s"$symbol&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"
val url=s"http://ichart.finance.yahoo.com/table.csv?s="
paste
:paste
val symbol:String = "M"
val year:Int = 2015 
val url= s"http://ichart.finance.yahoo.com/table.csv?s=" +
            s"$symbol&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"
            
scala.io.Source.fromURL(url).mkString
val year:Int = 2014
scala.io.Source.fromURL(url).mkString
:paste
val symbol:String = "M"
val year:Int = 2014 
val url= s"http://ichart.finance.yahoo.com/table.csv?s=$symbol&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"            
scala.io.Source.fromURL(url).mkString
println(List(1,2,3,4,5).map(x => if (x % 2 == 0) None else Some(x)))
val r = List(1,2,3,4,5).map(x => if (x % 2 == 0) None else Some(x))
r.flatten
val r = List(1,2,3,4,5).flatMap(x => if (x % 2 == 0) None else Some(x))
None.flatten
class Foo(x:Int) {
  val f = (y:Int) = x + 4
class Foo(x:Int) {
  val f = (y:Int) => x + 4
}
new Foo(4)
res3.f(10)
class Foo(x:Int) {
   def m(y:Int) = (z:Int) = x + y + z
class Foo(x:Int) {
   def m(y:Int) = (z:Int) => x + y + z
}
new Foo(4)
res5.m(10)
res6(3)
res5.m _
res8(4)
res9(3)
10.isOdd
val x = 10
val f = (y:Int) => x + 10
f(19)
val msg = "Hello, There"
msg match {
   case "Hello, There" => println("Hi!")
   case _ => println("Don't understand")
}
val f = (x:Int, y:Int, z:Int)=> x + y + z
f.curried
f(1)
f.curried
res4(4)
res5(10)
res6(11)
def foo(x:Int)(y:Int)(z:Int) = x + y + z
foo(2) _
val f = foo(2) _
f(4)
res9(10)
List(1,2,3,4,5).foldLeft(0)_
val f2 = (x:Int, y:Int) => x + y
res11(f2)
def foo(x:Int)(y:Int)(z:Int) = x + y + z
val f = foo(3)(_:Int)(10)
f(10)
val f = foo(3)(_:Int)(_:Int)
def foo(x:Int,y:Int,z:Int) = x + y + z
foo(3, _:Int, 10)
foo(10)
res14(10)
:quit
exit
:quit
case class Employee(name:String, minutes:Int)
case class Exercise(name:String, minutes:Int)
Exercise("Swimming", 60)
Exercise.apply("Swimming", 60)
val f = Exercise.apply _
val f2 = Exercise.unapply _
def foo(x:Int) = x + 1
foo _
:quit
:q
new java.util.Date()
println(res0)
:history
:!2501
:help
:history
:history 2502
:quit
val a = 10
var b = 20
a = 10
a = 40
b = 900
val a:Long = 10
val a  = 10:Long
val `How are you doing today?` = "Fine"
val `void` = "Fine"
val `true` = false
val `true^H` = false
val `tru` = false
val howAreYouDoingToday_? = false
val howAreYouDoingToday? = false
val howAreYouDoingToday_?! = false
val howAreYouDoingToday_?!$ = false
val howAreYouDoingToday_?!* = false
3 + 4
3.+(4)
Int.MinValue
class Employee(val firstName:String, val lastName:String)
val e = new Employee("Sandra", "O\'Conner')
val e = new Employee("Sandra", "O'Conner')
val e = new Employee("Sandra", "O'Conner")
val e:AnyRef = new Employee("Sandra", "O'Conner")
val e:Any = new Employee("Sandra", "O'Conner")
class Employee(val firstName:String, val lastName:String) extends AnyRef
val e:AnyVal = new Employee("Sandra", "O'Conner")
val a = "Dodgeball"
println(s"I want to play $a")
println("I want to play $a")
println(s"I want to play $a")
println("I want to play %s".format(a))
def add(x:Int, y:Int) = {
   x + y
}
def add(x:Int, y:Int):Int = {
    return x + y
}
def add(x:Int, y:Int):Int = {
    return x + y;
}
add(4, 5)
def add(x:Int, y:Int) = x + y
add(10, 14)
def add(x:Int, y:Int) { x + y }
add(10, 40)
def add(x:Int, y:Int) { return (x + y) }
add(10, 12)
def add(x:Int, y:Int) = { return (x + y) }
def add(x:Int, y:Int) = { (x + y) }
def add(x:Int, y:Int):Unit = { x + y; println("Hello") }
def add(x:Int, y:Int) { x + y; println("Hello") }
def factorial(x:Int):Int = {
   if (x == 0) 1
   else if (x == 1) 1
   else x * factorial(x-1)
}
factorial(4)
factorial(1000)
factorial(10000)
factorial(-1)
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val f = new Foo
val f = new Foo(10)
f.bar(30)
class Foo(x:Int) {
   def ~:(y:Int) = x + y
}
val f = new Foo(10)
f.~:(30)
30 ~: f
val lst = List(1,2,3,4,5,6)
val lst = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil
Nil
val lst = 1 :: 2 :: List(3,4,5,6)
object MySingleton
val single1 = MySingleton
val single2 = MySingleton
single1.equals(single2)
single1 == single2
single1 eq single2
var single1 = MySingleton
val single2 = MySingleton
single1 = single2
single2 = single1
object MySingleton {
}
object MySingleton {
   def myFavoriteNumber = 42
}
MySingleton.myFavoriteNumber
class Human private(firstName:String, lastName:String, heroName:String)
Int.MinValue
class Foo(x:Int) {
  def apply(y:Int) = x + y
}
val f = new Foo(10)
f.apply(20)
f(20)
List(1,2,3,4,5,6)
new List(1,2,3,4,5,6)
List(1,2,3,4,5,6)
List.apply(1,2,3,4,5,6)
List(1,2,3,4,5,6)
val xs = List(1,2,3,4,5,6)
xs[2]
xs(2)
xs.apply(2)
List.range(0, 10, 2)
Range(0, 10, 2)
List.empty
List.empty[Int]
List.empty
List.empty[Any]
res16 :+ 4
res16 :+ "Hello"
List.empty[Nothing]
res19 :+ 3
res19 :+ 34
res19 :+ "Hello"
val xs = List(1,2,3,4,5)
val newxs = xs :+ 4
xs
val newxs = xs :+ "Hello"
val x = null
val x:Null = null
val danAge = Some(43)
val ladyAge = None:Option[Int]
val ladyAge = None
val ladyAge = None:Option[Int]
val map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
map.get(1)
map.get(2)
map.get(3)
map.get(4)
myAge.getOrElse(-1)
danAge.getOrElse(-1)
ladyAge.getOrElse(-1)
def getAge(x:Option[Int]) = {
   x match {
     case Some(n) => n
     case None => -1
   }
}
getAge(myAge)
getAge(danAge)
getAge(ladyAge)
val Some(x) = danAge
val t = (1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t = (1, 2.0, "Hello", new Employee("Bob", "Barker", "The Flash"))
val t = (1, 2.0, "Hello", new Employee("Bob", "Barker"))
class Employee(val firstName:String, val lastName:String)
val t = (1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t:Tuple[Int, Double, String, Employee] = (1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t:Tuple4[Int, Double, String, Employee] = (1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t:Tuple4[Int, Double, String, Employee] = Tuple4.apply(1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t:Tuple4[Int, Double, String, Employee] = Tuple4(1, 2.0, "Hello", new Employee("Bob", "Barker"))
val t2 = (3, ("Hello", 5.0))
val t2 = ()
val t2 = (3, ("Hello", 5.0))
val t1 = (3, "Hello")
t1._1
t1._3
t1._2
val t2 = (3, ("Hello", 5.0))
t2._2._1
val t3 = 3 -> "Three"
val m = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
val m = Map((1, "One"), (2, "Two"))
m.values
m.values.toList
m.values.toSet
m.values.toVector
m.values.mkString("~
m.values.mkString("~")
m.values.mkString("#", "~", "#")
Set(1,2,3,4,5,5,5,5,5,6)
val r = 1 to 10
val r = 1 until 10
val r2 = Array(1,2,3,4,5,6)
val f = new Function1[Int, Int] {
    def apply(x:Int) = x + 2
}
f.apply(10)
val f = (x:Int) => x + 2
val f:Int => Int = (x:Int) => x + 2
val f:Function1[Int, Int] = (x:Int) => x + 2
val f = (x:Int) => x + 2
val f = x => x + 2
val f:Int => Int = x => x + 2
val f = x => x + 2:Int=>Int
val f = (x:Int) => x + 2
val xs = List(1,2,3,4,5)
xs.map(f)
xs.map((x:Int) => x + 2)
xs.map(x => x + 2)
xs.map(_ + 2)
xs.map(2 + _)
xs.map(2 +)
xs.map(2+)
xs.map(x => x + 2)
xs.map(2 +)
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val f = new Foo(10)
val foo = new Foo(10)
val g = foo.bar _
val g = foo.bar
val g = foo.bar _
List(1,2,3,4,5).map(g)
List(1,2,3,4,5).map(foo.bar _)
List(1,2,3,4,5).map(foo.bar)
List(1,2,3,4,5) map foo.bar
val gg = (x:Int, y:Int, z:Int) => x + y + z
gg(3,4,5)
gg.curried
val gg = (x:Int, y:Int, z:Int) => x + y + z
val gg = (x:Int)(y:Int)(z:Int) => x + y + z
val gg = {case (x:Int)(y:Int)(z:Int) => x + y + z}
val gg = (x:Int, y:Int, z:Int) => x + y + z
gg.curried
val c = gg.curried
c(2)
val d = c(2)
val e = d(3)
val f = e(10)
def method1(x:Int)(y:Int) = {
   x + y
}
method1(2)(3)
method1(2) _
method1 _
def method1(x:Int)(y:Int) = x + y
method(_:Int)(10)
method1(_:Int)(10)
res68(5)
List(1,2,3,4,5).lift(3)
List(1,2,3,4,5).foldLeft(0)((acc,next) => acc + next)
List(1,2,3,4,5).foldLeft(0){(acc,next) => println(s"acc: $acc, next: $next"); acc + next}
List(1,2,3,4,5).foldLeft(1){(acc,next) => println(s"acc: $acc, next: $next"); acc * next}
List(1,2,3,4,5).foldLeft(1)(_ * _)
List(1,2,3,4,5).foldLeft(1)((x, y) => x * (y + x))
List(1,2,3,4,5).foldLeft(1)((x, y) => x * (y + X)
)
println("Whoa")
val f = println _
List(1,2,3,4,5).foreach(x => println(x))
List(1,2,3,4,5).foreach(println _)
List(1,2,3,4,5).foreach(println)
List(1,2,3,4,5) foreach println
List(1,2,3,4,5).head
List(1,2,3,4,5).tail
def myMax(xs:List[Int]):Int = {
   xs match {
val a = 10 
println(a)
val a = 10
var b = 30
b = 40
a = 30
val a = 40
val b = 100
b = 1010
var b = 100
val b = 100
val a = 10
a = 40
var b = 10
b = 30
b = 50
exit
:quit
def roman(int number) {
def roman(int number) = {
def roman(number:Int) = {
   val map = Map(1 -> "I")
   if (map.contains(number)) map.get(number)
"1234".reverse
11100.toString
11100.toString.reverse.toInt
Some(10)
val a = 10
a = 40
var b = 10
b = 10
lazy val a = 100
a
lazy val a = {println("Hello"); 30}
a
:quit
ls
:quit
:help
:history
:!2494
:2494
:edit 2494
:help
:sh ls
implicitly[List[String]]
res0
implicitly[=> List[String]]
implicitly[() => List[String]]
:sh ls
res4.lines
:help
:power
:help
:history
:history 2505
!2512
:!!2512
:history 2512
:history 2
:heko
:help
:history
:replay 2519
:replay 2503
:replay
:replay ?
:help replay
:import planets.jar
Planets.Mercury.id
:load planets.jar
:help
:require planets.jar
Planets.Earth
res4.id
:quit
:require planets.jar
Planets.Earth
res0.mass
res0.radius
:quit
:load Planets.scala
:reset
Planets.Earth
:reset
exit
:help
val a = 10
a.toFloat
:quit
:help
val a = 10
a.toFloat
:quit
:reset
:load MyApp.scala
:quit
:help
val a = 10
println(a)
10 + 19
res1 + 30
res1
:quit
:load MyApp.scala
:quit
:load MyApp.scala
new Department("Toys")
:quit
:require myapp.jar
new Department("Hardware")
new Employee("Bob", "Barker", res0)
:reset
new Employee("Bob", "Barker")
:quit
class Department(name:String)
class Employee(firstName:String, lastName:String, department:Department)
new Department("Fabrics")
:reset
:paste
class Department(name:String)
class Employee(firstName:String, lastName:String, department:Department)
new Department("Gardening")
:history
:help
:quit
List(1,2,3,4,5).map(x => x + 10)
List(1,2,3,4,5).map(10+).filter(_ % 2 != 0)
case class Employee(firstName:String, lastName:String)
new Employee("Larry", "Samson")
Employee("Larry", "Samson")
res3 = res2
res3 == res2
(1, "One", 40.0)
:quit
def market_/?(x:Int) = x + 10
def market_/?::&@(x:Int) = x + 10
def market_/?::&@⅁(x:Int) = x + 10
def market_/?::&@⅁㉥(x:Int) = x + 10
def market_/?::&@⅁㉥(😽x:Int) = x + 10
def market_/?::&@⅁㉥😽(?x:Int) = x + 10
def market_/?::&@⅁㉥😽 (?x:Int) = x + 10
def market_/?::&@⅁㉥?(?x:Int) = x + 10
def market_/?::&@⅁㉥??x:Int) = x + 10
def market_/?::&@⇠(x:Int) = x + 10
def market_/?::&@⇠⋖(x:Int) = x + 10
def market_/?::&@⇠⋖؆(x:Int) = x + 10
val a = 10
a = 14
val a = 10 //value
a = 155
var b = 10
b = 100
val a = 10
a = 100
val a = 10 //value
var b = 100
b = 120
val c:Int = 10
val d:Double = 10
val e = 10:Double
val a = 10
println(a)
val a = 10
a = 120
var b = 30
b = 150
b = "Some String"
b = 403
var b = 104
val b:Int = 300
val b:Double = 400
val c = 400:Double
val a:Int = 10
val b:String = "Hello, "
val c = b + a
val `my greatest gift in dollars` = 500
var `my greatest gift in dollars` = 500
val `my greatest gift in dollars` = 500
val `my greatest gift in dollars $$$` = 500
val my greatest gift in dollars $$$ = 500
val `my greatest gift in dollars $$$` = 500
val howMuchCanIGet_? = 5000.00
howMuchCanIGet_?
val howMuchCanIGet_?~ = 5000.00
val howMuchCanIGet?~ = 5000.00
val `void` = 100
`void`
void
val `yield` = 400
yield
val `void` = 100
val `false` = true
val `return` = 90
if (`false`) `void` else `return`
lazy val a = 10
lazy val a = 100
a
lazy var a = 100
a
:reset
val `this is the dawning of the age of aquarius` = 103
this is the dawning of the age of aquarius
`this is the dawning of the age of aquarius`
val howMuchCanIMake_? = 50000
howMuchCanIMake_? + 100
`howMuchCanIMake_?` + 100
:quit
val a = 100
a = 200
var b = 400
b = 500
val c = 10
val a = 100
a = 300
var b = 400
b = 500
b = "Hello"
val a = 100
a = 400
val a:Int = 100
var b = 400
b = 500
b = "Hello"
val c:Int = 3000
val c = 3000
val d:Double = 4000
val e = 4000:Double
val a:Int = 10
val b:String = "Hello"
val c = b + ", " + a
val `the greatest gift in dollars` = 500
println(`the greatest gift in dollars`)
val `the greatest gift in dollars $$$` = 500
val `the greatest gift in dollars $$$!` = 500
val howMuchDoIMake_? = 30000
howMuchDoIMake_?
:reset
val a = 100
a = 200
var b = 100
b = 200
b = "Hello"
:reset
val a = 100
a = 400
var b = 100
b = 400
val b:Int = 4400
var c:Int = 402
val d = 300:Double
val a = 10
val b = "Hello
val b = "Hello"
val c = b + ", " + a
:reset
val a = 100
a = 300
var b = 400
b = 500
b = "Hello"
val a = 400
val a:Int = 400
val a:Double = 400
val a = 400:Double
val a = 100
val b = "Hello"
val c = b + ", " + a
def ⟼(x:Int) = x + y
def ⟼(x:Int) = x + 
def ⟼(x:Int) = x + 4
val a⟼b = 300
val `a⟼b` = 300
a⟼b
val λ = 3010
val tk_ƕ = 3001
:quit
var divisor = 0
lazy quotient = 40 / divisor
lazy val quotient = 40 / divisor
quotient
divisor = 2
quotient
:reset
var divisor = 0
lazy val quotient = 40 / divisor
quotient
divisor = 2
quotient
lazy val a = 100
a
lazy var b = 200
var history = ""
lazy val c = {history = history + "5"; 19}
history
c
history
val list:List[() => Int] = List(1 + 4, 1 + 5, 4 + 10, 10 + 19)
val list:List[=> Int] = List(1 + 4, 1 + 5, 4 + 10, 10 + 19)
val list:List[()=>Int] = List(1 + 4, 1 + 5, 4 + 10, 10 + 19)
val list:List[()=>Int] = List(() => 1 + 4, () => 1 + 5, () => 4 + 10, () => 10 + 19)
val g:Nothing = 40
val lst:List[Nothing] = Nil
exit
:quit
1 + 30
val d = 400
:help
println("Hello, Macys")
:help
println("Hello, Macys")
val a:String = "Macy's Hooray"
val b = "Macy's Hoorah"
val c = "Macy's
val c = "Macy's" + " Hooray"
4 + 40
res3 + 50
res3 + c
:quit
12 + 10
res0 + 40
:save /home/danno/myrepl.scala
val d = 10 + 1004.00
:save /home/danno/myrepl.scala
val a = 100
a = 400
var b = 100
b = 400
val a = 100
var b = 100
val a:Int = 200
val c:Double = 400
val e = 4000:Double
val f = 10 + 40
val f = 10.+(40)
val f = 10 + 40
class Foo {
  def bar}
class Foo(x:Int) {
  def bar(y:Int) = x + y
}
val f = new Foo(10)
f.bar(20)
f bar 2-
f bar 20
12 + 40
12.+(50)
lazy val h = 10
h
var history = ""
lazy val a = {history = history + "Hi"; 40}
history
val c = a + 20
history
var history = ""
lazy val a = {history = history + "Hi"; 40}
lazy val b = 40 + a
history
b
history
lazy var j = 100
var history = ""
:reset
var history = ""
lazy val a = {history = history + "Hi"; 40}
lazy val b = 40 + a
history
b
history
var history = ""
lazy val a = {history = history + "Hi"; lazy val b = 19; 40 + b}
a
b
:reset
var history = ""
lazy val a = {history = history + "Hi"; lazy val b = 19; 40 + b}
a
b
history
:reset
var history = ""
lazy val a = {history = history + "Hi"; lazy val b = 19; 40}
a
history
b
a.b
:reset
var history = ""
lazy val a = {history = history + "Hi"; lazy val b = 19; 40}
a
:warning
:reset
var history = ""
lazy val a = {history = history + "Hi"; val b = 19; 40}
history
a
history
b
val `how much can I make ???` = 400
val `void` = 40
void
val `true` = false
true
`true`
val `yield` = 10
val `return` = 10
return
`return`
val howMuchCanIMake_<$> = 40
val howMuchCanIMake_$ = 40
val howMuchCanIMake_$? = 40
val howMuchCanIMake_$ = 40
val howMuchCanIMake_? = 40
val _howMuchCanIMake_? = 40
val _?howMuchCanIMake_? = 40
val _how?MuchCanIMake_? = 40
val _howMuchCanIMake_? = 40
val howMuchCanIMake_? = 100000000000000000000000
Int.MaxValue
Long.MaxValue
val howMuchCanIMake_? = 100000000000000000000000:Long
val howMuchCanIMake_? = 100000000000000000000000:BigInt
val howMuchCanIMake_? = BigInt(100000000000000000000000)
val howMuchCanIMake_? = BigInt("100000000000000000000000")
val b:Byte = 3994
val b:Byte = 39
val b:Byte = 127
val b:Byte = 128
val m = 1000.0
val m = 1000.0f
val m = 1000.0F
val m = 1000.0D
val m = 1000.0d
val g = true
val h = false
g != h
g == h
val c = 'd'
val c = '/u0059'
val c = '\u0059'
val c = '\t'
val c = '\n'
val s = "Hello, is it me you are looking for"
val s2 = """Hello,
            is it me you are looking for"""
val s2 = """Hello,
            |is it me you are looking for""".stripMargin
val s2 = """Hello,
            @is it me you are looking for""".stripMargin('@')
val doIt = true
val g = if (doIt) 10 else 20
var g = ""
if (doIt) g = "10
if (doIt) g = "10"
val num = 13
val result = if (num < 10) "Less than 10" else if (num > 10 && num < 20) "10 - 20" else "More than 20"
:quit
class Fruit
class Citrus extends Fruit
class Orange extends Citrus
val o = new Orange
val p:Any = o
val p2:AnyRef = o
val p2:AnyVal = o
val p3:Fruit = o
:paste
def add4(x:Int, y:Int) = {  //1 vote int, 1 vote any *Winner*, 1 vote string
    if (x > 10) y + "foo"
    else x + y
}
Nil
object MySingleton
object Foo
val a = MySingleton
val b = MySingleton
a == b
object MySingleton {
   def foo(x:Int) = x + 4
}
MySingleton.foo(50)
class Employee(val firstName:String, val lastName:String)
val e = new Employee("Larry", "Wall")
e.firstName
e.lastName
e.firstName = "Bob"
class Employee(var firstName:String, var lastName:String)
class Employee(var firstName:String, val lastName:String)
//mutable
val a = new Employee("Sam", "Larryson")
a.firstName = "Ann"
a
a.firstName
case class Employee(firstName:String, lastName:String)
val a = new Employee("Stu", "Benderworth")
a.copy(firstName = "Margaret")
a
res6
a = new Employee("Bobby", "Kennedy")
val v = res6
case class Employee(firstName:String, lastName:String)
val z = Employee("Zoe", "Paullson")
class Employee(firstName:String, lastName:String)
:reset
class Employee(firstName:String, lastName:String)
val z = Employee("Zoe", "Paullson")
case class Employee(firstName:String, lastName:String)
val z = Employee("Zoe", "Paullson")
val z = Employee.apply("Zoe", "Paullson")
val baz = (1, List(5,4,3,2), 10.0)
val laz = (1, List(5,4,3,2), (10, 40, "Lice"), 10.0)
laz._2
res0(3)
 val tupleList = List((1,4), (4, 10), (9, 16))
val groceries =  List("Eggs", "Milk", "Sponges", "Naan")
groceries.zipWithIndex
groceries.zipWithIndex.map(t => t.swap)
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2))
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
val myFavoriteWine = "Merlot"
println(s"My Favorite Wine is $myFavoriteWine")
println(s"My Favorite Wine is ${myFavoriteWine}")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"$t._1. $t._2").mkString("\n")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}")
List(1,2,3,4,5).mkString("~")
List(1,2,3,4,5).mkString("\n")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}")
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").force
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t=> s"${t._1}. ${t._2}").mkString("\n")
exit
:quit
val groceries = List("Eggs", "Milk", "Naan", "Sponges")
val groceries = List("Eggs", "Milk", "Naan", "Sponges", "Tacos")
groceries.zipWithIndex
val g:Tuple2[Int, Int] = (40, 0)
val h:(Int, Int) = (40, 0)
groceries.zipWithIndex
groceries.zipWithIndex.map(t => (t._2, t._1))
groceries.zipWithIndex.map(t => t.swap)
groceries.zipWithIndex.map(_.swap)
groceries.zipWithIndex.map(_.swap).map(t => t._1+1)
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2))
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => t._2)
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("$$")
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString(",")
groceries.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}")
res17.force
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
List(1,2,3,4,5,6).filter((x:Int) => x % 2 != 0)
List(1,2,3,4,5,6).filter(x => x % 2 != 0)
List(1,2,3,4,5,6).filter(_ % 2 != 0)
List(1,2,3,4,5,6).filter( _ % 2 != 0)
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1+1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
List(1,2,3,4,5,6).filter( _ % 2 != 0)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map((x:Int) = x.toString)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map((x:Int) => x.toString)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map(_.toString)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map(_ + 10)
List(1,2,3,4,5,6).filter( _ % 2 != 0).toString
res29 == "List(1, 3, 5)"
List(1,2,3,4,5,6).filter( _ % 2 != 0).map(_ + 10)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map(10 + _)
List(1,2,3,4,5,6).filter( _ % 2 != 0).map(10+)
List(1,2,3,4,5,6).filter(x => x % 2 != 0).map(x => x + 10)
:help
:warnings
import scala.language.postfixOps
List(1,2,3,4,5,6).filter(x => x % 2 != 0).map(10+)
def applyFunction2Curried(a: Int, b:Int)(z: (Int, Int) => Int):Int = z(a, b)
val f = def applyFunction2Curried(3,4) _
val f = applyFunction2Curried(3,4) _
Map(1 -> "One", 2 -> "Two", 3 -> "Three")
Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four")
Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five")
Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six")
3.isOdd
case class Exercise(name:String, minutes:Int)
Employee.apply("Badmitton", 30)
Exercise.apply("Badmitton", 30)
case class Exercise(name:String, minutes:Int)
Exercise.apply _
case class Exercise(name:String, minutes:Int)
Exercise("Baseball", 40)
Exercise.unapply(res3)
val rnd = new Random()
val rnd = new java.util.Random()
val rnd = (new java.util.Random() * 4000) - 1
val rnd = ((new java.util.Random()) * 4000) - 1
val rnd = new java.util.Random()
:quit
val a = 100
val a:Double = 100
val a:Int = 100
a
var b = 10
b = 43
val a = 10
a = 40
lazy val a = 1000
a
var history = ""
lazy val g = {history = history + "5"; 400}
history
g
history
g
history
def foo(x:Int):Int = {
   return x + 4
}
def foo(x:Int):Int = {
   x + 4
}
foo(5)
def foo(x:Int):Int = {
  println("Do something else")
  x + 4
}
foo(10)
def foo(x:Int):Int = { x + 4 }
def foo(x:Int):Int = x + 4
def foo(x:Int) = x + 4
def sayHello(name:String):Unit = {
   println(s"Hello $name")
}
sayHello("Maria")
def sayHello(name:String):Unit = {
   println(s"Hello $$ $name")
}
sayHello("Maria")
def sayHello(name:String):Unit = {
   println(s"Hello $$ $name")
}
def sayHello(name:String):Unit = {
   println("Hello %s".format(name)
}
def sayHello(name:String):Unit = {
   println("Hello %s".format(name))
}
def sayHello(name:String) {println(s"Hello ${name}")}
sayHello("Maria")
def foo(x:Int) {
   x + 10
}
foo(12)
val areYouThere_? = 100
val areYouThere_?! = 100
val `The do run run the do run run` = 100
val `true` = false
val `void` = 10
if (`true`) `void` else 19
class Employee(firstName:String, lastName:String)
val e = new Employee("Bob", "Barker")
class Employee(val firstName:String, val lastName:String)
val e = new Employee("Bob", "Barker")
e.firstName
e.lastName
e.firstName = "Stu"
class Employee(var firstName:String, var lastName:String)
val e = new Employee("Bob", "Barker")
e.firstName = "Stu"
e.firstName
:load /home/danno/tmp/Employee.scala
val e = new Employee("Bob", "Barker")
e.title
:load /home/danno/tmp/Employee.scala
val e = new Employee("Bob", "Barker")
e.getFirstName
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val f = new Foo(10)
f.bar(30)
class Foo(x:Int) {
   def apply(y:Int) = x + y
}
val f = new Foo(10)
f.bar(30)
f.apply(30)
f(30)
class Foo(x:Int) {
   def ~:(y:Int) = x + y
}
val f = new Foo(10)
f.~:(30)
30 ~: f
val g = Some(10)
val h = None
val h:Option[Int] = None
val g:Option[Int] = Some(10)
g.get
h.get
g.get
g.getOrElse(30)
h.getOrElse(30)
def giveMeAnswer(x:Option[Int]) = {
    x match {
      case Some(i) => s"Answer is $i"
      case None => "Sorry no answer"
    }
}
giveMeAnswer(g)
giveMeAnswer(h)
object MySingleton
val a = MySingleton
val b = MySingleton
a == b
a eq b
object MySingleton {
  def apply(x:Int) = x + 10
}
MySingleton.apply(40)
MySingleton(40)
:load /home/danno/tmp/Employee.scala
:reset
:load /home/danno/tmp/Employee.scala
new Employee("Benjamin", None, "Franklin")
new Employee("Benjamin", None, "Franklin", "Men's Dept")
:load /home/danno/tmp/Employee.scala
:reset
:load /home/danno/tmp/Employee.scala
Employee.apply("Stan", "Q", "Lee")
Employee("Stan", "Q", "Lee")
:reset
:load /home/danno/tmp/Employee.scala
val e = new Employee("Bob", "Barker")
e.apply("Barbara", "M.", "Billingsly")
res0.firstName
e("Barbara", "M.", "Billingsly")
List(1,2,3,4,5)
List.apply(1,2,3,4,5)
List.apply(1,2,"3",4,5)
List.apply(1,2,3.0,4,5)
val list = List.apply(1,2,3,4,5)
val list = List(1,2,3,4,5)
list.apply(2)
list(2)
list.apply(2)
val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
Nil
List()
List():List[Int]
List[Int]()
Set(1,2,3,4,5,6)
val t = (1, 3.0, "Hello")
t._1
t._2
t._3
val t:(Int, String) = (1, "Foo")
val t:Tuple2[Int, String] = (1, "Foo")
val t = (1, "Foo")
t._1
Map.apply((1, "One"), (2, "Two"), (3, "Three"))
val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
m.get(1)
m.get(2)
m.get(3)
m.get(4)
val m2 = m :+ (4, "Four") 
val m2 = m + (4, "Four") 
val m2 = m + ((4, "Four")) 
val m2 = m +(4, "Four") 
val m2 = m +((4, "Four")) 
val m2 = m + (4 -> "Four") 
4 -> "Nice"
m2
m
val f = new Function1[Int, Int] {
            def apply(x:Int) = x + 2
}
f.apply(10)
f(10)
val f = (x:Int) => x + 2
val g = (x:Int, y:String) => y + x + 2
g(10, 4)
g(10, "4")
g(10, "Foo")
val g = (x:Int, y:String) => y + x + 2
val g = (x:Int, y:String):String => y + x + 2
val g:Function2[Int, String, String] = (x:Int, y:String) => y + x + 2
val g:Function1[Int, (Int, String)] = (x:Int) => (x+1, "Foo + x)
val g:Function1[Int, (Int, String)] = (x:Int) => (x+1, "Foo" + x)
val g = (x:Int) => (x+1, "Foo" + x)
g(10)
List(1,2,3,4,5,6).map(g)
List(1,2,3,4,5,6).map((x:Int) => x + 1)
List(1,2,3,4,5,6).map(x => x + 1)
List(1,2,3,4,5,6).map(_ + 1)
List(1,2,3,4,5,6).map(1 + _)
List(1,2,3,4,5,6).map(1+)
import scala.language.postfixOps
List(1,2,3,4,5,6).map(1+)
List(1,2,3,4,5,6).foreach(x => println(x))
List(1,2,3,4,5,6).foreach(println(_))
List(1,2,3,4,5,6).foreach(println _)
List(1,2,3,4,5,6).foreach(println)
List(1,2,3,4,5,6) foreach println
val f = (x:Int) => List(-x, 0, x)
List(1,2,3,4,5).map(f)
List(1,2,3,4,5).map(f).flatten
List(1,2,3,4,5).flatMap(f)
Some(10).map(x => x + 12)
Some(10).map(x => Some(x + 12))
Some(10).map(x => Some(x + 12)).flatten
val a:Option[Int] = Some(10)
val b:Option[Int] = None
val c:Option[Int] = Some(40)
a.map(x => b.map(y => Some(x + y))
)
val a:Option[Int] = Some(10)
val b:Option[Int] = None
a.map(x => b.map(y => Some(x + y))
)
a.flatMap(x => b.map(y => Some(x + y)))
val b:Option[Int] = Some(90)
a.flatMap(x => b.map(y => Some(x + y)))
a.flatMap(x => b.flatMap(y => Some(x + y)))
val groceries = List("Eggs", "Naan", "Soy Milk", "Anchovies")
groceries.zipWithIndex
groceries.zipWithIndex.map(x =
)
groceries.zipWithIndex.map(x => x.swap)
groceries.zipWithIndex.map(_.swap)
groceries.zipWithIndex.map(_.swap).map(t => (t._1 + 1, t._2))
groceries.zipWithIndex.map(_.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(_.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(_.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
:exit
exit
:quit
val g = "This is a test of the emergency broadcast system"
class Box[A] {
}
class Box[A](a:A) {
   def content:A = a
}
class Apple
new Box(new Apple)
res0.content
combine[A](a:A, b:A) = a + b
def combine[A](a:A, b:A) = a + b
def combine[A <: Number](a:A, b:A) = a + b
:reset
def combine[A <: Number](a:A, b:A) = a + b
def combine[A <: ScalaNumberProxy](a:A, b:A) = a + b
def combine[A <: Int](a:A, b:A) = a + b
class Apple
def eat[A](a:A) = A
def flyer[A](a:A):A = a
flyer(new Apple)
flyer("Hello")
def ⇶(x:Int) = x + 1
val `import` = 10
val `continue` = "Hello"
import
;
println(import)
:reset
val `my greatest gift in dollars` = 100
val isThisMySalaryPerYear_? = 50000
val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000
val `import` = 10
println(import)
println(`import`)
val `magic` = 19
println(magic)
val `void` = 100
val `false` = true
val `return` = 90
if (`false`) `void` else `return`
:reset
val `my greatest gift in dollars` = 500
:reset
val `my greatest gift in dollars` = 500
:reset
val `my greatest gift in dollars` = 500
val isThisMySalaryPerYear_? = 50000
val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000
val `import` = 10
println(import)
`import`
val `magic` = 19
println(magic)
val `void` = 100
val `false` = true
val `return` = 90
if (`false`) `void` else `return`
:reset
val a = 100
val b = 100
val c = 3000
:reset
val a =1030
val `my greatest gift in dollars` = 500
val isThisMySalaryPerYear_? = 50000
:reset
val `my greatest gift in dollars` = 500
val isThisMySalaryPerYear_? = 5000
val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000
val `import` = 10
println(import)
println(`import`)
val `magic` = 19
println(magic)
val `void` = 100
val `false` = true
val `return` = 90
if (`false`) `void` else `return`
5/4
val g:Byte = 128
val g = 127:Byte
val maxShort = 32767
val maxShort = 32768
val maxShort = 32769
val maxShort = 32767:Short
val maxShort = 32768:Short
val a = 201202
val g = 30010200
val g:Long = 30010200
val g = 30010200:Long
val g = 30010200l
val g = 30010200L
val f:Float = 203F
val f:Float = 203
val f = 203:Float
1.+(4)
500.toHexString
val z = 0x1f4
val z = 0x1f4:Short
val z = 0x1f4:Byte
127.toHexString
val z = 7F:Byte
val z = 0x7F:Byte
import java.time._
LocalDate.parse("2015-07-14")
LocalDate.now
Period.between(LocalDate("2014-01-16"), LocalDate.now)
Period.between(LocalDate.parse("2014-01-16"), LocalDate.now))
Period.between(LocalDate.parse("2014-01-16"), LocalDate.now)
res4.getMonths
res4.getTotalMonths
res4.toTotalMonths
Period.between(LocalDate.parse("2014-01-16"), LocalDate.now).toTotalMonths
Period.between(LocalDate.parse("2010-01-16"), LocalDate.now).toTotalMonths
Period.between(LocalDate.parse("2010-01-14"), LocalDate.now).toTotalMonths
val a = 10
a
100 + 400
res1 + 1000
res2
class Employee(firstName:String, lastName:String)
new Employee("Sunil", "Agarwal")
res4
res8]
:reset
:load /home/danno/development/scalatraining-20150720/Employee.scala
new Employee("Dan", "Hinojosa")
:quit
:reset
class Employee(firstName:String, middleName:String, lastName:String)
:load /home/danno/development/scalatraining-20150720/Employee.scala
new Employee("Foo", "Bar")
new Employee("Foo","Out", "Bar")
class Employee(firstName:String, middleName:String, lastName:String, title:String)
:help
:require /home/danno/.m2/repository/com/google/guava/guava/18.0/guava-18.0.jar
import com.google.common.collect._
Lists.newArrayList("20
Lists.newArrayList("20", "Hello", "Awesome")
//Running as a script
println("Scala is concise")
:paste
//Running as a script
println("Scala is concise")
:quit
val a = 10
a = 50
var b = 100
b = 400
val a = 140
val a:Int = 450
val a = 450:Int
val a = 450:Double
class Employee(firstName:String, lastName:String)
new Employee("Keith", "Wong")
res0.firstName
res0.lastName
res0.getFirstName()
res0.getLastName()
class Employee(val firstName:String, val lastName:String)
val kw = new Employee("Keith", "Wong")
kw.firstName
kw.lastName
:reset
:paste
class Employee(firstName:String, lastName:String) {
   def fullName:String = firstName + " " + lastName
}
val bs = new Employee("Basha", "Shaik")
class Employee(firstName:String, lastName:String) {
   val fname = firstName
   val lname = lastName
}
val bs = new Employee("Basha", "Shaik")
bs.fname
bs.lname
class Employee(var firstName:String, var lastName:String) 
val bs = new Employee("Basha", "Shaik")
bs.firstName
bs.firstName = "Keith"
bs
bs.firstName
:quit
lazy a = 10
lazy val a = 10
a
val `Hello is it me you are looking for` = true
val `Give me some $$$` = 500.0
val howMuchCanIMake_∜$ = 10.0
val howMuchCanIMake_∜ = 10.0
val howMuchCanIMake_∜$ = 10.0
val howMuchCanIMake_$ = 10.0
val howMuchCanIMake_$$ = 10.0
val howMuchCanIMake_$$∜ = 10.0
val howMuchCanIMake_$$ = 10.0
val giveMeMyRaise_!!! = howMuchCanIMake_$ + 10
val `false` = true
val `void` = 10
val `return` = 90
if (`false`) `void` else `return`
if (false) `void` else `return`
if (false) void else `return`
if (false) void else return
if (false) void else `return`
:load /home/danno/development/scalatraining-20150720/Models.scala
val js = new Employee("Joe", "Smith")
js.firstName
:load /home/danno/development/scalatraining-20150720/Models.scala
val js = new Employee("Joe", "Smith")
js.firstName
js.fullName
val a = 10:Byte
val a:Byte = 110
val a:Byte = 127
val a:Byte = 128
val a:Byte = -128
val a:Byte = -129
val a:Short = 10030
val a:Int = 10030
val a = 10030
val a = 10030L
val a = 10030l
val a = 10030L
val a = 10030:Long
val a:Long = 10030
10 + 40
10.+(40)
class MyInt(x:Int) {
  def +(y:Int) = x + y
}
val mi = new MyInt(10)
mi.+(40)
mi + 40
class MyInt(x:Int) {
  def +(y:Int) = x + y
}
val mi = new MyInt(10)
mi.+(50)
mi + 50
12 + 50
12.+(50)
val z:Float = 1002
val z:Double = 1002
val z = 1002d
val z = 1002:Double
class MyInt(x:Int) {
  def +(y:Int) = x + y
}
val mi = new MyInt(10)
mi + 20
val b = true
val c = 'd'
val c = '\u0048'
val d = 0x04D
val x = 300
val r = if (x < 100) 10 else 30
val r = if (x < 100) true else false
val r = if (x < 100) true else 30
val r = if (x < 100) true else "30 something"
val r = if (x < 100) true else Any
val r = if (x < 100) true else new Employee("John", "Doe")
class Employee(firstName:String, lastName:String) extends AnyVal
class Employee(firstName:String) extends AnyVal
class Employee(val firstName:String) extends AnyVal
new Employee("Dan")
val r = if (x < 100) true
val r = if (x < 100) true else if (x == 100) false else "40"
var x = 10
while (x > 0) {
  println("I'm happy")
  x = x - 1
}
for (x <- 1 to 10) println(x)
(1 to 10)
(1 until 10)
val r = for (x <- 1 to 10) yield (x + 3)
(1.0 to 10.0)
val r = for (x <- 1.0 to 10.0) yield (x + 3)
val r = for (x <- 1 to 10) yield (x + 3.0)
val r = for (x <- 1 to 10) println (x + 3.0)
val r = for (x <- 1 to 10) yield (x + 3.0)
def add4(x:Int) = x + 4
val c = 100
if (c > 50) {
   add4(c)
} else {
   add4(c + 10)
}
val z = if (c > 50) {
   add4(c)
} else {
   add4(c + 10)
}
val str = "My age is %d".format(43)
val str = "My age is %d, but I wish I was %d again".format(43,21)
val str = "My age is %d$2, but I wish I was %d again".format(43,21)
val str = "My age is %d$1, but I wish I was %d again".format(43,21)
val str = "My age is %d, but I wish I was %d again".format(43,21)
val str = "Howdy, %s".format("Dan")
val firstName = "Rajiv"
val str = s"Howdy, ${firstName} "
val str = s"Howdy, ${firstName}"
val str = "Howdy, ${firstName}"
val str = s"Howdy, ${firstName}"
val str = s"Howdy, ${lastName}"
val pct = .10
val str = s"Howdy, %${lastName}"
val str = s"Howdy, %${firstName}"
val str = "Howdy, %% %s".format("Dan")
val str = s"Howdy, ${lastName}"
val str = s"Howdy, ${firstName}"
val str = s"Howdy, $firstName"
val str = s"Howdy, $firstName.toUpperCase"
val str = s"Howdy, ${firstName.toUpperCase}"
val str = s"Howdy, ${firstName\{.toUpperCase}"
val str = s"Howdy, ${firstName}.toUpperCase"
val str = s"Howdy, ${firstName.toUpperCase}"
val str = s"Howdy, ${firstName.toUpperCase + "!"}"
:paste
def add(x:Int) =  {
  if (x >= 10) x + 50
  else x + 19.0
}
:reset
:paste
def add(x:Int) =  {
  if (x >= 10) x + 50
  else "Hello, wrong number"
}
:reset
:paste
def add(x:Int) =  {
  if (x >= 10) x + 50
  else println("Hello, wrong number")
}
val x = ()
val y = Unit
def foo() = Unit
foo
() == foo
x
y
object MySingleton
val a = MySingleton
val b = MySingleton
a == b
a eq b
val u = Unit
val z = Unit
u == z
val zz = ()
zz == z
val g:BigInt = 13
def `do something exciting` = {
    3 + 4
}
Nil
1 :: Nil
Nil.::(1)
1 :: 2 :: Nil
2 :: 1 :: Nil
1 :: Nil :: 2
1 :: 2
1 :: 2 :: List(4, 5)
List(1,2,3,4)
res16 :+ 4
res16 :+ 5
res16
res16.+:(0)
0 +: res16
0 +: List(1,2,3,4) :+ 5
def zoom[A](x:A):A = x 
zoom(4)
zoom("String")
val a = "Sunil"
val b = "Sunil"
a.equals(b)
a eq b
val c = new String("Sunil")
a == c
a.equals(c)
a eq c
case class Department(name:String) 
val dept = new Department("Toys")
val autos = dept.copy(name = "Automotive")
dept
val list = List(1,2,3,4)
val list2 = 1 +: list
list
val dept = Department("Toys")
val list = List(1,2,3,4,5)
val list = List("Fee", "Fi", "Foe", "Thumb")
:paste
class Box[A](val x:A) {  //declaration site parameterized type, invariant
   def changeTo(x:A):Box[A] = new Box(x)
}
:paste
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
case class Department(name:String) 
class Manager(override val firstName:String, 
              override val lastName:String, 
              override val title:String, 
              val department:Department) 
                 extends Employee(firstName, lastName, title)
:paste
class Manager(override val firstName:String, 
              override val lastName:String, 
              override val title:String, 
              val department:Department) 
                 extends Employee(firstName, lastName, title)
new Box(new Manager("A", "B", "C", new Department("D"))
)
res32.changeTo(10)
res32.changeTo(new Manager("X", "Y", "Z", new Department("bB"))
)
class Crate[I](x:String) {
}
new Crate("Hello")
new Crate[Int]("Hello")
class Crate[I](x:String) {
   def doIt(y:I) = y
}
List(1,2,3,4,5)
0 +: res37
"Foo" +: res37
class Box[A] {
   def foo(x:A):Box[A] = new Box(x)
}
class Box[A](x:A) {
   def foo(y:A):Box[A] = new Box(y)
}
new Box(14)
res40.foo("Foo")
class Box[A](x:A) {
   def +:(y:A):Box[A] = new Box(y)
}
new Box(14)
"Foo" +: res42
class Box[A](x:A) {
   def +:[B](y:B):Box[B] = new Box(y)
}
val b = new Box(14)
"Foo" +: b
object MySingleton
val a = MySingleton
val b = MySingleton
a == b
a eq b
object MySingleton {
   def foo(x:Int) = x + 5
}
MySingleton.foo(10)
class Foo(x:Int) {
  def bar(y:Int) = x + y
}
val a = new Foo(3)
a.bar(15)
class Foo(x:Int) {
  def apply(y:Int) = x + y
}
val a = new Foo(3)
a.apply(15)
a(15)
class Foo(x:Int) {
  def apply(y:Int) = x + y
  def apply(y:Int, z:Int) = x + y + z
}
val a = new Foo(3)
a.apply(14, 19)
a(14, 19)
a(1)
a.apply(1)
class Foo(x:Int) {
  def apply(y:Int) = x + y
  def supply(y:Int, z:Int) = x + y + z
}
class Foo(x:Int) {
  def apply(y:Int) = x + y
  def supply(y:Int) = x + y
}
class Foo(x:Int) {
  def apply(y:Int) = 10000
  def supply(y:Int) = x + y
}
val a = new Foo(100)
a.apply(10)
a(10)
a.supply(40)
object SomeSingleton {
   def apply(x:Int) = x + 19
}
SomeSingleton.apply(40)
SomeSingleton(40)
List(1,2,3,4,5)
List.apply(1,2,3,4,5)
case class Employee(firstName:String, lastName:String)
new Employee("Malay", "Tripathi")
Employee("Malay", "Tripathi")
Employee.apply("Malay", "Tripathi")
List.empty[Int]
List.concat(List(1,2,3,4), List(5,6,7,8))
val a = List(1,2,3,4,5)
a.apply(3)
a(3)
a(5)
Set(1,2,4,5,6,7)
Set.apply(1,2,4,5,6,7)
Set(1,2,4,5,6,7)
Set.apply(1,2,4,5,6,7).apply(3)
Set(1,2,4,5,6,7)(3)
Set(1,2,4,5,6,7)(2)
Set(1,2,4,5,6,7)[Any]
Set[Any](1,2,4,5,6,7)
Set.apply[Any](1,2,4,5,6,7)
Set[Any](1,2,4,5,6,7)
res79 :+ "Zoom!"
res79 + "Zoom!"
case class Employee(firstName:String, lastName:String)
Employee.apply("A", "B")
Employee("A", "B")
val sunilsMiddleName:Option[String] = None
val viddusMiddleName:Option[String] = Some("mallikarjunaiah")
val viddusMiddleName = Some("mallikarjunaiah")
var viddusMiddleName = Some("mallikarjunaiah")
viddusMiddleName = None
val viddusMiddleName = Some("mallikarjunaiah")
viddusMiddleName
val viddusMiddleName:Option[String] = Some("mallikarjunaiah")
viddusMiddleName.get
sunilsMiddleName.get
class Employee(firstName:String, middleName:Option[String], lastName)
class Employee(firstName:String, middleName:Option[String], lastName:String)
:reset
class Employee(firstName:String, middleName:Option[String], lastName:String)
new Employee("Sunil", None, "Agarwal")
new Employee("", None, "Agarwal")
new Employee("Sunil", "", "Agarwal")
new Employee("Sunil", None, "Agarwal")
val sunil = new Employee("Sunil", None, "Agarwal")
val viddu = new Employee("Viddu", Some("M"), "Devigere")
sunil.middleName.get
case class Employee(firstName:String, middleName:Option[String], lastName:String)
val viddu = new Employee("Viddu", Some("M"), "Devigere")
val sunil = new Employee("Sunil", None, "Agarwal")
sunil.middleName
sunil.middleName.get
viddu.middleName.get
viddu.middleName.getOrElse("No middle name")
sunil.middleName.getOrElse("No middle name")
val t = (4, "Hello")
val t:(Int, String) = (4, "Hello")
val t:Tuple2[Int, String] = (4, "Hello")
val z:String = "Hello"
val t:Tuple2[Int, String] = Tuple2(4, "Hello")
val t:Tuple2[Int, String] = Tuple2.apply(4, "Hello")
val t = (4, "Hello")
t._1
t._2
t.swap
val t = (4, "Hello", new Employee("A", Some("B"), "C"))
val t = (4, "Hello", new Employee("A", Some("B"), "C"), (1, 4.5)
)
def getStuff(x:Int) = (x+1, x-1)
getStuff(5)
val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
val m = Map((1, "One"), (2, "Two"), (3, "Three"))
val m = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
m.get(1)
m.get(4)
m.get(1).getOrElse("Unknown")
m.get(4).getOrElse("Unknown")
val m = Map(1 -> ("One", "Uno, 2 -> "Two", 3 -> "Three")
val m = Map(1 -> ("One", "Uno"), 2 -> ("Two", "Dos"), 3 -> ("Three", "Tres")
)
m.get(3).getOrElse("No Such Value" -> "Nada")._2
m.get(4).getOrElse("No Such Value" -> "Nada")._2
val t3 = (1, "Three", 2.0)
val t3:Tuple3[Int, String, Double] = (1, "Three", 2.0)
val t3:Tuple4[Int, String, Double] = (1, "Three", 2.0)
val t3:Tuple4[Int, String, Double, Double] = (1, "Three", 2.0)
val m = Map(1 -> ("One", "Uno"), 2 -> ("Two", "Dos"), 3 -> ("Three", "Tres"))
m.get(3).getOrElse("No Such Value" -> "Nada")._2
m
m.get(3)
m.get(3)._2
m.get(3).getOrElse("No Such Value" -> "Nada")
m.get(3)
m.get(3).getOrElse("Unknown")
m.get(3).getOrElse("No Such Value" -> "Nada")
m.get(3).getOrElse("No Such Value" -> "Nada")._2
m.get(3).get._2
m.get(4).get._2
m.get(4)
m.get(3).getOrElse(40)
m.get(3).getOrElse(("A", "B"))
m.get(4).getOrElse(("A", "B"))
m.get(4).getOrElse(("A", "B"))._2
val f = (x:Int) => x + 4
List(1,2,3,4,5).map(f)
List(1,2,3,4,5).map((x:Int) => x + 4)
List(1,2,3,4,5).map(x => x + 4)
List(1,2,3,4,5).map(_ + 4)
List(1,2,3,4,5).map(4 + _)
List(1,2,3,4,5).map(4+)
List(1,2,3,4,5).map(4*)
List("Eggs", "Milk", "Soy Sauce", "Naan", "Chocolate Chip Cookies")
val groceries = List("Eggs", "Milk", "Soy Sauce", "Naan", "Chocolate Chip Cookies")
groceries.zipWithIndex
groceries.zipWithIndex.map(t => (t._2 + 1, t._1))
groceries.zipWithIndex.map(t => t.swap)
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2))
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}")
groceries.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
groceries.view.sorted.zipWithIndex.map(t => t.swap).map(t => (t._1 + 1, t._2)).map(t => s"${t._1}. ${t._2}").mkString("\n")
quit
:quit
new java.util.HashMap()
new java.util.HashMap[Int, Int]()
res1.put(1, "Three)
:quit
val a = 10
a = 30
var a = 10
a = 40
val f = (x:Int) => x % 2 != 0
List(1,2,3,4,5).filter(f)
List(1,2,3,4,5).filter((x:Int) => x + 1)
List(1,2,3,4,5).filter((x:Int) => x % 2 != 0)
List(1,2,3,4,5).filter(x => x % 2 != 0)
List(1,2,3,4,5).filter(_ % 2 != 0)
1 :: 2 :: 3 :: Nil
NIl
Nil
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
new Foo(10)
val a = new Foo(10)
a.bar(40)
class Foo(x:Int) {
   def +:(y:Int) = x + y
}
val a = new Foo(10)
a.+:(30)
30 +: a
14 + 10
:quit
val a = 10
a = 40
var b = 10
b = 40
val a:Int = 10
val a = 10:Double
a
:help
:paste
:quit
:paste
val b = 30
val result = if (b > 20) {
  40
} else {
  100
}
:paste
def foo(x:Int):Int = {
  x = 900
  x + 100
  x + 200
}
List(1,2,3,4,5).par.foreach(println)
("One", 3)
("One", 3, 14.0)
val z:Tuple3[String, Int, Double] = ("One", 3, 14.0)
z._2
val nums = List(4,5,5,3,2)
val nums = List.apply(4,5,5,3,2)
val nums = 4 :: 5 :: 5 :: 3 :: 2 :: Nil
Nil
val myMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
val t = 1 -> "Zoom"
myMap.get(2)
val nums = 4 :: 5 :: 5 :: 3 :: 2 :: Nil
nums.apply(3)
nums(3)
val myMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
myMap.apply(1)
myMap.apply(2)
myMap.apply(6)
val s = Set(30, 12, 19, 12, 32)
val s = Set(30, 12, 19, 12, 32, 400)
val s = Set(30, 12, 19, 12, 32, 400, 12)
val s = Set(30, 12, 19, 12, 32, 400, 1400)
s.apply(4)
val as = Array[1,2,3,4,5]
val as = Array(1,2,3,4,5)
val as = Array(1,2,3,4,5).map(x => x + 1)
as.apply(3)
val as = Array(1,2,3,4,5)
as.apply(3)
def groceries(items:String*) = {
   println(items)
}
groceries("Eggs", "Naan", "Apples", "Ice Cream", "Brussel Sprouts")
def groceries(items:String*) = {
   println(items.map(x => x + "!")
}
def groceries(items:String*) = {
   println(items.map(x => x + "!"))
}
groceries("Eggs", "Naan", "Apples", "Ice Cream", "Brussel Sprouts")
def groceries(items:String*) = {
   items.map(x => x + "!")
}
groceries("Eggs", "Naan", "Apples", "Ice Cream", "Brussel Sprouts")
res15.reverse
res15
def groceries(items:String*) = {
   items.map(x => x + "!").toList
}
groceries("Eggs", "Naan", "Apples", "Ice Cream", "Brussel Sprouts")
val otherList = ("Sponges", "Chocolate", "Wine", "Candles")
groceries(otherList)
val otherList = List("Sponges", "Chocolate", "Wine", "Candles")
groceries(otherList)
groceries(otherList:_*)
groceries(otherList.toArray)
otherList.toArray
groceries(otherList.toArray)
groceries(otherList:_*)
groceries
otherList
List(otherList)
List(otherList:_*)
List.apply(otherList:_*)
"Suraj is not in the house!".map(x => x + 2)
"Suraj is not in the house!".map(x => x + 2).toString
new String("Suraj is not in the house!".map(x => x + 2))
new String("Suraj is not in the house!".map(x => x + 2).toArray)
"Suraj is not in the house!".map(x => x + 2).toCharArray
"Suraj is not in the house!".map(x => x + 2).toArray
"Suraj is not in the house!".map(x => x + 2).mkString
"Suraj is not in the house!".map(x => (x + 2).toChar)
Range(1, 10)
1 to 10
1 until 10
(1 until 10).apply(3)
(1 until 10).size
(1 until 10).map(x => x + 1)
Range.apply(0, 100, 5)
def myStream(x:Int):Stream[Int] = Stream.cons(1, myStream(x + 1)
)
def myStream(x:Int):Stream[Int] = Stream.cons(1, myStream(x + 1))
val items = myStream(4)
println(items.take(5))
println(items.take(5).mkString(","))
def myStream(x:Int):Stream[Int] = Stream.cons(x, myStream(x + 1))
println(items.take(5).mkString(","))
val items = myStream(4)
println(items.take(5).mkString(","))
items.map(x = x + 10).take(4).mkString(",")
items.map(x => x + 10).take(4).mkString(",")
def myStream(x:Int):Stream[Int] = Stream.cons(x, myStream(x + 1))
def myStream(x:Int):Stream[Int] = x #:: myStream(x + 1)
List(1,2,3,4).zip(List(5,6,7,8))
val myList = List(3,4,5,6,7)
myList.head
myList.tail
myList
myList.init
myList.last
Set(1,2,3,4,5,6,7,8,9,10)
res59.head
res59.tail
List("Eggs", "Naan", "Fibonacci Sequence Salad").zipWithIndex
"Sunil is the word".head
"Sunil is the word".tail
"Sunil is the word".init
val fibs:Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => t._1 + t._2 }
fibs.take(100).mkString(",")
val fibs:Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => println(t); t._1 + t._2 }
fibs.take(10).mkString(",")
fibs.take(10)
fibs.hasDefiniteSize
fibs.take(10).hasDefiniteSize
fibs.take(10).mkString(",")
fibs.mkString(",")
val fibs:Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => println(t); t._1 + t._2 }
fibs.take(10).mkString(",")
val 10fibs = fibs.take(10)
val tenfibs = fibs.take(10)
tenfibs.mkString(",")
tenfibs.hasDefiniteSize
val tenfibs = fibs.take(10).force()
val tenfibs = fibs.take(10).force
val tenfibs = fibs.take(10)
val tenfibs = fibs.take(10).hasDefinitiveSize
val tenfibs = fibs.take(10).hasDefiniteSize
val tenfibs = fibs.take(10)
tenfibs.mkString(",")
tenfibs.hasDefiniteSize
val tenfibs = fibs.take(10)
tenfibs.hasDefiniteSize
val tenfibs = fibs.take(10).force
tenfibs.hasDefiniteSize
String url = "http://wsf.cdyne.com/WeatherWS/Weather.asmx/GetCityForecastByZIP?ZIP=94107"
val url = "http://wsf.cdyne.com/WeatherWS/Weather.asmx/GetCityForecastByZIP?ZIP=94107"
val source = Source.fromURL(url)
val source = scala.io.Source.fromURL(url)
source.foreach(print)
val url = "http://wsf.cdyne.com/WeatherWS/Weather.asmx/GetCityForecastByZIP?ZIP=94107"
val source = scala.io.Source.fromURL(url)
source.mkString
new XML(source)
import scala.io.Source
val source = Source.fromURL(url)
import scala.io._
val source = Source.fromURL(url)
val f = new Function[Int, Int] {
}
val f = new Function1[Int, Int] {
 def apply(x:Int):Int = x + 1
}
f.apply(10)
f(10)
val predicate = (x:Int) => x % 2 != 0
List(4, 6, 7, 10, 19, 35, 109).filter(predicate)
List(4, 6, 7, 10, 19, 35, 109).filter(predicate).map(10+)
(1 to 10000).filter(predicate).map(10+)
(1 to 10000).view.filter(predicate).map(10+)
val cached = (1 to 10000).view.filter(predicate).map(10+)
cached.force
val cached = (1 to 10000).view.filter(predicate).map(x => println(x); x + 10)
val cached = (1 to 10000).view.filter(predicate).map{x => println(x); x + 10}
val cached = (1 to 10000).filter(predicate).map{x => println(x); x + 10}
val cached = (1 to 10000).filter(predicate).map{x => println(x); x + 10}.take(3)
val cached = (1 to 10000).view.filter(predicate).map{x => println(x); x + 10}.take(3).force
val cached = (1 to 10000).view.filter(predicate).map{x => println(x); x + 10}.take(3)
val cached = (1 to 10000).view.filter(predicate).map{x => println(x); x + 10}.take(3).mkString(",")
val cached = (1 to 10000).filter(predicate).map{x => println(x); x + 10}.take(3).mkString(",")
val cached = (1 to 10000).view.filter(predicate).map{x => println(x); x + 10}.take(3).mkString(",")
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val f = (x:Int) => x + 3
class Foo(x:Int) {
   def bar(y:Int) = (z:Int) => x + y + z
}
val foo = new Foo(10)
val f = foo.bar(18)
List(1,2,3,4,5).map(f)
class Foo(x:Int) {
   def bar(y:Int):Function1[Int, Int] = (z:Int) => x + y + z
}
val f = foo.bar(18)
f(20)
val x = 10
val f = (y:Int) => x + y
f.apply(40)
f(40)
class Foo(x:Int) {
   def bar(y:Int) = x + Y
}
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val foo = new Foo(10)
val f = foo.bar _
List(1,2,3,4,5).map(f)
val f = foo.bar
val f = foo.bar _
class Foo(x:Int) {
   def bar(y:Int) = x + y
}
val f = foo.bar _
foo
List(1,2,3,4,5).map(foo.bar _)
val foo = new Foo(10)
List(1,2,3,4,5).map(foo.bar _)
List(1,2,3,4,5).map(x => x + 5)
List(1,2,3,4,5).map(_ + 5)
List(1,2,3,4,5).map(5 + _)
List(1,2,3,4,5).map(5 +)
List(1,2,3,4,5).map(foo.bar)
List(1,2,3,4,5) map foo.bar
val p = println
val p = println _
val p = println (_:Any)
val p = println(_:Any)
List(1,2,3,4).foreach(p)
List(1,2,3,4).foreach(println(_:Any))
List(1,2,3,4).foreach(println)
List(1,2,3,4) foreach println
def zoom(f:(Int, Int) => Int, a:Int) = f(a)
def zoom(f:(Int, Int) => Int, a:Int) = f(a, a + 3)
zoom((x,y) = > x * y, 10)
zoom((x,y) => x * y, 10)
def zoom(f:(Int, Int) => Int, a:Int) = f.apply(a, a + 3)
zoom((x,y) => x * y, 10)
def polly(x:Int, y:Int) = x * y + 10
zoom(polly _, 19)
val p = polly _
zoom(polly , 19)
19 * 21 + 10
19 * 22 + 10
val f2 = polly(40, _)
val f2 = polly(40, _:Int)
(1 to 100).map(f2)
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(x => x.head)
"Sunil".head
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith")
res45.head
res45.head.head
res47.head
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(x => x.head)
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head)
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('S')
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('S').size
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K').size
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K').get
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K').getOrElse(Nil)
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K').getOrElse(Nil).size
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K')
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head)
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K')
List("Sunil", "Kalyan", "Viddu", "Srini", "Keith").groupBy(_.head).get('K').getOrElse(Nil).size
:reset
val f = (x:Int, y:Int, z:Int) => x * y + (z * 14)
val g = (10, 11, _:Int)
val g = f(10, 11, _:Int)
g(10)
val f = (x:Int, y:Int, z:Int) => x * y + (z * 14)
f.curried
val g = f.curried
g(10)
val h = g(10)
val i = h(10)
i(19)
def boom(x:Int)(y:Int => Int) = {
y(x)
}
boom(10)(3+)
boom(10)(_ + 4)
(1 to 10).foldLeft(0)((b:Int, a:Int) => a + b)
(1 to 10).foldLeft(0)((total:Int, next:Int) => total + next)
(1 to 10).foldLeft(0)((total:Int, next:Int) => println(s"total: $total next: $next"); total + next)
(1 to 10).foldLeft(0){(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).foldLeft(0){(total:Int, next:Int) => total + next}
(1 to 10).foldLeft(0){(total, next) => total + next}
(1 to 10).foldLeft(0){_ + _}
(1 to 10).foldLeft(0){_ + _ + _}
(1 to 10).foldLeft(0){(total, next) => total + next + next}
(1 to 10).foldLeft(0){_ - _}
(1 to 10).foldLeft(0){_-_}
(1 to 10).foldLeft(0)((total, next) => total + next + next)
(1 to 10).foldLeft(0)(total, next => total + next + next)
(1 to 10).foldLeft(0)((total, next) => total + next + next)
(1 to 10).foldLeft(0)((total:Int, next:Int) => println(s"total: $total next: $next"); total + next)
(1 to 10).foldLeft(0){(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).foldRight(0){(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceRight{(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceLeft{(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceLeft{(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
def factorial(x:Int) = (1 to x).reduceLeft(_ * _)
factorial(10)
factorial(10000)
def factorial(x:BigInt) = (1 to x).reduceLeft(_ * _)
def factorial(x:BigInt):Stream[BigInt]
def factorial(x:Int) = (1 to x).reduceLeft(_ * _)
def factorial(x:BigInt) = (1 to x).reduceLeft(_ * _)
def factorial(x:Int) = (1 to x).reduceLeft(_ * _)
val f = (x:Int) = x + 10
val f = (x:Int) => x + 10
val f:Int => Double = (x:Int) => x + 10
f(3)
:save /home/danno/Desktop/functionalsessional.scala
:quit
import scala.concurrent._
import ExecutionContext.Implicits.global
val f = Future { 10 + 19}
f.foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
f.foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
f.filter(_ % 2 != 0).foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
f.filter(_ % 2 != 0).foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
f.filter(_ % 2 == 0).foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
val g = Future {Thread.sleep(10000); 10 + 20}
val f = Future {Thread.sleep(10000); 10 + 19}
f.map(x => x + 100)
res5.foreach(println)
val f = Future {Thread.sleep(10000); 10 + 19}
f.map(x => x + 100)
res7 foreach println
val r = f.map(x => x + 100)
val f = Future {Thread.sleep(10000); 10 + 19}
f.map(x => x + 100)
val r = f.map(x => x + 100)
r foreach println
val f = Future {Thread.sleep(10000); 10 + 19}
val r = f.map(x => x + 100)
r foreach println
val f = Future {Thread.sleep(10000); 10 + 19}
val g = Future {Thread.sleep(10000); 10 + 19}
for (x <- f;
     y <- g) yield (x + y)
res12 foreach println
val f = Future {Thread.sleep(10000); 10 + 19}
val g = Future {Thread.sleep(10000); 10 + 19}
f.flatMap(x => g.flatMap(y => x + y))
f.flatMap(x => g.flatMap(y => x + y)))
f.flatMap(x => g.map(y => x + y)))
f.flatMap(x => g.map(y => x + y))
res15 foreach println
f.flatMap(x => g.map(y => x + y)))
val regex = """Color\(\d+,\d+,\d+\)""".r
exit
val regex = "(/d+)".r
regex.findAllIn("12345")
regex.findAllIn("12345").mkString(",")
regex.findAllIn("12345").toList
val regex = "(\d+)".r
val regex = """(\d+)""".r
regex.findAllIn("12345").toList
val regex = """(\d+)""".r
regex.findAllIn("12345").toList
regex.findAllMatchIn("12345").toList
regex.findAllIn("12345")
"""[a-z&&[^aeiou]]{4}"""
"""[a-z&&[^aeiou]]{4}""".r
val regex = """[a-z&&[^aeiou]]{4}""".r
regex findAllIn "Zoom"
(regex findAllIn "Zoom").toList
(regex findAllIn "Zma").toList
(regex findAllIn "Zmad").toList
(regex findAllIn "zmad").toList
(regex findAllIn "zmadvd").toList
(regex findAllMatchIn "zmadvd").toList
val regex = """[a-zA-Z&&[^aeiouAEIOU]]{4}""".r
(regex findAllMatchIn "zmadvd").toList
val otherRegex = "\d+".r
val otherRegex = """\d+""".r
(otherRegex findAllMatchIn "20120").toList
(otherRegex findAllMatchIn "20120 ddsd 204302").toList
(otherRegex findAllMatchIn "20120 ddsd 2043").toList
(otherRegex findAllIn "20120 ddsd 2043").toList
val regex = """[a-zA-Z&&[^aeiouAEIOU]]{4}""".r
regex findAllIn "qqqqq"
(regex findAllIn "qqqqq").toList
(regex findAllIn "qqqq asld").toList
(regex findAllIn "qqqq asld deppa").toList
(regex findAllIn "qqqq asld deppa Olympia").toList
:quit
(regex findAllIn "qqqq asld deppa").toList
val regex = """[a-zA-Z&&[^aeiouAEIOU]]{4}""".r
regex findAllIn "zoom"
(regex findAllIn "zoom").toList
(regex findAllIn "qqqq").toList
(regex findAllIn "qqqqrqw").toList
(regex findAllIn "eqqqqerqw").toList
(regex findAllIn "eqqqqerqw") != Nil
(regex findAllIn "aassseee") != Nil
(regex findAllIn "eqqqqerqw") != Nil
val regex = """[a-zA-Z&&[^aeiouAEIOU]]{4}""".r
(regex findAllIn "asssssse")
(regex findAllIn "asssssse").toList
(regex findAllIn "assse").toList
(regex findAllIn "asee").toList
(regex findAllIn "asee").toList != Nil
(regex findAllIn "asssee").toList != Nil
(regex findAllIn "assssee").toList != Nil
List(1,2,3,4,5).filter(_ % 2 != 0)
:quit
:paste
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
val roger = new Employee("Roger", "Rabbit")
val roger(p1, p2) = (13, "Whoa",19)
20.isOdd
20.toBinaryString
20.toHexString
val now = LocalDate.now
import java.time._
val now = LocalDate.now
Period.between(now, LocalDate.of(2015, 12, 31))
Period.between(now, LocalDate.of(2015, 12, 31)).days
Period.between(now, LocalDate.of(2015, 12, 31)).toDays
Period.between(now, LocalDate.of(2015, 12, 31)).getDays
Duration.between(now, LocalDate.of(2015, 12, 31)).getDays
Duration.between(now, LocalDate.of(2015, 12, 31))
Period.between(now, LocalDate.of(2015, 12, 31))
ChronoUnit.DAYS.between(now, LocalDate.of(2015, 12, 31))
import java.time.temporal._
ChronoUnit.DAYS.between(now, LocalDate.of(2015, 12, 31))
LocalDateTime localDateTime = LocalDateTime.of(1982, Month.APRIL, 17, 14, 11);
ZonedDateTime jakartaTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Jakarta"));
val localDateTime = LocalDateTime.of(1982, Month.APRIL, 17, 14, 11);
val jakartaTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Jakarta"));
List(5,3,1,10,19).sorted
val localDateTime = LocalDateTime.of(2015, Month.APRIL, 17, 14, 11);
new java.util.GregorianCalendar
val localDateTime = LocalDateTime.of(2015, Month.APRIL, 17, 14, 11);
val est = ZonedDateTime.of(localDateTime, ZoneId.of("America/New York"))
val est = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"))
ZonedDateTime.now
ZonedDateTime.now.withZoneSameInstant(ZoneId.of("American/New_York"))
ZonedDateTime.now.withZoneSameInstant(ZoneId.of("America/New_York"))
:quit
import java.time._
ZoneId.getAvailableZoneIds
import scala.collection.JavaConverters._
res18.asScala
val timeZones = res18.asScala.toSet
timeZone.filter(x => x.startsWith("America"))
timeZones.filter(x => x.startsWith("America"))
timeZones.filter(x => x.startsWith("America")).size
timeZones.filter(x => x.startsWith("America")).map(x => x.split("/")(1))
timeZones.filter(_.startsWith("America")).map(_.split("/")(1))
timeZones.filter(_.startsWith("America")).map(_.split("/")(1)).sorted
timeZones.filter(_.startsWith("America")).map(_.split("/")(1)).toList.sorted
timeZones.filter(_.startsWith("America")).map(_.split("/")(1)).toList.sorted.filter(_.startsWith("L")
)
java.time.ZoneId.getAvailableZoneIds.filter(_.startsWith("America")).map(_.split("/")(1)).toList.sorted.filter(_.startsWith("L")
)
java.time.ZoneId.getAvailableZoneIds.asScala.toSet.filter(_.startsWith("America")).map(_.split("/")(1)).toList.sorted.filter(_.startsWith("L"))
:quit
