


def add(x:Int):Unit =  {
//  if (x >= 10) x + 50
//  else println("Hello, wrong number")
   println(x + 10)
}


println(add(10)) //20

val g:Unit = ()

println(g)

// 1 * 2 * 3 * 4 * 5 = 5! = 120
def factorial(x:BigInt):BigInt = {
   import scala.annotation.tailrec

   @tailrec
   def fact(total:BigInt, next:BigInt):BigInt = {
     if(next == 0 || next == 1) total
     else {
       fact(total * next, next - 1)
     }
   }

  fact(1, x)
}

println(factorial(5)) //120
//println(factorial(100)) //Some Big Number
//println(factorial(10000)) //Some Enormous Value


class Foo(x:Int) {
   def ~:(y:Int) = x + y
}

val f = new Foo(10)

println(f.~:(20))
println(20 ~: f)

println(List(1,2,3,4,5))
println(1 :: 2 :: 3 :: 4 :: 5 :: Nil)

def zoom[A](x:A):A = x // Parameterized Type







