
var history = ""

println(history)

lazy val a = {history = history + "Assigned"; 10}

println(history)
println(a)
println(history)
println(a)
println(history)
