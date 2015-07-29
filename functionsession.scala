val f = (x:Int, y:Int, z:Int) => x * y + (z * 14)
val g = (10, 11, _:Int)
val g = f(10, 11, _:Int)
g(10)
val f = (x:Int, y:Int, z:Int) => x * y + (z * 14)
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
(1 to 10).foldLeft(0){(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).foldLeft(0){(total:Int, next:Int) => total + next}
(1 to 10).foldLeft(0){(total, next) => total + next}
(1 to 10).foldLeft(0){_ + _}
(1 to 10).foldLeft(0){_ + _}
(1 to 10).foldLeft(0){_ + _}
(1 to 10).foldLeft(0){(total, next) => total + next + next}
(1 to 10).foldLeft(0){_ - _}
(1 to 10).foldLeft(0){_-_}
(1 to 10).foldLeft(0)((total, next) => total + next + next)
(1 to 10).foldLeft(0)((total, next) => total + next + next)
(1 to 10).foldLeft(0){(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).foldRight(0){(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceRight{(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceLeft{(next:Int, total:Int) => println(s"total: $total next: $next"); total + next}
(1 to 10).reduceLeft{(total:Int, next:Int) => println(s"total: $total next: $next"); total + next}
def factorial(x:Int) = (1 to x).reduceLeft(_ * _)
factorial(10)
factorial(10000)
def factorial(x:Int) = (1 to x).reduceLeft(_ * _)
val f = (x:Int) => x + 10
val f:Int => Double = (x:Int) => x + 10
f(3)
