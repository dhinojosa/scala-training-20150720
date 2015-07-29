
val items = List(1,2,3,4,5,6).flatMap(x => List(-x, 0, x))
println(items)

//for loop
//yucky, imperitive
var x = 0
for (y <- 1 to 10) {
   x = x + y
}
println(x)

val y = 10
val r = if (y > 3) 17 else 22

// for comprehension
val s = for (y <- 1 to 10) yield (y + 1)

println(s)
println((1 to 10).map(_ + 1))

val t = for (a <- 1 to 10;
             b <- 11 to 20) yield (a, b)

println(t)

val as = 1 to 10
val bs = 11 to 20
println(as.flatMap(a => bs.map(b => (a,b))))


case class Box[A](x:A) {
   def map[B](f: A => B):Box[B] = new Box(f(x))
   def flatMap[B](f: A => Box[B]):Box[B] = f(x)
}

val box = new Box(13)
println(box.flatMap(x => new Box(x + 19)))

val box2 = new Box(20)

println(box.flatMap(x => box2.map(y => x + y)))

val boxes = for (x <- box;
                 y <- box2) yield (x + y)

println(boxes)


val o1:Option[Int] = Some(1)
val o2:Option[Int] = None
val o3:Option[Int] = Some(67)

val options = for (x <- o1;
                   y <- o2;
                   z <- o3) yield (x + y + z) //Some(88)

println(options)

val failureLists = for (x <- List(1,2,3,4);
                        y <- Nil:List[Int];
                        z <- List(1)) yield (x + y + z)

println(failureLists)


import scala.concurrent._
import ExecutionContext.Implicits.global

