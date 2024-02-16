fun main() {
    try
    {
        var x1 = readln().toDouble()
        var y1 = readln().toDouble()
        var x2 = readln().toDouble()
        var y2 = readln().toDouble()
        var S = x1*y1
        println("S = $S")
    }
    catch (a: Exception) {
        println("ERROR")
    }
}