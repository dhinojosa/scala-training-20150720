object UsingFunctions extends App {

  //verbose
  val addOne:Function1[Int, Int] = new Function1[Int,Int] {
     def apply(x:Int):Int = {
         x + 1
     }
  }

  //verboseFunction2
  val f2:Function2[Int, Int, String] = new Function2[Int,Int,String] {
     def apply(x:Int, y:Int):String = {
         "wow" + x + y + 4
     }
  }


  //verbose
  val addOnePrime:Int => Int = new Function1[Int,Int] {
     def apply(x:Int):Int = {
         x + 1
     }
  }

  val addOnePrime2:Int => Int = (x:Int) => x + 1
  
  val addOnePrime3 = (x:Int) => x + 1

  val addTwo:(Int, Int) => Int = (x:Int, y:Int) => x + y + 4

  val addTwoPrime = (x:Int, y:Int) => x + y + 4

  println(addOne.apply(3))
  println(addOne(3))
  println(addOnePrime3(3))
  println(addTwo(3,4))

  def foo(x:Int, y:Int, z:(Int, Int)=> Int) = {
      z.apply(x,y)
  }

  println(foo(3,5, addTwo)) //12


