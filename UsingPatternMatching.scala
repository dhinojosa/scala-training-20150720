import java.awt.Color

val regexColor = """Color\((\d+),(\d+),(\d+)\)""".r

def patternMatch1(x:Any) = {
   x match {
     case x:Int if (x >= 0 && x < 256) => new Color(x, x, x)
     case x:Int => Color.BLACK
     case (r:Int, g:Int, b:Int) => new Color(r, g, b)
     case regexColor(r:String, g:String, b:String) => new Color(r.toInt, g.toInt, b.toInt)
     case "Red" => Color.RED
     case "Green" => Color.GREEN
     case _ => Color.BLACK
   }
}

println(patternMatch1("Red"))
println(patternMatch1("Yellow"))
println(patternMatch1(10))
println(patternMatch1((10, 20, 30)))
println(patternMatch1("Color(10,16,45)"))
println(patternMatch1(-1))
